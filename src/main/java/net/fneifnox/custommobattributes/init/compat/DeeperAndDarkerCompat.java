package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

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
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForAnglerFish"), ranged("deeperAndDarker.damageMultiplierForAnglerFish"), ranged("deeperAndDarker.speedMultiplierForAnglerFish"), ranged("deeperAndDarker.scaleMultiplierForAnglerFish")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkCentipede, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForSculkCentipede"), ranged("deeperAndDarker.damageMultiplierForSculkCentipede"), ranged("deeperAndDarker.speedMultiplierForSculkCentipede"), ranged("deeperAndDarker.scaleMultiplierForSculkCentipede")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkLeech, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForSculkLeech"), ranged("deeperAndDarker.damageMultiplierForSculkLeech"), ranged("deeperAndDarker.speedMultiplierForSculkLeech"), ranged("deeperAndDarker.scaleMultiplierForSculkLeech")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkSnapper, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForSculkSnapper"), ranged("deeperAndDarker.damageMultiplierForSculkSnapper"), ranged("deeperAndDarker.speedMultiplierForSculkSnapper"), ranged("deeperAndDarker.scaleMultiplierForSculkSnapper")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shattered, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForShattered"), ranged("deeperAndDarker.damageMultiplierForShattered"), ranged("deeperAndDarker.speedMultiplierForShattered"), ranged("deeperAndDarker.scaleMultiplierForShattered")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shriekWorm, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForShriekWorm"), ranged("deeperAndDarker.damageMultiplierForShriekWorm"), null, ranged("deeperAndDarker.scaleMultiplierForShriekWorm")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sludge, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForSludge"), ranged("deeperAndDarker.damageMultiplierForSludge"), ranged("deeperAndDarker.speedMultiplierForSludge"), ranged("deeperAndDarker.scaleMultiplierForSludge")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(stalker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("deeperAndDarker.healthMultiplierForStalker"), ranged("deeperAndDarker.damageMultiplierForStalker"), ranged("deeperAndDarker.speedMultiplierForStalker"), ranged("deeperAndDarker.scaleMultiplierForStalker")
            );
        });
    }
}
