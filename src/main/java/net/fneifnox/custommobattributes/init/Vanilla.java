package net.fneifnox.custommobattributes.init;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;
import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class Vanilla {

    public static void initVanillaAttributeHandlers() {

        ATTRIBUTE_HANDLERS.put(EntityType.ALLAY, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.ALLAY, CONFIG::healthMultiplierForAllay, CONFIG::damageMultiplierForAllay, CONFIG::speedMultiplierForAllay, CONFIG::scaleMultiplierForAllay
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ARMADILLO, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.ARMADILLO, CONFIG.babyArmadillo::healthMultiplierForBabyArmadillo, null, CONFIG.babyArmadillo::speedMultiplierForBabyArmadillo, CONFIG.babyArmadillo::scaleMultiplierForBabyArmadillo
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.ARMADILLO, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.AXOLOTL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.AXOLOTL, CONFIG.babyAxolotl::healthMultiplierForBabyAxolotl, CONFIG.babyAxolotl::damageMultiplierForBabyAxolotl, CONFIG.babyAxolotl::speedMultiplierForBabyAxolotl, CONFIG.babyAxolotl::scaleMultiplierForBabyAxolotl
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.AXOLOTL, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BAT, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.BAT, CONFIG::healthMultiplierForBat, null, CONFIG::speedMultiplierForBat, CONFIG::scaleMultiplierForBat
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BEE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.BEE, CONFIG.babyBee::healthMultiplierForBabyBee, CONFIG.babyBee::damageMultiplierForBabyBee, CONFIG.babyBee::speedMultiplierForBabyBee, CONFIG.babyBee::scaleMultiplierForBabyBee
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.BEE, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, CONFIG::speedMultiplierForBee, CONFIG::scaleMultiplierForBee
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BLAZE, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.BLAZE, CONFIG::healthMultiplierForBlaze, CONFIG::damageMultiplierForBlaze, CONFIG::speedMultiplierForBlaze, CONFIG::scaleMultiplierForBlaze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BOGGED, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.BOGGED, CONFIG::healthMultiplierForBogged, CONFIG::damageMultiplierForBogged, CONFIG::speedMultiplierForBogged, CONFIG::scaleMultiplierForBogged
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BREEZE, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.BREEZE, CONFIG::healthMultiplierForBreeze, CONFIG::damageMultiplierForBreeze, CONFIG::speedMultiplierForBreeze, CONFIG::scaleMultiplierForBreeze
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAMEL, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.CAMEL, CONFIG.babyCamel::healthMultiplierForBabyCamel, null, CONFIG.babyCamel::speedMultiplierForBabyCamel, CONFIG.babyCamel::scaleMultiplierForBabyCamel
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.CAMEL, CONFIG::healthMultiplierForCamel, null, CONFIG::speedMultiplierForCamel, CONFIG::scaleMultiplierForCamel
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAVE_SPIDER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.CAVE_SPIDER, CONFIG::healthMultiplierForCaveSpider, CONFIG::damageMultiplierForCaveSpider, CONFIG::speedMultiplierForCaveSpider, CONFIG::scaleMultiplierForCaveSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.CAT, CONFIG.babyCat::healthMultiplierForBabyCat, CONFIG.babyCat::damageMultiplierForBabyCat, CONFIG.babyCat::speedMultiplierForBabyCat, CONFIG.babyCat::scaleMultiplierForBabyCat
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.CAT, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CHICKEN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.CHICKEN, CONFIG.babyChicken::healthMultiplierForBabyChicken, null, CONFIG.babyChicken::speedMultiplierForBabyChicken, CONFIG.babyChicken::scaleMultiplierForBabyChicken
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.CHICKEN, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COD, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.COD, CONFIG::healthMultiplierForCod, null, null, CONFIG::scaleMultiplierForCod
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COW, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.COW, CONFIG.babyCow::healthMultiplierForBabyCow, null, CONFIG.babyCow::speedMultiplierForBabyCow, CONFIG.babyCow::scaleMultiplierForBabyCow
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.COW, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CREEPER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.CREEPER, CONFIG::healthMultiplierForCreeper, CONFIG::damageMultiplierForCreeper, CONFIG::speedMultiplierForCreeper, CONFIG::scaleMultiplierForCreeper
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DONKEY, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.DONKEY, CONFIG.babyDonkey::healthMultiplierForBabyDonkey, null, CONFIG.babyDonkey::speedMultiplierForBabyDonkey, CONFIG.babyDonkey::scaleMultiplierForBabyDonkey
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.DONKEY, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DOLPHIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.DOLPHIN, CONFIG.babyDolphin::healthMultiplierForBabyDolphin, CONFIG.babyDolphin::damageMultiplierForBabyDolphin, CONFIG.babyDolphin::speedMultiplierForBabyDolphin, CONFIG.babyDolphin::scaleMultiplierForBabyDolphin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.DOLPHIN, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DROWNED, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.DROWNED, CONFIG.babyDrowned::healthMultiplierForBabyDrowned, CONFIG.babyDrowned::damageMultiplierForBabyDrowned, CONFIG.babyDrowned::speedMultiplierForBabyDrowned, CONFIG.babyDrowned::scaleMultiplierForBabyDrowned
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.DROWNED, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ELDER_GUARDIAN, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.ELDER_GUARDIAN, CONFIG::healthMultiplierForElderGuardian, CONFIG::damageMultiplierForElderGuardian, CONFIG::speedMultiplierForElderGuardian, CONFIG::scaleMultiplierForElderGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDER_DRAGON, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.ENDER_DRAGON, CONFIG::healthMultiplierForEnderDragon, CONFIG::damageMultiplierForEnderDragon, null, null
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMAN, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.ENDERMAN, CONFIG::healthMultiplierForEnderman, CONFIG::damageMultiplierForEnderman, CONFIG::speedMultiplierForEnderman, CONFIG::scaleMultiplierForEnderman
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMITE, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.ENDERMITE, CONFIG::healthMultiplierForEndermite, CONFIG::damageMultiplierForEndermite, CONFIG::speedMultiplierForEndermite, CONFIG::scaleMultiplierForEndermite
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.EVOKER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.EVOKER, CONFIG::healthMultiplierForEvoker, CONFIG::damageMultiplierForEvoker, CONFIG::speedMultiplierForEvoker, CONFIG::scaleMultiplierForEvoker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FOX, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.FOX, CONFIG.babyFox::healthMultiplierForBabyFox, CONFIG.babyFox::damageMultiplierForBabyFox, CONFIG.babyFox::speedMultiplierForBabyFox, CONFIG.babyFox::scaleMultiplierForBabyFox
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.FOX, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FROG, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.FROG, CONFIG::healthMultiplierForFrog, CONFIG::damageMultiplierForFrog, CONFIG::speedMultiplierForFrog, CONFIG::scaleMultiplierForFrog
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GHAST, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.GHAST, CONFIG::healthMultiplierForGhast, null, CONFIG::speedMultiplierForGhast, CONFIG::scaleMultiplierForGhast
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GIANT, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.GIANT, CONFIG::healthMultiplierForGiant, CONFIG::damageMultiplierForGiant, CONFIG::speedMultiplierForGiant, CONFIG::scaleMultiplierForGiant
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GLOW_SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.GLOW_SQUID, CONFIG.babyGlowSquid::healthMultiplierForBabyGlowSquid, null, CONFIG.babyGlowSquid::speedMultiplierForBabyGlowSquid, CONFIG.babyGlowSquid::scaleMultiplierForBabyGlowSquid
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.GLOW_SQUID, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GOAT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.GOAT, CONFIG.babyGoat::healthMultiplierForBabyGoat, CONFIG.babyGoat::damageMultiplierForBabyGoat, CONFIG.babyGoat::speedMultiplierForBabyGoat, CONFIG.babyGoat::scaleMultiplierForBabyGoat
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.GOAT, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GUARDIAN, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.GUARDIAN, CONFIG::healthMultiplierForGuardian, CONFIG::damageMultiplierForGuardian, CONFIG::speedMultiplierForGuardian, CONFIG::scaleMultiplierForGuardian
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.HOGLIN, CONFIG.babyHoglin::healthMultiplierForBabyHoglin, CONFIG.babyHoglin::damageMultiplierForBabyHoglin, CONFIG.babyHoglin::speedMultiplierForBabyHoglin, CONFIG.babyHoglin::scaleMultiplierForBabyHoglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.HOGLIN, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.HORSE, CONFIG.babyHorse::healthMultiplierForBabyHorse, null, CONFIG.babyHorse::speedMultiplierForBabyHorse, CONFIG.babyHorse::scaleMultiplierForBabyHorse
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.HORSE, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HUSK, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.HUSK, CONFIG.babyHusk::healthMultiplierForBabyHusk, CONFIG.babyHusk::damageMultiplierForBabyHusk, CONFIG.babyHusk::speedMultiplierForBabyHusk, CONFIG.babyHusk::scaleMultiplierForBabyHusk
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.HUSK, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ILLUSIONER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.ILLUSIONER, CONFIG::healthMultiplierForIllusioner, CONFIG::damageMultiplierForIllusioner, CONFIG::speedMultiplierForIllusioner, CONFIG::scaleMultiplierForIllusioner
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.IRON_GOLEM, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.IRON_GOLEM, CONFIG::healthMultiplierForIronGolem, CONFIG::damageMultiplierForIronGolem, CONFIG::speedMultiplierForIronGolem, CONFIG::scaleMultiplierForIronGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.LLAMA, CONFIG.babyLlama::healthMultiplierForBabyLlama, null, CONFIG.babyLlama::speedMultiplierForBabyLlama, CONFIG.babyLlama::scaleMultiplierForBabyLlama
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.LLAMA, CONFIG::healthMultiplierForLlama, null, CONFIG::speedMultiplierForLlama, CONFIG::scaleMultiplierForLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MAGMA_CUBE, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.MAGMA_CUBE, CONFIG::healthMultiplierForMagmaCube, CONFIG::damageMultiplierForMagmaCube, CONFIG::speedMultiplierForMagmaCube, CONFIG::scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MOOSHROOM, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.MOOSHROOM, CONFIG.babyMooshroom::healthMultiplierForBabyMooshroom, null, CONFIG.babyMooshroom::speedMultiplierForBabyMooshroom, CONFIG.babyMooshroom::scaleMultiplierForBabyMooshroom
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.MOOSHROOM, CONFIG::healthMultiplierForMooshroom, null, CONFIG::speedMultiplierForMooshroom, CONFIG::scaleMultiplierForMooshroom
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MULE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.MULE, CONFIG.babyMule::healthMultiplierForBabyMule, null, CONFIG.babyMule::speedMultiplierForBabyMule, CONFIG.babyMule::scaleMultiplierForBabyMule
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.MULE, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.OCELOT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.OCELOT, CONFIG.babyOcelot::healthMultiplierForBabyOcelot, CONFIG.babyOcelot::damageMultiplierForBabyOcelot, CONFIG.babyOcelot::speedMultiplierForBabyOcelot, CONFIG.babyOcelot::scaleMultiplierForBabyOcelot
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.OCELOT, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PANDA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.PANDA, CONFIG.babyPanda::healthMultiplierForBabyPanda, CONFIG.babyPanda::damageMultiplierForBabyPanda, CONFIG.babyPanda::speedMultiplierForBabyPanda, CONFIG.babyPanda::scaleMultiplierForBabyPanda
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.PANDA, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PARROT, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.PARROT, CONFIG::healthMultiplierForParrot, CONFIG::damageMultiplierForParrot, CONFIG::speedMultiplierForParrot, CONFIG::scaleMultiplierForParrot
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PHANTOM, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.PHANTOM, CONFIG::healthMultiplierForPhantom, CONFIG::damageMultiplierForPhantom, null, CONFIG::scaleMultiplierForPhantom
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIG, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.PIG, CONFIG.babyPig::healthMultiplierForBabyPig, null, CONFIG.babyPig::speedMultiplierForBabyPig, CONFIG.babyPig::scaleMultiplierForBabyPig
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.PIG, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.PIGLIN, CONFIG.babyPiglin::healthMultiplierForBabyPiglin, CONFIG.babyPiglin::damageMultiplierForBabyPiglin, CONFIG.babyPiglin::speedMultiplierForBabyPiglin, CONFIG.babyPiglin::scaleMultiplierForBabyPiglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.PIGLIN, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN_BRUTE, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.PIGLIN_BRUTE, CONFIG::healthMultiplierForPiglinBrute, CONFIG::damageMultiplierForPiglinBrute, CONFIG::speedMultiplierForPiglinBrute, CONFIG::scaleMultiplierForPiglinBrute
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PILLAGER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.PILLAGER, CONFIG::healthMultiplierForPillager, CONFIG::damageMultiplierForPillager, CONFIG::speedMultiplierForPillager, CONFIG::scaleMultiplierForPillager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.POLAR_BEAR, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.POLAR_BEAR, CONFIG.babyPolarBear::healthMultiplierForBabyPolarBear, null, CONFIG.babyPolarBear::speedMultiplierForBabyPolarBear, CONFIG.babyPolarBear::scaleMultiplierForBabyPolarBear
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.POLAR_BEAR, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PUFFERFISH, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.PUFFERFISH, CONFIG::healthMultiplierForPufferfish, null, null, CONFIG::scaleMultiplierForPufferfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RABBIT, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.RABBIT, CONFIG.babyRabbit::healthMultiplierForBabyRabbit, CONFIG.babyRabbit::damageMultiplierForBabyRabbit, CONFIG.babyRabbit::speedMultiplierForBabyRabbit, CONFIG.babyRabbit::scaleMultiplierForBabyRabbit
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.RABBIT, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RAVAGER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.RAVAGER, CONFIG::healthMultiplierForRavager, CONFIG::damageMultiplierForRavager, CONFIG::speedMultiplierForRavager, CONFIG::scaleMultiplierForRavager
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SALMON, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.SALMON, CONFIG::healthMultiplierForSalmon, null, null, CONFIG::scaleMultiplierForSalmon
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHEEP, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.SHEEP, CONFIG.babySheep::healthMultiplierForBabySheep, null, CONFIG.babySheep::speedMultiplierForBabySheep, CONFIG.babySheep::scaleMultiplierForBabySheep
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.SHEEP, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHULKER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.SHULKER, CONFIG::healthMultiplierForShulker, null, null, CONFIG::scaleMultiplierForShulker
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SILVERFISH, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.SILVERFISH, CONFIG::healthMultiplierForSilverfish, CONFIG::damageMultiplierForSilverfish, CONFIG::speedMultiplierForSilverfish, CONFIG::scaleMultiplierForSilverfish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.SKELETON, CONFIG::healthMultiplierForSkeleton, CONFIG::damageMultiplierForSkeleton, CONFIG::speedMultiplierForSkeleton, CONFIG::scaleMultiplierForSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.SKELETON_HORSE, CONFIG.babySkeletonHorse::healthMultiplierForBabySkeletonHorse, null, CONFIG.babySkeletonHorse::speedMultiplierForBabySkeletonHorse, CONFIG.babySkeletonHorse::scaleMultiplierForBabySkeletonHorse
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.SKELETON_HORSE, CONFIG::healthMultiplierForSkeletonHorse, null, CONFIG::speedMultiplierForSkeletonHorse, CONFIG::scaleMultiplierForSkeletonHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SLIME, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.SLIME, CONFIG::healthMultiplierForSlime, CONFIG::damageMultiplierForSlime, CONFIG::speedMultiplierForSlime, CONFIG::scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNIFFER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.SNIFFER, CONFIG.babySniffer::healthMultiplierForBabySniffer, null, CONFIG.babySniffer::speedMultiplierForBabySniffer, CONFIG.babySniffer::scaleMultiplierForBabySniffer
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.SNIFFER, CONFIG::healthMultiplierForSniffer, null, CONFIG::speedMultiplierForSniffer, CONFIG::scaleMultiplierForSniffer
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNOW_GOLEM, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.SNOW_GOLEM, CONFIG::healthMultiplierForSnowGolem, null, CONFIG::speedMultiplierForSnowGolem, CONFIG::scaleMultiplierForSnowGolem
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SPIDER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.SPIDER, CONFIG::healthMultiplierForSpider, CONFIG::damageMultiplierForSpider, CONFIG::speedMultiplierForSpider, CONFIG::scaleMultiplierForSpider
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SQUID, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.SQUID, CONFIG.babySquid::healthMultiplierForBabySquid, null, CONFIG.babySquid::speedMultiplierForBabySquid, CONFIG.babySquid::scaleMultiplierForBabySquid
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.SQUID, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRAY, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.STRAY, CONFIG::healthMultiplierForStray, CONFIG::damageMultiplierForStray, CONFIG::speedMultiplierForStray, CONFIG::scaleMultiplierForStray
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRIDER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.STRIDER, CONFIG.babyStrider::healthMultiplierForBabyStrider, null, CONFIG.babyStrider::speedMultiplierForBabyStrider, CONFIG.babyStrider::scaleMultiplierForBabyStrider
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.STRIDER, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TADPOLE, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.TADPOLE, CONFIG::healthMultiplierForTadpole, null, null, CONFIG::scaleMultiplierForTadpole
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TRADER_LLAMA, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.TRADER_LLAMA, CONFIG.babyTraderLlama::healthMultiplierForBabyTraderLlama, null, CONFIG.babyTraderLlama::speedMultiplierForBabyTraderLlama, CONFIG.babyTraderLlama::scaleMultiplierForBabyTraderLlama
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.TRADER_LLAMA, CONFIG::healthMultiplierForTraderLlama, null, CONFIG::speedMultiplierForTraderLlama, CONFIG::scaleMultiplierForTraderLlama
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TROPICAL_FISH, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.TROPICAL_FISH, CONFIG::healthMultiplierForTropicalFish, null, null, CONFIG::scaleMultiplierForTropicalFish
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TURTLE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.TURTLE, CONFIG.babyTurtle::healthMultiplierForBabyTurtle, null, CONFIG.babyTurtle::speedMultiplierForBabyTurtle, CONFIG.babyTurtle::scaleMultiplierForBabyTurtle
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.TURTLE, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VEX, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.VEX, CONFIG::healthMultiplierForVex, CONFIG::damageMultiplierForVex, CONFIG::speedMultiplierForVex, CONFIG::scaleMultiplierForVex
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.VILLAGER, CONFIG.babyVillager::healthMultiplierForBabyVillager, null, CONFIG.babyVillager::speedMultiplierForBabyVillager, CONFIG.babyVillager::scaleMultiplierForBabyVillager
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.VILLAGER, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VINDICATOR, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.VINDICATOR, CONFIG::healthMultiplierForVindicator, CONFIG::damageMultiplierForVindicator, CONFIG::speedMultiplierForVindicator, CONFIG::scaleMultiplierForVindicator
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WANDERING_TRADER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.WANDERING_TRADER, CONFIG::healthMultiplierForWanderingTrader, null, CONFIG::speedMultiplierForWanderingTrader, CONFIG::scaleMultiplierForWanderingTrader
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WARDEN, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.WARDEN, CONFIG::healthMultiplierForWarden, CONFIG::damageMultiplierForWarden, CONFIG::speedMultiplierForWarden, CONFIG::scaleMultiplierForWarden
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITCH, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.WITCH, CONFIG::healthMultiplierForWitch, CONFIG::damageMultiplierForWitch, CONFIG::speedMultiplierForWitch, CONFIG::scaleMultiplierForWitch
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.WITHER, CONFIG::healthMultiplierForWither, CONFIG::damageMultiplierForWither, CONFIG::speedMultiplierForWither, CONFIG::scaleMultiplierForWither
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER_SKELETON, entity -> {
            configureEntityAttributes(entity.getWorld(), EntityType.WITHER_SKELETON, CONFIG::healthMultiplierForWitherSkeleton, CONFIG::damageMultiplierForWitherSkeleton, CONFIG::speedMultiplierForWitherSkeleton, CONFIG::scaleMultiplierForWitherSkeleton
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WOLF, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.WOLF, CONFIG.babyWolf::healthMultiplierForBabyWolf, CONFIG.babyWolf::damageMultiplierForBabyWolf, CONFIG.babyWolf::speedMultiplierForBabyWolf, CONFIG.babyWolf::scaleMultiplierForBabyWolf
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.WOLF, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOGLIN, CONFIG.babyZoglin::healthMultiplierForBabyZoglin, CONFIG.babyZoglin::damageMultiplierForBabyZoglin, CONFIG.babyZoglin::speedMultiplierForBabyZoglin, CONFIG.babyZoglin::scaleMultiplierForBabyZoglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOGLIN, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIE, CONFIG.babyZombie::healthMultiplierForBabyZombie, CONFIG.babyZombie::damageMultiplierForBabyZombie, CONFIG.babyZombie::speedMultiplierForBabyZombie, CONFIG.babyZombie::scaleMultiplierForBabyZombie
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIE, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_HORSE, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIE_HORSE, CONFIG.babyZombieHorse::healthMultiplierForBabyZombieHorse, null, CONFIG.babyZombieHorse::speedMultiplierForBabyZombieHorse, CONFIG.babyZombieHorse::scaleMultiplierForBabyZombieHorse
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIE_HORSE, CONFIG::healthMultiplierForZombieHorse, null, CONFIG::speedMultiplierForZombieHorse, CONFIG::scaleMultiplierForZombieHorse
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_VILLAGER, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIE_VILLAGER, CONFIG.babyZombieVillager::healthMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::damageMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::speedMultiplierForBabyZombieVillager, CONFIG.babyZombieVillager::scaleMultiplierForBabyZombieVillager
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIE_VILLAGER, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
                );
            }
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIFIED_PIGLIN, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIFIED_PIGLIN, CONFIG.babyZombifiedPiglin::healthMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::damageMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::speedMultiplierForBabyZombifiedPiglin, CONFIG.babyZombifiedPiglin::scaleMultiplierForBabyZombifiedPiglin
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), EntityType.ZOMBIFIED_PIGLIN, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
                );
            }
        });

        // Projectile Entities have their own Mixin
        // The Purge Damage from the Ender Dragon has its own Mixin
        // The Speed Multiplier of Salmon, Cod, Tropical Fish, Pufferfish, Tadpole, Ghast, Squid, Vex and Bat have their own Mixin
    }
}
