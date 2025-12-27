package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class BetterEndCompat {

    public static void initBetterEndAttributeHandlers() {
        EntityType cubozoa = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betterend", "cubozoa"));
        EntityType dragonfly = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betterend", "dragonfly"));
        EntityType endFish = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betterend", "end_fish"));
        EntityType endSlime = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betterend", "end_slime"));
        EntityType shadowWalker = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betterend", "shadow_walker"));
        EntityType silkMoth = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betterend", "silk_moth"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(cubozoa, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_END.healthMultiplierForCubozoa, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dragonfly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_END.healthMultiplierForDragonfly, null, null, Config.BETTER_END.scaleMultiplierForDragonfly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endFish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_END.healthMultiplierForEndFish, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_END.healthMultiplierForEndSlime, Config.BETTER_END.damageMultiplierForEndSlime, Config.BETTER_END.speedMultiplierForEndSlime, Config.BETTER_END.scaleMultiplierForEndSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shadowWalker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_END.healthMultiplierForShadowWalker, Config.BETTER_END.damageMultiplierForShadowWalker, Config.BETTER_END.speedMultiplierForShadowWalker, Config.BETTER_END.scaleMultiplierForShadowWalker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(silkMoth, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_END.healthMultiplierForSilkMoth, null, null, Config.BETTER_END.scaleMultiplierForSilkMoth
            );
        });
    }
}
