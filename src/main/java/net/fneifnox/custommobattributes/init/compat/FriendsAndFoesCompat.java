package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class FriendsAndFoesCompat {

    public static void initFriendsAndFoesAttributeHandlers() {
        EntityType copperGolem = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "copper_golem"));
        EntityType crab = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "crab"));
        EntityType glare = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "glare"));
        EntityType iceologer = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "iceologer"));
        EntityType mauler = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "mauler"));
        EntityType moobloom = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "moobloom"));
        EntityType rascal = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "rascal"));
        EntityType tuffGolem = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "tuff_golem"));
        EntityType wildfire = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("friendsandfoes", "wildfire"));


        AttributeUpdater.ATTRIBUTE_HANDLERS.put(copperGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForCopperGolem, Config.FRIENDS_AND_FOES.damageMultiplierForCopperGolem, Config.FRIENDS_AND_FOES.speedMultiplierForCopperGolem, Config.FRIENDS_AND_FOES.scaleMultiplierForCopperGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(crab, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForCrab, Config.FRIENDS_AND_FOES.damageMultiplierForCrab, Config.FRIENDS_AND_FOES.speedMultiplierForCrab, Config.FRIENDS_AND_FOES.scaleMultiplierForCrab
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(glare, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForGlare, Config.FRIENDS_AND_FOES.damageMultiplierForGlare, Config.FRIENDS_AND_FOES.speedMultiplierForGlare, Config.FRIENDS_AND_FOES.scaleMultiplierForGlare
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(iceologer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForIceologer, Config.FRIENDS_AND_FOES.damageMultiplierForIceologer, Config.FRIENDS_AND_FOES.speedMultiplierForIceologer, Config.FRIENDS_AND_FOES.scaleMultiplierForIceologer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mauler, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForMauler, Config.FRIENDS_AND_FOES.damageMultiplierForMauler, Config.FRIENDS_AND_FOES.speedMultiplierForMauler, Config.FRIENDS_AND_FOES.scaleMultiplierForMauler
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(moobloom, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForMoobloom, Config.FRIENDS_AND_FOES.damageMultiplierForMoobloom, Config.FRIENDS_AND_FOES.speedMultiplierForMoobloom, Config.FRIENDS_AND_FOES.scaleMultiplierForMoobloom
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(rascal, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForRascal, Config.FRIENDS_AND_FOES.damageMultiplierForRascal, Config.FRIENDS_AND_FOES.speedMultiplierForRascal, Config.FRIENDS_AND_FOES.scaleMultiplierForRascal
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tuffGolem, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForTuffGolem, Config.FRIENDS_AND_FOES.damageMultiplierForTuffGolem, Config.FRIENDS_AND_FOES.speedMultiplierForTuffGolem, Config.FRIENDS_AND_FOES.scaleMultiplierForTuffGolem
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(wildfire, entity -> {
                AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.FRIENDS_AND_FOES.healthMultiplierForWildfire, Config.FRIENDS_AND_FOES.damageMultiplierForWildfire, Config.FRIENDS_AND_FOES.speedMultiplierForWildfire, Config.FRIENDS_AND_FOES.scaleMultiplierForWildfire
            );
        });
    }
}
