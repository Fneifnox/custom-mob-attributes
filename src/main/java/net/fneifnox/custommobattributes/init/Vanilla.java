package net.fneifnox.custommobattributes.init;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;

public class Vanilla {

    public static void initVanillaAttributeHandlers() {

        ATTRIBUTE_HANDLERS.put(EntityType.ALLAY, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ALLAY, Config.VANILLA.healthMultiplierForAllay, Config.VANILLA.damageMultiplierForAllay, Config.VANILLA.speedMultiplierForAllay, Config.VANILLA.scaleMultiplierForAllay
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.AXOLOTL, entity -> {
            configureEntityAttributes(entity.level(), EntityType.AXOLOTL, Config.VANILLA.healthMultiplierForAxolotl, Config.VANILLA.damageMultiplierForAxolotl, Config.VANILLA.speedMultiplierForAxolotl, Config.VANILLA.scaleMultiplierForAxolotl
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BAT, entity -> {
            configureEntityAttributes(entity.level(), EntityType.BAT, Config.VANILLA.healthMultiplierForBat, null, Config.VANILLA.speedMultiplierForBat, Config.VANILLA.scaleMultiplierForBat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BEE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.BEE, Config.VANILLA.healthMultiplierForBee, Config.VANILLA.damageMultiplierForBee, Config.VANILLA.speedMultiplierForBee, Config.VANILLA.scaleMultiplierForBee
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BLAZE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.BLAZE, Config.VANILLA.healthMultiplierForBlaze, Config.VANILLA.damageMultiplierForBlaze, Config.VANILLA.speedMultiplierForBlaze, Config.VANILLA.scaleMultiplierForBlaze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAMEL, entity -> {
            configureEntityAttributes(entity.level(), EntityType.CAMEL, Config.VANILLA.healthMultiplierForCamel, null, Config.VANILLA.speedMultiplierForCamel, Config.VANILLA.scaleMultiplierForCamel
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAVE_SPIDER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.CAVE_SPIDER, Config.VANILLA.healthMultiplierForCaveSpider, Config.VANILLA.damageMultiplierForCaveSpider, Config.VANILLA.speedMultiplierForCaveSpider, Config.VANILLA.scaleMultiplierForCaveSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAT, entity -> {
            configureEntityAttributes(entity.level(), EntityType.CAT, Config.VANILLA.healthMultiplierForCat, Config.VANILLA.damageMultiplierForCat, Config.VANILLA.speedMultiplierForCat, Config.VANILLA.scaleMultiplierForCat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CHICKEN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.CHICKEN, Config.VANILLA.healthMultiplierForChicken, null, Config.VANILLA.speedMultiplierForChicken, Config.VANILLA.scaleMultiplierForChicken
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COD, entity -> {
            configureEntityAttributes(entity.level(), EntityType.COD, Config.VANILLA.healthMultiplierForCod, null, null, Config.VANILLA.scaleMultiplierForCod
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COW, entity -> {
            configureEntityAttributes(entity.level(), EntityType.COW, Config.VANILLA.healthMultiplierForCow, null, Config.VANILLA.speedMultiplierForCow, Config.VANILLA.scaleMultiplierForCow
            );
        });
// TODO
        ATTRIBUTE_HANDLERS.put(EntityType.CREEPER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.CREEPER, Config.VANILLA.healthMultiplierForCreeper, Config.VANILLA.damageMultiplierForCreeper, Config.VANILLA.speedMultiplierForCreeper, Config.VANILLA.scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREEPER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.CREEPER, Config.VANILLA.healthMultiplierForCreeper, Config.VANILLA.damageMultiplierForCreeper, Config.VANILLA.speedMultiplierForCreeper, Config.VANILLA.scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DONKEY, entity -> {
            configureEntityAttributes(entity.level(), EntityType.DONKEY, Config.VANILLA.healthMultiplierForDonkey, null, Config.VANILLA.speedMultiplierForDonkey, Config.VANILLA.scaleMultiplierForDonkey
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DOLPHIN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.DOLPHIN, Config.VANILLA.healthMultiplierForDolphin, Config.VANILLA.damageMultiplierForDolphin, Config.VANILLA.speedMultiplierForDolphin, Config.VANILLA.scaleMultiplierForDolphin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DROWNED, entity -> {
            configureEntityAttributes(entity.level(), EntityType.DROWNED, Config.VANILLA.healthMultiplierForDrowned, Config.VANILLA.damageMultiplierForDrowned, Config.VANILLA.speedMultiplierForDrowned, Config.VANILLA.scaleMultiplierForDrowned
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ELDER_GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ELDER_GUARDIAN, Config.VANILLA.healthMultiplierForElderGuardian, Config.VANILLA.damageMultiplierForElderGuardian, Config.VANILLA.speedMultiplierForElderGuardian, Config.VANILLA.scaleMultiplierForElderGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDER_DRAGON, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ENDER_DRAGON, Config.VANILLA.healthMultiplierForEnderDragon, Config.VANILLA.damageMultiplierForEnderDragon, null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMAN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ENDERMAN, Config.VANILLA.healthMultiplierForEnderman, Config.VANILLA.damageMultiplierForEnderman, Config.VANILLA.speedMultiplierForEnderman, Config.VANILLA.scaleMultiplierForEnderman
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMITE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ENDERMITE, Config.VANILLA.healthMultiplierForEndermite, Config.VANILLA.damageMultiplierForEndermite, Config.VANILLA.speedMultiplierForEndermite, Config.VANILLA.scaleMultiplierForEndermite
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.EVOKER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.EVOKER, Config.VANILLA.healthMultiplierForEvoker, Config.VANILLA.damageMultiplierForEvoker, Config.VANILLA.speedMultiplierForEvoker, Config.VANILLA.scaleMultiplierForEvoker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FOX, entity -> {
            configureEntityAttributes(entity.level(), EntityType.FOX, Config.VANILLA.healthMultiplierForFox, Config.VANILLA.damageMultiplierForFox, Config.VANILLA.speedMultiplierForFox, Config.VANILLA.scaleMultiplierForFox
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FROG, entity -> {
            configureEntityAttributes(entity.level(), EntityType.FROG, Config.VANILLA.healthMultiplierForFrog, Config.VANILLA.damageMultiplierForFrog, Config.VANILLA.speedMultiplierForFrog, Config.VANILLA.scaleMultiplierForFrog
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GHAST, entity -> {
            configureEntityAttributes(entity.level(), EntityType.GHAST, Config.VANILLA.healthMultiplierForGhast, null, Config.VANILLA.speedMultiplierForGhast, Config.VANILLA.scaleMultiplierForGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GIANT, entity -> {
            configureEntityAttributes(entity.level(), EntityType.GIANT, Config.VANILLA.healthMultiplierForGiant, Config.VANILLA.damageMultiplierForGiant, Config.VANILLA.speedMultiplierForGiant, Config.VANILLA.scaleMultiplierForGiant
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GLOW_SQUID, entity -> {
            configureEntityAttributes(entity.level(), EntityType.GLOW_SQUID, Config.VANILLA.healthMultiplierForGlowSquid, null, Config.VANILLA.speedMultiplierForGlowSquid, Config.VANILLA.scaleMultiplierForGlowSquid
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GOAT, entity -> {
            configureEntityAttributes(entity.level(), EntityType.GOAT, Config.VANILLA.healthMultiplierForGoat, Config.VANILLA.damageMultiplierForGoat, Config.VANILLA.speedMultiplierForGoat, Config.VANILLA.scaleMultiplierForGoat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.GUARDIAN, Config.VANILLA.healthMultiplierForGuardian, Config.VANILLA.damageMultiplierForGuardian, Config.VANILLA.speedMultiplierForGuardian, Config.VANILLA.scaleMultiplierForGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HOGLIN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.HOGLIN, Config.VANILLA.healthMultiplierForHoglin, Config.VANILLA.damageMultiplierForHoglin, Config.VANILLA.speedMultiplierForHoglin, Config.VANILLA.scaleMultiplierForHoglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HORSE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.HORSE, Config.VANILLA.healthMultiplierForHorse, null, Config.VANILLA.speedMultiplierForHorse, Config.VANILLA.scaleMultiplierForHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HUSK, entity -> {
            configureEntityAttributes(entity.level(), EntityType.HUSK, Config.VANILLA.healthMultiplierForHusk, Config.VANILLA.damageMultiplierForHusk, Config.VANILLA.speedMultiplierForHusk, Config.VANILLA.scaleMultiplierForHusk
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ILLUSIONER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ILLUSIONER, Config.VANILLA.healthMultiplierForIllusioner, Config.VANILLA.damageMultiplierForIllusioner, Config.VANILLA.speedMultiplierForIllusioner, Config.VANILLA.scaleMultiplierForIllusioner
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.IRON_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), EntityType.IRON_GOLEM, Config.VANILLA.healthMultiplierForIronGolem, Config.VANILLA.damageMultiplierForIronGolem, Config.VANILLA.speedMultiplierForIronGolem, Config.VANILLA.scaleMultiplierForIronGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.LLAMA, entity -> {
            configureEntityAttributes(entity.level(), EntityType.LLAMA, Config.VANILLA.healthMultiplierForLlama, null, Config.VANILLA.speedMultiplierForLlama, Config.VANILLA.scaleMultiplierForLlama
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MAGMA_CUBE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.MAGMA_CUBE, Config.VANILLA.healthMultiplierForMagmaCube, Config.VANILLA.damageMultiplierForMagmaCube, Config.VANILLA.speedMultiplierForMagmaCube, Config.VANILLA.scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MOOSHROOM, entity -> {
            configureEntityAttributes(entity.level(), EntityType.MOOSHROOM, Config.VANILLA.healthMultiplierForMooshroom, null, Config.VANILLA.speedMultiplierForMooshroom, Config.VANILLA.scaleMultiplierForMooshroom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MULE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.MULE, Config.VANILLA.healthMultiplierForMule, null, Config.VANILLA.speedMultiplierForMule, Config.VANILLA.scaleMultiplierForMule
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.OCELOT, entity -> {
            configureEntityAttributes(entity.level(), EntityType.OCELOT, Config.VANILLA.healthMultiplierForOcelot, Config.VANILLA.damageMultiplierForOcelot, Config.VANILLA.speedMultiplierForOcelot, Config.VANILLA.scaleMultiplierForOcelot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PANDA, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PANDA, Config.VANILLA.healthMultiplierForPanda, Config.VANILLA.damageMultiplierForPanda, Config.VANILLA.speedMultiplierForPanda, Config.VANILLA.scaleMultiplierForPanda
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PARROT, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PARROT, Config.VANILLA.healthMultiplierForParrot, Config.VANILLA.damageMultiplierForParrot, Config.VANILLA.speedMultiplierForParrot, Config.VANILLA.scaleMultiplierForParrot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PHANTOM, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PHANTOM, Config.VANILLA.healthMultiplierForPhantom, Config.VANILLA.damageMultiplierForPhantom, null, Config.VANILLA.scaleMultiplierForPhantom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIG, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PIG, Config.VANILLA.healthMultiplierForPig, null, Config.VANILLA.speedMultiplierForPig, Config.VANILLA.scaleMultiplierForPig
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PIGLIN, Config.VANILLA.healthMultiplierForPiglin, Config.VANILLA.damageMultiplierForPiglin, Config.VANILLA.speedMultiplierForPiglin, Config.VANILLA.scaleMultiplierForPiglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN_BRUTE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PIGLIN_BRUTE, Config.VANILLA.healthMultiplierForPiglinBrute, Config.VANILLA.damageMultiplierForPiglinBrute, Config.VANILLA.speedMultiplierForPiglinBrute, Config.VANILLA.scaleMultiplierForPiglinBrute
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PILLAGER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PILLAGER, Config.VANILLA.healthMultiplierForPillager, Config.VANILLA.damageMultiplierForPillager, Config.VANILLA.speedMultiplierForPillager, Config.VANILLA.scaleMultiplierForPillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.POLAR_BEAR, entity -> {
            configureEntityAttributes(entity.level(), EntityType.POLAR_BEAR, Config.VANILLA.healthMultiplierForPolarBear, Config.VANILLA.damageMultiplierForPolarBear, Config.VANILLA.speedMultiplierForPolarBear, Config.VANILLA.scaleMultiplierForPolarBear
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PUFFERFISH, entity -> {
            configureEntityAttributes(entity.level(), EntityType.PUFFERFISH, Config.VANILLA.healthMultiplierForPufferfish, null, null, Config.VANILLA.scaleMultiplierForPufferfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RABBIT, entity -> {
            configureEntityAttributes(entity.level(), EntityType.RABBIT, Config.VANILLA.healthMultiplierForRabbit, Config.VANILLA.damageMultiplierForRabbit, Config.VANILLA.speedMultiplierForRabbit, Config.VANILLA.scaleMultiplierForRabbit
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RAVAGER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.RAVAGER, Config.VANILLA.healthMultiplierForRavager, Config.VANILLA.damageMultiplierForRavager, Config.VANILLA.speedMultiplierForRavager, Config.VANILLA.scaleMultiplierForRavager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SALMON, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SALMON, Config.VANILLA.healthMultiplierForSalmon, null, null, Config.VANILLA.scaleMultiplierForSalmon
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHEEP, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SHEEP, Config.VANILLA.healthMultiplierForSheep, null, Config.VANILLA.speedMultiplierForSheep, Config.VANILLA.scaleMultiplierForSheep
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHULKER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SHULKER, Config.VANILLA.healthMultiplierForShulker, null, null, Config.VANILLA.scaleMultiplierForShulker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SILVERFISH, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SILVERFISH, Config.VANILLA.healthMultiplierForSilverfish, Config.VANILLA.damageMultiplierForSilverfish, Config.VANILLA.speedMultiplierForSilverfish, Config.VANILLA.scaleMultiplierForSilverfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SKELETON, Config.VANILLA.healthMultiplierForSkeleton, Config.VANILLA.damageMultiplierForSkeleton, Config.VANILLA.speedMultiplierForSkeleton, Config.VANILLA.scaleMultiplierForSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON_HORSE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SKELETON_HORSE, Config.VANILLA.healthMultiplierForSkeletonHorse, null, Config.VANILLA.speedMultiplierForSkeletonHorse, Config.VANILLA.scaleMultiplierForSkeletonHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SLIME, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SLIME, Config.VANILLA.healthMultiplierForSlime, Config.VANILLA.damageMultiplierForSlime, Config.VANILLA.speedMultiplierForSlime, Config.VANILLA.scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNIFFER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SNIFFER, Config.VANILLA.healthMultiplierForSniffer, null, Config.VANILLA.speedMultiplierForSniffer, Config.VANILLA.scaleMultiplierForSniffer
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNOW_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SNOW_GOLEM, Config.VANILLA.healthMultiplierForSnowGolem, null, Config.VANILLA.speedMultiplierForSnowGolem, Config.VANILLA.scaleMultiplierForSnowGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SPIDER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SPIDER, Config.VANILLA.healthMultiplierForSpider, Config.VANILLA.damageMultiplierForSpider, Config.VANILLA.speedMultiplierForSpider, Config.VANILLA.scaleMultiplierForSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SQUID, entity -> {
            configureEntityAttributes(entity.level(), EntityType.SQUID, Config.VANILLA.healthMultiplierForSquid, null, Config.VANILLA.speedMultiplierForSquid, Config.VANILLA.scaleMultiplierForSquid
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRAY, entity -> {
            configureEntityAttributes(entity.level(), EntityType.STRAY, Config.VANILLA.healthMultiplierForStray, Config.VANILLA.damageMultiplierForStray, Config.VANILLA.speedMultiplierForStray, Config.VANILLA.scaleMultiplierForStray
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRIDER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.STRIDER, Config.VANILLA.healthMultiplierForStrider, null, Config.VANILLA.speedMultiplierForStrider, Config.VANILLA.scaleMultiplierForStrider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TADPOLE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.TADPOLE, Config.VANILLA.healthMultiplierForTadpole, null, null, Config.VANILLA.scaleMultiplierForTadpole
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TRADER_LLAMA, entity -> {
            configureEntityAttributes(entity.level(), EntityType.TRADER_LLAMA, Config.VANILLA.healthMultiplierForTraderLlama, null, Config.VANILLA.speedMultiplierForTraderLlama, Config.VANILLA.scaleMultiplierForTraderLlama
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TROPICAL_FISH, entity -> {
            configureEntityAttributes(entity.level(), EntityType.TROPICAL_FISH, Config.VANILLA.healthMultiplierForTropicalFish, null, null, Config.VANILLA.scaleMultiplierForTropicalFish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TURTLE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.TURTLE, Config.VANILLA.healthMultiplierForTurtle, null, Config.VANILLA.speedMultiplierForTurtle, Config.VANILLA.scaleMultiplierForTurtle
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VEX, entity -> {
            configureEntityAttributes(entity.level(), EntityType.VEX, Config.VANILLA.healthMultiplierForVex, Config.VANILLA.damageMultiplierForVex, Config.VANILLA.speedMultiplierForVex, Config.VANILLA.scaleMultiplierForVex
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VILLAGER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.VILLAGER, Config.VANILLA.healthMultiplierForVillager, null, Config.VANILLA.speedMultiplierForVillager, Config.VANILLA.scaleMultiplierForVillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VINDICATOR, entity -> {
            configureEntityAttributes(entity.level(), EntityType.VINDICATOR, Config.VANILLA.healthMultiplierForVindicator, Config.VANILLA.damageMultiplierForVindicator, Config.VANILLA.speedMultiplierForVindicator, Config.VANILLA.scaleMultiplierForVindicator
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WANDERING_TRADER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.WANDERING_TRADER, Config.VANILLA.healthMultiplierForWanderingTrader, null, Config.VANILLA.speedMultiplierForWanderingTrader, Config.VANILLA.scaleMultiplierForWanderingTrader
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WARDEN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.WARDEN, Config.VANILLA.healthMultiplierForWarden, Config.VANILLA.damageMultiplierForWarden, Config.VANILLA.speedMultiplierForWarden, Config.VANILLA.scaleMultiplierForWarden
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITCH, entity -> {
            configureEntityAttributes(entity.level(), EntityType.WITCH, Config.VANILLA.healthMultiplierForWitch, Config.VANILLA.damageMultiplierForWitch, Config.VANILLA.speedMultiplierForWitch, Config.VANILLA.scaleMultiplierForWitch
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.WITHER, Config.VANILLA.healthMultiplierForWither, Config.VANILLA.damageMultiplierForWither, Config.VANILLA.speedMultiplierForWither, Config.VANILLA.scaleMultiplierForWither
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER_SKELETON, entity -> {
            configureEntityAttributes(entity.level(), EntityType.WITHER_SKELETON, Config.VANILLA.healthMultiplierForWitherSkeleton, Config.VANILLA.damageMultiplierForWitherSkeleton, Config.VANILLA.speedMultiplierForWitherSkeleton, Config.VANILLA.scaleMultiplierForWitherSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WOLF, entity -> {
            configureEntityAttributes(entity.level(), EntityType.WOLF, Config.VANILLA.healthMultiplierForWolf, Config.VANILLA.damageMultiplierForWolf, Config.VANILLA.speedMultiplierForWolf, Config.VANILLA.scaleMultiplierForWolf
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOGLIN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ZOGLIN, Config.VANILLA.healthMultiplierForZoglin, Config.VANILLA.damageMultiplierForZoglin, Config.VANILLA.speedMultiplierForZoglin, Config.VANILLA.scaleMultiplierForZoglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ZOMBIE, Config.VANILLA.healthMultiplierForZombie, Config.VANILLA.damageMultiplierForZombie, Config.VANILLA.speedMultiplierForZombie, Config.VANILLA.scaleMultiplierForZombie
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_HORSE, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ZOMBIE_HORSE, Config.VANILLA.healthMultiplierForZombieHorse, null, Config.VANILLA.speedMultiplierForZombieHorse, Config.VANILLA.scaleMultiplierForZombieHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_VILLAGER, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ZOMBIE_VILLAGER, Config.VANILLA.healthMultiplierForZombieVillager, Config.VANILLA.damageMultiplierForZombieVillager, Config.VANILLA.speedMultiplierForZombieVillager, Config.VANILLA.scaleMultiplierForZombieVillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIFIED_PIGLIN, entity -> {
            configureEntityAttributes(entity.level(), EntityType.ZOMBIFIED_PIGLIN, Config.VANILLA.healthMultiplierForZombifiedPiglin, Config.VANILLA.damageMultiplierForZombifiedPiglin, Config.VANILLA.speedMultiplierForZombifiedPiglin, Config.VANILLA.scaleMultiplierForZombifiedPiglin
            );
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish, Tadpole, Ghast, Squid, Vex and Bat have their own Mixin
    }
}
