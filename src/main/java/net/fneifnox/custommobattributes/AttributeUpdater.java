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
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class AttributeUpdater {

    private static final UUID HEALTH_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    private static final UUID DAMAGE_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174001");
    private static final UUID SPEED_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174002");
    private static final UUID SCALE_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174003");

    public static final Map<EntityType<?>, Consumer<LivingEntity>> ATTRIBUTE_HANDLERS = new HashMap<>();

    public static void register() {
        Vanilla.initVanillaAttributeHandlers();

        if (FabricLoader.getInstance().isModLoaded("vanillabackport")) {
            VanillaBackportCompat.initVanillaBackportAttributeHandlers();
        }
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

    public static <T extends LivingEntity> void configureEntityAttributes(
            World world,
            EntityType<T> entityType,
            @Nullable Supplier<Double> healthMultiplier,
            @Nullable Supplier<Double> damageMultiplier,
            @Nullable Supplier<Double> speedMultiplier,
            @Nullable Supplier<Double> scaleMultiplier
    ) {
        Box box = new Box(new Vec3d(-1_000_000, -1_000_000, -1_000_000), new Vec3d(1_000_000, 1_000_000, 1_000_000));
        Predicate<Entity> predicate = entityType == EntityType.ENDER_DRAGON
                ? e -> e instanceof EnderDragonEntity
                : e -> e instanceof LivingEntity;

        for (T entity : world.getEntitiesByType(entityType, box, predicate)) {
            if (CONFIG.parentsAlsoAffectBabies() && entity.isBaby()) {
                var health = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = health.getBaseValue() * healthMultiplier.get() * CONFIG.healthMultiplierForBabyAll() * CONFIG.healthMultiplierForAll();
                    if (health.getValue() != val) {
                        updateModifier(entity, EntityAttributes.GENERIC_MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * CONFIG.healthMultiplierForBabyAll() * CONFIG.healthMultiplierForAll());
                        entity.setHealth((float) val);
                    }
                }
                if (damageMultiplier != null) {
                    updateModifier(entity, EntityAttributes.GENERIC_ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForAll());
                }
                if (speedMultiplier != null) {
                    updateModifier(entity, EntityAttributes.GENERIC_MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * CONFIG.speedMultiplierForBabyAll() * CONFIG.speedMultiplierForAll());
                    if (entity.getAttributeInstance(EntityAttributes.GENERIC_FLYING_SPEED) != null) {
                        updateModifier(entity, EntityAttributes.GENERIC_FLYING_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * CONFIG.speedMultiplierForBabyAll() * CONFIG.speedMultiplierForAll());
                    }
                }
                if (scaleMultiplier != null) {
                    updateModifier(entity, EntityAttributes.GENERIC_SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * CONFIG.scaleMultiplierForBabyAll() * CONFIG.scaleMultiplierForAll());
                }
            }
            else {
                var health = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = health.getBaseValue() * healthMultiplier.get() * (entity.isBaby() ? CONFIG.healthMultiplierForBabyAll() : CONFIG.healthMultiplierForAll());
                    if (health.getValue() != val) {
                        updateModifier(entity, EntityAttributes.GENERIC_MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * (entity.isBaby() ? CONFIG.healthMultiplierForBabyAll() : CONFIG.healthMultiplierForAll()));
                        entity.setHealth((float) val);
                    }
                }
                if (damageMultiplier != null) {
                    updateModifier(entity, EntityAttributes.GENERIC_ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * (entity.isBaby() ? CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForAll()));
                }
                if (speedMultiplier != null) {
                    updateModifier(entity, EntityAttributes.GENERIC_MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * (entity.isBaby() ? CONFIG.speedMultiplierForBabyAll() : CONFIG.speedMultiplierForAll()));
                    if (entity.getAttributeInstance(EntityAttributes.GENERIC_FLYING_SPEED) != null) {
                        updateModifier(entity, EntityAttributes.GENERIC_FLYING_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * (entity.isBaby() ? CONFIG.speedMultiplierForBabyAll() : CONFIG.speedMultiplierForAll()));
                    }
                }
                if (scaleMultiplier != null) {
                    updateModifier(entity, EntityAttributes.GENERIC_SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * (entity.isBaby() ? CONFIG.scaleMultiplierForBabyAll() : CONFIG.scaleMultiplierForAll()));
                }
            }
        }
    }

    private static void updateModifier(
            LivingEntity entity,
            EntityAttribute entry,
            UUID id,
            double multiplier
    ) {
        var attrInstance = entity.getAttributeInstance(entry);
        if (attrInstance == null) return;

        var oldModifier = attrInstance.getModifier(id);
        if (oldModifier != null) {
            attrInstance.removeModifier(oldModifier.getId());
        }

        if (multiplier == 1.0) return;

        double amount = attrInstance.getBaseValue() * (multiplier - 1);
        EntityAttributeModifier modifier = new EntityAttributeModifier(
                id,
                "attribute modifier",
                amount,
                EntityAttributeModifier.Operation.ADDITION
        );
        attrInstance.addPersistentModifier(modifier);
    }
}

