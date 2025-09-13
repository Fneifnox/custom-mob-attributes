package net.fneifnox.custommobattributes.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class BetterNetherCompat {

    public static void initBetterNetherAttributeHandlers() {
        EntityType firefly = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "firefly"));
        EntityType flyingPig = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "flying_pig"));
        EntityType hydrogenJellyfish = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "hydrogen_jellyfish"));
        EntityType jungleSkeleton = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "jungle_skeleton"));
        EntityType naga = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "naga"));
        EntityType skull = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "skull"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firefly, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, firefly, CONFIG.betterNether::healthMultiplierForFirefly, CONFIG.betterNether::damageMultiplierForFirefly, null, CONFIG.betterNether::scaleMultiplierForFirefly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(flyingPig, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, flyingPig, CONFIG.betterNether::healthMultiplierForFlyingPig, CONFIG.betterNether::damageMultiplierForFlyingPig, CONFIG.betterNether::speedMultiplierForFlyingPig, CONFIG.betterNether::scaleMultiplierForFlyingPig
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(hydrogenJellyfish, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, hydrogenJellyfish, CONFIG.betterNether::healthMultiplierForHydrogenJellyfish, CONFIG.betterNether::damageMultiplierForHydrogenJellyfish, null, CONFIG.betterNether::scaleMultiplierForHydrogenJellyfish
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleSkeleton, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, jungleSkeleton, CONFIG.betterNether::healthMultiplierForJungleSkeleton, CONFIG.betterNether::damageMultiplierForJungleSkeleton, CONFIG.betterNether::speedMultiplierForJungleSkeleton, CONFIG.betterNether::scaleMultiplierForJungleSkeleton
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(naga, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, naga, CONFIG.betterNether::healthMultiplierForNaga, CONFIG.betterNether::damageMultiplierForNaga, CONFIG.betterNether::speedMultiplierForNaga, CONFIG.betterNether::scaleMultiplierForNaga
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skull, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, skull, CONFIG.betterNether::healthMultiplierForSkull, CONFIG.betterNether::damageMultiplierForSkull, null, CONFIG.betterNether::scaleMultiplierForSkull
            );
        });
    }
}
