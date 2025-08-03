package net.fneifnox.custommobattributes;

import io.wispforest.owo.config.Option;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class AttributeUpdater {

    private static final Identifier HEALTH_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "health_modifier");
    private static final Identifier DAMAGE_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "damage_modifier");
    private static final Identifier SPEED_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "speed_modifier");
    private static final Identifier SCALE_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "scale_modifier");

    private static final Map<EntityType<?>, Consumer<LivingEntity>> ATTRIBUTE_HANDLERS = new HashMap<>();

    public static void initAttributeHandlers() {
        ATTRIBUTE_HANDLERS.put(EntityType.ALLAY, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ALLAY, CONFIG::healthMultiplierForAllay, CONFIG::damageMultiplierForAllay, CONFIG::speedMultiplierForAllay, CONFIG::scaleMultiplierForAllay
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ARMADILLO, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ARMADILLO, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.AXOLOTL, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.AXOLOTL, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BAT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BAT, CONFIG::healthMultiplierForBat, null, null, CONFIG::scaleMultiplierForBat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BEE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BEE, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, null, CONFIG::scaleMultiplierForBee
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BLAZE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BLAZE, CONFIG::healthMultiplierForBlaze, CONFIG::damageMultiplierForBlaze, CONFIG::speedMultiplierForBlaze, CONFIG::scaleMultiplierForBlaze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BOGGED, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BOGGED, CONFIG::healthMultiplierForBogged, CONFIG::damageMultiplierForBogged, CONFIG::speedMultiplierForBogged, CONFIG::scaleMultiplierForBogged
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BREEZE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BREEZE, CONFIG::healthMultiplierForBreeze, CONFIG::damageMultiplierForBreeze, CONFIG::speedMultiplierForBreeze, CONFIG::scaleMultiplierForBreeze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAMEL, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CAMEL, CONFIG::healthMultiplierForCamel, null, CONFIG::speedMultiplierForCamel, CONFIG::scaleMultiplierForCamel
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAVE_SPIDER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CAVE_SPIDER, CONFIG::healthMultiplierForCaveSpider, CONFIG::damageMultiplierForCaveSpider, CONFIG::speedMultiplierForCaveSpider, CONFIG::scaleMultiplierForCaveSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CAT, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CHICKEN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CHICKEN, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COD, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.COD, CONFIG::healthMultiplierForCod, null, null, CONFIG::scaleMultiplierForCod
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COW, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.COW, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREEPER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CREEPER, CONFIG::healthMultiplierForCreeper, CONFIG::damageMultiplierForCreeper, CONFIG::speedMultiplierForCreeper, CONFIG::scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREAKING, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CREAKING, CONFIG::healthMultiplierForCreaking, CONFIG::damageMultiplierForCreaking, CONFIG::speedMultiplierForCreaking, CONFIG::scaleMultiplierForCreaking
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DONKEY, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.DONKEY, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DOLPHIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.DOLPHIN, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DROWNED, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.DROWNED, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ELDER_GUARDIAN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ELDER_GUARDIAN, CONFIG::healthMultiplierForElderGuardian, CONFIG::damageMultiplierForElderGuardian, CONFIG::speedMultiplierForElderGuardian, CONFIG::scaleMultiplierForElderGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDER_DRAGON, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ENDER_DRAGON, CONFIG::healthMultiplierForEnderDragon, CONFIG::damageMultiplierForEnderDragon, null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMAN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ENDERMAN, CONFIG::healthMultiplierForEnderman, CONFIG::damageMultiplierForEnderman, CONFIG::speedMultiplierForEnderman, CONFIG::scaleMultiplierForEnderman
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMITE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ENDERMITE, CONFIG::healthMultiplierForEndermite, CONFIG::damageMultiplierForEndermite, CONFIG::speedMultiplierForEndermite, CONFIG::scaleMultiplierForEndermite
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.EVOKER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.EVOKER, CONFIG::healthMultiplierForEvoker, CONFIG::damageMultiplierForEvoker, CONFIG::speedMultiplierForEvoker, CONFIG::scaleMultiplierForEvoker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FOX, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.FOX, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FROG, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.FROG, CONFIG::healthMultiplierForFrog, CONFIG::damageMultiplierForFrog, CONFIG::speedMultiplierForFrog, CONFIG::scaleMultiplierForFrog
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GHAST, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GHAST, CONFIG::healthMultiplierForGhast, null, CONFIG::speedMultiplierForGhast, CONFIG::scaleMultiplierForGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GIANT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GIANT, CONFIG::healthMultiplierForGiant, CONFIG::damageMultiplierForGiant, CONFIG::speedMultiplierForGiant, CONFIG::scaleMultiplierForGiant
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GLOW_SQUID, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GLOW_SQUID, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GOAT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GOAT, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GUARDIAN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GUARDIAN, CONFIG::healthMultiplierForGuardian, CONFIG::damageMultiplierForGuardian, CONFIG::speedMultiplierForGuardian, CONFIG::scaleMultiplierForGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HAPPY_GHAST, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.HAPPY_GHAST, CONFIG::healthMultiplierForHappyGhast, null, CONFIG::speedMultiplierForHappyGhast, CONFIG::scaleMultiplierForHappyGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HOGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.HOGLIN, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HORSE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.HORSE, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HUSK, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.HUSK, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ILLUSIONER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ILLUSIONER, CONFIG::healthMultiplierForIllusioner, CONFIG::damageMultiplierForIllusioner, CONFIG::speedMultiplierForIllusioner, CONFIG::scaleMultiplierForIllusioner
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.IRON_GOLEM, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.IRON_GOLEM, CONFIG::healthMultiplierForIronGolem, CONFIG::damageMultiplierForIronGolem, CONFIG::speedMultiplierForIronGolem, CONFIG::scaleMultiplierForIronGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.LLAMA, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.LLAMA, CONFIG::healthMultiplierForLlama, null, CONFIG::speedMultiplierForLlama, CONFIG::scaleMultiplierForLlama
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MAGMA_CUBE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.MAGMA_CUBE, CONFIG::healthMultiplierForMagmaCube, CONFIG::damageMultiplierForMagmaCube, CONFIG::speedMultiplierForMagmaCube, CONFIG::scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MOOSHROOM, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.MOOSHROOM, CONFIG::healthMultiplierForMooshroom, null, CONFIG::speedMultiplierForMooshroom, CONFIG::scaleMultiplierForMooshroom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MULE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.MULE, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.OCELOT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.OCELOT, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PANDA, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PANDA, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PARROT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PARROT, CONFIG::healthMultiplierForParrot, CONFIG::damageMultiplierForParrot, CONFIG::speedMultiplierForParrot, CONFIG::scaleMultiplierForParrot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PHANTOM, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PHANTOM, CONFIG::healthMultiplierForPhantom, CONFIG::damageMultiplierForPhantom, CONFIG::speedMultiplierForPhantom, CONFIG::scaleMultiplierForPhantom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIG, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PIG, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PIGLIN, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN_BRUTE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PIGLIN_BRUTE, CONFIG::healthMultiplierForPiglinBrute, CONFIG::damageMultiplierForPiglinBrute, CONFIG::speedMultiplierForPiglinBrute, CONFIG::scaleMultiplierForPiglinBrute
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PILLAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PILLAGER, CONFIG::healthMultiplierForPillager, CONFIG::damageMultiplierForPillager, CONFIG::speedMultiplierForPillager, CONFIG::scaleMultiplierForPillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.POLAR_BEAR, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.POLAR_BEAR, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PUFFERFISH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PUFFERFISH, CONFIG::healthMultiplierForPufferfish, null, null, CONFIG::scaleMultiplierForPufferfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RABBIT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.RABBIT, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RAVAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.RAVAGER, CONFIG::healthMultiplierForRavager, CONFIG::damageMultiplierForRavager, CONFIG::speedMultiplierForRavager, CONFIG::scaleMultiplierForRavager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SALMON, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SALMON, CONFIG::healthMultiplierForSalmon, null, null, CONFIG::scaleMultiplierForSalmon
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHEEP, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SHEEP, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHULKER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SHULKER, CONFIG::healthMultiplierForShulker, null, null, CONFIG::scaleMultiplierForShulker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SILVERFISH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SILVERFISH, CONFIG::healthMultiplierForSilverfish, CONFIG::damageMultiplierForSilverfish, CONFIG::speedMultiplierForSilverfish, CONFIG::scaleMultiplierForSilverfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SKELETON, CONFIG::healthMultiplierForSkeleton, CONFIG::damageMultiplierForSkeleton, CONFIG::speedMultiplierForSkeleton, CONFIG::scaleMultiplierForSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON_HORSE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SKELETON_HORSE, CONFIG::healthMultiplierForSkeletonHorse, null, CONFIG::speedMultiplierForSkeletonHorse, CONFIG::scaleMultiplierForSkeletonHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SLIME, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SLIME, CONFIG::healthMultiplierForSlime, CONFIG::damageMultiplierForSlime, CONFIG::speedMultiplierForSlime, CONFIG::scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNIFFER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SNIFFER, CONFIG::healthMultiplierForSniffer, null, CONFIG::speedMultiplierForSniffer, CONFIG::scaleMultiplierForSniffer
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNOW_GOLEM, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SNOW_GOLEM, CONFIG::healthMultiplierForSnowGolem, null, CONFIG::speedMultiplierForSnowGolem, CONFIG::scaleMultiplierForSnowGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SPIDER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SPIDER, CONFIG::healthMultiplierForSpider, CONFIG::damageMultiplierForSpider, CONFIG::speedMultiplierForSpider, CONFIG::scaleMultiplierForSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SQUID, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SQUID, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRAY, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.STRAY, CONFIG::healthMultiplierForStray, CONFIG::damageMultiplierForStray, CONFIG::speedMultiplierForStray, CONFIG::scaleMultiplierForStray
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRIDER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.STRIDER, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TADPOLE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.TADPOLE, CONFIG::healthMultiplierForTadpole, null, null, CONFIG::scaleMultiplierForTadpole
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TRADER_LLAMA, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.TRADER_LLAMA, CONFIG::healthMultiplierForTraderLlama, null, CONFIG::speedMultiplierForTraderLlama, CONFIG::scaleMultiplierForTraderLlama
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TROPICAL_FISH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.TROPICAL_FISH, CONFIG::healthMultiplierForTropicalFish, null, null, CONFIG::scaleMultiplierForTropicalFish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TURTLE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.TURTLE, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VEX, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.VEX, CONFIG::healthMultiplierForVex, CONFIG::damageMultiplierForVex, CONFIG::speedMultiplierForVex, CONFIG::scaleMultiplierForVex
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VILLAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.VILLAGER, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VINDICATOR, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.VINDICATOR, CONFIG::healthMultiplierForVindicator, CONFIG::damageMultiplierForVindicator, CONFIG::speedMultiplierForVindicator, CONFIG::scaleMultiplierForVindicator
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WANDERING_TRADER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WANDERING_TRADER, CONFIG::healthMultiplierForWanderingTrader, null, CONFIG::speedMultiplierForWanderingTrader, CONFIG::scaleMultiplierForWanderingTrader
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WARDEN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WARDEN, CONFIG::healthMultiplierForWarden, CONFIG::damageMultiplierForWarden, CONFIG::speedMultiplierForWarden, CONFIG::scaleMultiplierForWarden
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITCH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WITCH, CONFIG::healthMultiplierForWitch, CONFIG::damageMultiplierForWitch, CONFIG::speedMultiplierForWitch, CONFIG::scaleMultiplierForWitch
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WITHER, CONFIG::healthMultiplierForWither, CONFIG::damageMultiplierForWither, CONFIG::speedMultiplierForWither, CONFIG::scaleMultiplierForWither
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER_SKELETON, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WITHER_SKELETON, CONFIG::healthMultiplierForWitherSkeleton, CONFIG::damageMultiplierForWitherSkeleton, CONFIG::speedMultiplierForWitherSkeleton, CONFIG::scaleMultiplierForWitherSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WOLF, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WOLF, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOGLIN, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOMBIE, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_HORSE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOMBIE_HORSE, CONFIG::healthMultiplierForZombieHorse, null, CONFIG::speedMultiplierForZombieHorse, CONFIG::scaleMultiplierForZombieHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_VILLAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOMBIE_VILLAGER, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIFIED_PIGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOMBIFIED_PIGLIN, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
            );
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish and Tadpole have their own Mixin
    }


    public static void register() {
        initAttributeHandlers();

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
            @Nullable Supplier<Float> healthMultiplier,
            @Nullable Supplier<Float> damageMultiplier,
            @Nullable Supplier<Float> speedMultiplier,
            @Nullable Supplier<Float> scaleMultiplier
    ) {
        Box box = new Box(new Vec3d(-1_000_000, -1_000_000, -1_000_000), new Vec3d(1_000_000, 1_000_000, 1_000_000));
        Predicate<Entity> predicate = entityType == EntityType.ENDER_DRAGON
                ? e -> e instanceof EnderDragonEntity
                : e -> e instanceof LivingEntity;

        for (T entity : world.getEntitiesByType(entityType, box, predicate)) {
            var health = entity.getAttributeInstance(EntityAttributes.MAX_HEALTH);
            if (health != null) {
                float val = (float) health.getBaseValue() * healthMultiplier.get() * CONFIG.healthMultiplierForAll();
                if (health.getValue() != val) {
                    updateModifier(entity, EntityAttributes.MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * CONFIG.healthMultiplierForAll());
                    entity.setHealth(val);
                }
            }
            if (damageMultiplier != null) {
                updateModifier(entity, EntityAttributes.ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * CONFIG.damageMultiplierForAll());
            }
            if (speedMultiplier != null) {
                updateModifier(entity, EntityAttributes.MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * CONFIG.speedMultiplierForAll());
                if (entity.getAttributeInstance(EntityAttributes.FLYING_SPEED) != null) {
                    System.out.println("TEST 1");
                    updateModifier(entity, EntityAttributes.FLYING_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * CONFIG.speedMultiplierForAll());
                }
            }
            if (scaleMultiplier != null) {
                updateModifier(entity, EntityAttributes.SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * CONFIG.scaleMultiplierForAll());
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

