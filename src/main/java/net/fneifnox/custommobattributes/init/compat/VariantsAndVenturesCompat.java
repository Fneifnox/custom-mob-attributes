package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class VariantsAndVenturesCompat {

    public static void initVariantsAndVenturesAttributeHandlers() {
        EntityType<?> gelid = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "gelid"));
        EntityType<?> murk = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "murk"));
        EntityType<?> thicket = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "thicket"));
        EntityType<?> verdant = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "verdant"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(gelid, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("variantsAndVentures.healthMultiplierForGelid"), ranged("variantsAndVentures.damageMultiplierForGelid"), ranged("variantsAndVentures.speedMultiplierForGelid"), ranged("variantsAndVentures.scaleMultiplierForGelid")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(murk, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("variantsAndVentures.healthMultiplierForMurk"), ranged("variantsAndVentures.damageMultiplierForMurk"), ranged("variantsAndVentures.speedMultiplierForMurk"), ranged("variantsAndVentures.scaleMultiplierForMurk")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(thicket, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("variantsAndVentures.healthMultiplierForThicket"), ranged("variantsAndVentures.damageMultiplierForThicket"), ranged("variantsAndVentures.speedMultiplierForThicket"), ranged("variantsAndVentures.scaleMultiplierForThicket")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(verdant, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("variantsAndVentures.healthMultiplierForVerdant"), ranged("variantsAndVentures.damageMultiplierForVerdant"), ranged("variantsAndVentures.speedMultiplierForVerdant"), ranged("variantsAndVentures.scaleMultiplierForVerdant")
            );
        });
    }
}
