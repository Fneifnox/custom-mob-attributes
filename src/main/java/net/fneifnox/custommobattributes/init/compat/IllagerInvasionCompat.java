package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

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
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForAlchemist, CONFIG.illagerInvasion::damageMultiplierForAlchemist, CONFIG.illagerInvasion::speedMultiplierForAlchemist, CONFIG.illagerInvasion::scaleMultiplierForAlchemist
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archivist, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForArchivist, CONFIG.illagerInvasion::damageMultiplierForArchivist, CONFIG.illagerInvasion::speedMultiplierForArchivist, CONFIG.illagerInvasion::scaleMultiplierForArchivist
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(basher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForBasher, CONFIG.illagerInvasion::damageMultiplierForBasher, CONFIG.illagerInvasion::speedMultiplierForBasher, CONFIG.illagerInvasion::scaleMultiplierForBasher
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firecaller, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForFirecaller, CONFIG.illagerInvasion::damageMultiplierForFirecaller, CONFIG.illagerInvasion::speedMultiplierForFirecaller, CONFIG.illagerInvasion::scaleMultiplierForFirecaller
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(inquisitor, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForInquisitor, CONFIG.illagerInvasion::damageMultiplierForInquisitor, CONFIG.illagerInvasion::speedMultiplierForInquisitor, CONFIG.illagerInvasion::scaleMultiplierForInquisitor
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(invoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForInvoker, CONFIG.illagerInvasion::damageMultiplierForInvoker, CONFIG.illagerInvasion::speedMultiplierForInvoker, CONFIG.illagerInvasion::scaleMultiplierForInvoker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(marauder, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForMarauder, CONFIG.illagerInvasion::damageMultiplierForMarauder, CONFIG.illagerInvasion::speedMultiplierForMarauder, CONFIG.illagerInvasion::scaleMultiplierForMarauder
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(necromancer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForNecromancer, CONFIG.illagerInvasion::damageMultiplierForNecromancer, CONFIG.illagerInvasion::speedMultiplierForNecromancer, CONFIG.illagerInvasion::scaleMultiplierForNecromancer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(provoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForProvoker, CONFIG.illagerInvasion::damageMultiplierForProvoker, CONFIG.illagerInvasion::speedMultiplierForProvoker, CONFIG.illagerInvasion::scaleMultiplierForProvoker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sorcerer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForSorcerer, CONFIG.illagerInvasion::damageMultiplierForSorcerer, CONFIG.illagerInvasion::speedMultiplierForSorcerer, CONFIG.illagerInvasion::scaleMultiplierForSorcerer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(surrendered, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.illagerInvasion::healthMultiplierForSurrendered, CONFIG.illagerInvasion::damageMultiplierForSurrendered, null, CONFIG.illagerInvasion::scaleMultiplierForSurrendered
            );
        });
    }
}
