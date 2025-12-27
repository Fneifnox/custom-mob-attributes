package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class BetterNetherCompat {

    public static void initBetterNetherAttributeHandlers() {
        EntityType firefly = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betternether", "firefly"));
        EntityType flyingPig = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betternether", "flying_pig"));
        EntityType hydrogenJellyfish = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betternether", "hydrogen_jellyfish"));
        EntityType jungleSkeleton = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betternether", "jungle_skeleton"));
        EntityType naga = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betternether", "naga"));
        EntityType skull = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betternether", "skull"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firefly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_NETHER.healthMultiplierForFirefly, Config.BETTER_NETHER.damageMultiplierForFirefly, null, Config.BETTER_NETHER.scaleMultiplierForFirefly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(flyingPig, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_NETHER.healthMultiplierForFlyingPig, Config.BETTER_NETHER.damageMultiplierForFlyingPig, Config.BETTER_NETHER.speedMultiplierForFlyingPig, Config.BETTER_NETHER.scaleMultiplierForFlyingPig
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(hydrogenJellyfish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_NETHER.healthMultiplierForHydrogenJellyfish, Config.BETTER_NETHER.damageMultiplierForHydrogenJellyfish, null, Config.BETTER_NETHER.scaleMultiplierForHydrogenJellyfish
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleSkeleton, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_NETHER.healthMultiplierForJungleSkeleton, Config.BETTER_NETHER.damageMultiplierForJungleSkeleton, Config.BETTER_NETHER.speedMultiplierForJungleSkeleton, Config.BETTER_NETHER.scaleMultiplierForJungleSkeleton
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(naga, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_NETHER.healthMultiplierForNaga, Config.BETTER_NETHER.damageMultiplierForNaga, Config.BETTER_NETHER.speedMultiplierForNaga, Config.BETTER_NETHER.scaleMultiplierForNaga
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skull, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.BETTER_NETHER.healthMultiplierForSkull, Config.BETTER_NETHER.damageMultiplierForSkull, null, Config.BETTER_NETHER.scaleMultiplierForSkull
            );
        });
    }
}
