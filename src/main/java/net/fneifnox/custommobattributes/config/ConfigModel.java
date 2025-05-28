package net.fneifnox.custommobattributes.config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RestartRequired;
import io.wispforest.owo.config.annotation.SectionHeader;

@Modmenu(modId = "custom-mob-attributes")
@Config(name = "custom-mob-attributes", wrapperName = "CustomMA")
public class ConfigModel {
    @RestartRequired
    @SectionHeader("All Mobs")
    @Comment("All Mobs")
    public float healthMultiplierForAll = 1f;
    @RestartRequired
    public float damageMultiplierForAll = 1f;
    @RestartRequired
    public float speedMultiplierForAll = 1f;
    @RestartRequired
    public float scaleMultiplierForAll = 1f;
    @RestartRequired
    @SectionHeader("Allay")
    @Comment("Allay")
    public float healthMultiplierForAllay = 1f;
    @RestartRequired
    public float damageMultiplierForAllay = 1f;
    @RestartRequired
    public float speedMultiplierForAllay = 1f;
    @RestartRequired
    public float scaleMultiplierForAllay = 1f;
    @RestartRequired
    @SectionHeader("Armadillo")
    @Comment("Armadillo")
    public float healthMultiplierForArmadillo = 1f;
    @RestartRequired
    public float speedMultiplierForArmadillo = 1f;
    @RestartRequired
    public float scaleMultiplierForArmadillo = 1f;
    @RestartRequired
    @SectionHeader("Axolotl")
    @Comment("Axolotl")
    public float healthMultiplierForAxolotl = 1f;
    @RestartRequired
    public float damageMultiplierForAxolotl = 1f;
    @RestartRequired
    public float speedMultiplierForAxolotl = 1f;
    @RestartRequired
    public float scaleMultiplierForAxolotl = 1f;
    @RestartRequired
    @SectionHeader("Bat")
    @Comment("Bat")
    public float healthMultiplierForBat = 1f;
    @RestartRequired
    public float scaleMultiplierForBat = 1f;
    @RestartRequired
    @SectionHeader("Bee")
    @Comment("Bee")
    public float healthMultiplierForBee = 1f;
    @RestartRequired
    public float damageMultiplierForBee = 1f;
    @RestartRequired
    public float scaleMultiplierForBee = 1f;
    @RestartRequired
    @SectionHeader("Blaze")
    @Comment("Blaze")
    public float healthMultiplierForBlaze = 1f;
    @RestartRequired
    public float damageMultiplierForBlaze = 1f;
    @RestartRequired
    public float speedMultiplierForBlaze = 1f;
    @RestartRequired
    public float scaleMultiplierForBlaze = 1f;
    @RestartRequired
    @SectionHeader("Bogged")
    @Comment("Bogged")
    public float healthMultiplierForBogged = 1f;
    @RestartRequired
    public float damageMultiplierForBogged = 1f;
    @RestartRequired
    public float speedMultiplierForBogged = 1f;
    @RestartRequired
    public float scaleMultiplierForBogged = 1f;
    @RestartRequired
    @SectionHeader("Breeze")
    @Comment("Breeze")
    public float healthMultiplierForBreeze = 1f;
    @RestartRequired
    public float damageMultiplierForBreeze = 1f;
    @RestartRequired
    public float speedMultiplierForBreeze = 1f;
    @RestartRequired
    public float scaleMultiplierForBreeze = 1f;
    @RestartRequired
    @SectionHeader("Camel")
    @Comment("Camel")
    public float healthMultiplierForCamel = 1f;
    @RestartRequired
    public float speedMultiplierForCamel = 1f;
    @RestartRequired
    public float scaleMultiplierForCamel = 1f;
    @RestartRequired
    @SectionHeader("Cat")
    @Comment("Cat")
    public float healthMultiplierForCat = 1f;
    @RestartRequired
    public float damageMultiplierForCat = 1f;
    @RestartRequired
    public float speedMultiplierForCat = 1f;
    @RestartRequired
    public float scaleMultiplierForCat = 1f;
    @RestartRequired
    @SectionHeader("Cave Spider")
    @Comment("Cave Spider")
    public float healthMultiplierForCaveSpider = 1f;
    @RestartRequired
    public float damageMultiplierForCaveSpider = 1f;
    @RestartRequired
    public float speedMultiplierForCaveSpider = 1f;
    @RestartRequired
    public float scaleMultiplierForCaveSpider = 1f;
    @RestartRequired
    @SectionHeader("Chicken")
    @Comment("Chicken")
    public float healthMultiplierForChicken = 1f;
    @RestartRequired
    public float speedMultiplierForChicken = 1f;
    @RestartRequired
    public float scaleMultiplierForChicken = 1f;
    @RestartRequired
    @SectionHeader("Cod")
    @Comment("Cod")
    public float healthMultiplierForCod = 1f;
    @RestartRequired
    public float speedMultiplierForCod = 1f;
    @RestartRequired
    public float scaleMultiplierForCod = 1f;
    @RestartRequired
    @SectionHeader("Cow")
    @Comment("Cow")
    public float healthMultiplierForCow = 1f;
    @RestartRequired
    public float speedMultiplierForCow = 1f;
    @RestartRequired
    public float scaleMultiplierForCow = 1f;
    @RestartRequired
    @SectionHeader("Creeper")
    @Comment("Creeper")
    public float healthMultiplierForCreeper = 1f;
    @RestartRequired
    public float damageMultiplierForCreeper = 1f;
    @RestartRequired
    public float speedMultiplierForCreeper = 1f;
    @RestartRequired
    public float scaleMultiplierForCreeper = 1f;
    @RestartRequired
    @SectionHeader("Dolphin")
    @Comment("Dolphin")
    public float healthMultiplierForDolphin = 1f;
    @RestartRequired
    public float damageMultiplierForDolphin = 1f;
    @RestartRequired
    public float speedMultiplierForDolphin = 1f;
    @RestartRequired
    public float scaleMultiplierForDolphin = 1f;
    @RestartRequired
    @SectionHeader("Donkey")
    @Comment("Donkey")
    public float healthMultiplierForDonkey = 1f;
    @RestartRequired
    public float speedMultiplierForDonkey = 1f;
    @RestartRequired
    public float scaleMultiplierForDonkey = 1f;
    @RestartRequired
    @SectionHeader("Drowned")
    @Comment("Drowned")
    public float healthMultiplierForDrowned = 1f;
    @RestartRequired
    public float damageMultiplierForDrowned = 1f;
    @RestartRequired
    public float speedMultiplierForDrowned = 1f;
    @RestartRequired
    public float scaleMultiplierForDrowned = 1f;
    @RestartRequired
    @SectionHeader("Elder Guardian")
    @Comment("Elder Guardian")
    public float healthMultiplierForElderGuardian = 1f;
    @RestartRequired
    public float damageMultiplierForElderGuardian = 1f;
    @RestartRequired
    public float speedMultiplierForElderGuardian = 1f;
    @RestartRequired
    public float scaleMultiplierForElderGuardian = 1f;
    @RestartRequired
    @SectionHeader("Ender Dragon")
    @Comment("Ender Dragon")
    public float healthMultiplierForEnderDragon = 1f;
    @RestartRequired
    public float speedMultiplierForEnderDragon = 1f;
    @RestartRequired
    public float scaleMultiplierForEnderDragon = 1f;
    @RestartRequired
    @SectionHeader("Enderman")
    @Comment("Enderman")
    public float healthMultiplierForEnderman = 1f;
    @RestartRequired
    public float damageMultiplierForEnderman = 1f;
    @RestartRequired
    public float speedMultiplierForEnderman = 1f;
    @RestartRequired
    public float scaleMultiplierForEnderman = 1f;
    @RestartRequired
    @SectionHeader("Endermite")
    @Comment("Endermite")
    public float healthMultiplierForEndermite = 1f;
    @RestartRequired
    public float damageMultiplierForEndermite = 1f;
    @RestartRequired
    public float speedMultiplierForEndermite = 1f;
    @RestartRequired
    public float scaleMultiplierForEndermite = 1f;
    @RestartRequired
    @SectionHeader("Evoker")
    @Comment("Evoker")
    public float healthMultiplierForEvoker = 1f;
    @RestartRequired
    public float damageMultiplierForEvoker = 1f;
    @RestartRequired
    public float speedMultiplierForEvoker = 1f;
    @RestartRequired
    public float scaleMultiplierForEvoker = 1f;
    @RestartRequired
    @SectionHeader("Fox")
    @Comment("Fox")
    public float healthMultiplierForFox = 1f;
    @RestartRequired
    public float damageMultiplierForFox = 1f;
    @RestartRequired
    public float speedMultiplierForFox = 1f;
    @RestartRequired
    public float scaleMultiplierForFox = 1f;
    @RestartRequired
    @SectionHeader("Frog")
    @Comment("Frog")
    public float healthMultiplierForFrog = 1f;
    @RestartRequired
    public float damageMultiplierForFrog = 1f;
    @RestartRequired
    public float speedMultiplierForFrog = 1f;
    @RestartRequired
    public float scaleMultiplierForFrog = 1f;
    @RestartRequired
    @SectionHeader("Ghast")
    @Comment("Ghast")
    public float healthMultiplierForGhast = 1f;
    @RestartRequired
    public float speedMultiplierForGhast = 1f;
    @RestartRequired
    public float scaleMultiplierForGhast = 1f;
    @RestartRequired
    @SectionHeader("Giant")
    @Comment("Giant")
    public float healthMultiplierForGiant = 1f;
    @RestartRequired
    public float damageMultiplierForGiant = 1f;
    @RestartRequired
    public float speedMultiplierForGiant = 1f;
    @RestartRequired
    public float scaleMultiplierForGiant = 1f;
    @RestartRequired
    @SectionHeader("Glow Squid")
    @Comment("Glow Squid")
    public float healthMultiplierForGlowSquid = 1f;
    @RestartRequired
    public float speedMultiplierForGlowSquid = 1f;
    @RestartRequired
    public float scaleMultiplierForGlowSquid = 1f;
    @RestartRequired
    @SectionHeader("Goat")
    @Comment("Goat")
    public float healthMultiplierForGoat = 1f;
    @RestartRequired
    public float damageMultiplierForGoat = 1f;
    @RestartRequired
    public float speedMultiplierForGoat = 1f;
    @RestartRequired
    public float scaleMultiplierForGoat = 1f;
    @RestartRequired
    @SectionHeader("Guardian")
    @Comment("Guardian")
    public float healthMultiplierForGuardian = 1f;
    @RestartRequired
    public float damageMultiplierForGuardian = 1f;
    @RestartRequired
    public float speedMultiplierForGuardian = 1f;
    @RestartRequired
    public float scaleMultiplierForGuardian = 1f;
    @RestartRequired
    @SectionHeader("Hoglin")
    @Comment("Hoglin")
    public float healthMultiplierForHoglin = 1f;
    @RestartRequired
    public float damageMultiplierForHoglin = 1f;
    @RestartRequired
    public float speedMultiplierForHoglin = 1f;
    @RestartRequired
    public float scaleMultiplierForHoglin = 1f;
    @RestartRequired
    @SectionHeader("Horse")
    @Comment("Horse")
    public float healthMultiplierForHorse = 1f;
    @RestartRequired
    public float speedMultiplierForHorse = 1f;
    @RestartRequired
    public float scaleMultiplierForHorse = 1f;
    @RestartRequired
    @SectionHeader("Husk")
    @Comment("Husk")
    public float healthMultiplierForHusk = 1f;
    @RestartRequired
    public float damageMultiplierForHusk = 1f;
    @RestartRequired
    public float speedMultiplierForHusk = 1f;
    @RestartRequired
    public float scaleMultiplierForHusk = 1f;
    @RestartRequired
    @SectionHeader("Illusioner")
    @Comment("Illusioner")
    public float healthMultiplierForIllusioner = 1f;
    @RestartRequired
    public float damageMultiplierForIllusioner = 1f;
    @RestartRequired
    public float speedMultiplierForIllusioner = 1f;
    @RestartRequired
    public float scaleMultiplierForIllusioner = 1f;
    @RestartRequired
    @SectionHeader("Iron Golem")
    @Comment("Iron Golem")
    public float healthMultiplierForIronGolem = 1f;
    @RestartRequired
    public float damageMultiplierForIronGolem = 1f;
    @RestartRequired
    public float speedMultiplierForIronGolem = 1f;
    @RestartRequired
    public float scaleMultiplierForIronGolem = 1f;
    @RestartRequired
    @SectionHeader("Llama")
    @Comment("Llama")
    public float healthMultiplierForLlama = 1f;
    @RestartRequired
    public float speedMultiplierForLlama = 1f;
    @RestartRequired
    public float scaleMultiplierForLlama = 1f;
    @RestartRequired
    @SectionHeader("Magma Cube")
    @Comment("Magma Cube")
    public float scaleMultiplierForMagmaCube = 1f;
    @RestartRequired
    @SectionHeader("Mooshroom")
    @Comment("Mooshroom")
    public float healthMultiplierForMooshroom = 1f;
    @RestartRequired
    public float speedMultiplierForMooshroom = 1f;
    @RestartRequired
    public float scaleMultiplierForMooshroom = 1f;
    @RestartRequired
    @SectionHeader("Mule")
    @Comment("Mule")
    public float healthMultiplierForMule = 1f;
    @RestartRequired
    public float speedMultiplierForMule = 1f;
    @RestartRequired
    public float scaleMultiplierForMule = 1f;
    @RestartRequired
    @SectionHeader("Ocelot")
    @Comment("Ocelot")
    public float healthMultiplierForOcelot = 1f;
    @RestartRequired
    public float damageMultiplierForOcelot = 1f;
    @RestartRequired
    public float speedMultiplierForOcelot = 1f;
    @RestartRequired
    public float scaleMultiplierForOcelot = 1f;
    @RestartRequired
    @SectionHeader("Panda")
    @Comment("Panda")
    public float healthMultiplierForPanda = 1f;
    @RestartRequired
    public float damageMultiplierForPanda = 1f;
    @RestartRequired
    public float speedMultiplierForPanda = 1f;
    @RestartRequired
    public float scaleMultiplierForPanda = 1f;
    @RestartRequired
    @SectionHeader("Parrot")
    @Comment("Parrot")
    public float healthMultiplierForParrot = 1f;
    @RestartRequired
    public float damageMultiplierForParrot = 1f;
    @RestartRequired
    public float speedMultiplierForParrot = 1f;
    @RestartRequired
    public float scaleMultiplierForParrot = 1f;
    @RestartRequired
    @SectionHeader("Phantom")
    @Comment("Phantom")
    public float healthMultiplierForPhantom = 1f;
    @RestartRequired
    public float damageMultiplierForPhantom = 1f;
    @RestartRequired
    public float speedMultiplierForPhantom = 1f;
    @RestartRequired
    public float scaleMultiplierForPhantom = 1f;
    @RestartRequired
    @SectionHeader("Pig")
    @Comment("Pig")
    public float healthMultiplierForPig = 1f;
    @RestartRequired
    public float speedMultiplierForPig = 1f;
    @RestartRequired
    public float scaleMultiplierForPig = 1f;
    @RestartRequired
    @SectionHeader("Piglin")
    @Comment("Piglin")
    public float healthMultiplierForPiglin = 1f;
    @RestartRequired
    public float damageMultiplierForPiglin = 1f;
    @RestartRequired
    public float speedMultiplierForPiglin = 1f;
    @RestartRequired
    public float scaleMultiplierForPiglin = 1f;
    @RestartRequired
    @SectionHeader("Piglin Brute")
    @Comment("Piglin Brute")
    public float healthMultiplierForPiglinBrute = 1f;
    @RestartRequired
    public float damageMultiplierForPiglinBrute = 1f;
    @RestartRequired
    public float speedMultiplierForPiglinBrute = 1f;
    @RestartRequired
    public float scaleMultiplierForPiglinBrute = 1f;
    @RestartRequired
    @SectionHeader("Pillager")
    @Comment("Pillager")
    public float healthMultiplierForPillager = 1f;
    @RestartRequired
    public float damageMultiplierForPillager = 1f;
    @RestartRequired
    public float speedMultiplierForPillager = 1f;
    @RestartRequired
    public float scaleMultiplierForPillager = 1f;
    @RestartRequired
    @SectionHeader("Polar Bear")
    @Comment("Polar Bear")
    public float healthMultiplierForPolarBear = 1f;
    @RestartRequired
    public float damageMultiplierForPolarBear = 1f;
    @RestartRequired
    public float speedMultiplierForPolarBear = 1f;
    @RestartRequired
    public float scaleMultiplierForPolarBear = 1f;
    @RestartRequired
    @SectionHeader("Pufferfish")
    @Comment("Pufferfish")
    public float healthMultiplierForPufferfish = 1f;
    @RestartRequired
    public float speedMultiplierForPufferfish = 1f;
    @RestartRequired
    public float scaleMultiplierForPufferfish = 1f;
    @RestartRequired
    @SectionHeader("Rabbit")
    @Comment("Rabbit")
    public float healthMultiplierForRabbit = 1f;
    @RestartRequired
    public float damageMultiplierForRabbit = 1f;
    @RestartRequired
    public float speedMultiplierForRabbit = 1f;
    @RestartRequired
    public float scaleMultiplierForRabbit = 1f;
    @RestartRequired
    @SectionHeader("Ravager")
    @Comment("Ravager")
    public float healthMultiplierForRavager = 1f;
    @RestartRequired
    public float damageMultiplierForRavager = 1f;
    @RestartRequired
    public float speedMultiplierForRavager = 1f;
    @RestartRequired
    public float scaleMultiplierForRavager = 1f;
    @RestartRequired
    @SectionHeader("Salmon")
    @Comment("Salmon")
    public float healthMultiplierForSalmon = 1f;
    @RestartRequired
    public float speedMultiplierForSalmon = 1f;
    @RestartRequired
    public float scaleMultiplierForSalmon = 1f;
    @RestartRequired
    @SectionHeader("Sheep")
    @Comment("Sheep")
    public float healthMultiplierForSheep = 1f;
    @RestartRequired
    public float speedMultiplierForSheep = 1f;
    @RestartRequired
    public float scaleMultiplierForSheep = 1f;
    @RestartRequired
    @SectionHeader("Shulker")
    @Comment("Shulker")
    public float healthMultiplierForShulker = 1f;
    @RestartRequired
    public float speedMultiplierForShulker = 1f;
    @RestartRequired
    public float scaleMultiplierForShulker = 1f;
    @RestartRequired
    @SectionHeader("Silverfish")
    @Comment("Silverfish")
    public float healthMultiplierForSilverfish = 1f;
    @RestartRequired
    public float damageMultiplierForSilverfish = 1f;
    @RestartRequired
    public float speedMultiplierForSilverfish = 1f;
    @RestartRequired
    public float scaleMultiplierForSilverfish = 1f;
    @RestartRequired
    @SectionHeader("Skeleton")
    @Comment("Skeleton")
    public float healthMultiplierForSkeleton = 1f;
    @RestartRequired
    public float damageMultiplierForSkeleton = 1f;
    @RestartRequired
    public float speedMultiplierForSkeleton = 1f;
    @RestartRequired
    public float scaleMultiplierForSkeleton = 1f;
    @RestartRequired
    @SectionHeader("Skeleton Horse")
    @Comment("Skeleton Horse")
    public float healthMultiplierForSkeletonHorse = 1f;
    @RestartRequired
    public float speedMultiplierForSkeletonHorse = 1f;
    @RestartRequired
    public float scaleMultiplierForSkeletonHorse = 1f;
    @RestartRequired
    @SectionHeader("Slime")
    @Comment("Slime")
    public float scaleMultiplierForSlime = 1f;
    @RestartRequired
    @SectionHeader("Sniffer")
    @Comment("Sniffer")
    public float healthMultiplierForSniffer = 1f;
    @RestartRequired
    public float speedMultiplierForSniffer = 1f;
    @RestartRequired
    public float scaleMultiplierForSniffer = 1f;
    @RestartRequired
    @SectionHeader("Snow Golem")
    @Comment("Snow Golem")
    public float healthMultiplierForSnowGolem = 1f;
    @RestartRequired
    public float speedMultiplierForSnowGolem = 1f;
    @RestartRequired
    public float scaleMultiplierForSnowGolem = 1f;
    @RestartRequired
    @SectionHeader("Spider")
    @Comment("Spider")
    public float healthMultiplierForSpider = 1f;
    @RestartRequired
    public float damageMultiplierForSpider = 1f;
    @RestartRequired
    public float speedMultiplierForSpider = 1f;
    @RestartRequired
    public float scaleMultiplierForSpider = 1f;
    @RestartRequired
    @SectionHeader("Squid")
    @Comment("Squid")
    public float healthMultiplierForSquid = 1f;
    @RestartRequired
    public float speedMultiplierForSquid = 1f;
    @RestartRequired
    public float scaleMultiplierForSquid = 1f;
    @RestartRequired
    @SectionHeader("Stray")
    @Comment("Stray")
    public float healthMultiplierForStray = 1f;
    @RestartRequired
    public float damageMultiplierForStray = 1f;
    @RestartRequired
    public float speedMultiplierForStray = 1f;
    @RestartRequired
    public float scaleMultiplierForStray = 1f;
    @RestartRequired
    @SectionHeader("Spider")
    @Comment("Strider")
    public float healthMultiplierForStrider = 1f;
    @RestartRequired
    public float speedMultiplierForStrider = 1f;
    @RestartRequired
    public float scaleMultiplierForStrider = 1f;
    @RestartRequired
    @SectionHeader("Tadpole")
    @Comment("Tadpole")
    public float healthMultiplierForTadpole = 1f;
    @RestartRequired
    public float speedMultiplierForTadpole = 1f;
    @RestartRequired
    public float scaleMultiplierForTadpole = 1f;
    @RestartRequired
    @SectionHeader("Trader Llama")
    @Comment("Trader Llama")
    public float healthMultiplierForTraderLlama = 1f;
    @RestartRequired
    public float speedMultiplierForTraderLlama = 1f;
    @RestartRequired
    public float scaleMultiplierForTraderLlama = 1f;
    @RestartRequired
    @SectionHeader("Tropical Fish")
    @Comment("Tropical Fish")
    public float healthMultiplierForTropicalFish = 1f;
    @RestartRequired
    public float speedMultiplierForTropicalFish = 1f;
    @RestartRequired
    public float scaleMultiplierForTropicalFish = 1f;
    @RestartRequired
    @SectionHeader("Turtle")
    @Comment("Turtle")
    public float healthMultiplierForTurtle = 1f;
    @RestartRequired
    public float speedMultiplierForTurtle = 1f;
    @RestartRequired
    public float scaleMultiplierForTurtle = 1f;
    @RestartRequired
    @SectionHeader("Vex")
    @Comment("Vex")
    public float healthMultiplierForVex = 1f;
    @RestartRequired
    public float damageMultiplierForVex = 1f;
    @RestartRequired
    public float speedMultiplierForVex = 1f;
    @RestartRequired
    public float scaleMultiplierForVex = 1f;
    @RestartRequired
    @SectionHeader("Villager")
    @Comment("Villager")
    public float healthMultiplierForVillager = 1f;
    @RestartRequired
    public float speedMultiplierForVillager = 1f;
    @RestartRequired
    public float scaleMultiplierForVillager = 1f;
    @RestartRequired
    @SectionHeader("Vindicator")
    @Comment("Vindicator")
    public float healthMultiplierForVindicator = 1f;
    @RestartRequired
    public float damageMultiplierForVindicator = 1f;
    @RestartRequired
    public float speedMultiplierForVindicator = 1f;
    @RestartRequired
    public float scaleMultiplierForVindicator = 1f;
    @RestartRequired
    @SectionHeader("Wandering Trader")
    @Comment("Wandering Trader")
    public float healthMultiplierForWanderingTrader = 1f;
    @RestartRequired
    public float speedMultiplierForWanderingTrader = 1f;
    @RestartRequired
    public float scaleMultiplierForWanderingTrader = 1f;
    @RestartRequired
    @SectionHeader("Warden")
    @Comment("Warden")
    public float healthMultiplierForWarden = 1f;
    @RestartRequired
    public float damageMultiplierForWarden = 1f;
    @RestartRequired
    public float speedMultiplierForWarden = 1f;
    @RestartRequired
    public float scaleMultiplierForWarden = 1f;
    @RestartRequired
    @SectionHeader("Witch")
    @Comment("Witch")
    public float healthMultiplierForWitch = 1f;
    @RestartRequired
    public float damageMultiplierForWitch = 1f;
    @RestartRequired
    public float speedMultiplierForWitch = 1f;
    @RestartRequired
    public float scaleMultiplierForWitch = 1f;
    @RestartRequired
    @SectionHeader("Wither")
    @Comment("Wither")
    public float healthMultiplierForWither = 1f;
    @RestartRequired
    public float damageMultiplierForWither = 1f;
    @RestartRequired
    public float speedMultiplierForWither = 1f;
    @RestartRequired
    public float scaleMultiplierForWither = 1f;
    @RestartRequired
    @SectionHeader("Wither Skeleton")
    @Comment("Wither Skeleton")
    public float healthMultiplierForWitherSkeleton = 1f;
    @RestartRequired
    public float damageMultiplierForWitherSkeleton = 1f;
    @RestartRequired
    public float speedMultiplierForWitherSkeleton = 1f;
    @RestartRequired
    public float scaleMultiplierForWitherSkeleton = 1f;
    @RestartRequired
    @SectionHeader("Wolf")
    @Comment("Wolf")
    public float healthMultiplierForWolf = 1f;
    @RestartRequired
    public float damageMultiplierForWolf = 1f;
    @RestartRequired
    public float speedMultiplierForWolf = 1f;
    @RestartRequired
    public float scaleMultiplierForWolf = 1f;
    @RestartRequired
    @SectionHeader("Zoglin")
    @Comment("Zoglin")
    public float healthMultiplierForZoglin = 1f;
    @RestartRequired
    public float damageMultiplierForZoglin = 1f;
    @RestartRequired
    public float speedMultiplierForZoglin = 1f;
    @RestartRequired
    public float scaleMultiplierForZoglin = 1f;
    @RestartRequired
    @SectionHeader("Zombie")
    @Comment("Zombie")
    public float healthMultiplierForZombie = 1f;
    @RestartRequired
    public float damageMultiplierForZombie = 1f;
    @RestartRequired
    public float speedMultiplierForZombie = 1f;
    @RestartRequired
    public float scaleMultiplierForZombie = 1f;
    @RestartRequired
    @SectionHeader("Zombie Horse")
    @Comment("Zombie Horse")
    public float healthMultiplierForZombieHorse= 1f;
    @RestartRequired
    public float speedMultiplierForZombieHorse = 1f;
    @RestartRequired
    public float scaleMultiplierForZombieHorse = 1f;
    @RestartRequired
    @SectionHeader("Zombie Villager")
    @Comment("Zombie Villager")
    public float healthMultiplierForZombieVillager = 1f;
    @RestartRequired
    public float damageMultiplierForZombieVillager = 1f;
    @RestartRequired
    public float speedMultiplierForZombieVillager = 1f;
    @RestartRequired
    public float scaleMultiplierForZombieVillager = 1f;
    @RestartRequired
    @SectionHeader("Zombified Piglin")
    @Comment("Zombified Piglin")
    public float healthMultiplierForZombifiedPiglin = 1f;
    @RestartRequired
    public float damageMultiplierForZombifiedPiglin = 1f;
    @RestartRequired
    public float speedMultiplierForZombifiedPiglin = 1f;
    @RestartRequired
    public float scaleMultiplierForZombifiedPiglin = 1f;
}
