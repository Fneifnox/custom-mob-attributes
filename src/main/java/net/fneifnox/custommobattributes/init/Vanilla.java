package net.fneifnox.custommobattributes.init;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;

public class Vanilla {

    public static void initVanillaAttributeHandlers() {

        ATTRIBUTE_HANDLERS.put(EntityType.ALLAY, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForAllay, Config.VANILLA.damageMultiplierForAllay, Config.VANILLA.speedMultiplierForAllay, Config.VANILLA.scaleMultiplierForAllay
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ARMADILLO, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyArmadillo, null, Config.VANILLA.speedMultiplierForBabyArmadillo, Config.VANILLA.scaleMultiplierForBabyArmadillo, Config.VANILLA.healthMultiplierForArmadillo, null, Config.VANILLA.speedMultiplierForArmadillo, Config.VANILLA.scaleMultiplierForArmadillo
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForArmadillo, null, Config.VANILLA.speedMultiplierForArmadillo, Config.VANILLA.scaleMultiplierForArmadillo
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.AXOLOTL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyAxolotl, Config.VANILLA.damageMultiplierForBabyAxolotl, Config.VANILLA.speedMultiplierForBabyAxolotl, Config.VANILLA.scaleMultiplierForBabyAxolotl, Config.VANILLA.healthMultiplierForAxolotl, Config.VANILLA.damageMultiplierForAxolotl, Config.VANILLA.speedMultiplierForAxolotl, Config.VANILLA.scaleMultiplierForAxolotl
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForAxolotl, Config.VANILLA.damageMultiplierForAxolotl, Config.VANILLA.speedMultiplierForAxolotl, Config.VANILLA.scaleMultiplierForAxolotl
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BAT, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBat, null, Config.VANILLA.speedMultiplierForBat, Config.VANILLA.scaleMultiplierForBat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BEE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyBee, Config.VANILLA.damageMultiplierForBabyBee, Config.VANILLA.speedMultiplierForBabyBee, Config.VANILLA.scaleMultiplierForBabyBee, Config.VANILLA.healthMultiplierForBee, Config.VANILLA.damageMultiplierForBee, Config.VANILLA.speedMultiplierForBee, Config.VANILLA.scaleMultiplierForBee
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBee, Config.VANILLA.damageMultiplierForBee, Config.VANILLA.speedMultiplierForBee, Config.VANILLA.scaleMultiplierForBee
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BLAZE, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBlaze, Config.VANILLA.damageMultiplierForBlaze, Config.VANILLA.speedMultiplierForBlaze, Config.VANILLA.scaleMultiplierForBlaze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BOGGED, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBogged, Config.VANILLA.damageMultiplierForBogged, Config.VANILLA.speedMultiplierForBogged, Config.VANILLA.scaleMultiplierForBogged
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BREEZE, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBreeze, Config.VANILLA.damageMultiplierForBreeze, Config.VANILLA.speedMultiplierForBreeze, Config.VANILLA.scaleMultiplierForBreeze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAMEL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyCamel, null, Config.VANILLA.speedMultiplierForBabyCamel, Config.VANILLA.scaleMultiplierForBabyCamel, Config.VANILLA.healthMultiplierForCamel, null, Config.VANILLA.speedMultiplierForCamel, Config.VANILLA.scaleMultiplierForCamel
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForCamel, null, Config.VANILLA.speedMultiplierForCamel, Config.VANILLA.scaleMultiplierForCamel
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAVE_SPIDER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForCaveSpider, Config.VANILLA.damageMultiplierForCaveSpider, Config.VANILLA.speedMultiplierForCaveSpider, Config.VANILLA.scaleMultiplierForCaveSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyCat, Config.VANILLA.damageMultiplierForBabyCat, Config.VANILLA.speedMultiplierForBabyCat, Config.VANILLA.scaleMultiplierForBabyCat, Config.VANILLA.healthMultiplierForCat, Config.VANILLA.damageMultiplierForCat, Config.VANILLA.speedMultiplierForCat, Config.VANILLA.scaleMultiplierForCat
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForCat, Config.VANILLA.damageMultiplierForCat, Config.VANILLA.speedMultiplierForCat, Config.VANILLA.scaleMultiplierForCat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CHICKEN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyChicken, null, Config.VANILLA.speedMultiplierForBabyChicken, Config.VANILLA.scaleMultiplierForBabyChicken, Config.VANILLA.healthMultiplierForChicken, null, Config.VANILLA.speedMultiplierForChicken, Config.VANILLA.scaleMultiplierForChicken
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForChicken, null, Config.VANILLA.speedMultiplierForChicken, Config.VANILLA.scaleMultiplierForChicken
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COD, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForCod, null, null, Config.VANILLA.scaleMultiplierForCod
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COW, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyCow, null, Config.VANILLA.speedMultiplierForBabyCow, Config.VANILLA.scaleMultiplierForBabyCow, Config.VANILLA.healthMultiplierForCow, null, Config.VANILLA.speedMultiplierForCow, Config.VANILLA.scaleMultiplierForCow
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForCow, null, Config.VANILLA.speedMultiplierForCow, Config.VANILLA.scaleMultiplierForCow
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREEPER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForCreeper, Config.VANILLA.damageMultiplierForCreeper, Config.VANILLA.speedMultiplierForCreeper, Config.VANILLA.scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DONKEY, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyDonkey, null, Config.VANILLA.speedMultiplierForBabyDonkey, Config.VANILLA.scaleMultiplierForBabyDonkey, Config.VANILLA.healthMultiplierForDonkey, null, Config.VANILLA.speedMultiplierForDonkey, Config.VANILLA.scaleMultiplierForDonkey
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForDonkey, null, Config.VANILLA.speedMultiplierForDonkey, Config.VANILLA.scaleMultiplierForDonkey
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DOLPHIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyDolphin, Config.VANILLA.damageMultiplierForBabyDolphin, Config.VANILLA.speedMultiplierForBabyDolphin, Config.VANILLA.scaleMultiplierForBabyDolphin, Config.VANILLA.healthMultiplierForDolphin, Config.VANILLA.damageMultiplierForDolphin, Config.VANILLA.speedMultiplierForDolphin, Config.VANILLA.scaleMultiplierForDolphin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForDolphin, Config.VANILLA.damageMultiplierForDolphin, Config.VANILLA.speedMultiplierForDolphin, Config.VANILLA.scaleMultiplierForDolphin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DROWNED, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyDrowned, Config.VANILLA.damageMultiplierForBabyDrowned, Config.VANILLA.speedMultiplierForBabyDrowned, Config.VANILLA.scaleMultiplierForBabyDrowned, Config.VANILLA.healthMultiplierForDrowned, Config.VANILLA.damageMultiplierForDrowned, Config.VANILLA.speedMultiplierForDrowned, Config.VANILLA.scaleMultiplierForDrowned
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForDrowned, Config.VANILLA.damageMultiplierForDrowned, Config.VANILLA.speedMultiplierForDrowned, Config.VANILLA.scaleMultiplierForDrowned
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ELDER_GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForElderGuardian, Config.VANILLA.damageMultiplierForElderGuardian, Config.VANILLA.speedMultiplierForElderGuardian, Config.VANILLA.scaleMultiplierForElderGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDER_DRAGON, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForEnderDragon, Config.VANILLA.damageMultiplierForEnderDragon, null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMAN, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForEnderman, Config.VANILLA.damageMultiplierForEnderman, Config.VANILLA.speedMultiplierForEnderman, Config.VANILLA.scaleMultiplierForEnderman
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMITE, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForEndermite, Config.VANILLA.damageMultiplierForEndermite, Config.VANILLA.speedMultiplierForEndermite, Config.VANILLA.scaleMultiplierForEndermite
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.EVOKER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForEvoker, Config.VANILLA.damageMultiplierForEvoker, Config.VANILLA.speedMultiplierForEvoker, Config.VANILLA.scaleMultiplierForEvoker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FOX, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyFox, Config.VANILLA.damageMultiplierForBabyFox, Config.VANILLA.speedMultiplierForBabyFox, Config.VANILLA.scaleMultiplierForBabyFox, Config.VANILLA.healthMultiplierForFox, Config.VANILLA.damageMultiplierForFox, Config.VANILLA.speedMultiplierForFox, Config.VANILLA.scaleMultiplierForFox
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForFox, Config.VANILLA.damageMultiplierForFox, Config.VANILLA.speedMultiplierForFox, Config.VANILLA.scaleMultiplierForFox
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FROG, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForFrog, Config.VANILLA.damageMultiplierForFrog, Config.VANILLA.speedMultiplierForFrog, Config.VANILLA.scaleMultiplierForFrog
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GHAST, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForGhast, null, Config.VANILLA.speedMultiplierForGhast, Config.VANILLA.scaleMultiplierForGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GIANT, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForGiant, Config.VANILLA.damageMultiplierForGiant, Config.VANILLA.speedMultiplierForGiant, Config.VANILLA.scaleMultiplierForGiant
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GLOW_SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyGlowSquid, null, Config.VANILLA.speedMultiplierForBabyGlowSquid, Config.VANILLA.scaleMultiplierForBabyGlowSquid, Config.VANILLA.healthMultiplierForGlowSquid, null, Config.VANILLA.speedMultiplierForGlowSquid, Config.VANILLA.scaleMultiplierForGlowSquid
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForGlowSquid, null, Config.VANILLA.speedMultiplierForGlowSquid, Config.VANILLA.scaleMultiplierForGlowSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GOAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyGoat, Config.VANILLA.damageMultiplierForBabyGoat, Config.VANILLA.speedMultiplierForBabyGoat, Config.VANILLA.scaleMultiplierForBabyGoat, Config.VANILLA.healthMultiplierForGoat, Config.VANILLA.damageMultiplierForGoat, Config.VANILLA.speedMultiplierForGoat, Config.VANILLA.scaleMultiplierForGoat
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForGoat, Config.VANILLA.damageMultiplierForGoat, Config.VANILLA.speedMultiplierForGoat, Config.VANILLA.scaleMultiplierForGoat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForGuardian, Config.VANILLA.damageMultiplierForGuardian, Config.VANILLA.speedMultiplierForGuardian, Config.VANILLA.scaleMultiplierForGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyHoglin, Config.VANILLA.damageMultiplierForBabyHoglin, Config.VANILLA.speedMultiplierForBabyHoglin, Config.VANILLA.scaleMultiplierForBabyHoglin, Config.VANILLA.healthMultiplierForHoglin, Config.VANILLA.damageMultiplierForHoglin, Config.VANILLA.speedMultiplierForHoglin, Config.VANILLA.scaleMultiplierForHoglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForHoglin, Config.VANILLA.damageMultiplierForHoglin, Config.VANILLA.speedMultiplierForHoglin, Config.VANILLA.scaleMultiplierForHoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyHorse, null, Config.VANILLA.speedMultiplierForBabyHorse, Config.VANILLA.scaleMultiplierForBabyHorse, Config.VANILLA.healthMultiplierForHorse, null, Config.VANILLA.speedMultiplierForHorse, Config.VANILLA.scaleMultiplierForHorse
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForHorse, null, Config.VANILLA.speedMultiplierForHorse, Config.VANILLA.scaleMultiplierForHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HUSK, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyHusk, Config.VANILLA.damageMultiplierForBabyHusk, Config.VANILLA.speedMultiplierForBabyHusk, Config.VANILLA.scaleMultiplierForBabyHusk, Config.VANILLA.healthMultiplierForHusk, Config.VANILLA.damageMultiplierForHusk, Config.VANILLA.speedMultiplierForHusk, Config.VANILLA.scaleMultiplierForHusk
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForHusk, Config.VANILLA.damageMultiplierForHusk, Config.VANILLA.speedMultiplierForHusk, Config.VANILLA.scaleMultiplierForHusk
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ILLUSIONER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForIllusioner, Config.VANILLA.damageMultiplierForIllusioner, Config.VANILLA.speedMultiplierForIllusioner, Config.VANILLA.scaleMultiplierForIllusioner
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.IRON_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForIronGolem, Config.VANILLA.damageMultiplierForIronGolem, Config.VANILLA.speedMultiplierForIronGolem, Config.VANILLA.scaleMultiplierForIronGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyLlama, null, Config.VANILLA.speedMultiplierForBabyLlama, Config.VANILLA.scaleMultiplierForBabyLlama, Config.VANILLA.healthMultiplierForLlama, null, Config.VANILLA.speedMultiplierForLlama, Config.VANILLA.scaleMultiplierForLlama
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForLlama, null, Config.VANILLA.speedMultiplierForLlama, Config.VANILLA.scaleMultiplierForLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MAGMA_CUBE, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForMagmaCube, Config.VANILLA.damageMultiplierForMagmaCube, Config.VANILLA.speedMultiplierForMagmaCube, Config.VANILLA.scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MOOSHROOM, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyMooshroom, null, Config.VANILLA.speedMultiplierForBabyMooshroom, Config.VANILLA.scaleMultiplierForBabyMooshroom, Config.VANILLA.healthMultiplierForMooshroom, null, Config.VANILLA.speedMultiplierForMooshroom, Config.VANILLA.scaleMultiplierForMooshroom
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForMooshroom, null, Config.VANILLA.speedMultiplierForMooshroom, Config.VANILLA.scaleMultiplierForMooshroom
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MULE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyMule, null, Config.VANILLA.speedMultiplierForBabyMule, Config.VANILLA.scaleMultiplierForBabyMule, Config.VANILLA.healthMultiplierForMule, null, Config.VANILLA.speedMultiplierForMule, Config.VANILLA.scaleMultiplierForMule
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForMule, null, Config.VANILLA.speedMultiplierForMule, Config.VANILLA.scaleMultiplierForMule
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.OCELOT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyOcelot, Config.VANILLA.damageMultiplierForBabyOcelot, Config.VANILLA.speedMultiplierForBabyOcelot, Config.VANILLA.scaleMultiplierForBabyOcelot, Config.VANILLA.healthMultiplierForOcelot, Config.VANILLA.damageMultiplierForOcelot, Config.VANILLA.speedMultiplierForOcelot, Config.VANILLA.scaleMultiplierForOcelot
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForOcelot, Config.VANILLA.damageMultiplierForOcelot, Config.VANILLA.speedMultiplierForOcelot, Config.VANILLA.scaleMultiplierForOcelot
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PANDA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyPanda, Config.VANILLA.damageMultiplierForBabyPanda, Config.VANILLA.speedMultiplierForBabyPanda, Config.VANILLA.scaleMultiplierForBabyPanda, Config.VANILLA.healthMultiplierForPanda, Config.VANILLA.damageMultiplierForPanda, Config.VANILLA.speedMultiplierForPanda, Config.VANILLA.scaleMultiplierForPanda
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPanda, Config.VANILLA.damageMultiplierForPanda, Config.VANILLA.speedMultiplierForPanda, Config.VANILLA.scaleMultiplierForPanda
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PARROT, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForParrot, Config.VANILLA.damageMultiplierForParrot, Config.VANILLA.speedMultiplierForParrot, Config.VANILLA.scaleMultiplierForParrot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PHANTOM, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPhantom, Config.VANILLA.damageMultiplierForPhantom, null, Config.VANILLA.scaleMultiplierForPhantom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIG, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyPig, null, Config.VANILLA.speedMultiplierForBabyPig, Config.VANILLA.scaleMultiplierForBabyPig, Config.VANILLA.healthMultiplierForPig, null, Config.VANILLA.speedMultiplierForPig, Config.VANILLA.scaleMultiplierForPig
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPig, null, Config.VANILLA.speedMultiplierForPig, Config.VANILLA.scaleMultiplierForPig
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyPiglin, Config.VANILLA.damageMultiplierForBabyPiglin, Config.VANILLA.speedMultiplierForBabyPiglin, Config.VANILLA.scaleMultiplierForBabyPiglin, Config.VANILLA.healthMultiplierForPiglin, Config.VANILLA.damageMultiplierForPiglin, Config.VANILLA.speedMultiplierForPiglin, Config.VANILLA.scaleMultiplierForPiglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPiglin, Config.VANILLA.damageMultiplierForPiglin, Config.VANILLA.speedMultiplierForPiglin, Config.VANILLA.scaleMultiplierForPiglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN_BRUTE, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPiglinBrute, Config.VANILLA.damageMultiplierForPiglinBrute, Config.VANILLA.speedMultiplierForPiglinBrute, Config.VANILLA.scaleMultiplierForPiglinBrute
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PILLAGER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPillager, Config.VANILLA.damageMultiplierForPillager, Config.VANILLA.speedMultiplierForPillager, Config.VANILLA.scaleMultiplierForPillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.POLAR_BEAR, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyPolarBear, null, Config.VANILLA.speedMultiplierForBabyPolarBear, Config.VANILLA.scaleMultiplierForBabyPolarBear, Config.VANILLA.healthMultiplierForPolarBear, Config.VANILLA.damageMultiplierForPolarBear, Config.VANILLA.speedMultiplierForPolarBear, Config.VANILLA.scaleMultiplierForPolarBear
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPolarBear, Config.VANILLA.damageMultiplierForPolarBear, Config.VANILLA.speedMultiplierForPolarBear, Config.VANILLA.scaleMultiplierForPolarBear
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PUFFERFISH, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForPufferfish, null, null, Config.VANILLA.scaleMultiplierForPufferfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RABBIT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyRabbit, Config.VANILLA.damageMultiplierForBabyRabbit, Config.VANILLA.speedMultiplierForBabyRabbit, Config.VANILLA.scaleMultiplierForBabyRabbit, Config.VANILLA.healthMultiplierForRabbit, Config.VANILLA.damageMultiplierForRabbit, Config.VANILLA.speedMultiplierForRabbit, Config.VANILLA.scaleMultiplierForRabbit
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForRabbit, Config.VANILLA.damageMultiplierForRabbit, Config.VANILLA.speedMultiplierForRabbit, Config.VANILLA.scaleMultiplierForRabbit
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RAVAGER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForRavager, Config.VANILLA.damageMultiplierForRavager, Config.VANILLA.speedMultiplierForRavager, Config.VANILLA.scaleMultiplierForRavager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SALMON, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSalmon, null, null, Config.VANILLA.scaleMultiplierForSalmon
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHEEP, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabySheep, null, Config.VANILLA.speedMultiplierForBabySheep, Config.VANILLA.scaleMultiplierForBabySheep, Config.VANILLA.healthMultiplierForSheep, null, Config.VANILLA.speedMultiplierForSheep, Config.VANILLA.scaleMultiplierForSheep
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSheep, null, Config.VANILLA.speedMultiplierForSheep, Config.VANILLA.scaleMultiplierForSheep
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHULKER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForShulker, null, null, Config.VANILLA.scaleMultiplierForShulker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SILVERFISH, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSilverfish, Config.VANILLA.damageMultiplierForSilverfish, Config.VANILLA.speedMultiplierForSilverfish, Config.VANILLA.scaleMultiplierForSilverfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSkeleton, Config.VANILLA.damageMultiplierForSkeleton, Config.VANILLA.speedMultiplierForSkeleton, Config.VANILLA.scaleMultiplierForSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabySkeletonHorse, null, Config.VANILLA.speedMultiplierForBabySkeletonHorse, Config.VANILLA.scaleMultiplierForBabySkeletonHorse, Config.VANILLA.healthMultiplierForSkeletonHorse, null, Config.VANILLA.speedMultiplierForSkeletonHorse, Config.VANILLA.scaleMultiplierForSkeletonHorse
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSkeletonHorse, null, Config.VANILLA.speedMultiplierForSkeletonHorse, Config.VANILLA.scaleMultiplierForSkeletonHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SLIME, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSlime, Config.VANILLA.damageMultiplierForSlime, Config.VANILLA.speedMultiplierForSlime, Config.VANILLA.scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNIFFER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabySniffer, null, Config.VANILLA.speedMultiplierForBabySniffer, Config.VANILLA.scaleMultiplierForBabySniffer, Config.VANILLA.healthMultiplierForSniffer, null, Config.VANILLA.speedMultiplierForSniffer, Config.VANILLA.scaleMultiplierForSniffer
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSniffer, null, Config.VANILLA.speedMultiplierForSniffer, Config.VANILLA.scaleMultiplierForSniffer
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNOW_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSnowGolem, null, Config.VANILLA.speedMultiplierForSnowGolem, Config.VANILLA.scaleMultiplierForSnowGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SPIDER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSpider, Config.VANILLA.damageMultiplierForSpider, Config.VANILLA.speedMultiplierForSpider, Config.VANILLA.scaleMultiplierForSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabySquid, null, Config.VANILLA.speedMultiplierForBabySquid, Config.VANILLA.scaleMultiplierForBabySquid, Config.VANILLA.healthMultiplierForSquid, null, Config.VANILLA.speedMultiplierForSquid, Config.VANILLA.scaleMultiplierForSquid
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForSquid, null, Config.VANILLA.speedMultiplierForSquid, Config.VANILLA.scaleMultiplierForSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRAY, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForStray, Config.VANILLA.damageMultiplierForStray, Config.VANILLA.speedMultiplierForStray, Config.VANILLA.scaleMultiplierForStray
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRIDER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyStrider, null, Config.VANILLA.speedMultiplierForBabyStrider, Config.VANILLA.scaleMultiplierForBabyStrider, Config.VANILLA.healthMultiplierForStrider, null, Config.VANILLA.speedMultiplierForStrider, Config.VANILLA.scaleMultiplierForStrider
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForStrider, null, Config.VANILLA.speedMultiplierForStrider, Config.VANILLA.scaleMultiplierForStrider
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TADPOLE, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForTadpole, null, null, Config.VANILLA.scaleMultiplierForTadpole
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TRADER_LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyTraderLlama, null, Config.VANILLA.speedMultiplierForBabyTraderLlama, Config.VANILLA.scaleMultiplierForBabyTraderLlama, Config.VANILLA.healthMultiplierForTraderLlama, null, Config.VANILLA.speedMultiplierForTraderLlama, Config.VANILLA.scaleMultiplierForTraderLlama
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForTraderLlama, null, Config.VANILLA.speedMultiplierForTraderLlama, Config.VANILLA.scaleMultiplierForTraderLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TROPICAL_FISH, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForTropicalFish, null, null, Config.VANILLA.scaleMultiplierForTropicalFish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TURTLE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyTurtle, null, Config.VANILLA.speedMultiplierForBabyTurtle, Config.VANILLA.scaleMultiplierForBabyTurtle, Config.VANILLA.healthMultiplierForTurtle, null, Config.VANILLA.speedMultiplierForTurtle, Config.VANILLA.scaleMultiplierForTurtle
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForTurtle, null, Config.VANILLA.speedMultiplierForTurtle, Config.VANILLA.scaleMultiplierForTurtle
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VEX, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForVex, Config.VANILLA.damageMultiplierForVex, Config.VANILLA.speedMultiplierForVex, Config.VANILLA.scaleMultiplierForVex
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyVillager, null, Config.VANILLA.speedMultiplierForBabyVillager, Config.VANILLA.scaleMultiplierForBabyVillager, Config.VANILLA.healthMultiplierForVillager, null, Config.VANILLA.speedMultiplierForVillager, Config.VANILLA.scaleMultiplierForVillager
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForVillager, null, Config.VANILLA.speedMultiplierForVillager, Config.VANILLA.scaleMultiplierForVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VINDICATOR, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForVindicator, Config.VANILLA.damageMultiplierForVindicator, Config.VANILLA.speedMultiplierForVindicator, Config.VANILLA.scaleMultiplierForVindicator
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WANDERING_TRADER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForWanderingTrader, null, Config.VANILLA.speedMultiplierForWanderingTrader, Config.VANILLA.scaleMultiplierForWanderingTrader
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WARDEN, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForWarden, Config.VANILLA.damageMultiplierForWarden, Config.VANILLA.speedMultiplierForWarden, Config.VANILLA.scaleMultiplierForWarden
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITCH, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForWitch, Config.VANILLA.damageMultiplierForWitch, Config.VANILLA.speedMultiplierForWitch, Config.VANILLA.scaleMultiplierForWitch
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForWither, Config.VANILLA.damageMultiplierForWither, Config.VANILLA.speedMultiplierForWither, Config.VANILLA.scaleMultiplierForWither
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER_SKELETON, entity -> {
            configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForWitherSkeleton, Config.VANILLA.damageMultiplierForWitherSkeleton, Config.VANILLA.speedMultiplierForWitherSkeleton, Config.VANILLA.scaleMultiplierForWitherSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WOLF, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyWolf, Config.VANILLA.damageMultiplierForBabyWolf, Config.VANILLA.speedMultiplierForBabyWolf, Config.VANILLA.scaleMultiplierForBabyWolf, Config.VANILLA.healthMultiplierForWolf, Config.VANILLA.damageMultiplierForWolf, Config.VANILLA.speedMultiplierForWolf, Config.VANILLA.scaleMultiplierForWolf
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForWolf, Config.VANILLA.damageMultiplierForWolf, Config.VANILLA.speedMultiplierForWolf, Config.VANILLA.scaleMultiplierForWolf
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyZoglin, Config.VANILLA.damageMultiplierForBabyZoglin, Config.VANILLA.speedMultiplierForBabyZoglin, Config.VANILLA.scaleMultiplierForBabyZoglin, Config.VANILLA.healthMultiplierForZoglin, Config.VANILLA.damageMultiplierForZoglin, Config.VANILLA.speedMultiplierForZoglin, Config.VANILLA.scaleMultiplierForZoglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForZoglin, Config.VANILLA.damageMultiplierForZoglin, Config.VANILLA.speedMultiplierForZoglin, Config.VANILLA.scaleMultiplierForZoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyZombie, Config.VANILLA.damageMultiplierForBabyZombie, Config.VANILLA.speedMultiplierForBabyZombie, Config.VANILLA.scaleMultiplierForBabyZombie, Config.VANILLA.healthMultiplierForZombie, Config.VANILLA.damageMultiplierForZombie, Config.VANILLA.speedMultiplierForZombie, Config.VANILLA.scaleMultiplierForZombie
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForZombie, Config.VANILLA.damageMultiplierForZombie, Config.VANILLA.speedMultiplierForZombie, Config.VANILLA.scaleMultiplierForZombie
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyZombieHorse, null, Config.VANILLA.speedMultiplierForBabyZombieHorse, Config.VANILLA.scaleMultiplierForBabyZombieHorse, Config.VANILLA.healthMultiplierForZombieHorse, null, Config.VANILLA.speedMultiplierForZombieHorse, Config.VANILLA.scaleMultiplierForZombieHorse
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForZombieHorse, null, Config.VANILLA.speedMultiplierForZombieHorse, Config.VANILLA.scaleMultiplierForZombieHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyZombieVillager, Config.VANILLA.damageMultiplierForBabyZombieVillager, Config.VANILLA.speedMultiplierForBabyZombieVillager, Config.VANILLA.scaleMultiplierForBabyZombieVillager, Config.VANILLA.healthMultiplierForZombieVillager, Config.VANILLA.damageMultiplierForZombieVillager, Config.VANILLA.speedMultiplierForZombieVillager, Config.VANILLA.scaleMultiplierForZombieVillager
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForZombieVillager, Config.VANILLA.damageMultiplierForZombieVillager, Config.VANILLA.speedMultiplierForZombieVillager, Config.VANILLA.scaleMultiplierForZombieVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIFIED_PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForBabyZombifiedPiglin, Config.VANILLA.damageMultiplierForBabyZombifiedPiglin, Config.VANILLA.speedMultiplierForBabyZombifiedPiglin, Config.VANILLA.scaleMultiplierForBabyZombifiedPiglin, Config.VANILLA.healthMultiplierForZombifiedPiglin, Config.VANILLA.damageMultiplierForZombifiedPiglin, Config.VANILLA.speedMultiplierForZombifiedPiglin, Config.VANILLA.scaleMultiplierForZombifiedPiglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, Config.VANILLA.healthMultiplierForZombifiedPiglin, Config.VANILLA.damageMultiplierForZombifiedPiglin, Config.VANILLA.speedMultiplierForZombifiedPiglin, Config.VANILLA.scaleMultiplierForZombifiedPiglin
                );
            }
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish, Tadpole, Ghast, Squid, Vex and Bat have their own Mixin
    }
}
