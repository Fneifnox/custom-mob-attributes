package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;
import static net.fneifnox.custommobattributes.AttributeUpdater.configureEntityAttributes;
import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class VanillaBackportCompat {

    public static void initVanillaBackportAttributeHandlers() {
        EntityType armadillo = Registries.ENTITY_TYPE.get(Identifier.of("minecraft", "armadillo"));
        EntityType creaking = Registries.ENTITY_TYPE.get(Identifier.of("minecraft", "creaking"));
        EntityType happyGhast = Registries.ENTITY_TYPE.get(Identifier.of("minecraft", "happy_ghast"));

        ATTRIBUTE_HANDLERS.put(armadillo, entity -> {
            if (entity.isBaby()) {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.vanillaBackport.babyArmadillo::healthMultiplierForBabyArmadillo, null, CONFIG.vanillaBackport.babyArmadillo::healthMultiplierForBabyArmadillo, CONFIG.vanillaBackport.babyArmadillo::healthMultiplierForBabyArmadillo, CONFIG.vanillaBackport::healthMultiplierForArmadillo, null, CONFIG.vanillaBackport::speedMultiplierForArmadillo, CONFIG.vanillaBackport::scaleMultiplierForArmadillo
                );
            }
            else {
                configureEntityAttributes(entity.getWorld(), entity, CONFIG.vanillaBackport::healthMultiplierForArmadillo, null, CONFIG.vanillaBackport::speedMultiplierForArmadillo, CONFIG.vanillaBackport::scaleMultiplierForArmadillo
                );
            }
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(creaking, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.vanillaBackport::healthMultiplierForCreaking, CONFIG.vanillaBackport::damageMultiplierForCreaking, CONFIG.vanillaBackport::speedMultiplierForCreaking, CONFIG.vanillaBackport::scaleMultiplierForCreaking
            );
        });

        ATTRIBUTE_HANDLERS.put(happyGhast, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.vanillaBackport::healthMultiplierForHappyGhast, null, CONFIG.vanillaBackport::speedMultiplierForHappyGhast, null
            );
        });
    }
}
