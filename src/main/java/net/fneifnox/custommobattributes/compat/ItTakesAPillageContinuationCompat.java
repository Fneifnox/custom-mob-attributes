package net.fneifnox.custommobattributes.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class ItTakesAPillageContinuationCompat {

    public static void initItTakesAPillageContinuationAttributeHandlers() {
        EntityType archer = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "archer"));
        EntityType clayGolem = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "clay_golem"));
        EntityType legioner = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "legioner"));
        EntityType skirmisher = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "skirmisher"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archer, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, archer, CONFIG.itTakesAPillageContinuation::healthMultiplierForArcher, CONFIG.itTakesAPillageContinuation::damageMultiplierForArcher, CONFIG.itTakesAPillageContinuation::speedMultiplierForArcher, CONFIG.itTakesAPillageContinuation::scaleMultiplierForArcher
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(clayGolem, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, clayGolem, CONFIG.itTakesAPillageContinuation::healthMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::damageMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::speedMultiplierForClayGolem, CONFIG.itTakesAPillageContinuation::scaleMultiplierForClayGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(legioner, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, legioner, CONFIG.itTakesAPillageContinuation::healthMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::damageMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::speedMultiplierForLegioner, CONFIG.itTakesAPillageContinuation::scaleMultiplierForLegioner
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skirmisher, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, skirmisher, CONFIG.itTakesAPillageContinuation::healthMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::damageMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::speedMultiplierForSkirmisher, CONFIG.itTakesAPillageContinuation::scaleMultiplierForSkirmisher
            );
        });
    }
}
