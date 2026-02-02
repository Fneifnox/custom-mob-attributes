package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class ItTakesAPillageContinuationCompat {

    public static void initItTakesAPillageContinuationAttributeHandlers() {
        EntityType<?> archer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "archer"));
        EntityType<?> clayGolem = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "clay_golem"));
        EntityType<?> legioner = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "legioner"));
        EntityType<?> skirmisher = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "skirmisher"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.itTakesAPillageContinuation::healthMultiplierForArcher, CONFIG.itTakesAPillageContinuation::damageMultiplierForArcher, CONFIG.itTakesAPillageContinuation::speedMultiplierForArcher, CONFIG.itTakesAPillageContinuation::scaleMultiplierForArcher
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(clayGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.itTakesAPillageContinuation::healthMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::damageMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::speedMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::scaleMultiplierForClayGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(legioner, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.itTakesAPillageContinuation::healthMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::damageMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::speedMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::scaleMultiplierForLegioner
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skirmisher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.itTakesAPillageContinuation::healthMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::damageMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::speedMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::scaleMultiplierForSkirmisher
            );
        });
    }
}
