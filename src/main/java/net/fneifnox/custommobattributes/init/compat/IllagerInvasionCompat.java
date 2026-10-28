package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class IllagerInvasionCompat {

    public static void initIllagerInvasionAttributeHandlers() {
        EntityType<?> alchemist = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "alchemist"));
        EntityType<?> archivist = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "archivist"));
        EntityType<?> basher = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "basher"));
        EntityType<?> firecaller = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "firecaller"));
        EntityType<?> inquisitor = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "inquisitor"));
        EntityType<?> invoker = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "invoker"));
        EntityType<?> marauder = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "marauder"));
        EntityType<?> necromancer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "necromancer"));
        EntityType<?> provoker = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "provoker"));
        EntityType<?> sorcerer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "sorcerer"));
        EntityType<?> surrendered = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "surrendered"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(alchemist, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForAlchemist"), ranged("illagerInvasion.damageMultiplierForAlchemist"), ranged("illagerInvasion.speedMultiplierForAlchemist"), ranged("illagerInvasion.scaleMultiplierForAlchemist")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archivist, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForArchivist"), ranged("illagerInvasion.damageMultiplierForArchivist"), ranged("illagerInvasion.speedMultiplierForArchivist"), ranged("illagerInvasion.scaleMultiplierForArchivist")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(basher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForBasher"), ranged("illagerInvasion.damageMultiplierForBasher"), ranged("illagerInvasion.speedMultiplierForBasher"), ranged("illagerInvasion.scaleMultiplierForBasher")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firecaller, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForFirecaller"), ranged("illagerInvasion.damageMultiplierForFirecaller"), ranged("illagerInvasion.speedMultiplierForFirecaller"), ranged("illagerInvasion.scaleMultiplierForFirecaller")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(inquisitor, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForInquisitor"), ranged("illagerInvasion.damageMultiplierForInquisitor"), ranged("illagerInvasion.speedMultiplierForInquisitor"), ranged("illagerInvasion.scaleMultiplierForInquisitor")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(invoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForInvoker"), ranged("illagerInvasion.damageMultiplierForInvoker"), ranged("illagerInvasion.speedMultiplierForInvoker"), ranged("illagerInvasion.scaleMultiplierForInvoker")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(marauder, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForMarauder"), ranged("illagerInvasion.damageMultiplierForMarauder"), ranged("illagerInvasion.speedMultiplierForMarauder"), ranged("illagerInvasion.scaleMultiplierForMarauder")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(necromancer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForNecromancer"), ranged("illagerInvasion.damageMultiplierForNecromancer"), ranged("illagerInvasion.speedMultiplierForNecromancer"), ranged("illagerInvasion.scaleMultiplierForNecromancer")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(provoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForProvoker"), ranged("illagerInvasion.damageMultiplierForProvoker"), ranged("illagerInvasion.speedMultiplierForProvoker"), ranged("illagerInvasion.scaleMultiplierForProvoker")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sorcerer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForSorcerer"), ranged("illagerInvasion.damageMultiplierForSorcerer"), ranged("illagerInvasion.speedMultiplierForSorcerer"), ranged("illagerInvasion.scaleMultiplierForSorcerer")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(surrendered, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("illagerInvasion.healthMultiplierForSurrendered"), ranged("illagerInvasion.damageMultiplierForSurrendered"), null, ranged("illagerInvasion.scaleMultiplierForSurrendered")
            );
        });
    }
}
