package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class RibbitsCompat {

    public static void initRibbitsAttributeHandlers() {
        EntityType ribbit = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("ribbits", "ribbit"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(ribbit, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.RIBBITS.healthMultiplierForRibbit, Config.RIBBITS.damageMultiplierForRibbit, Config.RIBBITS.speedMultiplierForRibbit, Config.RIBBITS.scaleMultiplierForRibbit
            );
        });
    }
}
