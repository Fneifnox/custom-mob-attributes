package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class DeeperAndDarkerCompat {

    public static void initDeeperAndDarkerAttributeHandlers() {
        EntityType anglerFish = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "angler_fish"));
        EntityType sculkCentipede = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "sculk_centipede"));
        EntityType sculkLeech = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "sculk_leech"));
        EntityType sculkSnapper = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "sculk_snapper"));
        EntityType shattered = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "shattered"));
        EntityType shriekWorm = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "shriek_worm"));
        EntityType sludge = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "sludge"));
        EntityType stalker = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "stalker"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(anglerFish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), anglerFish, Config.DEEPER_AND_DARKER.healthMultiplierForAnglerFish, Config.DEEPER_AND_DARKER.damageMultiplierForAnglerFish, Config.DEEPER_AND_DARKER.speedMultiplierForAnglerFish, Config.DEEPER_AND_DARKER.scaleMultiplierForAnglerFish
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkCentipede, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), sculkCentipede, Config.DEEPER_AND_DARKER.healthMultiplierForSculkCentipede, Config.DEEPER_AND_DARKER.damageMultiplierForSculkCentipede, Config.DEEPER_AND_DARKER.speedMultiplierForSculkCentipede, Config.DEEPER_AND_DARKER.scaleMultiplierForSculkCentipede
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkLeech, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), sculkLeech, Config.DEEPER_AND_DARKER.healthMultiplierForSculkLeech, Config.DEEPER_AND_DARKER.damageMultiplierForSculkLeech, Config.DEEPER_AND_DARKER.speedMultiplierForSculkLeech, Config.DEEPER_AND_DARKER.scaleMultiplierForSculkLeech
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkSnapper, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), sculkSnapper, Config.DEEPER_AND_DARKER.healthMultiplierForSculkSnapper, Config.DEEPER_AND_DARKER.damageMultiplierForSculkSnapper, Config.DEEPER_AND_DARKER.speedMultiplierForSculkSnapper, Config.DEEPER_AND_DARKER.scaleMultiplierForSculkSnapper
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shattered, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), shattered, Config.DEEPER_AND_DARKER.healthMultiplierForShattered, Config.DEEPER_AND_DARKER.damageMultiplierForShattered, Config.DEEPER_AND_DARKER.speedMultiplierForShattered, Config.DEEPER_AND_DARKER.scaleMultiplierForShattered
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shriekWorm, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), shriekWorm, Config.DEEPER_AND_DARKER.healthMultiplierForShriekWorm, Config.DEEPER_AND_DARKER.damageMultiplierForShriekWorm, null, Config.DEEPER_AND_DARKER.scaleMultiplierForShriekWorm
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sludge, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), sludge, Config.DEEPER_AND_DARKER.healthMultiplierForSludge, Config.DEEPER_AND_DARKER.damageMultiplierForSludge, Config.DEEPER_AND_DARKER.speedMultiplierForSludge, Config.DEEPER_AND_DARKER.scaleMultiplierForSludge
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(stalker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), stalker, Config.DEEPER_AND_DARKER.healthMultiplierForStalker, Config.DEEPER_AND_DARKER.damageMultiplierForStalker, Config.DEEPER_AND_DARKER.speedMultiplierForStalker, Config.DEEPER_AND_DARKER.scaleMultiplierForStalker
            );
        });
    }
}
