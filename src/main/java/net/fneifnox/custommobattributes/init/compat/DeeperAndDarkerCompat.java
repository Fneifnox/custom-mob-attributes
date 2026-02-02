package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class DeeperAndDarkerCompat {

    public static void initDeeperAndDarkerAttributeHandlers() {
        EntityType<?> anglerFish = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "angler_fish"));
        EntityType<?> sculkCentipede = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "sculk_centipede"));
        EntityType<?> sculkLeech = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "sculk_leech"));
        EntityType<?> sculkSnapper = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "sculk_snapper"));
        EntityType<?> shattered = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "shattered"));
        EntityType<?> shriekWorm = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "shriek_worm"));
        EntityType<?> sludge = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "sludge"));
        EntityType<?> stalker = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("deeperdarker", "stalker"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(anglerFish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForAnglerFish, CONFIG.deeperAndDarker::damageMultiplierForAnglerFish, CONFIG.deeperAndDarker::speedMultiplierForAnglerFish, CONFIG.deeperAndDarker::scaleMultiplierForAnglerFish
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkCentipede, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForSculkCentipede, CONFIG.deeperAndDarker::damageMultiplierForSculkCentipede, CONFIG.deeperAndDarker::speedMultiplierForSculkCentipede, CONFIG.deeperAndDarker::scaleMultiplierForSculkCentipede
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkLeech, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForSculkLeech, CONFIG.deeperAndDarker::damageMultiplierForSculkLeech, CONFIG.deeperAndDarker::speedMultiplierForSculkLeech, CONFIG.deeperAndDarker::scaleMultiplierForSculkLeech
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkSnapper, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForSculkSnapper, CONFIG.deeperAndDarker::damageMultiplierForSculkSnapper, CONFIG.deeperAndDarker::speedMultiplierForSculkSnapper, CONFIG.deeperAndDarker::scaleMultiplierForSculkSnapper
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shattered, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForShattered, CONFIG.deeperAndDarker::damageMultiplierForShattered, CONFIG.deeperAndDarker::speedMultiplierForShattered, CONFIG.deeperAndDarker::scaleMultiplierForShattered
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shriekWorm, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForShriekWorm, CONFIG.deeperAndDarker::damageMultiplierForShriekWorm, null, CONFIG.deeperAndDarker::scaleMultiplierForShriekWorm
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sludge, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForSludge, CONFIG.deeperAndDarker::damageMultiplierForSludge, CONFIG.deeperAndDarker::speedMultiplierForSludge, CONFIG.deeperAndDarker::scaleMultiplierForSludge
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(stalker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.deeperAndDarker::healthMultiplierForStalker, CONFIG.deeperAndDarker::damageMultiplierForStalker, CONFIG.deeperAndDarker::speedMultiplierForStalker, CONFIG.deeperAndDarker::scaleMultiplierForStalker
            );
        });
    }
}
