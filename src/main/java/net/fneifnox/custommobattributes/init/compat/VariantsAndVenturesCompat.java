package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class VariantsAndVenturesCompat {

    public static void initVariantsAndVenturesAttributeHandlers() {
        EntityType<?> gelid = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "gelid"));
        EntityType<?> murk = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "murk"));
        EntityType<?> thicket = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "thicket"));
        EntityType<?> verdant = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "verdant"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(gelid, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.variantsAndVentures::healthMultiplierForGelid, CONFIG.variantsAndVentures::damageMultiplierForGelid, CONFIG.variantsAndVentures::speedMultiplierForGelid, CONFIG.variantsAndVentures::scaleMultiplierForGelid
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(murk, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.variantsAndVentures::healthMultiplierForMurk, CONFIG.variantsAndVentures::damageMultiplierForMurk, CONFIG.variantsAndVentures::speedMultiplierForMurk, CONFIG.variantsAndVentures::scaleMultiplierForMurk
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(thicket, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.variantsAndVentures::healthMultiplierForThicket, CONFIG.variantsAndVentures::damageMultiplierForThicket, CONFIG.variantsAndVentures::speedMultiplierForThicket, CONFIG.variantsAndVentures::scaleMultiplierForThicket
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(verdant, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.variantsAndVentures::healthMultiplierForVerdant, CONFIG.variantsAndVentures::damageMultiplierForVerdant, CONFIG.variantsAndVentures::speedMultiplierForVerdant, CONFIG.variantsAndVentures::scaleMultiplierForVerdant
            );
        });
    }
}
