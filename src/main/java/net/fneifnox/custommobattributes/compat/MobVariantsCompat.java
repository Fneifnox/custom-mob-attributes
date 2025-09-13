package net.fneifnox.custommobattributes.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class MobVariantsCompat {

    public static void initMobVariantsAttributeHandlers() {
        EntityType armoredSpider = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "armored_spider"));
        EntityType bloatedCorpse = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "bloated_corpse"));
        EntityType caveCreeper = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "cave_creeper"));
        EntityType corsair = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "corsair"));
        EntityType executioner = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "executioner"));
        EntityType explorer = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "explorer"));
        EntityType forgotten = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "forgotten"));
        EntityType frozenZombie = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "frozen_zombie"));
        EntityType infectedPiglin = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "infected_piglin"));
        EntityType InfectedPiglinBrute = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "infected_piglin_brute"));
        EntityType lavaSlime = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "lava_slime"));
        EntityType nightmare = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "nightmare"));
        EntityType soulStealer = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "soul_stealer"));
        EntityType toxicSlime = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "toxic_slime"));
        EntityType tropicalSpider = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "tropical_spider"));
        EntityType undeadWarrior = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "undead_warrior"));
        EntityType zombifiedPiglinBrute = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "zombified_piglin_brute"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(armoredSpider, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, armoredSpider, CONFIG.mobVariants::healthMultiplierForArmoredSpider, CONFIG.mobVariants::damageMultiplierForArmoredSpider, CONFIG.mobVariants::speedMultiplierForArmoredSpider, CONFIG.mobVariants::scaleMultiplierForArmoredSpider
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(bloatedCorpse, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, bloatedCorpse, CONFIG.mobVariants::healthMultiplierForBloatedCorpse, CONFIG.mobVariants::damageMultiplierForBloatedCorpse, CONFIG.mobVariants::speedMultiplierForBloatedCorpse, CONFIG.mobVariants::scaleMultiplierForBloatedCorpse
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(caveCreeper, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, caveCreeper, CONFIG.mobVariants::healthMultiplierForCaveCreeper, CONFIG.mobVariants::damageMultiplierForCaveCreeper, CONFIG.mobVariants::speedMultiplierForCaveCreeper, CONFIG.mobVariants::scaleMultiplierForCaveCreeper
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(corsair, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, corsair, CONFIG.mobVariants::healthMultiplierForCorsair, CONFIG.mobVariants::damageMultiplierForCorsair, CONFIG.mobVariants::speedMultiplierForCorsair, CONFIG.mobVariants::scaleMultiplierForCorsair
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(executioner, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, executioner, CONFIG.mobVariants::healthMultiplierForExecutioner, CONFIG.mobVariants::damageMultiplierForExecutioner, CONFIG.mobVariants::speedMultiplierForExecutioner, CONFIG.mobVariants::scaleMultiplierForExecutioner
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(explorer, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, explorer, CONFIG.mobVariants::healthMultiplierForExplorer, CONFIG.mobVariants::damageMultiplierForExplorer, CONFIG.mobVariants::speedMultiplierForExplorer, CONFIG.mobVariants::scaleMultiplierForExplorer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(forgotten, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, forgotten, CONFIG.mobVariants::healthMultiplierForForgotten, CONFIG.mobVariants::damageMultiplierForForgotten, CONFIG.mobVariants::speedMultiplierForForgotten, CONFIG.mobVariants::scaleMultiplierForForgotten
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(frozenZombie, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, frozenZombie, CONFIG.mobVariants::healthMultiplierForFrozenZombie, CONFIG.mobVariants::damageMultiplierForFrozenZombie, CONFIG.mobVariants::speedMultiplierForFrozenZombie, CONFIG.mobVariants::scaleMultiplierForFrozenZombie
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(infectedPiglin, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, infectedPiglin, CONFIG.mobVariants::healthMultiplierForInfectedPiglin, CONFIG.mobVariants::damageMultiplierForInfectedPiglin, CONFIG.mobVariants::speedMultiplierForInfectedPiglin, CONFIG.mobVariants::scaleMultiplierForInfectedPiglin
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(InfectedPiglinBrute, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, InfectedPiglinBrute, CONFIG.mobVariants::healthMultiplierForInfectedPiglinBrute, CONFIG.mobVariants::damageMultiplierForInfectedPiglinBrute, CONFIG.mobVariants::speedMultiplierForInfectedPiglinBrute, CONFIG.mobVariants::scaleMultiplierForInfectedPiglinBrute
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lavaSlime, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, lavaSlime, CONFIG.mobVariants::healthMultiplierForLavaSlime, CONFIG.mobVariants::damageMultiplierForLavaSlime, CONFIG.mobVariants::speedMultiplierForLavaSlime, CONFIG.mobVariants::scaleMultiplierForLavaSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(nightmare, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, nightmare, CONFIG.mobVariants::healthMultiplierForNightmare, CONFIG.mobVariants::damageMultiplierForNightmare, CONFIG.mobVariants::speedMultiplierForNightmare, CONFIG.mobVariants::scaleMultiplierForNightmare
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(soulStealer, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, soulStealer, CONFIG.mobVariants::healthMultiplierForSoulStealer, CONFIG.mobVariants::damageMultiplierForSoulStealer, CONFIG.mobVariants::speedMultiplierForSoulStealer, CONFIG.mobVariants::scaleMultiplierForSoulStealer
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(toxicSlime, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, toxicSlime, CONFIG.mobVariants::healthMultiplierForToxicSlime, CONFIG.mobVariants::damageMultiplierForToxicSlime, CONFIG.mobVariants::speedMultiplierForToxicSlime, CONFIG.mobVariants::scaleMultiplierForToxicSlime
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(tropicalSpider, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, tropicalSpider, CONFIG.mobVariants::healthMultiplierForTropicalSpider, CONFIG.mobVariants::damageMultiplierForTropicalSpider, CONFIG.mobVariants::speedMultiplierForTropicalSpider, CONFIG.mobVariants::scaleMultiplierForTropicalSpider
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(undeadWarrior, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, undeadWarrior, CONFIG.mobVariants::healthMultiplierForUndeadWarrior, CONFIG.mobVariants::damageMultiplierForUndeadWarrior, CONFIG.mobVariants::speedMultiplierForUndeadWarrior, CONFIG.mobVariants::scaleMultiplierForUndeadWarrior
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(zombifiedPiglinBrute, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, zombifiedPiglinBrute, CONFIG.mobVariants::healthMultiplierForZombifiedPiglinBrute, CONFIG.mobVariants::damageMultiplierForZombifiedPiglinBrute, CONFIG.mobVariants::speedMultiplierForZombifiedPiglinBrute, CONFIG.mobVariants::scaleMultiplierForZombifiedPiglinBrute
            );
        });
    }
}
