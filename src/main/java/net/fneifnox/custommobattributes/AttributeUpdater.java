package net.fneifnox.custommobattributes;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.init.Vanilla;
import net.fneifnox.custommobattributes.init.compat.*;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = CustomMobAttributes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AttributeUpdater {

    private static final UUID HEALTH_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    private static final UUID DAMAGE_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174001");
    private static final UUID SPEED_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174002");
    private static final UUID SCALE_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174003");

    public static final Map<EntityType<?>, Consumer<LivingEntity>> ATTRIBUTE_HANDLERS = new HashMap<>();
    public static final Map<LivingEntity, Integer> pendingEntities = new ConcurrentHashMap<>();

    public static void register() {
        Vanilla.initVanillaAttributeHandlers();

        if (ModList.get().isLoaded("vanillabackport")) {
            VanillaBackportCompat.initVanillaBackportAttributeHandlers();
        }
        if (ModList.get().isLoaded("frycmobvariants")) {
            MobVariantsCompat.initMobVariantsAttributeHandlers();
        }
        if (ModList.get().isLoaded("betterend")) {
            BetterEndCompat.initBetterEndAttributeHandlers();
        }
        if (ModList.get().isLoaded("betternether")) {
            BetterNetherCompat.initBetterNetherAttributeHandlers();
        }
        if (ModList.get().isLoaded("variantsandventures")) {
            VariantsAndVenturesCompat.initVariantsAndVenturesAttributeHandlers();
        }
        if (ModList.get().isLoaded("friendsandfoes")) {
            FriendsAndFoesCompat.initFriendsAndFoesAttributeHandlers();
        }
        if (ModList.get().isLoaded("takesapillage")) {
            ItTakesAPillageContinuationCompat.initItTakesAPillageContinuationAttributeHandlers();
        }
        if (ModList.get().isLoaded("deeperdarker")) {
            DeeperAndDarkerCompat.initDeeperAndDarkerAttributeHandlers();
        }
        if (ModList.get().isLoaded("illagerinvasion")) {
            IllagerInvasionCompat.initIllagerInvasionAttributeHandlers();
        }
        if (ModList.get().isLoaded("zombie_variants")) {
            ZombieVariantsCompat.initZombieVariantsAttributeHandlers();
        }
        if (ModList.get().isLoaded("ribbits")) {
            RibbitsCompat.initRibbitsAttributeHandlers();
        }
    }

    @SubscribeEvent
    public static void onEntityJoinWorld(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        Level world = event.getLevel();

        if (entity instanceof LivingEntity living && !world.isClientSide()) {
            Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(entity.getType());
            if (handler != null) {
                pendingEntities.put(living, 0);
            }
        }
    }

    @SubscribeEvent
    public static void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Iterator<Map.Entry<LivingEntity, Integer>> it = pendingEntities.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<LivingEntity, Integer> entry = it.next();
                LivingEntity entity = entry.getKey();
                int ticks = entry.getValue() + 1;

                if (!entity.isAlive()) {
                    it.remove();
                    continue;
                }

                if (ticks >= 1) {
                    var type = entity.getType();
                    Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(type);
                    if (handler != null) {
                        handler.accept(entity);
                    }
                    it.remove();
                } else {
                    entry.setValue(ticks);
                }
            }
        }
    }

    @SafeVarargs
    public static <T extends LivingEntity> void configureEntityAttributes(
            Level world,
            LivingEntity entity,
            @Nullable Supplier<Double> healthMultiplier,
            @Nullable Supplier<Double> damageMultiplier,
            @Nullable Supplier<Double> speedMultiplier,
            @Nullable Supplier<Double> scaleMultiplier,
            @Nullable Supplier<Double>... extraMultiplier
    ) {
        AABB box = new AABB(new Vec3(-1_000_000, -1_000_000, -1_000_000), new Vec3(1_000_000, 1_000_000, 1_000_000));

        if (Config.VANILLA.adultsAlsoAffectBabies.get() && entity.isBaby()) {
            var health = entity.getAttribute(Attributes.MAX_HEALTH);
            if (health != null && extraMultiplier.length >= 1) {
                double val = health.getBaseValue() * healthMultiplier.get() * extraMultiplier[0].get() * Config.VANILLA.healthMultiplierForBabyAll.get() * Config.VANILLA.healthMultiplierForAll.get();
                if (health.getValue() != val) {
                    updateModifier(entity, Attributes.MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * extraMultiplier[0].get() * Config.VANILLA.healthMultiplierForBabyAll.get() * Config.VANILLA.healthMultiplierForAll.get());
                    entity.setHealth((float) val);
                }
            }
            if (damageMultiplier != null && extraMultiplier.length >= 2) {
                updateModifier(entity, Attributes.ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * extraMultiplier[1].get() * Config.VANILLA.damageMultiplierForBabyAll.get() * Config.VANILLA.damageMultiplierForAll.get());
            }
            if (speedMultiplier != null && extraMultiplier.length >= 3) {
                updateModifier(entity, Attributes.MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * extraMultiplier[2].get() * Config.VANILLA.speedMultiplierForBabyAll.get() * Config.VANILLA.speedMultiplierForAll.get());
                if (entity.getAttribute(Attributes.FLYING_SPEED) != null) {
                    updateModifier(entity, Attributes.FLYING_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * extraMultiplier[2].get() * Config.VANILLA.speedMultiplierForBabyAll.get() * Config.VANILLA.speedMultiplierForAll.get());
                }
            }
            if (scaleMultiplier != null && extraMultiplier.length >= 4) {
                updateModifier(entity, CustomMobAttributes.SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * extraMultiplier[3].get() * Config.VANILLA.scaleMultiplierForBabyAll.get() * Config.VANILLA.scaleMultiplierForAll.get());
            }
        }

        else {
            var health = entity.getAttribute(Attributes.MAX_HEALTH);
            if (health != null) {
                double val = health.getBaseValue() * healthMultiplier.get() * (entity.isBaby() ? Config.VANILLA.healthMultiplierForBabyAll.get() : Config.VANILLA.healthMultiplierForAll.get());
                if (health.getValue() != val) {
                    updateModifier(entity, Attributes.MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * (entity.isBaby() ? Config.VANILLA.healthMultiplierForBabyAll.get() : Config.VANILLA.healthMultiplierForAll.get()));
                    entity.setHealth((float) val);
                }
            }
            if (damageMultiplier != null) {
                updateModifier(entity, Attributes.ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * (entity.isBaby() ? Config.VANILLA.damageMultiplierForBabyAll.get() : Config.VANILLA.damageMultiplierForAll.get()));
            }
            if (speedMultiplier != null) {
                updateModifier(entity, Attributes.MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * (entity.isBaby() ? Config.VANILLA.speedMultiplierForBabyAll.get() : Config.VANILLA.speedMultiplierForAll.get()));
                if (entity.getAttribute(Attributes.FLYING_SPEED) != null) {
                    updateModifier(entity, Attributes.FLYING_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * (entity.isBaby() ? Config.VANILLA.speedMultiplierForBabyAll.get() : Config.VANILLA.speedMultiplierForAll.get()));
                }
            }
            if (scaleMultiplier != null) {
                updateModifier(entity, CustomMobAttributes.SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * (entity.isBaby() ? Config.VANILLA.scaleMultiplierForBabyAll.get() : Config.VANILLA.scaleMultiplierForAll.get()));
            }
        }
    }

    private static void updateModifier(
            LivingEntity entity,
            Attribute entry,
            UUID id,
            double multiplier
    ) {
        var attrInstance = entity.getAttribute(entry);
        if (attrInstance == null) return;

        var oldModifier = attrInstance.getModifier(id);
        if (oldModifier != null) {
            attrInstance.removeModifier(oldModifier.getId());
        }

        if (multiplier == 1.0) return;

        double amount = attrInstance.getBaseValue() * (multiplier - 1);
        AttributeModifier modifier = new AttributeModifier(
                id,
                "attribute modifier",
                amount,
                AttributeModifier.Operation.ADDITION
        );
        attrInstance.addPermanentModifier(modifier);
    }
}

