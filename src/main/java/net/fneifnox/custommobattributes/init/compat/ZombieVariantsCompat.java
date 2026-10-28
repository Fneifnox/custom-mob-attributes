package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

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
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForBadlandsZombie"), ranged("zombieVariants.damageMultiplierForBadlandsZombie"), ranged("zombieVariants.speedMultiplierForBadlandsZombie"), ranged("zombieVariants.scaleMultiplierForBadlandsZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(bambooZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForBambooZombie"), ranged("zombieVariants.damageMultiplierForBambooZombie"), ranged("zombieVariants.speedMultiplierForBambooZombie"), ranged("zombieVariants.scaleMultiplierForBambooZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(caveZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForCaveZombie"), ranged("zombieVariants.damageMultiplierForCaveZombie"), ranged("zombieVariants.speedMultiplierForCaveZombie"), ranged("zombieVariants.scaleMultiplierForCaveZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(cherryZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForCherryZombie"), ranged("zombieVariants.damageMultiplierForCherryZombie"), ranged("zombieVariants.speedMultiplierForCherryZombie"), ranged("zombieVariants.scaleMultiplierForCherryZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(deepDarkZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForDeepDarkZombie"), ranged("zombieVariants.damageMultiplierForDeepDarkZombie"), ranged("zombieVariants.speedMultiplierForDeepDarkZombie"), ranged("zombieVariants.scaleMultiplierForDeepDarkZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(desertZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForDesertZombie"), ranged("zombieVariants.damageMultiplierForDesertZombie"), ranged("zombieVariants.speedMultiplierForDesertZombie"), ranged("zombieVariants.scaleMultiplierForDesertZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(dripstoneZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForDripstoneZombie"), ranged("zombieVariants.damageMultiplierForDripstoneZombie"), ranged("zombieVariants.speedMultiplierForDripstoneZombie"), ranged("zombieVariants.scaleMultiplierForDripstoneZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(frozenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForFrozenZombie"), ranged("zombieVariants.damageMultiplierForFrozenZombie"), ranged("zombieVariants.speedMultiplierForFrozenZombie"), ranged("zombieVariants.scaleMultiplierForFrozenZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForJungleZombie"), ranged("zombieVariants.damageMultiplierForJungleZombie"), ranged("zombieVariants.speedMultiplierForJungleZombie"), ranged("zombieVariants.scaleMultiplierForJungleZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lushZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForLushZombie"), ranged("zombieVariants.damageMultiplierForLushZombie"), ranged("zombieVariants.speedMultiplierForLushZombie"), ranged("zombieVariants.scaleMultiplierForLushZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mangroveZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForMangroveZombie"), ranged("zombieVariants.damageMultiplierForMangroveZombie"), ranged("zombieVariants.speedMultiplierForMangroveZombie"), ranged("zombieVariants.scaleMultiplierForMangroveZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(mushroomZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForMushroomZombie"), ranged("zombieVariants.damageMultiplierForMushroomZombie"), ranged("zombieVariants.speedMultiplierForMushroomZombie"), ranged("zombieVariants.scaleMultiplierForMushroomZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(paleGardenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForPaleGardenZombie"), ranged("zombieVariants.damageMultiplierForPaleGardenZombie"), ranged("zombieVariants.speedMultiplierForPaleGardenZombie"), ranged("zombieVariants.scaleMultiplierForPaleGardenZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(savannaZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForSavannaZombie"), ranged("zombieVariants.damageMultiplierForSavannaZombie"), ranged("zombieVariants.speedMultiplierForSavannaZombie"), ranged("zombieVariants.scaleMultiplierForSavannaZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(swampZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("zombieVariants.healthMultiplierForSwampZombie"), ranged("zombieVariants.damageMultiplierForSwampZombie"), ranged("zombieVariants.speedMultiplierForSwampZombie"), ranged("zombieVariants.scaleMultiplierForSwampZombie")
            );
        });
    }
}
