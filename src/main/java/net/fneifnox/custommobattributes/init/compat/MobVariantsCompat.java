package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.range.RangedMultipliers.ranged;

public class MobVariantsCompat {

    public static void initMobVariantsAttributeHandlers() {
        EntityType<?> armoredSpider = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "armored_spider"));
        EntityType<?> bloatedCorpse = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "bloated_corpse"));
        EntityType<?> caveCreeper = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "cave_creeper"));
        EntityType<?> corsair = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "corsair"));
        EntityType<?> executioner = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "executioner"));
        EntityType<?> explorer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "explorer"));
        EntityType<?> forgotten = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "forgotten"));
        EntityType<?> frozenZombie = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "frozen_zombie"));
        EntityType<?> infectedPiglin = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "infected_piglin"));
        EntityType<?> InfectedPiglinBrute = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "infected_piglin_brute"));
        EntityType<?> lavaSlime = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "lava_slime"));
        EntityType<?> nightmare = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "nightmare"));
        EntityType<?> soulStealer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "soul_stealer"));
        EntityType<?> toxicSlime = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "toxic_slime"));
        EntityType<?> tropicalSpider = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "tropical_spider"));
        EntityType<?> undeadWarrior = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "undead_warrior"));
        EntityType<?> zombifiedPiglinBrute = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "zombified_piglin_brute"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(armoredSpider, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForArmoredSpider"), ranged("mobVariants.damageMultiplierForArmoredSpider"), ranged("mobVariants.speedMultiplierForArmoredSpider"), ranged("mobVariants.scaleMultiplierForArmoredSpider")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(bloatedCorpse, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForBloatedCorpse"), ranged("mobVariants.damageMultiplierForBloatedCorpse"), ranged("mobVariants.speedMultiplierForBloatedCorpse"), ranged("mobVariants.scaleMultiplierForBloatedCorpse")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(caveCreeper, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForCaveCreeper"), ranged("mobVariants.damageMultiplierForCaveCreeper"), ranged("mobVariants.speedMultiplierForCaveCreeper"), ranged("mobVariants.scaleMultiplierForCaveCreeper")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(corsair, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForCorsair"), ranged("mobVariants.damageMultiplierForCorsair"), ranged("mobVariants.speedMultiplierForCorsair"), ranged("mobVariants.scaleMultiplierForCorsair")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(executioner, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForExecutioner"), ranged("mobVariants.damageMultiplierForExecutioner"), ranged("mobVariants.speedMultiplierForExecutioner"), ranged("mobVariants.scaleMultiplierForExecutioner")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(explorer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForExplorer"), ranged("mobVariants.damageMultiplierForExplorer"), ranged("mobVariants.speedMultiplierForExplorer"), ranged("mobVariants.scaleMultiplierForExplorer")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(forgotten, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForForgotten"), ranged("mobVariants.damageMultiplierForForgotten"), ranged("mobVariants.speedMultiplierForForgotten"), ranged("mobVariants.scaleMultiplierForForgotten")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(frozenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForFrozenZombie"), ranged("mobVariants.damageMultiplierForFrozenZombie"), ranged("mobVariants.speedMultiplierForFrozenZombie"), ranged("mobVariants.scaleMultiplierForFrozenZombie")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(infectedPiglin, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForInfectedPiglin"), ranged("mobVariants.damageMultiplierForInfectedPiglin"), ranged("mobVariants.speedMultiplierForInfectedPiglin"), ranged("mobVariants.scaleMultiplierForInfectedPiglin")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(InfectedPiglinBrute, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForInfectedPiglinBrute"), ranged("mobVariants.damageMultiplierForInfectedPiglinBrute"), ranged("mobVariants.speedMultiplierForInfectedPiglinBrute"), ranged("mobVariants.scaleMultiplierForInfectedPiglinBrute")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lavaSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForLavaSlime"), ranged("mobVariants.damageMultiplierForLavaSlime"), ranged("mobVariants.speedMultiplierForLavaSlime"), ranged("mobVariants.scaleMultiplierForLavaSlime")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(nightmare, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForNightmare"), ranged("mobVariants.damageMultiplierForNightmare"), ranged("mobVariants.speedMultiplierForNightmare"), ranged("mobVariants.scaleMultiplierForNightmare")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(soulStealer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForSoulStealer"), ranged("mobVariants.damageMultiplierForSoulStealer"), ranged("mobVariants.speedMultiplierForSoulStealer"), ranged("mobVariants.scaleMultiplierForSoulStealer")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(toxicSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForToxicSlime"), ranged("mobVariants.damageMultiplierForToxicSlime"), ranged("mobVariants.speedMultiplierForToxicSlime"), ranged("mobVariants.scaleMultiplierForToxicSlime")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tropicalSpider, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForTropicalSpider"), ranged("mobVariants.damageMultiplierForTropicalSpider"), ranged("mobVariants.speedMultiplierForTropicalSpider"), ranged("mobVariants.scaleMultiplierForTropicalSpider")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(undeadWarrior, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForUndeadWarrior"), ranged("mobVariants.damageMultiplierForUndeadWarrior"), ranged("mobVariants.speedMultiplierForUndeadWarrior"), ranged("mobVariants.scaleMultiplierForUndeadWarrior")
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(zombifiedPiglinBrute, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, ranged("mobVariants.healthMultiplierForZombifiedPiglinBrute"), ranged("mobVariants.damageMultiplierForZombifiedPiglinBrute"), ranged("mobVariants.speedMultiplierForZombifiedPiglinBrute"), ranged("mobVariants.scaleMultiplierForZombifiedPiglinBrute")
            );
        });
    }
}
