package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class BetterEndCompat {

    public static void initBetterEndAttributeHandlers() {
        EntityType<?> cubozoa = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "cubozoa"));
        EntityType<?> dragonfly = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "dragonfly"));
        EntityType<?> endFish = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "end_fish"));
        EntityType<?> endSlime = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "end_slime"));
        EntityType<?> shadowWalker = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "shadow_walker"));
        EntityType<?> silkMoth = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "silk_moth"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(cubozoa, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterEnd.healthMultiplierForCubozoa"), null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dragonfly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterEnd.healthMultiplierForDragonfly"), null, null, ranged("betterEnd.scaleMultiplierForDragonfly")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endFish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterEnd.healthMultiplierForEndFish"), null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterEnd.healthMultiplierForEndSlime"), ranged("betterEnd.damageMultiplierForEndSlime"), ranged("betterEnd.speedMultiplierForEndSlime"), ranged("betterEnd.scaleMultiplierForEndSlime")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shadowWalker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterEnd.healthMultiplierForShadowWalker"), ranged("betterEnd.damageMultiplierForShadowWalker"), ranged("betterEnd.speedMultiplierForShadowWalker"), ranged("betterEnd.scaleMultiplierForShadowWalker")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(silkMoth, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterEnd.healthMultiplierForSilkMoth"), null, null, ranged("betterEnd.scaleMultiplierForSilkMoth")
            );
        });
    }
}
