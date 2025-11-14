package net.fneifnox.custommobattributes.init;

import net.minecraft.entity.EntityType;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;
import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class Vanilla {

    public static void initVanillaAttributeHandlers() {

        ATTRIBUTE_HANDLERS.put(EntityType.ALLAY, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ALLAY, CONFIG::healthMultiplierForAllay, CONFIG::damageMultiplierForAllay, CONFIG::speedMultiplierForAllay, CONFIG::scaleMultiplierForAllay
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ARMADILLO, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ARMADILLO, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.AXOLOTL, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.AXOLOTL, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BAT, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.BAT, CONFIG::healthMultiplierForBat, null, CONFIG::speedMultiplierForBat, CONFIG::scaleMultiplierForBat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BEE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.BEE, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, CONFIG::speedMultiplierForBee, CONFIG::scaleMultiplierForBee
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BLAZE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.BLAZE, CONFIG::healthMultiplierForBlaze, CONFIG::damageMultiplierForBlaze, CONFIG::speedMultiplierForBlaze, CONFIG::scaleMultiplierForBlaze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BOGGED, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.BOGGED, CONFIG::healthMultiplierForBogged, CONFIG::damageMultiplierForBogged, CONFIG::speedMultiplierForBogged, CONFIG::scaleMultiplierForBogged
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BREEZE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.BREEZE, CONFIG::healthMultiplierForBreeze, CONFIG::damageMultiplierForBreeze, CONFIG::speedMultiplierForBreeze, CONFIG::scaleMultiplierForBreeze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAMEL, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.CAMEL, CONFIG::healthMultiplierForCamel, null, CONFIG::speedMultiplierForCamel, CONFIG::scaleMultiplierForCamel
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAVE_SPIDER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.CAVE_SPIDER, CONFIG::healthMultiplierForCaveSpider, CONFIG::damageMultiplierForCaveSpider, CONFIG::speedMultiplierForCaveSpider, CONFIG::scaleMultiplierForCaveSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAT, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.CAT, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CHICKEN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.CHICKEN, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COD, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.COD, CONFIG::healthMultiplierForCod, null, null, CONFIG::scaleMultiplierForCod
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COPPER_GOLEM, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.COPPER_GOLEM, CONFIG::healthMultiplierForCopperGolem, null, CONFIG::speedMultiplierForCopperGolem, CONFIG::scaleMultiplierForCopperGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COW, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.COW, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREAKING, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.CREAKING, CONFIG::healthMultiplierForCreaking, CONFIG::damageMultiplierForCreaking, CONFIG::speedMultiplierForCreaking, CONFIG::scaleMultiplierForCreaking
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREEPER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.CREEPER, CONFIG::healthMultiplierForCreeper, CONFIG::damageMultiplierForCreeper, CONFIG::speedMultiplierForCreeper, CONFIG::scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DONKEY, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.DONKEY, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DOLPHIN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.DOLPHIN, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DROWNED, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.DROWNED, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ELDER_GUARDIAN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ELDER_GUARDIAN, CONFIG::healthMultiplierForElderGuardian, CONFIG::damageMultiplierForElderGuardian, CONFIG::speedMultiplierForElderGuardian, CONFIG::scaleMultiplierForElderGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDER_DRAGON, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ENDER_DRAGON, CONFIG::healthMultiplierForEnderDragon, CONFIG::damageMultiplierForEnderDragon, null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMAN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ENDERMAN, CONFIG::healthMultiplierForEnderman, CONFIG::damageMultiplierForEnderman, CONFIG::speedMultiplierForEnderman, CONFIG::scaleMultiplierForEnderman
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMITE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ENDERMITE, CONFIG::healthMultiplierForEndermite, CONFIG::damageMultiplierForEndermite, CONFIG::speedMultiplierForEndermite, CONFIG::scaleMultiplierForEndermite
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.EVOKER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.EVOKER, CONFIG::healthMultiplierForEvoker, CONFIG::damageMultiplierForEvoker, CONFIG::speedMultiplierForEvoker, CONFIG::scaleMultiplierForEvoker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FOX, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.FOX, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FROG, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.FROG, CONFIG::healthMultiplierForFrog, CONFIG::damageMultiplierForFrog, CONFIG::speedMultiplierForFrog, CONFIG::scaleMultiplierForFrog
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GHAST, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.GHAST, CONFIG::healthMultiplierForGhast, null, CONFIG::speedMultiplierForGhast, CONFIG::scaleMultiplierForGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GIANT, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.GIANT, CONFIG::healthMultiplierForGiant, CONFIG::damageMultiplierForGiant, CONFIG::speedMultiplierForGiant, CONFIG::scaleMultiplierForGiant
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GLOW_SQUID, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.GLOW_SQUID, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GOAT, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.GOAT, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GUARDIAN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.GUARDIAN, CONFIG::healthMultiplierForGuardian, CONFIG::damageMultiplierForGuardian, CONFIG::speedMultiplierForGuardian, CONFIG::scaleMultiplierForGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HAPPY_GHAST, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.HAPPY_GHAST, CONFIG::healthMultiplierForHappyGhast, null, CONFIG::speedMultiplierForHappyGhast, CONFIG::scaleMultiplierForHappyGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HOGLIN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.HOGLIN, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HORSE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.HORSE, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HUSK, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.HUSK, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ILLUSIONER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ILLUSIONER, CONFIG::healthMultiplierForIllusioner, CONFIG::damageMultiplierForIllusioner, CONFIG::speedMultiplierForIllusioner, CONFIG::scaleMultiplierForIllusioner
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.IRON_GOLEM, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.IRON_GOLEM, CONFIG::healthMultiplierForIronGolem, CONFIG::damageMultiplierForIronGolem, CONFIG::speedMultiplierForIronGolem, CONFIG::scaleMultiplierForIronGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.LLAMA, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.LLAMA, CONFIG::healthMultiplierForLlama, null, CONFIG::speedMultiplierForLlama, CONFIG::scaleMultiplierForLlama
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MAGMA_CUBE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.MAGMA_CUBE, CONFIG::healthMultiplierForMagmaCube, CONFIG::damageMultiplierForMagmaCube, CONFIG::speedMultiplierForMagmaCube, CONFIG::scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MOOSHROOM, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.MOOSHROOM, CONFIG::healthMultiplierForMooshroom, null, CONFIG::speedMultiplierForMooshroom, CONFIG::scaleMultiplierForMooshroom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MULE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.MULE, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.OCELOT, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.OCELOT, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PANDA, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PANDA, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PARROT, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PARROT, CONFIG::healthMultiplierForParrot, CONFIG::damageMultiplierForParrot, CONFIG::speedMultiplierForParrot, CONFIG::scaleMultiplierForParrot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PHANTOM, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PHANTOM, CONFIG::healthMultiplierForPhantom, CONFIG::damageMultiplierForPhantom, null, CONFIG::scaleMultiplierForPhantom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIG, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PIG, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PIGLIN, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN_BRUTE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PIGLIN_BRUTE, CONFIG::healthMultiplierForPiglinBrute, CONFIG::damageMultiplierForPiglinBrute, CONFIG::speedMultiplierForPiglinBrute, CONFIG::scaleMultiplierForPiglinBrute
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PILLAGER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PILLAGER, CONFIG::healthMultiplierForPillager, CONFIG::damageMultiplierForPillager, CONFIG::speedMultiplierForPillager, CONFIG::scaleMultiplierForPillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.POLAR_BEAR, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.POLAR_BEAR, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PUFFERFISH, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.PUFFERFISH, CONFIG::healthMultiplierForPufferfish, null, null, CONFIG::scaleMultiplierForPufferfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RABBIT, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.RABBIT, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RAVAGER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.RAVAGER, CONFIG::healthMultiplierForRavager, CONFIG::damageMultiplierForRavager, CONFIG::speedMultiplierForRavager, CONFIG::scaleMultiplierForRavager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SALMON, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SALMON, CONFIG::healthMultiplierForSalmon, null, null, CONFIG::scaleMultiplierForSalmon
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHEEP, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SHEEP, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHULKER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SHULKER, CONFIG::healthMultiplierForShulker, null, null, CONFIG::scaleMultiplierForShulker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SILVERFISH, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SILVERFISH, CONFIG::healthMultiplierForSilverfish, CONFIG::damageMultiplierForSilverfish, CONFIG::speedMultiplierForSilverfish, CONFIG::scaleMultiplierForSilverfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SKELETON, CONFIG::healthMultiplierForSkeleton, CONFIG::damageMultiplierForSkeleton, CONFIG::speedMultiplierForSkeleton, CONFIG::scaleMultiplierForSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON_HORSE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SKELETON_HORSE, CONFIG::healthMultiplierForSkeletonHorse, null, CONFIG::speedMultiplierForSkeletonHorse, CONFIG::scaleMultiplierForSkeletonHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SLIME, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SLIME, CONFIG::healthMultiplierForSlime, CONFIG::damageMultiplierForSlime, CONFIG::speedMultiplierForSlime, CONFIG::scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNIFFER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SNIFFER, CONFIG::healthMultiplierForSniffer, null, CONFIG::speedMultiplierForSniffer, CONFIG::scaleMultiplierForSniffer
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNOW_GOLEM, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SNOW_GOLEM, CONFIG::healthMultiplierForSnowGolem, null, CONFIG::speedMultiplierForSnowGolem, CONFIG::scaleMultiplierForSnowGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SPIDER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SPIDER, CONFIG::healthMultiplierForSpider, CONFIG::damageMultiplierForSpider, CONFIG::speedMultiplierForSpider, CONFIG::scaleMultiplierForSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SQUID, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.SQUID, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRAY, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.STRAY, CONFIG::healthMultiplierForStray, CONFIG::damageMultiplierForStray, CONFIG::speedMultiplierForStray, CONFIG::scaleMultiplierForStray
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRIDER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.STRIDER, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TADPOLE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.TADPOLE, CONFIG::healthMultiplierForTadpole, null, null, CONFIG::scaleMultiplierForTadpole
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TRADER_LLAMA, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.TRADER_LLAMA, CONFIG::healthMultiplierForTraderLlama, null, CONFIG::speedMultiplierForTraderLlama, CONFIG::scaleMultiplierForTraderLlama
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TROPICAL_FISH, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.TROPICAL_FISH, CONFIG::healthMultiplierForTropicalFish, null, null, CONFIG::scaleMultiplierForTropicalFish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TURTLE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.TURTLE, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VEX, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.VEX, CONFIG::healthMultiplierForVex, CONFIG::damageMultiplierForVex, CONFIG::speedMultiplierForVex, CONFIG::scaleMultiplierForVex
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VILLAGER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.VILLAGER, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VINDICATOR, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.VINDICATOR, CONFIG::healthMultiplierForVindicator, CONFIG::damageMultiplierForVindicator, CONFIG::speedMultiplierForVindicator, CONFIG::scaleMultiplierForVindicator
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WANDERING_TRADER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.WANDERING_TRADER, CONFIG::healthMultiplierForWanderingTrader, null, CONFIG::speedMultiplierForWanderingTrader, CONFIG::scaleMultiplierForWanderingTrader
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WARDEN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.WARDEN, CONFIG::healthMultiplierForWarden, CONFIG::damageMultiplierForWarden, CONFIG::speedMultiplierForWarden, CONFIG::scaleMultiplierForWarden
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITCH, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.WITCH, CONFIG::healthMultiplierForWitch, CONFIG::damageMultiplierForWitch, CONFIG::speedMultiplierForWitch, CONFIG::scaleMultiplierForWitch
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.WITHER, CONFIG::healthMultiplierForWither, CONFIG::damageMultiplierForWither, CONFIG::speedMultiplierForWither, CONFIG::scaleMultiplierForWither
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER_SKELETON, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.WITHER_SKELETON, CONFIG::healthMultiplierForWitherSkeleton, CONFIG::damageMultiplierForWitherSkeleton, CONFIG::speedMultiplierForWitherSkeleton, CONFIG::scaleMultiplierForWitherSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WOLF, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.WOLF, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOGLIN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ZOGLIN, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ZOMBIE, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_HORSE, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ZOMBIE_HORSE, CONFIG::healthMultiplierForZombieHorse, null, CONFIG::speedMultiplierForZombieHorse, CONFIG::scaleMultiplierForZombieHorse
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_VILLAGER, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ZOMBIE_VILLAGER, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIFIED_PIGLIN, entity -> {
            configureEntityAttributes(entity.getEntityWorld(), EntityType.ZOMBIFIED_PIGLIN, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
            );
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish, Tadpole, Ghast, Squid, Vex and Bat have their own Mixin
    }
}
