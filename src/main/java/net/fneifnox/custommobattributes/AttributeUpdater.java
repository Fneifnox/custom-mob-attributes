package net.fneifnox.custommobattributes;

import io.wispforest.owo.config.Option;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fneifnox.custommobattributes.init.Vanilla;
import net.fneifnox.custommobattributes.init.compat.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class AttributeUpdater {

    private static final Identifier HEALTH_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "health_modifier");
    private static final Identifier DAMAGE_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "damage_modifier");
    private static final Identifier SPEED_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "speed_modifier");
    private static final Identifier SCALE_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "scale_modifier");

    public static final Map<EntityType<?>, Consumer<LivingEntity>> ATTRIBUTE_HANDLERS = new HashMap<>();

    public static void register() {
        Vanilla.initVanillaAttributeHandlers();

        if (FabricLoader.getInstance().isModLoaded("frycmobvariants")) {
            MobVariantsCompat.initMobVariantsAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            BetterEndCompat.initBetterEndAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            BetterNetherCompat.initBetterNetherAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("variantsandventures")) {
            VariantsAndVenturesCompat.initVariantsAndVenturesAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("friendsandfoes")) {
            FriendsAndFoesCompat.initFriendsAndFoesAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("takesapillage")) {
            ItTakesAPillageContinuationCompat.initItTakesAPillageContinuationAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            DeeperAndDarkerCompat.initDeeperAndDarkerAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("illagerinvasion")) {
            IllagerInvasionCompat.initIllagerInvasionAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("zombie_variants")) {
            ZombieVariantsCompat.initZombieVariantsAttributeHandlers();
        }
        if (FabricLoader.getInstance().isModLoaded("ribbits")) {
            RibbitsCompat.initRibbitsAttributeHandlers();
        }

        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof LivingEntity living && !world.isClient) {
                Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(entity.getType());
                if (handler != null) {
                    handler.accept(living);
                }
            }
        });
    }

    public static void reloadConfig(MinecraftServer server) {
        for (ServerWorld world : server.getWorlds()) {
            for (Entity entity : world.iterateEntities()) {
                if (!(entity instanceof LivingEntity living)) continue;

                Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(entity.getType());
                if (handler != null) {
                    handler.accept(living);
                }
            }
        }
    }

    public static void observeAllConfigChanges(Runnable callback) {
        for (Field field : CONFIG.getClass().getDeclaredFields()) {
            if (!Option.class.isAssignableFrom(field.getType())) continue;
            field.setAccessible(true);
            try {
                @SuppressWarnings("unchecked")
                Option<Object> option = (Option<Object>) field.get(CONFIG);
                option.observe(val -> callback.run());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @SafeVarargs
    public static <T extends LivingEntity> void configureEntityAttributes(
            World world,
            LivingEntity entity,
            @Nullable Supplier<Double> healthMultiplier,
            @Nullable Supplier<Double> damageMultiplier,
            @Nullable Supplier<Double> speedMultiplier,
            @Nullable Supplier<Double> scaleMultiplier,
            @Nullable Supplier<Double>... extraMultiplier
    ) {

        if (CONFIG.adultsAlsoAffectBabies() && entity.isBaby()) {
            var health = entity.getAttributeInstance(EntityAttributes.MAX_HEALTH);
            if (health != null && extraMultiplier.length >= 1) {
                double val = health.getBaseValue() * healthMultiplier.get() * extraMultiplier[0].get() * CONFIG.healthMultiplierForBabyAll() * CONFIG.healthMultiplierForAll();
                if (health.getValue() != val) {
                    updateModifier(entity, EntityAttributes.MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * extraMultiplier[0].get() * CONFIG.healthMultiplierForBabyAll() * CONFIG.healthMultiplierForAll());
                    entity.setHealth((float) val);
                }
            }
            if (damageMultiplier != null && extraMultiplier.length >= 2) {
                updateModifier(entity, EntityAttributes.ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * extraMultiplier[1].get() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForAll());
            }
            if (speedMultiplier != null && extraMultiplier.length >= 3) {
                updateModifier(entity, EntityAttributes.MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * extraMultiplier[2].get() * CONFIG.speedMultiplierForBabyAll() * CONFIG.speedMultiplierForAll());
                if (entity.getAttributeInstance(EntityAttributes.FLYING_SPEED) != null) {
                    updateModifier(entity, EntityAttributes.FLYING_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * extraMultiplier[2].get() * CONFIG.speedMultiplierForBabyAll() * CONFIG.speedMultiplierForAll());
                }
            }
            if (scaleMultiplier != null && extraMultiplier.length >= 4) {
                updateModifier(entity, EntityAttributes.SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * extraMultiplier[3].get() * CONFIG.scaleMultiplierForBabyAll() * CONFIG.scaleMultiplierForAll());
            }
        }

        else {
            var health = entity.getAttributeInstance(EntityAttributes.MAX_HEALTH);
            if (health != null) {
                double val = health.getBaseValue() * healthMultiplier.get() * (entity.isBaby() ? CONFIG.healthMultiplierForBabyAll() : CONFIG.healthMultiplierForAll());
                if (health.getValue() != val) {
                    updateModifier(entity, EntityAttributes.MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * (entity.isBaby() ? CONFIG.healthMultiplierForBabyAll() : CONFIG.healthMultiplierForAll()));
                    entity.setHealth((float) val);
                }
            }
            if (damageMultiplier != null) {
                updateModifier(entity, EntityAttributes.ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * (entity.isBaby() ? CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForAll()));
            }
            if (speedMultiplier != null) {
                updateModifier(entity, EntityAttributes.MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * (entity.isBaby() ? CONFIG.speedMultiplierForBabyAll() : CONFIG.speedMultiplierForAll()));
                if (entity.getAttributeInstance(EntityAttributes.FLYING_SPEED) != null) {
                    updateModifier(entity, EntityAttributes.FLYING_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * (entity.isBaby() ? CONFIG.speedMultiplierForBabyAll() : CONFIG.speedMultiplierForAll()));
                }
            }
            if (scaleMultiplier != null) {
                updateModifier(entity, EntityAttributes.SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * (entity.isBaby() ? CONFIG.scaleMultiplierForBabyAll() : CONFIG.scaleMultiplierForAll()));
            }
        }
    }

    private static void updateModifier(
            LivingEntity entity,
            RegistryEntry<EntityAttribute> entry,
            Identifier id,
            double multiplier
    ) {
        var attrInstance = entity.getAttributeInstance(entry);
        if (attrInstance == null) return;

        var oldModifier = attrInstance.getModifier(id);
        if (oldModifier != null) {
            attrInstance.removeModifier(oldModifier);
        }

        if (multiplier == 1.0) return;

        double amount = attrInstance.getBaseValue() * (multiplier - 1);
        EntityAttributeModifier modifier = new EntityAttributeModifier(
                id,
                amount,
                EntityAttributeModifier.Operation.ADD_VALUE
        );
        attrInstance.addPersistentModifier(modifier);
    }
}

