package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

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
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForCrab, CONFIG.friendsAndFoes::damageMultiplierForCrab, CONFIG.friendsAndFoes::speedMultiplierForCrab, CONFIG.friendsAndFoes::scaleMultiplierForCrab
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(glare, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForGlare, CONFIG.friendsAndFoes::damageMultiplierForGlare, CONFIG.friendsAndFoes::speedMultiplierForGlare, CONFIG.friendsAndFoes::scaleMultiplierForGlare
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(iceologer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForIceologer, CONFIG.friendsAndFoes::damageMultiplierForIceologer, CONFIG.friendsAndFoes::speedMultiplierForIceologer, CONFIG.friendsAndFoes::scaleMultiplierForIceologer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mauler, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForMauler, CONFIG.friendsAndFoes::damageMultiplierForMauler, CONFIG.friendsAndFoes::speedMultiplierForMauler, CONFIG.friendsAndFoes::scaleMultiplierForMauler
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(moobloom, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForMoobloom, CONFIG.friendsAndFoes::damageMultiplierForMoobloom, CONFIG.friendsAndFoes::speedMultiplierForMoobloom, CONFIG.friendsAndFoes::scaleMultiplierForMoobloom
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(rascal, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForRascal, CONFIG.friendsAndFoes::damageMultiplierForRascal, CONFIG.friendsAndFoes::speedMultiplierForRascal, CONFIG.friendsAndFoes::scaleMultiplierForRascal
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tuffGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForTuffGolem, CONFIG.friendsAndFoes::damageMultiplierForTuffGolem, CONFIG.friendsAndFoes::speedMultiplierForTuffGolem, CONFIG.friendsAndFoes::scaleMultiplierForTuffGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(wildfire, entity -> {
                AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.friendsAndFoes::healthMultiplierForWildfire, CONFIG.friendsAndFoes::damageMultiplierForWildfire, CONFIG.friendsAndFoes::speedMultiplierForWildfire, CONFIG.friendsAndFoes::scaleMultiplierForWildfire
            );
        });
    }
}
