package net.fneifnox.custommobattributes.init;

import net.minecraft.world.entity.EntityTypes;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;
import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;
import static net.fneifnox.custommobattributes.range.RangedMultipliers.fixed;
import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class Vanilla {

    public static void initVanillaAttributeHandlers() {

        ATTRIBUTE_HANDLERS.put(EntityTypes.ALLAY, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForAllay"), null, ranged("speedMultiplierForAllay"), ranged("scaleMultiplierForAllay")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ARMADILLO, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyArmadillo::healthMultiplierForBabyArmadillo), null, fixed(CONFIG.babyArmadillo::speedMultiplierForBabyArmadillo), fixed(CONFIG.babyArmadillo::scaleMultiplierForBabyArmadillo), ranged("healthMultiplierForArmadillo"), null, ranged("speedMultiplierForArmadillo"), ranged("scaleMultiplierForArmadillo")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForArmadillo"), null, ranged("speedMultiplierForArmadillo"), ranged("scaleMultiplierForArmadillo")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.AXOLOTL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyAxolotl::healthMultiplierForBabyAxolotl), fixed(CONFIG.babyAxolotl::damageMultiplierForBabyAxolotl), fixed(CONFIG.babyAxolotl::speedMultiplierForBabyAxolotl), fixed(CONFIG.babyAxolotl::scaleMultiplierForBabyAxolotl), ranged("healthMultiplierForAxolotl"), ranged("damageMultiplierForAxolotl"), ranged("speedMultiplierForAxolotl"), ranged("scaleMultiplierForAxolotl")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForAxolotl"), ranged("damageMultiplierForAxolotl"), ranged("speedMultiplierForAxolotl"), ranged("scaleMultiplierForAxolotl")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BAT, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForBat"), null, ranged("speedMultiplierForBat"), ranged("scaleMultiplierForBat")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BEE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyBee::healthMultiplierForBabyBee), fixed(CONFIG.babyBee::damageMultiplierForBabyBee), fixed(CONFIG.babyBee::speedMultiplierForBabyBee), fixed(CONFIG.babyBee::scaleMultiplierForBabyBee), ranged("healthMultiplierForBee"), ranged("damageMultiplierForBee"), ranged("speedMultiplierForBee"), ranged("scaleMultiplierForBee")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForBee"), ranged("damageMultiplierForBee"), ranged("speedMultiplierForBee"), ranged("scaleMultiplierForBee")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BLAZE, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForBlaze"), ranged("damageMultiplierForBlaze"), ranged("speedMultiplierForBlaze"), ranged("scaleMultiplierForBlaze")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BOGGED, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForBogged"), ranged("damageMultiplierForBogged"), ranged("speedMultiplierForBogged"), ranged("scaleMultiplierForBogged")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.BREEZE, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForBreeze"), ranged("damageMultiplierForBreeze"), ranged("speedMultiplierForBreeze"), ranged("scaleMultiplierForBreeze")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAMEL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyCamel::healthMultiplierForBabyCamel), null, fixed(CONFIG.babyCamel::speedMultiplierForBabyCamel), fixed(CONFIG.babyCamel::scaleMultiplierForBabyCamel), ranged("healthMultiplierForCamel"), null, ranged("speedMultiplierForCamel"), ranged("scaleMultiplierForCamel")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCamel"), null, ranged("speedMultiplierForCamel"), ranged("scaleMultiplierForCamel")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAMEL_HUSK, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyCamelHusk::healthMultiplierForBabyCamelHusk), null, fixed(CONFIG.babyCamelHusk::speedMultiplierForBabyCamelHusk), fixed(CONFIG.babyCamelHusk::scaleMultiplierForBabyCamelHusk), ranged("healthMultiplierForCamelHusk"), null, ranged("speedMultiplierForCamelHusk"), ranged("scaleMultiplierForCamelHusk")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCamelHusk"), null, ranged("speedMultiplierForCamelHusk"), ranged("scaleMultiplierForCamelHusk")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAVE_SPIDER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCaveSpider"), ranged("damageMultiplierForCaveSpider"), ranged("speedMultiplierForCaveSpider"), ranged("scaleMultiplierForCaveSpider")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyCat::healthMultiplierForBabyCat), fixed(CONFIG.babyCat::damageMultiplierForBabyCat), fixed(CONFIG.babyCat::speedMultiplierForBabyCat), fixed(CONFIG.babyCat::scaleMultiplierForBabyCat), ranged("healthMultiplierForCat"), ranged("damageMultiplierForCat"), ranged("speedMultiplierForCat"), ranged("scaleMultiplierForCat")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCat"), ranged("damageMultiplierForCat"), ranged("speedMultiplierForCat"), ranged("scaleMultiplierForCat")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CHICKEN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyChicken::healthMultiplierForBabyChicken), null, fixed(CONFIG.babyChicken::speedMultiplierForBabyChicken), fixed(CONFIG.babyChicken::scaleMultiplierForBabyChicken), ranged("healthMultiplierForChicken"), null, ranged("speedMultiplierForChicken"), ranged("scaleMultiplierForChicken")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForChicken"), null, ranged("speedMultiplierForChicken"), ranged("scaleMultiplierForChicken")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.COD, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCod"), null, null, ranged("scaleMultiplierForCod")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.COPPER_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCopperGolem"), null, ranged("speedMultiplierForCopperGolem"), ranged("scaleMultiplierForCopperGolem")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.COW, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyCow::healthMultiplierForBabyCow), null, fixed(CONFIG.babyCow::speedMultiplierForBabyCow), fixed(CONFIG.babyCow::scaleMultiplierForBabyCow), ranged("healthMultiplierForCow"), null, ranged("speedMultiplierForCow"), ranged("scaleMultiplierForCow")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCow"), null, ranged("speedMultiplierForCow"), ranged("scaleMultiplierForCow")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CREAKING, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCreaking"), ranged("damageMultiplierForCreaking"), ranged("speedMultiplierForCreaking"), ranged("scaleMultiplierForCreaking")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.CREEPER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForCreeper"), ranged("damageMultiplierForCreeper"), ranged("speedMultiplierForCreeper"), ranged("scaleMultiplierForCreeper")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.DONKEY, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyDonkey::healthMultiplierForBabyDonkey), null, fixed(CONFIG.babyDonkey::speedMultiplierForBabyDonkey), fixed(CONFIG.babyDonkey::scaleMultiplierForBabyDonkey), ranged("healthMultiplierForDonkey"), null, ranged("speedMultiplierForDonkey"), ranged("scaleMultiplierForDonkey")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForDonkey"), null, ranged("speedMultiplierForDonkey"), ranged("scaleMultiplierForDonkey")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.DOLPHIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyDolphin::healthMultiplierForBabyDolphin), fixed(CONFIG.babyDolphin::damageMultiplierForBabyDolphin), fixed(CONFIG.babyDolphin::speedMultiplierForBabyDolphin), fixed(CONFIG.babyDolphin::scaleMultiplierForBabyDolphin), ranged("healthMultiplierForDolphin"), ranged("damageMultiplierForDolphin"), ranged("speedMultiplierForDolphin"), ranged("scaleMultiplierForDolphin")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForDolphin"), ranged("damageMultiplierForDolphin"), ranged("speedMultiplierForDolphin"), ranged("scaleMultiplierForDolphin")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.DROWNED, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyDrowned::healthMultiplierForBabyDrowned), fixed(CONFIG.babyDrowned::damageMultiplierForBabyDrowned), fixed(CONFIG.babyDrowned::speedMultiplierForBabyDrowned), fixed(CONFIG.babyDrowned::scaleMultiplierForBabyDrowned), ranged("healthMultiplierForDrowned"), ranged("damageMultiplierForDrowned"), ranged("speedMultiplierForDrowned"), ranged("scaleMultiplierForDrowned")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForDrowned"), ranged("damageMultiplierForDrowned"), ranged("speedMultiplierForDrowned"), ranged("scaleMultiplierForDrowned")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ELDER_GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForElderGuardian"), ranged("damageMultiplierForElderGuardian"), ranged("speedMultiplierForElderGuardian"), ranged("scaleMultiplierForElderGuardian")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ENDER_DRAGON, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForEnderDragon"), ranged("damageMultiplierForEnderDragon"), null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ENDERMAN, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForEnderman"), ranged("damageMultiplierForEnderman"), ranged("speedMultiplierForEnderman"), ranged("scaleMultiplierForEnderman")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ENDERMITE, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForEndermite"), ranged("damageMultiplierForEndermite"), ranged("speedMultiplierForEndermite"), ranged("scaleMultiplierForEndermite")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.EVOKER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForEvoker"), ranged("damageMultiplierForEvoker"), ranged("speedMultiplierForEvoker"), ranged("scaleMultiplierForEvoker")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.FOX, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyFox::healthMultiplierForBabyFox), fixed(CONFIG.babyFox::damageMultiplierForBabyFox), fixed(CONFIG.babyFox::speedMultiplierForBabyFox), fixed(CONFIG.babyFox::scaleMultiplierForBabyFox), ranged("healthMultiplierForFox"), ranged("damageMultiplierForFox"), ranged("speedMultiplierForFox"), ranged("scaleMultiplierForFox")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForFox"), ranged("damageMultiplierForFox"), ranged("speedMultiplierForFox"), ranged("scaleMultiplierForFox")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.FROG, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForFrog"), ranged("damageMultiplierForFrog"), ranged("speedMultiplierForFrog"), ranged("scaleMultiplierForFrog")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GHAST, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForGhast"), null, ranged("speedMultiplierForGhast"), ranged("scaleMultiplierForGhast")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GIANT, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForGiant"), ranged("damageMultiplierForGiant"), ranged("speedMultiplierForGiant"), ranged("scaleMultiplierForGiant")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GLOW_SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyGlowSquid::healthMultiplierForBabyGlowSquid), null, fixed(CONFIG.babyGlowSquid::speedMultiplierForBabyGlowSquid), fixed(CONFIG.babyGlowSquid::scaleMultiplierForBabyGlowSquid), ranged("healthMultiplierForGlowSquid"), null, ranged("speedMultiplierForGlowSquid"), ranged("scaleMultiplierForGlowSquid")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForGlowSquid"), null, ranged("speedMultiplierForGlowSquid"), ranged("scaleMultiplierForGlowSquid")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GOAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyGoat::healthMultiplierForBabyGoat), fixed(CONFIG.babyGoat::damageMultiplierForBabyGoat), fixed(CONFIG.babyGoat::speedMultiplierForBabyGoat), fixed(CONFIG.babyGoat::scaleMultiplierForBabyGoat), ranged("healthMultiplierForGoat"), ranged("damageMultiplierForGoat"), ranged("speedMultiplierForGoat"), ranged("scaleMultiplierForGoat")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForGoat"), ranged("damageMultiplierForGoat"), ranged("speedMultiplierForGoat"), ranged("scaleMultiplierForGoat")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.GUARDIAN, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForGuardian"), ranged("damageMultiplierForGuardian"), ranged("speedMultiplierForGuardian"), ranged("scaleMultiplierForGuardian")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HAPPY_GHAST, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyHappyGhast::healthMultiplierForBabyHappyGhast), null, fixed(CONFIG.babyHappyGhast::speedMultiplierForBabyHappyGhast), fixed(CONFIG.babyHappyGhast::scaleMultiplierForBabyHappyGhast), ranged("healthMultiplierForHappyGhast"), null, ranged("speedMultiplierForHappyGhast"), ranged("scaleMultiplierForHappyGhast")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForHappyGhast"), null, ranged("speedMultiplierForHappyGhast"), ranged("scaleMultiplierForHappyGhast")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyHoglin::healthMultiplierForBabyHoglin), fixed(CONFIG.babyHoglin::damageMultiplierForBabyHoglin), fixed(CONFIG.babyHoglin::speedMultiplierForBabyHoglin), fixed(CONFIG.babyHoglin::scaleMultiplierForBabyHoglin), ranged("healthMultiplierForHoglin"), ranged("damageMultiplierForHoglin"), ranged("speedMultiplierForHoglin"), ranged("scaleMultiplierForHoglin")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForHoglin"), ranged("damageMultiplierForHoglin"), ranged("speedMultiplierForHoglin"), ranged("scaleMultiplierForHoglin")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyHorse::healthMultiplierForBabyHorse), null, fixed(CONFIG.babyHorse::speedMultiplierForBabyHorse), fixed(CONFIG.babyHorse::scaleMultiplierForBabyHorse), ranged("healthMultiplierForHorse"), null, ranged("speedMultiplierForHorse"), ranged("scaleMultiplierForHorse")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForHorse"), null, ranged("speedMultiplierForHorse"), ranged("scaleMultiplierForHorse")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.HUSK, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyHusk::healthMultiplierForBabyHusk), fixed(CONFIG.babyHusk::damageMultiplierForBabyHusk), fixed(CONFIG.babyHusk::speedMultiplierForBabyHusk), fixed(CONFIG.babyHusk::scaleMultiplierForBabyHusk), ranged("healthMultiplierForHusk"), ranged("damageMultiplierForHusk"), ranged("speedMultiplierForHusk"), ranged("scaleMultiplierForHusk")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForHusk"), ranged("damageMultiplierForHusk"), ranged("speedMultiplierForHusk"), ranged("scaleMultiplierForHusk")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ILLUSIONER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForIllusioner"), ranged("damageMultiplierForIllusioner"), ranged("speedMultiplierForIllusioner"), ranged("scaleMultiplierForIllusioner")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.IRON_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForIronGolem"), ranged("damageMultiplierForIronGolem"), ranged("speedMultiplierForIronGolem"), ranged("scaleMultiplierForIronGolem")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyLlama::healthMultiplierForBabyLlama), null, fixed(CONFIG.babyLlama::speedMultiplierForBabyLlama), fixed(CONFIG.babyLlama::scaleMultiplierForBabyLlama), ranged("healthMultiplierForLlama"), null, ranged("speedMultiplierForLlama"), ranged("scaleMultiplierForLlama")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForLlama"), null, ranged("speedMultiplierForLlama"), ranged("scaleMultiplierForLlama")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.MAGMA_CUBE, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForMagmaCube"), ranged("damageMultiplierForMagmaCube"), ranged("speedMultiplierForMagmaCube"), ranged("scaleMultiplierForMagmaCube")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.MOOSHROOM, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyMooshroom::healthMultiplierForBabyMooshroom), null, fixed(CONFIG.babyMooshroom::speedMultiplierForBabyMooshroom), fixed(CONFIG.babyMooshroom::scaleMultiplierForBabyMooshroom), ranged("healthMultiplierForMooshroom"), null, ranged("speedMultiplierForMooshroom"), ranged("scaleMultiplierForMooshroom")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForMooshroom"), null, ranged("speedMultiplierForMooshroom"), ranged("scaleMultiplierForMooshroom")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.MULE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyMule::healthMultiplierForBabyMule), null, fixed(CONFIG.babyMule::speedMultiplierForBabyMule), fixed(CONFIG.babyMule::scaleMultiplierForBabyMule), ranged("healthMultiplierForMule"), null, ranged("speedMultiplierForMule"), ranged("scaleMultiplierForMule")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForMule"), null, ranged("speedMultiplierForMule"), ranged("scaleMultiplierForMule")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.NAUTILUS, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyNautilus::healthMultiplierForBabyNautilus), null, fixed(CONFIG.babyNautilus::speedMultiplierForBabyNautilus), fixed(CONFIG.babyNautilus::scaleMultiplierForBabyNautilus), ranged("healthMultiplierForNautilus"), null, ranged("speedMultiplierForNautilus"), ranged("scaleMultiplierForNautilus")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForNautilus"), null, ranged("speedMultiplierForNautilus"), ranged("scaleMultiplierForNautilus")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.OCELOT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyOcelot::healthMultiplierForBabyOcelot), fixed(CONFIG.babyOcelot::damageMultiplierForBabyOcelot), fixed(CONFIG.babyOcelot::speedMultiplierForBabyOcelot), fixed(CONFIG.babyOcelot::scaleMultiplierForBabyOcelot), ranged("healthMultiplierForOcelot"), ranged("damageMultiplierForOcelot"), ranged("speedMultiplierForOcelot"), ranged("scaleMultiplierForOcelot")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForOcelot"), ranged("damageMultiplierForOcelot"), ranged("speedMultiplierForOcelot"), ranged("scaleMultiplierForOcelot")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PANDA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyPanda::healthMultiplierForBabyPanda), fixed(CONFIG.babyPanda::damageMultiplierForBabyPanda), fixed(CONFIG.babyPanda::speedMultiplierForBabyPanda), fixed(CONFIG.babyPanda::scaleMultiplierForBabyPanda), ranged("healthMultiplierForPanda"), ranged("damageMultiplierForPanda"), ranged("speedMultiplierForPanda"), ranged("scaleMultiplierForPanda")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPanda"), ranged("damageMultiplierForPanda"), ranged("speedMultiplierForPanda"), ranged("scaleMultiplierForPanda")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PARCHED, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForParched"), ranged("damageMultiplierForParched"), ranged("speedMultiplierForParched"), ranged("scaleMultiplierForParched")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PARROT, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForParrot"), null, ranged("speedMultiplierForParrot"), ranged("scaleMultiplierForParrot")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PHANTOM, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPhantom"), ranged("damageMultiplierForPhantom"), null, ranged("scaleMultiplierForPhantom")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PIG, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyPig::healthMultiplierForBabyPig), null, fixed(CONFIG.babyPig::speedMultiplierForBabyPig), fixed(CONFIG.babyPig::scaleMultiplierForBabyPig), ranged("healthMultiplierForPig"), null, ranged("speedMultiplierForPig"), ranged("scaleMultiplierForPig")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPig"), null, ranged("speedMultiplierForPig"), ranged("scaleMultiplierForPig")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyPiglin::healthMultiplierForBabyPiglin), null, fixed(CONFIG.babyPiglin::speedMultiplierForBabyPiglin), fixed(CONFIG.babyPiglin::scaleMultiplierForBabyPiglin), ranged("healthMultiplierForPiglin"), ranged("damageMultiplierForPiglin"), ranged("speedMultiplierForPiglin"), ranged("scaleMultiplierForPiglin")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPiglin"), ranged("damageMultiplierForPiglin"), ranged("speedMultiplierForPiglin"), ranged("scaleMultiplierForPiglin")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PIGLIN_BRUTE, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPiglinBrute"), ranged("damageMultiplierForPiglinBrute"), ranged("speedMultiplierForPiglinBrute"), ranged("scaleMultiplierForPiglinBrute")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PILLAGER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPillager"), ranged("damageMultiplierForPillager"), ranged("speedMultiplierForPillager"), ranged("scaleMultiplierForPillager")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.POLAR_BEAR, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyPolarBear::healthMultiplierForBabyPolarBear), null, fixed(CONFIG.babyPolarBear::speedMultiplierForBabyPolarBear), fixed(CONFIG.babyPolarBear::scaleMultiplierForBabyPolarBear), ranged("healthMultiplierForPolarBear"), ranged("damageMultiplierForPolarBear"), ranged("speedMultiplierForPolarBear"), ranged("scaleMultiplierForPolarBear")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPolarBear"), ranged("damageMultiplierForPolarBear"), ranged("speedMultiplierForPolarBear"), ranged("scaleMultiplierForPolarBear")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.PUFFERFISH, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForPufferfish"), null, null, ranged("scaleMultiplierForPufferfish")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.RABBIT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyRabbit::healthMultiplierForBabyRabbit), fixed(CONFIG.babyRabbit::damageMultiplierForBabyRabbit), fixed(CONFIG.babyRabbit::speedMultiplierForBabyRabbit), fixed(CONFIG.babyRabbit::scaleMultiplierForBabyRabbit), ranged("healthMultiplierForRabbit"), ranged("damageMultiplierForRabbit"), ranged("speedMultiplierForRabbit"), ranged("scaleMultiplierForRabbit")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForRabbit"), ranged("damageMultiplierForRabbit"), ranged("speedMultiplierForRabbit"), ranged("scaleMultiplierForRabbit")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.RAVAGER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForRavager"), ranged("damageMultiplierForRavager"), ranged("speedMultiplierForRavager"), ranged("scaleMultiplierForRavager")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SALMON, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSalmon"), null, null, ranged("scaleMultiplierForSalmon")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SHEEP, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babySheep::healthMultiplierForBabySheep), null, fixed(CONFIG.babySheep::speedMultiplierForBabySheep), fixed(CONFIG.babySheep::scaleMultiplierForBabySheep), ranged("healthMultiplierForSheep"), null, ranged("speedMultiplierForSheep"), ranged("scaleMultiplierForSheep")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSheep"), null, ranged("speedMultiplierForSheep"), ranged("scaleMultiplierForSheep")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SHULKER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForShulker"), null, null, ranged("scaleMultiplierForShulker")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SILVERFISH, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSilverfish"), ranged("damageMultiplierForSilverfish"), ranged("speedMultiplierForSilverfish"), ranged("scaleMultiplierForSilverfish")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SKELETON, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSkeleton"), ranged("damageMultiplierForSkeleton"), ranged("speedMultiplierForSkeleton"), ranged("scaleMultiplierForSkeleton")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SKELETON_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babySkeletonHorse::healthMultiplierForBabySkeletonHorse), null, fixed(CONFIG.babySkeletonHorse::speedMultiplierForBabySkeletonHorse), fixed(CONFIG.babySkeletonHorse::scaleMultiplierForBabySkeletonHorse), ranged("healthMultiplierForSkeletonHorse"), null, ranged("speedMultiplierForSkeletonHorse"), ranged("scaleMultiplierForSkeletonHorse")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSkeletonHorse"), null, ranged("speedMultiplierForSkeletonHorse"), ranged("scaleMultiplierForSkeletonHorse")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SLIME, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSlime"), ranged("damageMultiplierForSlime"), ranged("speedMultiplierForSlime"), ranged("scaleMultiplierForSlime")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SNIFFER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babySniffer::healthMultiplierForBabySniffer), null, fixed(CONFIG.babySniffer::speedMultiplierForBabySniffer), fixed(CONFIG.babySniffer::scaleMultiplierForBabySniffer), ranged("healthMultiplierForSniffer"), null, ranged("speedMultiplierForSniffer"), ranged("scaleMultiplierForSniffer")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSniffer"), null, ranged("speedMultiplierForSniffer"), ranged("scaleMultiplierForSniffer")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SNOW_GOLEM, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSnowGolem"), null, ranged("speedMultiplierForSnowGolem"), ranged("scaleMultiplierForSnowGolem")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SPIDER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSpider"), ranged("damageMultiplierForSpider"), ranged("speedMultiplierForSpider"), ranged("scaleMultiplierForSpider")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babySquid::healthMultiplierForBabySquid), null, fixed(CONFIG.babySquid::speedMultiplierForBabySquid), fixed(CONFIG.babySquid::scaleMultiplierForBabySquid), ranged("healthMultiplierForSquid"), null, ranged("speedMultiplierForSquid"), ranged("scaleMultiplierForSquid")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSquid"), null, ranged("speedMultiplierForSquid"), ranged("scaleMultiplierForSquid")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.STRAY, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForStray"), ranged("damageMultiplierForStray"), ranged("speedMultiplierForStray"), ranged("scaleMultiplierForStray")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.STRIDER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyStrider::healthMultiplierForBabyStrider), null, fixed(CONFIG.babyStrider::speedMultiplierForBabyStrider), fixed(CONFIG.babyStrider::scaleMultiplierForBabyStrider), ranged("healthMultiplierForStrider"), null, ranged("speedMultiplierForStrider"), ranged("scaleMultiplierForStrider")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForStrider"), null, ranged("speedMultiplierForStrider"), ranged("scaleMultiplierForStrider")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.SULFUR_CUBE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babySulfurCube::healthMultiplierForBabySulfurCube), null, fixed(CONFIG.babySulfurCube::speedMultiplierForBabySulfurCube), fixed(CONFIG.babySulfurCube::scaleMultiplierForBabySulfurCube), ranged("healthMultiplierForSulfurCube"), null, ranged("speedMultiplierForSulfurCube"), ranged("scaleMultiplierForSulfurCube")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForSulfurCube"), null, ranged("speedMultiplierForSulfurCube"), ranged("scaleMultiplierForSulfurCube")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TADPOLE, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForTadpole"), null, null, ranged("scaleMultiplierForTadpole")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TRADER_LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyTraderLlama::healthMultiplierForBabyTraderLlama), null, fixed(CONFIG.babyTraderLlama::speedMultiplierForBabyTraderLlama), fixed(CONFIG.babyTraderLlama::scaleMultiplierForBabyTraderLlama), ranged("healthMultiplierForTraderLlama"), null, ranged("speedMultiplierForTraderLlama"), ranged("scaleMultiplierForTraderLlama")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForTraderLlama"), null, ranged("speedMultiplierForTraderLlama"), ranged("scaleMultiplierForTraderLlama")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TROPICAL_FISH, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForTropicalFish"), null, null, ranged("scaleMultiplierForTropicalFish")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.TURTLE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyTurtle::healthMultiplierForBabyTurtle), null, fixed(CONFIG.babyTurtle::speedMultiplierForBabyTurtle), fixed(CONFIG.babyTurtle::scaleMultiplierForBabyTurtle), ranged("healthMultiplierForTurtle"), null, ranged("speedMultiplierForTurtle"), ranged("scaleMultiplierForTurtle")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForTurtle"), null, ranged("speedMultiplierForTurtle"), ranged("scaleMultiplierForTurtle")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.VEX, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForVex"), ranged("damageMultiplierForVex"), ranged("speedMultiplierForVex"), ranged("scaleMultiplierForVex")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyVillager::healthMultiplierForBabyVillager), null, fixed(CONFIG.babyVillager::speedMultiplierForBabyVillager), fixed(CONFIG.babyVillager::scaleMultiplierForBabyVillager), ranged("healthMultiplierForVillager"), null, ranged("speedMultiplierForVillager"), ranged("scaleMultiplierForVillager")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForVillager"), null, ranged("speedMultiplierForVillager"), ranged("scaleMultiplierForVillager")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.VINDICATOR, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForVindicator"), ranged("damageMultiplierForVindicator"), ranged("speedMultiplierForVindicator"), ranged("scaleMultiplierForVindicator")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WANDERING_TRADER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForWanderingTrader"), null, ranged("speedMultiplierForWanderingTrader"), ranged("scaleMultiplierForWanderingTrader")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WARDEN, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForWarden"), ranged("damageMultiplierForWarden"), ranged("speedMultiplierForWarden"), ranged("scaleMultiplierForWarden")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WITCH, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForWitch"), ranged("damageMultiplierForWitch"), ranged("speedMultiplierForWitch"), ranged("scaleMultiplierForWitch")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WITHER, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForWither"), ranged("damageMultiplierForWither"), ranged("speedMultiplierForWither"), ranged("scaleMultiplierForWither")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WITHER_SKELETON, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForWitherSkeleton"), ranged("damageMultiplierForWitherSkeleton"), ranged("speedMultiplierForWitherSkeleton"), ranged("scaleMultiplierForWitherSkeleton")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.WOLF, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyWolf::healthMultiplierForBabyWolf), fixed(CONFIG.babyWolf::damageMultiplierForBabyWolf), fixed(CONFIG.babyWolf::speedMultiplierForBabyWolf), fixed(CONFIG.babyWolf::scaleMultiplierForBabyWolf), ranged("healthMultiplierForWolf"), ranged("damageMultiplierForWolf"), ranged("speedMultiplierForWolf"), ranged("scaleMultiplierForWolf")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForWolf"), ranged("damageMultiplierForWolf"), ranged("speedMultiplierForWolf"), ranged("scaleMultiplierForWolf")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyZoglin::healthMultiplierForBabyZoglin), fixed(CONFIG.babyZoglin::damageMultiplierForBabyZoglin), fixed(CONFIG.babyZoglin::speedMultiplierForBabyZoglin), fixed(CONFIG.babyZoglin::scaleMultiplierForBabyZoglin), ranged("healthMultiplierForZoglin"), ranged("damageMultiplierForZoglin"), ranged("speedMultiplierForZoglin"), ranged("scaleMultiplierForZoglin")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForZoglin"), ranged("damageMultiplierForZoglin"), ranged("speedMultiplierForZoglin"), ranged("scaleMultiplierForZoglin")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyZombie::healthMultiplierForBabyZombie), fixed(CONFIG.babyZombie::damageMultiplierForBabyZombie), fixed(CONFIG.babyZombie::speedMultiplierForBabyZombie), fixed(CONFIG.babyZombie::scaleMultiplierForBabyZombie), ranged("healthMultiplierForZombie"), ranged("damageMultiplierForZombie"), ranged("speedMultiplierForZombie"), ranged("scaleMultiplierForZombie")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForZombie"), ranged("damageMultiplierForZombie"), ranged("speedMultiplierForZombie"), ranged("scaleMultiplierForZombie")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyZombieHorse::healthMultiplierForBabyZombieHorse), null, fixed(CONFIG.babyZombieHorse::speedMultiplierForBabyZombieHorse), fixed(CONFIG.babyZombieHorse::scaleMultiplierForBabyZombieHorse), ranged("healthMultiplierForZombieHorse"), null, ranged("speedMultiplierForZombieHorse"), ranged("scaleMultiplierForZombieHorse")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForZombieHorse"), null, ranged("speedMultiplierForZombieHorse"), ranged("scaleMultiplierForZombieHorse")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE_NAUTILUS, entity -> {
            configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForZombieNautilus"), ranged("damageMultiplierForZombieNautilus"), ranged("speedMultiplierForZombieNautilus"), ranged("scaleMultiplierForZombieNautilus")
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIE_VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyZombieVillager::healthMultiplierForBabyZombieVillager), fixed(CONFIG.babyZombieVillager::damageMultiplierForBabyZombieVillager), fixed(CONFIG.babyZombieVillager::speedMultiplierForBabyZombieVillager), fixed(CONFIG.babyZombieVillager::scaleMultiplierForBabyZombieVillager), ranged("healthMultiplierForZombieVillager"), ranged("damageMultiplierForZombieVillager"), ranged("speedMultiplierForZombieVillager"), ranged("scaleMultiplierForZombieVillager")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForZombieVillager"), ranged("damageMultiplierForZombieVillager"), ranged("speedMultiplierForZombieVillager"), ranged("scaleMultiplierForZombieVillager")
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityTypes.ZOMBIFIED_PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.level(), entity, fixed(CONFIG.babyZombifiedPiglin::healthMultiplierForBabyZombifiedPiglin), fixed(CONFIG.babyZombifiedPiglin::damageMultiplierForBabyZombifiedPiglin), fixed(CONFIG.babyZombifiedPiglin::speedMultiplierForBabyZombifiedPiglin), fixed(CONFIG.babyZombifiedPiglin::scaleMultiplierForBabyZombifiedPiglin), ranged("healthMultiplierForZombifiedPiglin"), ranged("damageMultiplierForZombifiedPiglin"), ranged("speedMultiplierForZombifiedPiglin"), ranged("scaleMultiplierForZombifiedPiglin")
                );
            }
            else {
                configureEntityAttributes(entity.level(), entity, ranged("healthMultiplierForZombifiedPiglin"), ranged("damageMultiplierForZombifiedPiglin"), ranged("speedMultiplierForZombifiedPiglin"), ranged("scaleMultiplierForZombifiedPiglin")
                );
            }
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish, Tadpole, Ghast, Squid, Vex and Bat have their own Mixin
    }
}
