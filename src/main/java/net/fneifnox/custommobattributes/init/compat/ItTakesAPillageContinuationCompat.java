package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class ItTakesAPillageContinuationCompat {

    public static void initItTakesAPillageContinuationAttributeHandlers() {
        EntityType archer = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("takesapillage", "archer"));
        EntityType clayGolem = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("takesapillage", "clay_golem"));
        EntityType legioner = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("takesapillage", "legioner"));
        EntityType skirmisher = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("takesapillage", "skirmisher"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.IT_TAKES_A_PILLAGE_CONTINUATION.healthMultiplierForArcher, Config.IT_TAKES_A_PILLAGE_CONTINUATION.damageMultiplierForArcher, Config.IT_TAKES_A_PILLAGE_CONTINUATION.speedMultiplierForArcher, Config.IT_TAKES_A_PILLAGE_CONTINUATION.scaleMultiplierForArcher
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(clayGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.IT_TAKES_A_PILLAGE_CONTINUATION.healthMultiplierForClayGolem, Config.IT_TAKES_A_PILLAGE_CONTINUATION.damageMultiplierForClayGolem, Config.IT_TAKES_A_PILLAGE_CONTINUATION.speedMultiplierForClayGolem, Config.IT_TAKES_A_PILLAGE_CONTINUATION.scaleMultiplierForClayGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(legioner, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.IT_TAKES_A_PILLAGE_CONTINUATION.healthMultiplierForLegioner, Config.IT_TAKES_A_PILLAGE_CONTINUATION.damageMultiplierForLegioner, Config.IT_TAKES_A_PILLAGE_CONTINUATION.speedMultiplierForLegioner, Config.IT_TAKES_A_PILLAGE_CONTINUATION.scaleMultiplierForLegioner
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skirmisher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.IT_TAKES_A_PILLAGE_CONTINUATION.healthMultiplierForSkirmisher, Config.IT_TAKES_A_PILLAGE_CONTINUATION.damageMultiplierForSkirmisher, Config.IT_TAKES_A_PILLAGE_CONTINUATION.speedMultiplierForSkirmisher, Config.IT_TAKES_A_PILLAGE_CONTINUATION.scaleMultiplierForSkirmisher
            );
        });
    }
}
