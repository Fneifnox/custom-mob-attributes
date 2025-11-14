package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class ItTakesAPillageContinuationCompat {

    public static void initItTakesAPillageContinuationAttributeHandlers() {
        EntityType archer = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "archer"));
        EntityType clayGolem = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "clay_golem"));
        EntityType legioner = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "legioner"));
        EntityType skirmisher = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "skirmisher"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), archer, CONFIG.itTakesAPillageContinuation::healthMultiplierForArcher, CONFIG.itTakesAPillageContinuation::damageMultiplierForArcher, CONFIG.itTakesAPillageContinuation::speedMultiplierForArcher, CONFIG.itTakesAPillageContinuation::scaleMultiplierForArcher
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(clayGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), clayGolem, CONFIG.itTakesAPillageContinuation::healthMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::damageMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::speedMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::scaleMultiplierForClayGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(legioner, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), legioner, CONFIG.itTakesAPillageContinuation::healthMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::damageMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::speedMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::scaleMultiplierForLegioner
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skirmisher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), skirmisher, CONFIG.itTakesAPillageContinuation::healthMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::damageMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::speedMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::scaleMultiplierForSkirmisher
            );
        });
    }
}
