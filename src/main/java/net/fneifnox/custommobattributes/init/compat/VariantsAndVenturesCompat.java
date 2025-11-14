package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class VariantsAndVenturesCompat {

    public static void initVariantsAndVenturesAttributeHandlers() {
        EntityType gelid = Registries.ENTITY_TYPE.get(Identifier.of("variantsandventures", "gelid"));
        EntityType murk = Registries.ENTITY_TYPE.get(Identifier.of("variantsandventures", "murk"));
        EntityType thicket = Registries.ENTITY_TYPE.get(Identifier.of("variantsandventures", "thicket"));
        EntityType verdant = Registries.ENTITY_TYPE.get(Identifier.of("variantsandventures", "verdant"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(gelid, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), gelid, CONFIG.variantsAndVentures::healthMultiplierForGelid, CONFIG.variantsAndVentures::damageMultiplierForGelid, CONFIG.variantsAndVentures::speedMultiplierForGelid, CONFIG.variantsAndVentures::scaleMultiplierForGelid
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(murk, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), murk, CONFIG.variantsAndVentures::healthMultiplierForMurk, CONFIG.variantsAndVentures::damageMultiplierForMurk, CONFIG.variantsAndVentures::speedMultiplierForMurk, CONFIG.variantsAndVentures::scaleMultiplierForMurk
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(thicket, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), thicket, CONFIG.variantsAndVentures::healthMultiplierForThicket, CONFIG.variantsAndVentures::damageMultiplierForThicket, CONFIG.variantsAndVentures::speedMultiplierForThicket, CONFIG.variantsAndVentures::scaleMultiplierForThicket
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(verdant, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), verdant, CONFIG.variantsAndVentures::healthMultiplierForVerdant, CONFIG.variantsAndVentures::damageMultiplierForVerdant, CONFIG.variantsAndVentures::speedMultiplierForVerdant, CONFIG.variantsAndVentures::scaleMultiplierForVerdant
            );
        });
    }
}
