package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class VanillaBackportCompat {

    public static void initVanillaBackportAttributeHandlers() {
        EntityType happyGhast = Registries.ENTITY_TYPE.get(Identifier.of("vanillabackport", "happy_ghast"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(happyGhast, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), happyGhast, CONFIG.vanillaBackport::healthMultiplierForHappyGhast, CONFIG.vanillaBackport::damageMultiplierForHappyGhast, CONFIG.vanillaBackport::speedMultiplierForHappyGhast, null
            );
        });
    }
}
