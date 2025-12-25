package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class BetterEndCompat {

    public static void initBetterEndAttributeHandlers() {
        EntityType cubozoa = Registries.ENTITY_TYPE.get(Identifier.of("betterend", "cubozoa"));
        EntityType dragonfly = Registries.ENTITY_TYPE.get(Identifier.of("betterend", "dragonfly"));
        EntityType endFish = Registries.ENTITY_TYPE.get(Identifier.of("betterend", "end_fish"));
        EntityType endSlime = Registries.ENTITY_TYPE.get(Identifier.of("betterend", "end_slime"));
        EntityType shadowWalker = Registries.ENTITY_TYPE.get(Identifier.of("betterend", "shadow_walker"));
        EntityType silkMoth = Registries.ENTITY_TYPE.get(Identifier.of("betterend", "silk_moth"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(cubozoa, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterEnd::healthMultiplierForCubozoa, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dragonfly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterEnd::healthMultiplierForDragonfly, null, null, CONFIG.betterEnd::scaleMultiplierForDragonfly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endFish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterEnd::healthMultiplierForEndFish, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterEnd::healthMultiplierForEndSlime, CONFIG.betterEnd::damageMultiplierForEndSlime, CONFIG.betterEnd::speedMultiplierForEndSlime, CONFIG.betterEnd::scaleMultiplierForEndSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shadowWalker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterEnd::healthMultiplierForShadowWalker, CONFIG.betterEnd::damageMultiplierForShadowWalker, CONFIG.betterEnd::speedMultiplierForShadowWalker, CONFIG.betterEnd::scaleMultiplierForShadowWalker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(silkMoth, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterEnd::healthMultiplierForSilkMoth, null, null, CONFIG.betterEnd::scaleMultiplierForSilkMoth
            );
        });
    }
}
