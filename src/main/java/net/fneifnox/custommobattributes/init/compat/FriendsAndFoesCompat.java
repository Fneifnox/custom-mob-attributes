package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class FriendsAndFoesCompat {

    public static void initFriendsAndFoesAttributeHandlers() {
        EntityType copperGolem = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "copper_golem"));
        EntityType crab = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "crab"));
        EntityType glare = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "glare"));
        EntityType iceologer = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "iceologer"));
        EntityType mauler = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "mauler"));
        EntityType moobloom = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "moobloom"));
        EntityType rascal = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "rascal"));
        EntityType tuffGolem = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "tuff_golem"));
        EntityType wildfire = Registries.ENTITY_TYPE.get(Identifier.of("friendsandfoes", "wildfire"));


        AttributeUpdater.ATTRIBUTE_HANDLERS.put(copperGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForCopperGolem, CONFIG.friendsAndFoes::damageMultiplierForCopperGolem, CONFIG.friendsAndFoes::speedMultiplierForCopperGolem, CONFIG.friendsAndFoes::scaleMultiplierForCopperGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(crab, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForCrab, CONFIG.friendsAndFoes::damageMultiplierForCrab, CONFIG.friendsAndFoes::speedMultiplierForCrab, CONFIG.friendsAndFoes::scaleMultiplierForCrab
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(glare, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForGlare, CONFIG.friendsAndFoes::damageMultiplierForGlare, CONFIG.friendsAndFoes::speedMultiplierForGlare, CONFIG.friendsAndFoes::scaleMultiplierForGlare
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(iceologer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForIceologer, CONFIG.friendsAndFoes::damageMultiplierForIceologer, CONFIG.friendsAndFoes::speedMultiplierForIceologer, CONFIG.friendsAndFoes::scaleMultiplierForIceologer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mauler, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForMauler, CONFIG.friendsAndFoes::damageMultiplierForMauler, CONFIG.friendsAndFoes::speedMultiplierForMauler, CONFIG.friendsAndFoes::scaleMultiplierForMauler
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(moobloom, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForMoobloom, CONFIG.friendsAndFoes::damageMultiplierForMoobloom, CONFIG.friendsAndFoes::speedMultiplierForMoobloom, CONFIG.friendsAndFoes::scaleMultiplierForMoobloom
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(rascal, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForRascal, CONFIG.friendsAndFoes::damageMultiplierForRascal, CONFIG.friendsAndFoes::speedMultiplierForRascal, CONFIG.friendsAndFoes::scaleMultiplierForRascal
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tuffGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForTuffGolem, CONFIG.friendsAndFoes::damageMultiplierForTuffGolem, CONFIG.friendsAndFoes::speedMultiplierForTuffGolem, CONFIG.friendsAndFoes::scaleMultiplierForTuffGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(wildfire, entity -> {
                AttributeUpdater.configureEntityAttributes(entity.getWorld(), entity, CONFIG.friendsAndFoes::healthMultiplierForWildfire, CONFIG.friendsAndFoes::damageMultiplierForWildfire, CONFIG.friendsAndFoes::speedMultiplierForWildfire, CONFIG.friendsAndFoes::scaleMultiplierForWildfire
            );
        });
    }
}
