package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.config.Config;
import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class MobVariantsCompat {

    public static void initMobVariantsAttributeHandlers() {
        EntityType armoredSpider = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "armored_spider"));
        EntityType bloatedCorpse = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "bloated_corpse"));
        EntityType caveCreeper = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "cave_creeper"));
        EntityType corsair = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "corsair"));
        EntityType executioner = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "executioner"));
        EntityType explorer = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "explorer"));
        EntityType forgotten = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "forgotten"));
        EntityType frozenZombie = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "frozen_zombie"));
        EntityType infectedPiglin = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "infected_piglin"));
        EntityType InfectedPiglinBrute = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "infected_piglin_brute"));
        EntityType lavaSlime = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "lava_slime"));
        EntityType nightmare = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "nightmare"));
        EntityType soulStealer = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "soul_stealer"));
        EntityType toxicSlime = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "toxic_slime"));
        EntityType tropicalSpider = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "tropical_spider"));
        EntityType undeadWarrior = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "undead_warrior"));
        EntityType zombifiedPiglinBrute = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "zombified_piglin_brute"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(armoredSpider, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), armoredSpider, Config.MOB_VARIANTS.healthMultiplierForArmoredSpider, Config.MOB_VARIANTS.damageMultiplierForArmoredSpider, Config.MOB_VARIANTS.speedMultiplierForArmoredSpider, Config.MOB_VARIANTS.scaleMultiplierForArmoredSpider
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(bloatedCorpse, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), bloatedCorpse, Config.MOB_VARIANTS.healthMultiplierForBloatedCorpse, Config.MOB_VARIANTS.damageMultiplierForBloatedCorpse, Config.MOB_VARIANTS.speedMultiplierForBloatedCorpse, Config.MOB_VARIANTS.scaleMultiplierForBloatedCorpse
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(caveCreeper, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), caveCreeper, Config.MOB_VARIANTS.healthMultiplierForCaveCreeper, Config.MOB_VARIANTS.damageMultiplierForCaveCreeper, Config.MOB_VARIANTS.speedMultiplierForCaveCreeper, Config.MOB_VARIANTS.scaleMultiplierForCaveCreeper
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(corsair, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), corsair, Config.MOB_VARIANTS.healthMultiplierForCorsair, Config.MOB_VARIANTS.damageMultiplierForCorsair, Config.MOB_VARIANTS.speedMultiplierForCorsair, Config.MOB_VARIANTS.scaleMultiplierForCorsair
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(executioner, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), executioner, Config.MOB_VARIANTS.healthMultiplierForExecutioner, Config.MOB_VARIANTS.damageMultiplierForExecutioner, Config.MOB_VARIANTS.speedMultiplierForExecutioner, Config.MOB_VARIANTS.scaleMultiplierForExecutioner
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(explorer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), explorer, Config.MOB_VARIANTS.healthMultiplierForExplorer, Config.MOB_VARIANTS.damageMultiplierForExplorer, Config.MOB_VARIANTS.speedMultiplierForExplorer, Config.MOB_VARIANTS.scaleMultiplierForExplorer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(forgotten, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), forgotten, Config.MOB_VARIANTS.healthMultiplierForForgotten, Config.MOB_VARIANTS.damageMultiplierForForgotten, Config.MOB_VARIANTS.speedMultiplierForForgotten, Config.MOB_VARIANTS.scaleMultiplierForForgotten
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(frozenZombie, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), frozenZombie, Config.MOB_VARIANTS.healthMultiplierForFrozenZombie, Config.MOB_VARIANTS.damageMultiplierForFrozenZombie, Config.MOB_VARIANTS.speedMultiplierForFrozenZombie, Config.MOB_VARIANTS.scaleMultiplierForFrozenZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(infectedPiglin, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), infectedPiglin, Config.MOB_VARIANTS.healthMultiplierForInfectedPiglin, Config.MOB_VARIANTS.damageMultiplierForInfectedPiglin, Config.MOB_VARIANTS.speedMultiplierForInfectedPiglin, Config.MOB_VARIANTS.scaleMultiplierForInfectedPiglin
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(InfectedPiglinBrute, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), InfectedPiglinBrute, Config.MOB_VARIANTS.healthMultiplierForInfectedPiglinBrute, Config.MOB_VARIANTS.damageMultiplierForInfectedPiglinBrute, Config.MOB_VARIANTS.speedMultiplierForInfectedPiglinBrute, Config.MOB_VARIANTS.scaleMultiplierForInfectedPiglinBrute
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lavaSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), lavaSlime, Config.MOB_VARIANTS.healthMultiplierForLavaSlime, Config.MOB_VARIANTS.damageMultiplierForLavaSlime, Config.MOB_VARIANTS.speedMultiplierForLavaSlime, Config.MOB_VARIANTS.scaleMultiplierForLavaSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(nightmare, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), nightmare, Config.MOB_VARIANTS.healthMultiplierForNightmare, Config.MOB_VARIANTS.damageMultiplierForNightmare, Config.MOB_VARIANTS.speedMultiplierForNightmare, Config.MOB_VARIANTS.scaleMultiplierForNightmare
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(soulStealer, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), soulStealer, Config.MOB_VARIANTS.healthMultiplierForSoulStealer, Config.MOB_VARIANTS.damageMultiplierForSoulStealer, Config.MOB_VARIANTS.speedMultiplierForSoulStealer, Config.MOB_VARIANTS.scaleMultiplierForSoulStealer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(toxicSlime, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), toxicSlime, Config.MOB_VARIANTS.healthMultiplierForToxicSlime, Config.MOB_VARIANTS.damageMultiplierForToxicSlime, Config.MOB_VARIANTS.speedMultiplierForToxicSlime, Config.MOB_VARIANTS.scaleMultiplierForToxicSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tropicalSpider, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), tropicalSpider, Config.MOB_VARIANTS.healthMultiplierForTropicalSpider, Config.MOB_VARIANTS.damageMultiplierForTropicalSpider, Config.MOB_VARIANTS.speedMultiplierForTropicalSpider, Config.MOB_VARIANTS.scaleMultiplierForTropicalSpider
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(undeadWarrior, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), undeadWarrior, Config.MOB_VARIANTS.healthMultiplierForUndeadWarrior, Config.MOB_VARIANTS.damageMultiplierForUndeadWarrior, Config.MOB_VARIANTS.speedMultiplierForUndeadWarrior, Config.MOB_VARIANTS.scaleMultiplierForUndeadWarrior
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(zombifiedPiglinBrute, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.level(), zombifiedPiglinBrute, Config.MOB_VARIANTS.healthMultiplierForZombifiedPiglinBrute, Config.MOB_VARIANTS.damageMultiplierForZombifiedPiglinBrute, Config.MOB_VARIANTS.speedMultiplierForZombifiedPiglinBrute, Config.MOB_VARIANTS.scaleMultiplierForZombifiedPiglinBrute
            );
        });
    }
}
