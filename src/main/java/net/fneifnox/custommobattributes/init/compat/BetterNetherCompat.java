package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class BetterNetherCompat {

    public static void initBetterNetherAttributeHandlers() {
        EntityType<?> firefly = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "firefly"));
        EntityType<?> flyingPig = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "flying_pig"));
        EntityType<?> hydrogenJellyfish = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "hydrogen_jellyfish"));
        EntityType<?> jungleSkeleton = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "jungle_skeleton"));
        EntityType<?> naga = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "naga"));
        EntityType<?> skull = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "skull"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firefly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterNether::healthMultiplierForFirefly, CONFIG.betterNether::damageMultiplierForFirefly, null, CONFIG.betterNether::scaleMultiplierForFirefly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(flyingPig, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterNether::healthMultiplierForFlyingPig, CONFIG.betterNether::damageMultiplierForFlyingPig, CONFIG.betterNether::speedMultiplierForFlyingPig, CONFIG.betterNether::scaleMultiplierForFlyingPig
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(hydrogenJellyfish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterNether::healthMultiplierForHydrogenJellyfish, CONFIG.betterNether::damageMultiplierForHydrogenJellyfish, null, CONFIG.betterNether::scaleMultiplierForHydrogenJellyfish
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleSkeleton, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterNether::healthMultiplierForJungleSkeleton, CONFIG.betterNether::damageMultiplierForJungleSkeleton, CONFIG.betterNether::speedMultiplierForJungleSkeleton, CONFIG.betterNether::scaleMultiplierForJungleSkeleton
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(naga, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterNether::healthMultiplierForNaga, CONFIG.betterNether::damageMultiplierForNaga, CONFIG.betterNether::speedMultiplierForNaga, CONFIG.betterNether::scaleMultiplierForNaga
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skull, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.betterNether::healthMultiplierForSkull, CONFIG.betterNether::damageMultiplierForSkull, null, CONFIG.betterNether::scaleMultiplierForSkull
            );
        });
    }
}
