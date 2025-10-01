package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

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
            World world = entity.getEntityWorld();
            AttributeUpdater.configureEntityAttributes(world, cubozoa, CONFIG.betterEnd::healthMultiplierForCubozoa, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dragonfly, entity -> {
            World world = entity.getEntityWorld();
            AttributeUpdater.configureEntityAttributes(world, dragonfly, CONFIG.betterEnd::healthMultiplierForDragonfly, null, null, CONFIG.betterEnd::scaleMultiplierForDragonfly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endFish, entity -> {
            World world = entity.getEntityWorld();
            AttributeUpdater.configureEntityAttributes(world, endFish, CONFIG.betterEnd::healthMultiplierForEndFish, null, null, null
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(endSlime, entity -> {
            World world = entity.getEntityWorld();
            AttributeUpdater.configureEntityAttributes(world, endSlime, CONFIG.betterEnd::healthMultiplierForEndSlime, CONFIG.betterEnd::damageMultiplierForEndSlime, CONFIG.betterEnd::speedMultiplierForEndSlime, CONFIG.betterEnd::scaleMultiplierForEndSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shadowWalker, entity -> {
            World world = entity.getEntityWorld();
            AttributeUpdater.configureEntityAttributes(world, shadowWalker, CONFIG.betterEnd::healthMultiplierForShadowWalker, CONFIG.betterEnd::damageMultiplierForShadowWalker, CONFIG.betterEnd::speedMultiplierForShadowWalker, CONFIG.betterEnd::scaleMultiplierForShadowWalker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(silkMoth, entity -> {
            World world = entity.getEntityWorld();
            AttributeUpdater.configureEntityAttributes(world, silkMoth, CONFIG.betterEnd::healthMultiplierForSilkMoth, null, null, CONFIG.betterEnd::scaleMultiplierForSilkMoth
            );
        });
    }
}
