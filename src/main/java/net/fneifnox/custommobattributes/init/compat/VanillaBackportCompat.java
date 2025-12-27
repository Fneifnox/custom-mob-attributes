package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class VanillaBackportCompat {

    public static void initVanillaBackportAttributeHandlers() {
        EntityType creaking = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("vanillabackport", "creaking"));
        EntityType happyGhast = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("vanillabackport", "happy_ghast"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(creaking, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.VANILLA_BACKPORT.healthMultiplierForCreaking, Config.VANILLA_BACKPORT.damageMultiplierForCreaking, Config.VANILLA_BACKPORT.speedMultiplierForCreaking, Config.VANILLA_BACKPORT.scaleMultiplierForCreaking
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(happyGhast, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.VANILLA_BACKPORT.healthMultiplierForHappyGhast, Config.VANILLA_BACKPORT.damageMultiplierForHappyGhast, Config.VANILLA_BACKPORT.speedMultiplierForHappyGhast, null
            );
        });
    }
}
