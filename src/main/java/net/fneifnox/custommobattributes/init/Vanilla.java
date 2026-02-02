package net.fneifnox.custommobattributes.init;

import net.minecraft.entity.EntityType;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;
import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class Vanilla {

    public static void initVanillaAttributeHandlers() {

        ATTRIBUTE_HANDLERS.put(EntityType.ALLAY, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForAllay, null, CONFIG::speedMultiplierForAllay, CONFIG::scaleMultiplierForAllay
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ARMADILLO, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyArmadillo::healthMultiplierForBabyArmadillo, null, CONFIG.babyArmadillo::speedMultiplierForBabyArmadillo, CONFIG.babyArmadillo::scaleMultiplierForBabyArmadillo, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.AXOLOTL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyAxolotl::healthMultiplierForBabyAxolotl, CONFIG.babyAxolotl::damageMultiplierForBabyAxolotl, CONFIG.babyAxolotl::speedMultiplierForBabyAxolotl, CONFIG.babyAxolotl::scaleMultiplierForBabyAxolotl, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BAT, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForBat, null, CONFIG::speedMultiplierForBat, CONFIG::scaleMultiplierForBat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BEE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyBee::healthMultiplierForBabyBee, CONFIG.babyBee::damageMultiplierForBabyBee, CONFIG.babyBee::speedMultiplierForBabyBee, CONFIG.babyBee::scaleMultiplierForBabyBee, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, CONFIG::speedMultiplierForBee, CONFIG::scaleMultiplierForBee
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, CONFIG::speedMultiplierForBee, CONFIG::scaleMultiplierForBee
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BLAZE, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForBlaze, CONFIG::damageMultiplierForBlaze, CONFIG::speedMultiplierForBlaze, CONFIG::scaleMultiplierForBlaze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BOGGED, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForBogged, CONFIG::damageMultiplierForBogged, CONFIG::speedMultiplierForBogged, CONFIG::scaleMultiplierForBogged
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BREEZE, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForBreeze, CONFIG::damageMultiplierForBreeze, CONFIG::speedMultiplierForBreeze, CONFIG::scaleMultiplierForBreeze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAMEL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyCamel::healthMultiplierForBabyCamel, null, CONFIG.babyCamel::speedMultiplierForBabyCamel, CONFIG.babyCamel::scaleMultiplierForBabyCamel, CONFIG::healthMultiplierForCamel, null, CONFIG::speedMultiplierForCamel, CONFIG::scaleMultiplierForCamel
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForCamel, null, CONFIG::speedMultiplierForCamel, CONFIG::scaleMultiplierForCamel
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAVE_SPIDER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForCaveSpider, CONFIG::damageMultiplierForCaveSpider, CONFIG::speedMultiplierForCaveSpider, CONFIG::scaleMultiplierForCaveSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyCat::healthMultiplierForBabyCat, CONFIG.babyCat::damageMultiplierForBabyCat, CONFIG.babyCat::speedMultiplierForBabyCat, CONFIG.babyCat::scaleMultiplierForBabyCat, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CHICKEN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyChicken::healthMultiplierForBabyChicken, null, CONFIG.babyChicken::speedMultiplierForBabyChicken, CONFIG.babyChicken::scaleMultiplierForBabyChicken, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COD, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForCod, null, null, CONFIG::scaleMultiplierForCod
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COW, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyCow::healthMultiplierForBabyCow, null, CONFIG.babyCow::speedMultiplierForBabyCow, CONFIG.babyCow::scaleMultiplierForBabyCow, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREEPER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForCreeper, CONFIG::damageMultiplierForCreeper, CONFIG::speedMultiplierForCreeper, CONFIG::scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DONKEY, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyDonkey::healthMultiplierForBabyDonkey, null, CONFIG.babyDonkey::speedMultiplierForBabyDonkey, CONFIG.babyDonkey::scaleMultiplierForBabyDonkey, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DOLPHIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyDolphin::healthMultiplierForBabyDolphin, CONFIG.babyDolphin::damageMultiplierForBabyDolphin, CONFIG.babyDolphin::speedMultiplierForBabyDolphin, CONFIG.babyDolphin::scaleMultiplierForBabyDolphin, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DROWNED, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyDrowned::healthMultiplierForBabyDrowned, CONFIG.babyDrowned::damageMultiplierForBabyDrowned, CONFIG.babyDrowned::speedMultiplierForBabyDrowned, CONFIG.babyDrowned::scaleMultiplierForBabyDrowned, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ELDER_GUARDIAN, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForElderGuardian, CONFIG::damageMultiplierForElderGuardian, CONFIG::speedMultiplierForElderGuardian, CONFIG::scaleMultiplierForElderGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDER_DRAGON, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForEnderDragon, CONFIG::damageMultiplierForEnderDragon, null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMAN, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForEnderman, CONFIG::damageMultiplierForEnderman, CONFIG::speedMultiplierForEnderman, CONFIG::scaleMultiplierForEnderman
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMITE, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForEndermite, CONFIG::damageMultiplierForEndermite, CONFIG::speedMultiplierForEndermite, CONFIG::scaleMultiplierForEndermite
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.EVOKER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForEvoker, CONFIG::damageMultiplierForEvoker, CONFIG::speedMultiplierForEvoker, CONFIG::scaleMultiplierForEvoker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FOX, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyFox::healthMultiplierForBabyFox, CONFIG.babyFox::damageMultiplierForBabyFox, CONFIG.babyFox::speedMultiplierForBabyFox, CONFIG.babyFox::scaleMultiplierForBabyFox, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FROG, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForFrog, CONFIG::damageMultiplierForFrog, CONFIG::speedMultiplierForFrog, CONFIG::scaleMultiplierForFrog
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GHAST, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForGhast, null, CONFIG::speedMultiplierForGhast, CONFIG::scaleMultiplierForGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GIANT, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForGiant, CONFIG::damageMultiplierForGiant, CONFIG::speedMultiplierForGiant, CONFIG::scaleMultiplierForGiant
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GLOW_SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyGlowSquid::healthMultiplierForBabyGlowSquid, null, CONFIG.babyGlowSquid::speedMultiplierForBabyGlowSquid, CONFIG.babyGlowSquid::scaleMultiplierForBabyGlowSquid, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GOAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyGoat::healthMultiplierForBabyGoat, CONFIG.babyGoat::damageMultiplierForBabyGoat, CONFIG.babyGoat::speedMultiplierForBabyGoat, CONFIG.babyGoat::scaleMultiplierForBabyGoat, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GUARDIAN, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForGuardian, CONFIG::damageMultiplierForGuardian, CONFIG::speedMultiplierForGuardian, CONFIG::scaleMultiplierForGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyHoglin::healthMultiplierForBabyHoglin, CONFIG.babyHoglin::damageMultiplierForBabyHoglin, CONFIG.babyHoglin::speedMultiplierForBabyHoglin, CONFIG.babyHoglin::scaleMultiplierForBabyHoglin, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyHorse::healthMultiplierForBabyHorse, null, CONFIG.babyHorse::speedMultiplierForBabyHorse, CONFIG.babyHorse::scaleMultiplierForBabyHorse, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HUSK, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyHusk::healthMultiplierForBabyHusk, CONFIG.babyHusk::damageMultiplierForBabyHusk, CONFIG.babyHusk::speedMultiplierForBabyHusk, CONFIG.babyHusk::scaleMultiplierForBabyHusk, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ILLUSIONER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForIllusioner, CONFIG::damageMultiplierForIllusioner, CONFIG::speedMultiplierForIllusioner, CONFIG::scaleMultiplierForIllusioner
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.IRON_GOLEM, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForIronGolem, CONFIG::damageMultiplierForIronGolem, CONFIG::speedMultiplierForIronGolem, CONFIG::scaleMultiplierForIronGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyLlama::healthMultiplierForBabyLlama, null, CONFIG.babyLlama::speedMultiplierForBabyLlama, CONFIG.babyLlama::scaleMultiplierForBabyLlama, CONFIG::healthMultiplierForLlama, null, CONFIG::speedMultiplierForLlama, CONFIG::scaleMultiplierForLlama
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForLlama, null, CONFIG::speedMultiplierForLlama, CONFIG::scaleMultiplierForLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MAGMA_CUBE, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForMagmaCube, CONFIG::damageMultiplierForMagmaCube, CONFIG::speedMultiplierForMagmaCube, CONFIG::scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MOOSHROOM, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyMooshroom::healthMultiplierForBabyMooshroom, null, CONFIG.babyMooshroom::speedMultiplierForBabyMooshroom, CONFIG.babyMooshroom::scaleMultiplierForBabyMooshroom, CONFIG::healthMultiplierForMooshroom, null, CONFIG::speedMultiplierForMooshroom, CONFIG::scaleMultiplierForMooshroom
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForMooshroom, null, CONFIG::speedMultiplierForMooshroom, CONFIG::scaleMultiplierForMooshroom
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MULE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyMule::healthMultiplierForBabyMule, null, CONFIG.babyMule::speedMultiplierForBabyMule, CONFIG.babyMule::scaleMultiplierForBabyMule, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.OCELOT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyOcelot::healthMultiplierForBabyOcelot, CONFIG.babyOcelot::damageMultiplierForBabyOcelot, CONFIG.babyOcelot::speedMultiplierForBabyOcelot, CONFIG.babyOcelot::scaleMultiplierForBabyOcelot, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PANDA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyPanda::healthMultiplierForBabyPanda, CONFIG.babyPanda::damageMultiplierForBabyPanda, CONFIG.babyPanda::speedMultiplierForBabyPanda, CONFIG.babyPanda::scaleMultiplierForBabyPanda, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PARROT, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForParrot, null, CONFIG::speedMultiplierForParrot, CONFIG::scaleMultiplierForParrot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PHANTOM, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPhantom, CONFIG::damageMultiplierForPhantom, null, CONFIG::scaleMultiplierForPhantom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIG, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyPig::healthMultiplierForBabyPig, null, CONFIG.babyPig::speedMultiplierForBabyPig, CONFIG.babyPig::scaleMultiplierForBabyPig, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyPiglin::healthMultiplierForBabyPiglin, null, CONFIG.babyPiglin::speedMultiplierForBabyPiglin, CONFIG.babyPiglin::scaleMultiplierForBabyPiglin, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN_BRUTE, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPiglinBrute, CONFIG::damageMultiplierForPiglinBrute, CONFIG::speedMultiplierForPiglinBrute, CONFIG::scaleMultiplierForPiglinBrute
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PILLAGER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPillager, CONFIG::damageMultiplierForPillager, CONFIG::speedMultiplierForPillager, CONFIG::scaleMultiplierForPillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.POLAR_BEAR, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyPolarBear::healthMultiplierForBabyPolarBear, null, CONFIG.babyPolarBear::speedMultiplierForBabyPolarBear, CONFIG.babyPolarBear::scaleMultiplierForBabyPolarBear, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PUFFERFISH, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForPufferfish, null, null, CONFIG::scaleMultiplierForPufferfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RABBIT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyRabbit::healthMultiplierForBabyRabbit, CONFIG.babyRabbit::damageMultiplierForBabyRabbit, CONFIG.babyRabbit::speedMultiplierForBabyRabbit, CONFIG.babyRabbit::scaleMultiplierForBabyRabbit, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RAVAGER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForRavager, CONFIG::damageMultiplierForRavager, CONFIG::speedMultiplierForRavager, CONFIG::scaleMultiplierForRavager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SALMON, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSalmon, null, null, CONFIG::scaleMultiplierForSalmon
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHEEP, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babySheep::healthMultiplierForBabySheep, null, CONFIG.babySheep::speedMultiplierForBabySheep, CONFIG.babySheep::scaleMultiplierForBabySheep, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHULKER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForShulker, null, null, CONFIG::scaleMultiplierForShulker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SILVERFISH, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSilverfish, CONFIG::damageMultiplierForSilverfish, CONFIG::speedMultiplierForSilverfish, CONFIG::scaleMultiplierForSilverfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSkeleton, CONFIG::damageMultiplierForSkeleton, CONFIG::speedMultiplierForSkeleton, CONFIG::scaleMultiplierForSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babySkeletonHorse::healthMultiplierForBabySkeletonHorse, null, CONFIG.babySkeletonHorse::speedMultiplierForBabySkeletonHorse, CONFIG.babySkeletonHorse::scaleMultiplierForBabySkeletonHorse, CONFIG::healthMultiplierForSkeletonHorse, null, CONFIG::speedMultiplierForSkeletonHorse, CONFIG::scaleMultiplierForSkeletonHorse
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSkeletonHorse, null, CONFIG::speedMultiplierForSkeletonHorse, CONFIG::scaleMultiplierForSkeletonHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SLIME, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSlime, CONFIG::damageMultiplierForSlime, CONFIG::speedMultiplierForSlime, CONFIG::scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNIFFER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babySniffer::healthMultiplierForBabySniffer, null, CONFIG.babySniffer::speedMultiplierForBabySniffer, CONFIG.babySniffer::scaleMultiplierForBabySniffer, CONFIG::healthMultiplierForSniffer, null, CONFIG::speedMultiplierForSniffer, CONFIG::scaleMultiplierForSniffer
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSniffer, null, CONFIG::speedMultiplierForSniffer, CONFIG::scaleMultiplierForSniffer
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNOW_GOLEM, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSnowGolem, null, CONFIG::speedMultiplierForSnowGolem, CONFIG::scaleMultiplierForSnowGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SPIDER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSpider, CONFIG::damageMultiplierForSpider, CONFIG::speedMultiplierForSpider, CONFIG::scaleMultiplierForSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babySquid::healthMultiplierForBabySquid, null, CONFIG.babySquid::speedMultiplierForBabySquid, CONFIG.babySquid::scaleMultiplierForBabySquid, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRAY, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForStray, CONFIG::damageMultiplierForStray, CONFIG::speedMultiplierForStray, CONFIG::scaleMultiplierForStray
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRIDER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyStrider::healthMultiplierForBabyStrider, null, CONFIG.babyStrider::speedMultiplierForBabyStrider, CONFIG.babyStrider::scaleMultiplierForBabyStrider, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TADPOLE, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForTadpole, null, null, CONFIG::scaleMultiplierForTadpole
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TRADER_LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyTraderLlama::healthMultiplierForBabyTraderLlama, null, CONFIG.babyTraderLlama::speedMultiplierForBabyTraderLlama, CONFIG.babyTraderLlama::scaleMultiplierForBabyTraderLlama, CONFIG::healthMultiplierForTraderLlama, null, CONFIG::speedMultiplierForTraderLlama, CONFIG::scaleMultiplierForTraderLlama
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForTraderLlama, null, CONFIG::speedMultiplierForTraderLlama, CONFIG::scaleMultiplierForTraderLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TROPICAL_FISH, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForTropicalFish, null, null, CONFIG::scaleMultiplierForTropicalFish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TURTLE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyTurtle::healthMultiplierForBabyTurtle, null, CONFIG.babyTurtle::speedMultiplierForBabyTurtle, CONFIG.babyTurtle::scaleMultiplierForBabyTurtle, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VEX, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForVex, CONFIG::damageMultiplierForVex, CONFIG::speedMultiplierForVex, CONFIG::scaleMultiplierForVex
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyVillager::healthMultiplierForBabyVillager, null, CONFIG.babyVillager::speedMultiplierForBabyVillager, CONFIG.babyVillager::scaleMultiplierForBabyVillager, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VINDICATOR, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForVindicator, CONFIG::damageMultiplierForVindicator, CONFIG::speedMultiplierForVindicator, CONFIG::scaleMultiplierForVindicator
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WANDERING_TRADER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForWanderingTrader, null, CONFIG::speedMultiplierForWanderingTrader, CONFIG::scaleMultiplierForWanderingTrader
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WARDEN, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForWarden, CONFIG::damageMultiplierForWarden, CONFIG::speedMultiplierForWarden, CONFIG::scaleMultiplierForWarden
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITCH, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForWitch, CONFIG::damageMultiplierForWitch, CONFIG::speedMultiplierForWitch, CONFIG::scaleMultiplierForWitch
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForWither, CONFIG::damageMultiplierForWither, CONFIG::speedMultiplierForWither, CONFIG::scaleMultiplierForWither
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER_SKELETON, entity -> {
            configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForWitherSkeleton, CONFIG::damageMultiplierForWitherSkeleton, CONFIG::speedMultiplierForWitherSkeleton, CONFIG::scaleMultiplierForWitherSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WOLF, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyWolf::healthMultiplierForBabyWolf, CONFIG.babyWolf::damageMultiplierForBabyWolf, CONFIG.babyWolf::speedMultiplierForBabyWolf, CONFIG.babyWolf::scaleMultiplierForBabyWolf, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyZoglin::healthMultiplierForBabyZoglin, CONFIG.babyZoglin::damageMultiplierForBabyZoglin, CONFIG.babyZoglin::speedMultiplierForBabyZoglin, CONFIG.babyZoglin::scaleMultiplierForBabyZoglin, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyZombie::healthMultiplierForBabyZombie, CONFIG.babyZombie::damageMultiplierForBabyZombie, CONFIG.babyZombie::speedMultiplierForBabyZombie, CONFIG.babyZombie::scaleMultiplierForBabyZombie, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyZombieHorse::healthMultiplierForBabyZombieHorse, null, CONFIG.babyZombieHorse::speedMultiplierForBabyZombieHorse, CONFIG.babyZombieHorse::scaleMultiplierForBabyZombieHorse, CONFIG::healthMultiplierForZombieHorse, null, CONFIG::speedMultiplierForZombieHorse, CONFIG::scaleMultiplierForZombieHorse
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForZombieHorse, null, CONFIG::speedMultiplierForZombieHorse, CONFIG::scaleMultiplierForZombieHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyZombieVillager::healthMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::damageMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::speedMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::scaleMultiplierForBabyZombieVillager, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIFIED_PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.babyZombifiedPiglin::healthMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::damageMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::speedMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::scaleMultiplierForBabyZombifiedPiglin, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
                );
            }
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish, Tadpole, Ghast, Squid, Vex and Bat have their own Mixin
    }
}
