package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class ZombieVariantsCompat {

    public static void initZombieVariantsAttributeHandlers() {
        EntityType badlandsZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "badlands_zombie"));
        EntityType bambooZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "bamboo_zombie"));
        EntityType caveZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "cave_zombie"));
        EntityType cherryZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "cherry_zombie"));
        EntityType deepDarkZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "deep_dark_zombie"));
        EntityType desertZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "desert_zombie"));
        EntityType dripstoneZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "dripstone_zombie"));
        EntityType frozenZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "frozen_zombie"));
        EntityType jungleZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "jungle_zombie"));
        EntityType lushZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "lush_zombie"));
        EntityType mangroveZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "mangrove_zombie"));
        EntityType mushroomZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "pale_garden_zombie"));
        EntityType paleGardenZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "savanna_zombie"));
        EntityType savannaZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "swamp_zombie"));
        EntityType swampZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("zombie_variants", "mushroom_zombie"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(badlandsZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForBadlandsZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForBadlandsZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForBadlandsZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForBadlandsZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(bambooZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForBambooZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForBambooZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForBambooZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForBambooZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(caveZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForCaveZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForCaveZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForCaveZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForCaveZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(cherryZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForCherryZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForCherryZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForCherryZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForCherryZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(deepDarkZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForDeepDarkZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForDeepDarkZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForDeepDarkZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForDeepDarkZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(desertZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForDesertZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForDesertZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForDesertZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForDesertZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dripstoneZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForDripstoneZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForDripstoneZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForDripstoneZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForDripstoneZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(frozenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForFrozenZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForFrozenZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForFrozenZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForFrozenZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForJungleZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForJungleZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForJungleZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForJungleZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lushZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForLushZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForLushZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForLushZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForLushZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mangroveZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForMangroveZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForMangroveZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForMangroveZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForMangroveZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mushroomZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForMushroomZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForMushroomZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForMushroomZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForMushroomZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(paleGardenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForPaleGardenZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForPaleGardenZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForPaleGardenZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForPaleGardenZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(savannaZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForSavannaZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForSavannaZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForSavannaZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForSavannaZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(swampZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, Config.ZOMBIE_VARIANTS.healthMultiplierForSwampZombie, Config.ZOMBIE_VARIANTS.damageMultiplierForSwampZombie, Config.ZOMBIE_VARIANTS.speedMultiplierForSwampZombie, Config.ZOMBIE_VARIANTS.scaleMultiplierForSwampZombie
            );
        });
    }
}
