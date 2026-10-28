package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class FriendsAndFoesCompat {

    public static void initFriendsAndFoesAttributeHandlers() {
        EntityType<?> crab = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "crab"));
        EntityType<?> glare = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "glare"));
        EntityType<?> iceologer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "iceologer"));
        EntityType<?> mauler = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "mauler"));
        EntityType<?> moobloom = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "moobloom"));
        EntityType<?> rascal = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "rascal"));
        EntityType<?> tuffGolem = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "tuff_golem"));
        EntityType<?> wildfire = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("friendsandfoes", "wildfire"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(crab, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForCrab"), ranged("friendsAndFoes.damageMultiplierForCrab"), ranged("friendsAndFoes.speedMultiplierForCrab"), ranged("friendsAndFoes.scaleMultiplierForCrab")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(glare, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForGlare"), ranged("friendsAndFoes.damageMultiplierForGlare"), ranged("friendsAndFoes.speedMultiplierForGlare"), ranged("friendsAndFoes.scaleMultiplierForGlare")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(iceologer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForIceologer"), ranged("friendsAndFoes.damageMultiplierForIceologer"), ranged("friendsAndFoes.speedMultiplierForIceologer"), ranged("friendsAndFoes.scaleMultiplierForIceologer")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mauler, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForMauler"), ranged("friendsAndFoes.damageMultiplierForMauler"), ranged("friendsAndFoes.speedMultiplierForMauler"), ranged("friendsAndFoes.scaleMultiplierForMauler")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(moobloom, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForMoobloom"), ranged("friendsAndFoes.damageMultiplierForMoobloom"), ranged("friendsAndFoes.speedMultiplierForMoobloom"), ranged("friendsAndFoes.scaleMultiplierForMoobloom")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(rascal, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForRascal"), ranged("friendsAndFoes.damageMultiplierForRascal"), ranged("friendsAndFoes.speedMultiplierForRascal"), ranged("friendsAndFoes.scaleMultiplierForRascal")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tuffGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForTuffGolem"), ranged("friendsAndFoes.damageMultiplierForTuffGolem"), ranged("friendsAndFoes.speedMultiplierForTuffGolem"), ranged("friendsAndFoes.scaleMultiplierForTuffGolem")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(wildfire, entity -> {
                AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("friendsAndFoes.healthMultiplierForWildfire"), ranged("friendsAndFoes.damageMultiplierForWildfire"), ranged("friendsAndFoes.speedMultiplierForWildfire"), ranged("friendsAndFoes.scaleMultiplierForWildfire")
            );
        });
    }
}
