package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class RibbitsCompat {

    public static void initRibbitsAttributeHandlers() {
        EntityType<?> ribbit = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("ribbits", "ribbit"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(ribbit, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("ribbits.healthMultiplierForRibbit"), ranged("ribbits.damageMultiplierForRibbit"), ranged("ribbits.speedMultiplierForRibbit"), ranged("ribbits.scaleMultiplierForRibbit")
            );
        });
    }
}
