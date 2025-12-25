package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class RibbitsCompat {

    public static void initRibbitsAttributeHandlers() {
        EntityType ribbit = Registries.ENTITY_TYPE.get(Identifier.of("ribbits", "ribbit"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(ribbit, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.ribbits::healthMultiplierForRibbit, CONFIG.ribbits::damageMultiplierForRibbit, CONFIG.ribbits::speedMultiplierForRibbit, CONFIG.ribbits::scaleMultiplierForRibbit
            );
        });
    }
}
