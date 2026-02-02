package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class BetterEndCompat {

    public static void initBetterEndAttributeHandlers() {
        EntityType<?> cubozoa = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "cubozoa"));
        EntityType<?> dragonfly = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "dragonfly"));
        EntityType<?> endFish = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "end_fish"));
        EntityType<?> endSlime = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "end_slime"));
        EntityType<?> shadowWalker = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "shadow_walker"));
        EntityType<?> silkMoth = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betterend", "silk_moth"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(cubozoa, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterEnd::healthMultiplierForCubozoa, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dragonfly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterEnd::healthMultiplierForDragonfly, null, null, CONFIG.betterEnd::scaleMultiplierForDragonfly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endFish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterEnd::healthMultiplierForEndFish, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterEnd::healthMultiplierForEndSlime, CONFIG.betterEnd::damageMultiplierForEndSlime, CONFIG.betterEnd::speedMultiplierForEndSlime, CONFIG.betterEnd::scaleMultiplierForEndSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shadowWalker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterEnd::healthMultiplierForShadowWalker, CONFIG.betterEnd::damageMultiplierForShadowWalker, CONFIG.betterEnd::speedMultiplierForShadowWalker, CONFIG.betterEnd::scaleMultiplierForShadowWalker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(silkMoth, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterEnd::healthMultiplierForSilkMoth, null, null, CONFIG.betterEnd::scaleMultiplierForSilkMoth
            );
        });
    }
}
