package net.fneifnox.custommobattributes.init;

import net.minecraft.world.entity.EntityTypes;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;
import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class Vanilla {

    public static void initVanillaAttributeHandlers() {

        ATTRIBUTE_HANDLERS.put(EntityTypes.ALLAY, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForAllay, null, CONFIG::speedMultiplierForAllay, CONFIG::scaleMultiplierForAllay
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ARMADILLO, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyArmadillo::healthMultiplierForBabyArmadillo, null, CONFIG.babyArmadillo::speedMultiplierForBabyArmadillo, CONFIG.babyArmadillo::scaleMultiplierForBabyArmadillo, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.AXOLOTL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyAxolotl::healthMultiplierForBabyAxolotl, CONFIG.babyAxolotl::damageMultiplierForBabyAxolotl, CONFIG.babyAxolotl::speedMultiplierForBabyAxolotl, CONFIG.babyAxolotl::scaleMultiplierForBabyAxolotl, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BAT, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForBat, null, CONFIG::speedMultiplierForBat, CONFIG::scaleMultiplierForBat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BEE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyBee::healthMultiplierForBabyBee, CONFIG.babyBee::damageMultiplierForBabyBee, CONFIG.babyBee::speedMultiplierForBabyBee, CONFIG.babyBee::scaleMultiplierForBabyBee, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, CONFIG::speedMultiplierForBee, CONFIG::scaleMultiplierForBee
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, CONFIG::speedMultiplierForBee, CONFIG::scaleMultiplierForBee
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BLAZE, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForBlaze, CONFIG::damageMultiplierForBlaze, CONFIG::speedMultiplierForBlaze, CONFIG::scaleMultiplierForBlaze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BOGGED, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForBogged, CONFIG::damageMultiplierForBogged, CONFIG::speedMultiplierForBogged, CONFIG::scaleMultiplierForBogged
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BREEZE, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForBreeze, CONFIG::damageMultiplierForBreeze, CONFIG::speedMultiplierForBreeze, CONFIG::scaleMultiplierForBreeze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAMEL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyCamel::healthMultiplierForBabyCamel, null, CONFIG.babyCamel::speedMultiplierForBabyCamel, CONFIG.babyCamel::scaleMultiplierForBabyCamel, CONFIG::healthMultiplierForCamel, null, CONFIG::speedMultiplierForCamel, CONFIG::scaleMultiplierForCamel
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCamel, null, CONFIG::speedMultiplierForCamel, CONFIG::scaleMultiplierForCamel
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAMEL_HUSK, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyCamelHusk::healthMultiplierForBabyCamelHusk, null, CONFIG.babyCamelHusk::speedMultiplierForBabyCamelHusk, CONFIG.babyCamelHusk::scaleMultiplierForBabyCamelHusk, CONFIG::healthMultiplierForCamelHusk, null, CONFIG::speedMultiplierForCamelHusk, CONFIG::scaleMultiplierForCamelHusk
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCamelHusk, null, CONFIG::speedMultiplierForCamelHusk, CONFIG::scaleMultiplierForCamelHusk
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAVE_SPIDER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCaveSpider, CONFIG::damageMultiplierForCaveSpider, CONFIG::speedMultiplierForCaveSpider, CONFIG::scaleMultiplierForCaveSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyCat::healthMultiplierForBabyCat, CONFIG.babyCat::damageMultiplierForBabyCat, CONFIG.babyCat::speedMultiplierForBabyCat, CONFIG.babyCat::scaleMultiplierForBabyCat, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CHICKEN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyChicken::healthMultiplierForBabyChicken, null, CONFIG.babyChicken::speedMultiplierForBabyChicken, CONFIG.babyChicken::scaleMultiplierForBabyChicken, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.COD, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCod, null, null, CONFIG::scaleMultiplierForCod
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.COPPER_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCopperGolem, null, CONFIG::speedMultiplierForCopperGolem, CONFIG::scaleMultiplierForCopperGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.COW, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyCow::healthMultiplierForBabyCow, null, CONFIG.babyCow::speedMultiplierForBabyCow, CONFIG.babyCow::scaleMultiplierForBabyCow, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CREAKING, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCreaking, CONFIG::damageMultiplierForCreaking, CONFIG::speedMultiplierForCreaking, CONFIG::scaleMultiplierForCreaking
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CREEPER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForCreeper, CONFIG::damageMultiplierForCreeper, CONFIG::speedMultiplierForCreeper, CONFIG::scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.DONKEY, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyDonkey::healthMultiplierForBabyDonkey, null, CONFIG.babyDonkey::speedMultiplierForBabyDonkey, CONFIG.babyDonkey::scaleMultiplierForBabyDonkey, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.DOLPHIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyDolphin::healthMultiplierForBabyDolphin, CONFIG.babyDolphin::damageMultiplierForBabyDolphin, CONFIG.babyDolphin::speedMultiplierForBabyDolphin, CONFIG.babyDolphin::scaleMultiplierForBabyDolphin, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.DROWNED, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyDrowned::healthMultiplierForBabyDrowned, CONFIG.babyDrowned::damageMultiplierForBabyDrowned, CONFIG.babyDrowned::speedMultiplierForBabyDrowned, CONFIG.babyDrowned::scaleMultiplierForBabyDrowned, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ELDER_GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForElderGuardian, CONFIG::damageMultiplierForElderGuardian, CONFIG::speedMultiplierForElderGuardian, CONFIG::scaleMultiplierForElderGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ENDER_DRAGON, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForEnderDragon, CONFIG::damageMultiplierForEnderDragon, null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ENDERMAN, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForEnderman, CONFIG::damageMultiplierForEnderman, CONFIG::speedMultiplierForEnderman, CONFIG::scaleMultiplierForEnderman
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ENDERMITE, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForEndermite, CONFIG::damageMultiplierForEndermite, CONFIG::speedMultiplierForEndermite, CONFIG::scaleMultiplierForEndermite
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.EVOKER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForEvoker, CONFIG::damageMultiplierForEvoker, CONFIG::speedMultiplierForEvoker, CONFIG::scaleMultiplierForEvoker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.FOX, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyFox::healthMultiplierForBabyFox, CONFIG.babyFox::damageMultiplierForBabyFox, CONFIG.babyFox::speedMultiplierForBabyFox, CONFIG.babyFox::scaleMultiplierForBabyFox, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.FROG, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForFrog, CONFIG::damageMultiplierForFrog, CONFIG::speedMultiplierForFrog, CONFIG::scaleMultiplierForFrog
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GHAST, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForGhast, null, CONFIG::speedMultiplierForGhast, CONFIG::scaleMultiplierForGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GIANT, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForGiant, CONFIG::damageMultiplierForGiant, CONFIG::speedMultiplierForGiant, CONFIG::scaleMultiplierForGiant
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GLOW_SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyGlowSquid::healthMultiplierForBabyGlowSquid, null, CONFIG.babyGlowSquid::speedMultiplierForBabyGlowSquid, CONFIG.babyGlowSquid::scaleMultiplierForBabyGlowSquid, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GOAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyGoat::healthMultiplierForBabyGoat, CONFIG.babyGoat::damageMultiplierForBabyGoat, CONFIG.babyGoat::speedMultiplierForBabyGoat, CONFIG.babyGoat::scaleMultiplierForBabyGoat, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForGuardian, CONFIG::damageMultiplierForGuardian, CONFIG::speedMultiplierForGuardian, CONFIG::scaleMultiplierForGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HAPPY_GHAST, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyHappyGhast::healthMultiplierForBabyHappyGhast, null, CONFIG.babyHappyGhast::speedMultiplierForBabyHappyGhast, CONFIG.babyHappyGhast::scaleMultiplierForBabyHappyGhast, CONFIG::healthMultiplierForHappyGhast, null, CONFIG::speedMultiplierForHappyGhast, CONFIG::scaleMultiplierForHappyGhast
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForHappyGhast, null, CONFIG::speedMultiplierForHappyGhast, CONFIG::scaleMultiplierForHappyGhast
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyHoglin::healthMultiplierForBabyHoglin, CONFIG.babyHoglin::damageMultiplierForBabyHoglin, CONFIG.babyHoglin::speedMultiplierForBabyHoglin, CONFIG.babyHoglin::scaleMultiplierForBabyHoglin, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyHorse::healthMultiplierForBabyHorse, null, CONFIG.babyHorse::speedMultiplierForBabyHorse, CONFIG.babyHorse::scaleMultiplierForBabyHorse, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HUSK, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyHusk::healthMultiplierForBabyHusk, CONFIG.babyHusk::damageMultiplierForBabyHusk, CONFIG.babyHusk::speedMultiplierForBabyHusk, CONFIG.babyHusk::scaleMultiplierForBabyHusk, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ILLUSIONER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForIllusioner, CONFIG::damageMultiplierForIllusioner, CONFIG::speedMultiplierForIllusioner, CONFIG::scaleMultiplierForIllusioner
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.IRON_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForIronGolem, CONFIG::damageMultiplierForIronGolem, CONFIG::speedMultiplierForIronGolem, CONFIG::scaleMultiplierForIronGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyLlama::healthMultiplierForBabyLlama, null, CONFIG.babyLlama::speedMultiplierForBabyLlama, CONFIG.babyLlama::scaleMultiplierForBabyLlama, CONFIG::healthMultiplierForLlama, null, CONFIG::speedMultiplierForLlama, CONFIG::scaleMultiplierForLlama
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForLlama, null, CONFIG::speedMultiplierForLlama, CONFIG::scaleMultiplierForLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.MAGMA_CUBE, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForMagmaCube, CONFIG::damageMultiplierForMagmaCube, CONFIG::speedMultiplierForMagmaCube, CONFIG::scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.MOOSHROOM, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyMooshroom::healthMultiplierForBabyMooshroom, null, CONFIG.babyMooshroom::speedMultiplierForBabyMooshroom, CONFIG.babyMooshroom::scaleMultiplierForBabyMooshroom, CONFIG::healthMultiplierForMooshroom, null, CONFIG::speedMultiplierForMooshroom, CONFIG::scaleMultiplierForMooshroom
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForMooshroom, null, CONFIG::speedMultiplierForMooshroom, CONFIG::scaleMultiplierForMooshroom
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.MULE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyMule::healthMultiplierForBabyMule, null, CONFIG.babyMule::speedMultiplierForBabyMule, CONFIG.babyMule::scaleMultiplierForBabyMule, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.NAUTILUS, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyNautilus::healthMultiplierForBabyNautilus, null, CONFIG.babyNautilus::speedMultiplierForBabyNautilus, CONFIG.babyNautilus::scaleMultiplierForBabyNautilus, CONFIG::healthMultiplierForNautilus, null, CONFIG::speedMultiplierForNautilus, CONFIG::scaleMultiplierForNautilus
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForNautilus, null, CONFIG::speedMultiplierForNautilus, CONFIG::scaleMultiplierForNautilus
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.OCELOT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyOcelot::healthMultiplierForBabyOcelot, CONFIG.babyOcelot::damageMultiplierForBabyOcelot, CONFIG.babyOcelot::speedMultiplierForBabyOcelot, CONFIG.babyOcelot::scaleMultiplierForBabyOcelot, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PANDA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyPanda::healthMultiplierForBabyPanda, CONFIG.babyPanda::damageMultiplierForBabyPanda, CONFIG.babyPanda::speedMultiplierForBabyPanda, CONFIG.babyPanda::scaleMultiplierForBabyPanda, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PARCHED, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForParched, CONFIG::damageMultiplierForParched, CONFIG::speedMultiplierForParched, CONFIG::scaleMultiplierForParched
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PARROT, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForParrot, null, CONFIG::speedMultiplierForParrot, CONFIG::scaleMultiplierForParrot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PHANTOM, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPhantom, CONFIG::damageMultiplierForPhantom, null, CONFIG::scaleMultiplierForPhantom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PIG, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyPig::healthMultiplierForBabyPig, null, CONFIG.babyPig::speedMultiplierForBabyPig, CONFIG.babyPig::scaleMultiplierForBabyPig, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyPiglin::healthMultiplierForBabyPiglin, null, CONFIG.babyPiglin::speedMultiplierForBabyPiglin, CONFIG.babyPiglin::scaleMultiplierForBabyPiglin, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PIGLIN_BRUTE, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPiglinBrute, CONFIG::damageMultiplierForPiglinBrute, CONFIG::speedMultiplierForPiglinBrute, CONFIG::scaleMultiplierForPiglinBrute
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PILLAGER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPillager, CONFIG::damageMultiplierForPillager, CONFIG::speedMultiplierForPillager, CONFIG::scaleMultiplierForPillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.POLAR_BEAR, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyPolarBear::healthMultiplierForBabyPolarBear, null, CONFIG.babyPolarBear::speedMultiplierForBabyPolarBear, CONFIG.babyPolarBear::scaleMultiplierForBabyPolarBear, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PUFFERFISH, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForPufferfish, null, null, CONFIG::scaleMultiplierForPufferfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.RABBIT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyRabbit::healthMultiplierForBabyRabbit, CONFIG.babyRabbit::damageMultiplierForBabyRabbit, CONFIG.babyRabbit::speedMultiplierForBabyRabbit, CONFIG.babyRabbit::scaleMultiplierForBabyRabbit, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.RAVAGER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForRavager, CONFIG::damageMultiplierForRavager, CONFIG::speedMultiplierForRavager, CONFIG::scaleMultiplierForRavager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SALMON, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSalmon, null, null, CONFIG::scaleMultiplierForSalmon
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SHEEP, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babySheep::healthMultiplierForBabySheep, null, CONFIG.babySheep::speedMultiplierForBabySheep, CONFIG.babySheep::scaleMultiplierForBabySheep, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SHULKER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForShulker, null, null, CONFIG::scaleMultiplierForShulker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SILVERFISH, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSilverfish, CONFIG::damageMultiplierForSilverfish, CONFIG::speedMultiplierForSilverfish, CONFIG::scaleMultiplierForSilverfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SKELETON, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSkeleton, CONFIG::damageMultiplierForSkeleton, CONFIG::speedMultiplierForSkeleton, CONFIG::scaleMultiplierForSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SKELETON_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babySkeletonHorse::healthMultiplierForBabySkeletonHorse, null, CONFIG.babySkeletonHorse::speedMultiplierForBabySkeletonHorse, CONFIG.babySkeletonHorse::scaleMultiplierForBabySkeletonHorse, CONFIG::healthMultiplierForSkeletonHorse, null, CONFIG::speedMultiplierForSkeletonHorse, CONFIG::scaleMultiplierForSkeletonHorse
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSkeletonHorse, null, CONFIG::speedMultiplierForSkeletonHorse, CONFIG::scaleMultiplierForSkeletonHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SLIME, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSlime, CONFIG::damageMultiplierForSlime, CONFIG::speedMultiplierForSlime, CONFIG::scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SNIFFER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babySniffer::healthMultiplierForBabySniffer, null, CONFIG.babySniffer::speedMultiplierForBabySniffer, CONFIG.babySniffer::scaleMultiplierForBabySniffer, CONFIG::healthMultiplierForSniffer, null, CONFIG::speedMultiplierForSniffer, CONFIG::scaleMultiplierForSniffer
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSniffer, null, CONFIG::speedMultiplierForSniffer, CONFIG::scaleMultiplierForSniffer
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SNOW_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSnowGolem, null, CONFIG::speedMultiplierForSnowGolem, CONFIG::scaleMultiplierForSnowGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SPIDER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSpider, CONFIG::damageMultiplierForSpider, CONFIG::speedMultiplierForSpider, CONFIG::scaleMultiplierForSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babySquid::healthMultiplierForBabySquid, null, CONFIG.babySquid::speedMultiplierForBabySquid, CONFIG.babySquid::scaleMultiplierForBabySquid, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.STRAY, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForStray, CONFIG::damageMultiplierForStray, CONFIG::speedMultiplierForStray, CONFIG::scaleMultiplierForStray
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.STRIDER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyStrider::healthMultiplierForBabyStrider, null, CONFIG.babyStrider::speedMultiplierForBabyStrider, CONFIG.babyStrider::scaleMultiplierForBabyStrider, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SULFUR_CUBE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babySulfurCube::healthMultiplierForBabySulfurCube, null, CONFIG.babySulfurCube::speedMultiplierForBabySulfurCube, CONFIG.babySulfurCube::scaleMultiplierForBabySulfurCube, CONFIG::healthMultiplierForSulfurCube, null, CONFIG::speedMultiplierForSulfurCube, CONFIG::scaleMultiplierForSulfurCube
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForSulfurCube, null, CONFIG::speedMultiplierForSulfurCube, CONFIG::scaleMultiplierForSulfurCube
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TADPOLE, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForTadpole, null, null, CONFIG::scaleMultiplierForTadpole
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TRADER_LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyTraderLlama::healthMultiplierForBabyTraderLlama, null, CONFIG.babyTraderLlama::speedMultiplierForBabyTraderLlama, CONFIG.babyTraderLlama::scaleMultiplierForBabyTraderLlama, CONFIG::healthMultiplierForTraderLlama, null, CONFIG::speedMultiplierForTraderLlama, CONFIG::scaleMultiplierForTraderLlama
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForTraderLlama, null, CONFIG::speedMultiplierForTraderLlama, CONFIG::scaleMultiplierForTraderLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TROPICAL_FISH, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForTropicalFish, null, null, CONFIG::scaleMultiplierForTropicalFish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TURTLE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyTurtle::healthMultiplierForBabyTurtle, null, CONFIG.babyTurtle::speedMultiplierForBabyTurtle, CONFIG.babyTurtle::scaleMultiplierForBabyTurtle, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.VEX, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForVex, CONFIG::damageMultiplierForVex, CONFIG::speedMultiplierForVex, CONFIG::scaleMultiplierForVex
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyVillager::healthMultiplierForBabyVillager, null, CONFIG.babyVillager::speedMultiplierForBabyVillager, CONFIG.babyVillager::scaleMultiplierForBabyVillager, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.VINDICATOR, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForVindicator, CONFIG::damageMultiplierForVindicator, CONFIG::speedMultiplierForVindicator, CONFIG::scaleMultiplierForVindicator
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WANDERING_TRADER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForWanderingTrader, null, CONFIG::speedMultiplierForWanderingTrader, CONFIG::scaleMultiplierForWanderingTrader
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WARDEN, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForWarden, CONFIG::damageMultiplierForWarden, CONFIG::speedMultiplierForWarden, CONFIG::scaleMultiplierForWarden
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WITCH, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForWitch, CONFIG::damageMultiplierForWitch, CONFIG::speedMultiplierForWitch, CONFIG::scaleMultiplierForWitch
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WITHER, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForWither, CONFIG::damageMultiplierForWither, CONFIG::speedMultiplierForWither, CONFIG::scaleMultiplierForWither
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WITHER_SKELETON, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForWitherSkeleton, CONFIG::damageMultiplierForWitherSkeleton, CONFIG::speedMultiplierForWitherSkeleton, CONFIG::scaleMultiplierForWitherSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WOLF, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyWolf::healthMultiplierForBabyWolf, CONFIG.babyWolf::damageMultiplierForBabyWolf, CONFIG.babyWolf::speedMultiplierForBabyWolf, CONFIG.babyWolf::scaleMultiplierForBabyWolf, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyZoglin::healthMultiplierForBabyZoglin, CONFIG.babyZoglin::damageMultiplierForBabyZoglin, CONFIG.babyZoglin::speedMultiplierForBabyZoglin, CONFIG.babyZoglin::scaleMultiplierForBabyZoglin, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyZombie::healthMultiplierForBabyZombie, CONFIG.babyZombie::damageMultiplierForBabyZombie, CONFIG.babyZombie::speedMultiplierForBabyZombie, CONFIG.babyZombie::scaleMultiplierForBabyZombie, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyZombieHorse::healthMultiplierForBabyZombieHorse, null, CONFIG.babyZombieHorse::speedMultiplierForBabyZombieHorse, CONFIG.babyZombieHorse::scaleMultiplierForBabyZombieHorse, CONFIG::healthMultiplierForZombieHorse, null, CONFIG::speedMultiplierForZombieHorse, CONFIG::scaleMultiplierForZombieHorse
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForZombieHorse, null, CONFIG::speedMultiplierForZombieHorse, CONFIG::scaleMultiplierForZombieHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE_NAUTILUS, entity -> {
            configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForZombieNautilus, CONFIG::damageMultiplierForZombieNautilus, CONFIG::speedMultiplierForZombieNautilus, CONFIG::scaleMultiplierForZombieNautilus
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE_VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyZombieVillager::healthMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::damageMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::speedMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::scaleMultiplierForBabyZombieVillager, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIFIED_PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, CONFIG.babyZombifiedPiglin::healthMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::damageMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::speedMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::scaleMultiplierForBabyZombifiedPiglin, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
                );
            }
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish, Tadpole, Ghast, Squid, Vex and Bat have their own Mixin
    }
}
