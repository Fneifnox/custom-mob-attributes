package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class ZombieVariantsCompat {

    public static void initZombieVariantsAttributeHandlers() {
        EntityType<?> badlandsZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "badlands_zombie"));
        EntityType<?> bambooZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "bamboo_zombie"));
        EntityType<?> caveZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "cave_zombie"));
        EntityType<?> cherryZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "cherry_zombie"));
        EntityType<?> deepDarkZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "deep_dark_zombie"));
        EntityType<?> desertZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "desert_zombie"));
        EntityType<?> dripstoneZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "dripstone_zombie"));
        EntityType<?> frozenZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "frozen_zombie"));
        EntityType<?> jungleZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "jungle_zombie"));
        EntityType<?> lushZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "lush_zombie"));
        EntityType<?> mangroveZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "mangrove_zombie"));
        EntityType<?> mushroomZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "pale_garden_zombie"));
        EntityType<?> paleGardenZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "savanna_zombie"));
        EntityType<?> savannaZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "swamp_zombie"));
        EntityType<?> swampZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("zombie_variants", "mushroom_zombie"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(badlandsZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForBadlandsZombie, CONFIG.zombieVariants::damageMultiplierForBadlandsZombie, CONFIG.zombieVariants::speedMultiplierForBadlandsZombie, CONFIG.zombieVariants::scaleMultiplierForBadlandsZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(bambooZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForBambooZombie, CONFIG.zombieVariants::damageMultiplierForBambooZombie, CONFIG.zombieVariants::speedMultiplierForBambooZombie, CONFIG.zombieVariants::scaleMultiplierForBambooZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(caveZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForCaveZombie, CONFIG.zombieVariants::damageMultiplierForCaveZombie, CONFIG.zombieVariants::speedMultiplierForCaveZombie, CONFIG.zombieVariants::scaleMultiplierForCaveZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(cherryZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForCherryZombie, CONFIG.zombieVariants::damageMultiplierForCherryZombie, CONFIG.zombieVariants::speedMultiplierForCherryZombie, CONFIG.zombieVariants::scaleMultiplierForCherryZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(deepDarkZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForDeepDarkZombie, CONFIG.zombieVariants::damageMultiplierForDeepDarkZombie, CONFIG.zombieVariants::speedMultiplierForDeepDarkZombie, CONFIG.zombieVariants::scaleMultiplierForDeepDarkZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(desertZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForDesertZombie, CONFIG.zombieVariants::damageMultiplierForDesertZombie, CONFIG.zombieVariants::speedMultiplierForDesertZombie, CONFIG.zombieVariants::scaleMultiplierForDesertZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dripstoneZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForDripstoneZombie, CONFIG.zombieVariants::damageMultiplierForDripstoneZombie, CONFIG.zombieVariants::speedMultiplierForDripstoneZombie, CONFIG.zombieVariants::scaleMultiplierForDripstoneZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(frozenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForFrozenZombie, CONFIG.zombieVariants::damageMultiplierForFrozenZombie, CONFIG.zombieVariants::speedMultiplierForFrozenZombie, CONFIG.zombieVariants::scaleMultiplierForFrozenZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForJungleZombie, CONFIG.zombieVariants::damageMultiplierForJungleZombie, CONFIG.zombieVariants::speedMultiplierForJungleZombie, CONFIG.zombieVariants::scaleMultiplierForJungleZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lushZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForLushZombie, CONFIG.zombieVariants::damageMultiplierForLushZombie, CONFIG.zombieVariants::speedMultiplierForLushZombie, CONFIG.zombieVariants::scaleMultiplierForLushZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mangroveZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForMangroveZombie, CONFIG.zombieVariants::damageMultiplierForMangroveZombie, CONFIG.zombieVariants::speedMultiplierForMangroveZombie, CONFIG.zombieVariants::scaleMultiplierForMangroveZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mushroomZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForMushroomZombie, CONFIG.zombieVariants::damageMultiplierForMushroomZombie, CONFIG.zombieVariants::speedMultiplierForMushroomZombie, CONFIG.zombieVariants::scaleMultiplierForMushroomZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(paleGardenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForPaleGardenZombie, CONFIG.zombieVariants::damageMultiplierForPaleGardenZombie, CONFIG.zombieVariants::speedMultiplierForPaleGardenZombie, CONFIG.zombieVariants::scaleMultiplierForPaleGardenZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(savannaZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForSavannaZombie, CONFIG.zombieVariants::damageMultiplierForSavannaZombie, CONFIG.zombieVariants::speedMultiplierForSavannaZombie, CONFIG.zombieVariants::scaleMultiplierForSavannaZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(swampZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.zombieVariants::healthMultiplierForSwampZombie, CONFIG.zombieVariants::damageMultiplierForSwampZombie, CONFIG.zombieVariants::speedMultiplierForSwampZombie, CONFIG.zombieVariants::scaleMultiplierForSwampZombie
            );
        });
    }
}
