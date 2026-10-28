package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class BetterNetherCompat {

    public static void initBetterNetherAttributeHandlers() {
        EntityType<?> firefly = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "firefly"));
        EntityType<?> flyingPig = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "flying_pig"));
        EntityType<?> hydrogenJellyfish = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "hydrogen_jellyfish"));
        EntityType<?> jungleSkeleton = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "jungle_skeleton"));
        EntityType<?> naga = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "naga"));
        EntityType<?> skull = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "skull"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firefly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterNether.healthMultiplierForFirefly"), ranged("betterNether.damageMultiplierForFirefly"), null, ranged("betterNether.scaleMultiplierForFirefly")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(flyingPig, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterNether.healthMultiplierForFlyingPig"), ranged("betterNether.damageMultiplierForFlyingPig"), ranged("betterNether.speedMultiplierForFlyingPig"), ranged("betterNether.scaleMultiplierForFlyingPig")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(hydrogenJellyfish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterNether.healthMultiplierForHydrogenJellyfish"), ranged("betterNether.damageMultiplierForHydrogenJellyfish"), null, ranged("betterNether.scaleMultiplierForHydrogenJellyfish")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleSkeleton, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterNether.healthMultiplierForJungleSkeleton"), ranged("betterNether.damageMultiplierForJungleSkeleton"), ranged("betterNether.speedMultiplierForJungleSkeleton"), ranged("betterNether.scaleMultiplierForJungleSkeleton")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(naga, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterNether.healthMultiplierForNaga"), ranged("betterNether.damageMultiplierForNaga"), ranged("betterNether.speedMultiplierForNaga"), ranged("betterNether.scaleMultiplierForNaga")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skull, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("betterNether.healthMultiplierForSkull"), ranged("betterNether.damageMultiplierForSkull"), null, ranged("betterNether.scaleMultiplierForSkull")
            );
        });
    }
}
