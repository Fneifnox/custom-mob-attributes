package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class RibbitsCompat {

    public static void initRibbitsAttributeHandlers() {
        EntityType<?> ribbit = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("ribbits", "ribbit"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(ribbit, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.ribbits::healthMultiplierForRibbit, CONFIG.ribbits::damageMultiplierForRibbit, CONFIG.ribbits::speedMultiplierForRibbit, CONFIG.ribbits::scaleMultiplierForRibbit
            );
        });
    }
}
