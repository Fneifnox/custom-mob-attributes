package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class ItTakesAPillageContinuationCompat {

    public static void initItTakesAPillageContinuationAttributeHandlers() {
        EntityType<?> archer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "archer"));
        EntityType<?> clayGolem = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "clay_golem"));
        EntityType<?> legioner = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "legioner"));
        EntityType<?> skirmisher = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "skirmisher"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("itTakesAPillageContinuation.healthMultiplierForArcher"), ranged("itTakesAPillageContinuation.damageMultiplierForArcher"), ranged("itTakesAPillageContinuation.speedMultiplierForArcher"), ranged("itTakesAPillageContinuation.scaleMultiplierForArcher")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(clayGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("itTakesAPillageContinuation.healthMultiplierForClayGolem"), ranged("itTakesAPillageContinuation.damageMultiplierForClayGolem"), ranged("itTakesAPillageContinuation.speedMultiplierForClayGolem"), ranged("itTakesAPillageContinuation.scaleMultiplierForClayGolem")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(legioner, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("itTakesAPillageContinuation.healthMultiplierForLegioner"), ranged("itTakesAPillageContinuation.damageMultiplierForLegioner"), ranged("itTakesAPillageContinuation.speedMultiplierForLegioner"), ranged("itTakesAPillageContinuation.scaleMultiplierForLegioner")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skirmisher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("itTakesAPillageContinuation.healthMultiplierForSkirmisher"), ranged("itTakesAPillageContinuation.damageMultiplierForSkirmisher"), ranged("itTakesAPillageContinuation.speedMultiplierForSkirmisher"), ranged("itTakesAPillageContinuation.scaleMultiplierForSkirmisher")
            );
        });
    }
}
