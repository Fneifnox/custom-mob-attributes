package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class IllagerInvasionCompat {

    public static void initIllagerInvasionAttributeHandlers() {
        EntityType alchemist = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "alchemist"));
        EntityType archivist = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "archivist"));
        EntityType basher = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "basher"));
        EntityType firecaller = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "firecaller"));
        EntityType inquisitor = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "inquisitor"));
        EntityType invoker = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "invoker"));
        EntityType marauder = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "marauder"));
        EntityType necromancer = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "necromancer"));
        EntityType provoker = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "provoker"));
        EntityType sorcerer = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "sorcerer"));
        EntityType surrendered = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "surrendered"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(alchemist, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), alchemist, Config.ILLAGER_INVASION.healthMultiplierForAlchemist, Config.ILLAGER_INVASION.damageMultiplierForAlchemist, Config.ILLAGER_INVASION.speedMultiplierForAlchemist, Config.ILLAGER_INVASION.scaleMultiplierForAlchemist
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archivist, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), archivist, Config.ILLAGER_INVASION.healthMultiplierForArchivist, Config.ILLAGER_INVASION.damageMultiplierForArchivist, Config.ILLAGER_INVASION.speedMultiplierForArchivist, Config.ILLAGER_INVASION.scaleMultiplierForArchivist
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(basher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), basher, Config.ILLAGER_INVASION.healthMultiplierForBasher, Config.ILLAGER_INVASION.damageMultiplierForBasher, Config.ILLAGER_INVASION.speedMultiplierForBasher, Config.ILLAGER_INVASION.scaleMultiplierForBasher
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firecaller, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), firecaller, Config.ILLAGER_INVASION.healthMultiplierForFirecaller, Config.ILLAGER_INVASION.damageMultiplierForFirecaller, Config.ILLAGER_INVASION.speedMultiplierForFirecaller, Config.ILLAGER_INVASION.scaleMultiplierForFirecaller
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(inquisitor, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), inquisitor, Config.ILLAGER_INVASION.healthMultiplierForInquisitor, Config.ILLAGER_INVASION.damageMultiplierForInquisitor, Config.ILLAGER_INVASION.speedMultiplierForInquisitor, Config.ILLAGER_INVASION.scaleMultiplierForInquisitor
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(invoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), invoker, Config.ILLAGER_INVASION.healthMultiplierForInvoker, Config.ILLAGER_INVASION.damageMultiplierForInvoker, Config.ILLAGER_INVASION.speedMultiplierForInvoker, Config.ILLAGER_INVASION.scaleMultiplierForInvoker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(marauder, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), marauder, Config.ILLAGER_INVASION.healthMultiplierForMarauder, Config.ILLAGER_INVASION.damageMultiplierForMarauder, Config.ILLAGER_INVASION.speedMultiplierForMarauder, Config.ILLAGER_INVASION.scaleMultiplierForMarauder
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(necromancer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), necromancer, Config.ILLAGER_INVASION.healthMultiplierForNecromancer, Config.ILLAGER_INVASION.damageMultiplierForNecromancer, Config.ILLAGER_INVASION.speedMultiplierForNecromancer, Config.ILLAGER_INVASION.scaleMultiplierForNecromancer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(provoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), provoker, Config.ILLAGER_INVASION.healthMultiplierForProvoker, Config.ILLAGER_INVASION.damageMultiplierForProvoker, Config.ILLAGER_INVASION.speedMultiplierForProvoker, Config.ILLAGER_INVASION.scaleMultiplierForProvoker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sorcerer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), sorcerer, Config.ILLAGER_INVASION.healthMultiplierForSorcerer, Config.ILLAGER_INVASION.damageMultiplierForSorcerer, Config.ILLAGER_INVASION.speedMultiplierForSorcerer, Config.ILLAGER_INVASION.scaleMultiplierForSorcerer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(surrendered, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), surrendered, Config.ILLAGER_INVASION.healthMultiplierForSurrendered, Config.ILLAGER_INVASION.damageMultiplierForSurrendered, null, Config.ILLAGER_INVASION.scaleMultiplierForSurrendered
            );
        });
    }
}
