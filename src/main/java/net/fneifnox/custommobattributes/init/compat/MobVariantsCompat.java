package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

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
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForArmoredSpider, CONFIG.mobVariants::damageMultiplierForArmoredSpider, CONFIG.mobVariants::speedMultiplierForArmoredSpider, CONFIG.mobVariants::scaleMultiplierForArmoredSpider
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(bloatedCorpse, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForBloatedCorpse, CONFIG.mobVariants::damageMultiplierForBloatedCorpse, CONFIG.mobVariants::speedMultiplierForBloatedCorpse, CONFIG.mobVariants::scaleMultiplierForBloatedCorpse
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(caveCreeper, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForCaveCreeper, CONFIG.mobVariants::damageMultiplierForCaveCreeper, CONFIG.mobVariants::speedMultiplierForCaveCreeper, CONFIG.mobVariants::scaleMultiplierForCaveCreeper
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(corsair, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForCorsair, CONFIG.mobVariants::damageMultiplierForCorsair, CONFIG.mobVariants::speedMultiplierForCorsair, CONFIG.mobVariants::scaleMultiplierForCorsair
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(executioner, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForExecutioner, CONFIG.mobVariants::damageMultiplierForExecutioner, CONFIG.mobVariants::speedMultiplierForExecutioner, CONFIG.mobVariants::scaleMultiplierForExecutioner
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(explorer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForExplorer, CONFIG.mobVariants::damageMultiplierForExplorer, CONFIG.mobVariants::speedMultiplierForExplorer, CONFIG.mobVariants::scaleMultiplierForExplorer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(forgotten, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForForgotten, CONFIG.mobVariants::damageMultiplierForForgotten, CONFIG.mobVariants::speedMultiplierForForgotten, CONFIG.mobVariants::scaleMultiplierForForgotten
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(frozenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForFrozenZombie, CONFIG.mobVariants::damageMultiplierForFrozenZombie, CONFIG.mobVariants::speedMultiplierForFrozenZombie, CONFIG.mobVariants::scaleMultiplierForFrozenZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(infectedPiglin, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForInfectedPiglin, CONFIG.mobVariants::damageMultiplierForInfectedPiglin, CONFIG.mobVariants::speedMultiplierForInfectedPiglin, CONFIG.mobVariants::scaleMultiplierForInfectedPiglin
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(InfectedPiglinBrute, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForInfectedPiglinBrute, CONFIG.mobVariants::damageMultiplierForInfectedPiglinBrute, CONFIG.mobVariants::speedMultiplierForInfectedPiglinBrute, CONFIG.mobVariants::scaleMultiplierForInfectedPiglinBrute
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lavaSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForLavaSlime, CONFIG.mobVariants::damageMultiplierForLavaSlime, CONFIG.mobVariants::speedMultiplierForLavaSlime, CONFIG.mobVariants::scaleMultiplierForLavaSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(nightmare, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForNightmare, CONFIG.mobVariants::damageMultiplierForNightmare, CONFIG.mobVariants::speedMultiplierForNightmare, CONFIG.mobVariants::scaleMultiplierForNightmare
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(soulStealer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForSoulStealer, CONFIG.mobVariants::damageMultiplierForSoulStealer, CONFIG.mobVariants::speedMultiplierForSoulStealer, CONFIG.mobVariants::scaleMultiplierForSoulStealer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(toxicSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForToxicSlime, CONFIG.mobVariants::damageMultiplierForToxicSlime, CONFIG.mobVariants::speedMultiplierForToxicSlime, CONFIG.mobVariants::scaleMultiplierForToxicSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tropicalSpider, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForTropicalSpider, CONFIG.mobVariants::damageMultiplierForTropicalSpider, CONFIG.mobVariants::speedMultiplierForTropicalSpider, CONFIG.mobVariants::scaleMultiplierForTropicalSpider
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(undeadWarrior, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForUndeadWarrior, CONFIG.mobVariants::damageMultiplierForUndeadWarrior, CONFIG.mobVariants::speedMultiplierForUndeadWarrior, CONFIG.mobVariants::scaleMultiplierForUndeadWarrior
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(zombifiedPiglinBrute, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), entity, CONFIG.mobVariants::healthMultiplierForZombifiedPiglinBrute, CONFIG.mobVariants::damageMultiplierForZombifiedPiglinBrute, CONFIG.mobVariants::speedMultiplierForZombifiedPiglinBrute, CONFIG.mobVariants::scaleMultiplierForZombifiedPiglinBrute
            );
        });
    }
}
