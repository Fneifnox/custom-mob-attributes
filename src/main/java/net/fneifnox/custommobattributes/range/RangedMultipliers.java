package net.fneifnox.custommobattributes.range;

import com.mojang.serialization.Codec;
import io.wispforest.owo.config.Option;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;
import static net.fneifnox.custommobattributes.CustomMobAttributes.LOGGER;

public final class RangedMultipliers {

    // Percentile (0..1) drawn once per mob and per multiplier key. The value is computed from it each time,
    // so changing a range or its curve remaps the mob to the same percentile of the new distribution.
    public static final AttachmentType<Map<String, Double>> PERCENTILES = AttachmentRegistry.create(
            Identifier.fromNamespaceAndPath("custom_mob_attributes", "range_percentiles"),
            builder -> builder.persistent(Codec.unboundedMap(Codec.STRING, Codec.DOUBLE))
    );

    private static final Map<String, Option<?>> OPTION_CACHE = new ConcurrentHashMap<>();
    private static final Set<String> WARNED = ConcurrentHashMap.newKeySet();

    private static final Formula SIGMA_FALLBACK = Formula.parse(Formula.DEFAULT_SIGMA);
    private static final Formula BLEND_FALLBACK = Formula.parse(Formula.DEFAULT_BLEND);

    private static String sigmaSource = Formula.DEFAULT_SIGMA;
    private static Formula sigmaFormula = SIGMA_FALLBACK;
    private static String blendSource = Formula.DEFAULT_BLEND;
    private static Formula blendFormula = BLEND_FALLBACK;

    private RangedMultipliers() {}

    public static void init() {
        // Loads the class so that the attachment type is registered before any world is loaded
    }

    @FunctionalInterface
    public interface EntityMultiplier {
        double get(Entity entity);
    }

    // Multiplier that supports a random range, the key is the option path of the fixed value, e.g. "healthMultiplierForZombie" or "betterEnd.healthMultiplierForCubozoa"
    public static EntityMultiplier ranged(String key) {
        option(key);
        option(key + "Range.enabled");
        return entity -> get(entity, key);
    }

    // Multiplier without a range (baby multipliers)
    public static EntityMultiplier fixed(Supplier<Double> value) {
        return entity -> value.get();
    }

    public static double get(@Nullable Entity entity, String key) {
        double fixed = RangedMultipliers.<Double>option(key).value();
        if (!RangedMultipliers.<Boolean>option(key + "Range.enabled").value()) {
            return fixed;
        }

        double min = RangedMultipliers.<Double>option(key + "Range.min").value();
        double max = RangedMultipliers.<Double>option(key + "Range.max").value();
        double curve = RangedMultipliers.<Double>option(key + "Range.curve").value();

        if (!(min > 0) || !(max > min) || !Double.isFinite(max) || !Double.isFinite(curve)) {
            warnOnce(key + "|" + min + "|" + max + "|" + curve,
                    "Invalid range for {} (min = {}, max = {}, curve = {}): min must be > 0 and max must be > min. Using the fixed value {} instead", key, min, max, curve, fixed);
            return fixed;
        }

        curve = Math.clamp(curve, -5, 5);
        double sigma = sigma(curve);
        double blend = 1;
        if (sigma >= CONFIG.rangeBlendMinSigma() && sigma <= CONFIG.rangeBlendMaxSigma()) {
            blend = blendWeight(curve, sigma);
        }

        return RangeDistribution.valueAt(percentile(entity, key), min, max, curve, sigma, blend);
    }

    private static double percentile(@Nullable Entity entity, String key) {
        if (entity == null) return 0.5;

        Map<String, Double> stored = entity.getAttached(PERCENTILES);
        Double percentile = stored == null ? null : stored.get(key);
        if (percentile != null) return percentile;

        // Only the server draws and saves values, the client falls back on the median
        if (entity.level().isClientSide()) return 0.5;

        double drawn = entity.getRandom().nextDouble();
        Map<String, Double> updated = stored == null ? new HashMap<>() : new HashMap<>(stored);
        updated.put(key, drawn);
        entity.setAttached(PERCENTILES, updated);
        return drawn;
    }

    private static double sigma(double curve) {
        String source = CONFIG.rangeSigmaFormula();
        if (!source.equals(sigmaSource)) {
            sigmaFormula = compile(source, SIGMA_FALLBACK, "sigma");
            sigmaSource = source;
        }
        double sigma = sigmaFormula.eval(curve, Double.NaN);
        if (!Double.isFinite(sigma) || sigma <= 0) {
            warnOnce("sigma|" + source + "|" + curve, "Sigma formula \"{}\" gave {} for x = {}, using the default formula instead", source, sigma, curve);
            sigma = SIGMA_FALLBACK.eval(curve, Double.NaN);
        }
        return sigma;
    }

    private static double blendWeight(double curve, double sigma) {
        String source = CONFIG.rangeBlendFormula();
        if (!source.equals(blendSource)) {
            blendFormula = compile(source, BLEND_FALLBACK, "blend");
            blendSource = source;
        }
        double weight = blendFormula.eval(curve, sigma);
        if (!Double.isFinite(weight)) {
            warnOnce("blend|" + source + "|" + curve, "Blend formula \"{}\" gave {} for x = {} and sigma = {}, using the full curve instead", source, weight, curve, sigma);
            return 1;
        }
        return weight;
    }

    private static Formula compile(String source, Formula fallback, String name) {
        try {
            return Formula.parse(source);
        } catch (IllegalArgumentException e) {
            warnOnce(name + "|" + source, "Invalid {} formula: {}. Using the default formula instead", name, e.getMessage());
            return fallback;
        }
    }

    private static void warnOnce(String id, String message, Object... args) {
        if (WARNED.add(id)) {
            LOGGER.warn(message, args);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> Option<T> option(String key) {
        return (Option<T>) OPTION_CACHE.computeIfAbsent(key, k -> {
            Option<?> option = CONFIG.optionForKey(new Option.Key(k));
            if (option == null) {
                throw new IllegalArgumentException("Unknown config option " + k);
            }
            return option;
        });
    }
}
