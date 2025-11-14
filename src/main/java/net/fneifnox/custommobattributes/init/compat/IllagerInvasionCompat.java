package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class IllagerInvasionCompat {

    public static void initIllagerInvasionAttributeHandlers() {
        EntityType alchemist = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "alchemist"));
        EntityType archivist = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "archivist"));
        EntityType basher = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "basher"));
        EntityType firecaller = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "firecaller"));
        EntityType inquisitor = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "inquisitor"));
        EntityType invoker = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "invoker"));
        EntityType marauder = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "marauder"));
        EntityType necromancer = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "necromancer"));
        EntityType provoker = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "provoker"));
        EntityType sorcerer = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "sorcerer"));
        EntityType surrendered = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "surrendered"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(alchemist, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), alchemist, CONFIG.illagerInvasion::healthMultiplierForAlchemist, CONFIG.illagerInvasion::damageMultiplierForAlchemist, CONFIG.illagerInvasion::speedMultiplierForAlchemist, CONFIG.illagerInvasion::scaleMultiplierForAlchemist
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(archivist, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), archivist, CONFIG.illagerInvasion::healthMultiplierForArchivist, CONFIG.illagerInvasion::damageMultiplierForArchivist, CONFIG.illagerInvasion::speedMultiplierForArchivist, CONFIG.illagerInvasion::scaleMultiplierForArchivist
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(basher, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), basher, CONFIG.illagerInvasion::healthMultiplierForBasher, CONFIG.illagerInvasion::damageMultiplierForBasher, CONFIG.illagerInvasion::speedMultiplierForBasher, CONFIG.illagerInvasion::scaleMultiplierForBasher
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firecaller, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), firecaller, CONFIG.illagerInvasion::healthMultiplierForFirecaller, CONFIG.illagerInvasion::damageMultiplierForFirecaller, CONFIG.illagerInvasion::speedMultiplierForFirecaller, CONFIG.illagerInvasion::scaleMultiplierForFirecaller
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(inquisitor, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), inquisitor, CONFIG.illagerInvasion::healthMultiplierForInquisitor, CONFIG.illagerInvasion::damageMultiplierForInquisitor, CONFIG.illagerInvasion::speedMultiplierForInquisitor, CONFIG.illagerInvasion::scaleMultiplierForInquisitor
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(invoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), invoker, CONFIG.illagerInvasion::healthMultiplierForInvoker, CONFIG.illagerInvasion::damageMultiplierForInvoker, CONFIG.illagerInvasion::speedMultiplierForInvoker, CONFIG.illagerInvasion::scaleMultiplierForInvoker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(marauder, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), marauder, CONFIG.illagerInvasion::healthMultiplierForMarauder, CONFIG.illagerInvasion::damageMultiplierForMarauder, CONFIG.illagerInvasion::speedMultiplierForMarauder, CONFIG.illagerInvasion::scaleMultiplierForMarauder
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(necromancer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), necromancer, CONFIG.illagerInvasion::healthMultiplierForNecromancer, CONFIG.illagerInvasion::damageMultiplierForNecromancer, CONFIG.illagerInvasion::speedMultiplierForNecromancer, CONFIG.illagerInvasion::scaleMultiplierForNecromancer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(provoker, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), provoker, CONFIG.illagerInvasion::healthMultiplierForProvoker, CONFIG.illagerInvasion::damageMultiplierForProvoker, CONFIG.illagerInvasion::speedMultiplierForProvoker, CONFIG.illagerInvasion::scaleMultiplierForProvoker
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sorcerer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), sorcerer, CONFIG.illagerInvasion::healthMultiplierForSorcerer, CONFIG.illagerInvasion::damageMultiplierForSorcerer, CONFIG.illagerInvasion::speedMultiplierForSorcerer, CONFIG.illagerInvasion::scaleMultiplierForSorcerer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(surrendered, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), surrendered, CONFIG.illagerInvasion::healthMultiplierForSurrendered, CONFIG.illagerInvasion::damageMultiplierForSurrendered, null, CONFIG.illagerInvasion::scaleMultiplierForSurrendered
            );
        });
    }
}
