package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class VariantsAndVenturesCompat {

    public static void initVariantsAndVenturesAttributeHandlers() {
        EntityType gelid = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("variantsandventures", "gelid"));
        EntityType murk = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("variantsandventures", "murk"));
        EntityType thicket = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("variantsandventures", "thicket"));
        EntityType verdant = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("variantsandventures", "verdant"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(gelid, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), gelid, Config.VARIANTS_AND_VENTURES.healthMultiplierForGelid, Config.VARIANTS_AND_VENTURES.damageMultiplierForGelid, Config.VARIANTS_AND_VENTURES.speedMultiplierForGelid, Config.VARIANTS_AND_VENTURES.scaleMultiplierForGelid
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(murk, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), murk, Config.VARIANTS_AND_VENTURES.healthMultiplierForMurk, Config.VARIANTS_AND_VENTURES.damageMultiplierForMurk, Config.VARIANTS_AND_VENTURES.speedMultiplierForMurk, Config.VARIANTS_AND_VENTURES.scaleMultiplierForMurk
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(thicket, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), thicket, Config.VARIANTS_AND_VENTURES.healthMultiplierForThicket, Config.VARIANTS_AND_VENTURES.damageMultiplierForThicket, Config.VARIANTS_AND_VENTURES.speedMultiplierForThicket, Config.VARIANTS_AND_VENTURES.scaleMultiplierForThicket
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(verdant, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), verdant, Config.VARIANTS_AND_VENTURES.healthMultiplierForVerdant, Config.VARIANTS_AND_VENTURES.damageMultiplierForVerdant, Config.VARIANTS_AND_VENTURES.speedMultiplierForVerdant, Config.VARIANTS_AND_VENTURES.scaleMultiplierForVerdant
            );
        });
    }
}
