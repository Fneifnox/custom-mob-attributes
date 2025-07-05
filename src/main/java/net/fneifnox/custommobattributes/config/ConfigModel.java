package net.fneifnox.custommobattributes.config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;

@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@Modmenu(modId = "custom-mob-attributes")
@Config(name = "custom-mob-attributes", wrapperName = "CustomMA")
public class ConfigModel {
    @SectionHeader("All Mobs")
    @Comment("All Mobs")
    public float healthMultiplierForAll = 1f;
    public float damageMultiplierForAll = 1f;
    public float speedMultiplierForAll = 1f;
    public float scaleMultiplierForAll = 1f;
    @SectionHeader("Allay")
    @Comment("Allay")
    public float healthMultiplierForAllay = 1f;
    public float damageMultiplierForAllay = 1f;
    public float speedMultiplierForAllay = 1f;
    public float scaleMultiplierForAllay = 1f;
    @SectionHeader("Armadillo")
    @Comment("Armadillo")
    public float healthMultiplierForArmadillo = 1f;
    public float speedMultiplierForArmadillo = 1f;
    public float scaleMultiplierForArmadillo = 1f;
    @SectionHeader("Axolotl")
    @Comment("Axolotl")
    public float healthMultiplierForAxolotl = 1f;
    public float damageMultiplierForAxolotl = 1f;
    public float speedMultiplierForAxolotl = 1f;
    public float scaleMultiplierForAxolotl = 1f;
    @SectionHeader("Bat")
    @Comment("Bat")
    public float healthMultiplierForBat = 1f;
    public float scaleMultiplierForBat = 1f;
    @SectionHeader("Bee")
    @Comment("Bee")
    public float healthMultiplierForBee = 1f;
    public float damageMultiplierForBee = 1f;
    public float scaleMultiplierForBee = 1f;
    @SectionHeader("Blaze")
    @Comment("Blaze")
    public float healthMultiplierForBlaze = 1f;
    public float damageMultiplierForBlaze = 1f;
    public float speedMultiplierForBlaze = 1f;
    public float scaleMultiplierForBlaze = 1f;
    @SectionHeader("Bogged")
    @Comment("Bogged")
    public float healthMultiplierForBogged = 1f;
    public float damageMultiplierForBogged = 1f;
    public float speedMultiplierForBogged = 1f;
    public float scaleMultiplierForBogged = 1f;
    @SectionHeader("Breeze")
    @Comment("Breeze")
    public float healthMultiplierForBreeze = 1f;
    public float damageMultiplierForBreeze = 1f;
    public float speedMultiplierForBreeze = 1f;
    public float scaleMultiplierForBreeze = 1f;
    @SectionHeader("Camel")
    @Comment("Camel")
    public float healthMultiplierForCamel = 1f;
    public float speedMultiplierForCamel = 1f;
    public float scaleMultiplierForCamel = 1f;
    @SectionHeader("Cat")
    @Comment("Cat")
    public float healthMultiplierForCat = 1f;
    public float damageMultiplierForCat = 1f;
    public float speedMultiplierForCat = 1f;
    public float scaleMultiplierForCat = 1f;
    @SectionHeader("Cave Spider")
    @Comment("Cave Spider")
    public float healthMultiplierForCaveSpider = 1f;
    public float damageMultiplierForCaveSpider = 1f;
    public float speedMultiplierForCaveSpider = 1f;
    public float scaleMultiplierForCaveSpider = 1f;
    @SectionHeader("Chicken")
    @Comment("Chicken")
    public float healthMultiplierForChicken = 1f;
    public float speedMultiplierForChicken = 1f;
    public float scaleMultiplierForChicken = 1f;
    @SectionHeader("Cod")
    @Comment("Cod")
    public float healthMultiplierForCod = 1f;
    public float speedMultiplierForCod = 1f;
    public float scaleMultiplierForCod = 1f;
    @SectionHeader("Cow")
    @Comment("Cow")
    public float healthMultiplierForCow = 1f;
    public float speedMultiplierForCow = 1f;
    public float scaleMultiplierForCow = 1f;
    @SectionHeader("Creeper")
    @Comment("Creeper")
    public float healthMultiplierForCreeper = 1f;
    public float damageMultiplierForCreeper = 1f;
    public float speedMultiplierForCreeper = 1f;
    public float scaleMultiplierForCreeper = 1f;
    @SectionHeader("Dolphin")
    @Comment("Dolphin")
    public float healthMultiplierForDolphin = 1f;
    public float damageMultiplierForDolphin = 1f;
    public float speedMultiplierForDolphin = 1f;
    public float scaleMultiplierForDolphin = 1f;
    @SectionHeader("Donkey")
    @Comment("Donkey")
    public float healthMultiplierForDonkey = 1f;
    public float speedMultiplierForDonkey = 1f;
    public float scaleMultiplierForDonkey = 1f;
    @SectionHeader("Drowned")
    @Comment("Drowned")
    public float healthMultiplierForDrowned = 1f;
    public float damageMultiplierForDrowned = 1f;
    public float speedMultiplierForDrowned = 1f;
    public float scaleMultiplierForDrowned = 1f;
    @SectionHeader("Elder Guardian")
    @Comment("Elder Guardian")
    public float healthMultiplierForElderGuardian = 1f;
    public float damageMultiplierForElderGuardian = 1f;
    public float speedMultiplierForElderGuardian = 1f;
    public float scaleMultiplierForElderGuardian = 1f;
    @SectionHeader("Ender Dragon")
    @Comment("Ender Dragon")
    public float healthMultiplierForEnderDragon = 1f;
    public float speedMultiplierForEnderDragon = 1f;
    public float scaleMultiplierForEnderDragon = 1f;
    @SectionHeader("Enderman")
    @Comment("Enderman")
    public float healthMultiplierForEnderman = 1f;
    public float damageMultiplierForEnderman = 1f;
    public float speedMultiplierForEnderman = 1f;
    public float scaleMultiplierForEnderman = 1f;
    @SectionHeader("Endermite")
    @Comment("Endermite")
    public float healthMultiplierForEndermite = 1f;
    public float damageMultiplierForEndermite = 1f;
    public float speedMultiplierForEndermite = 1f;
    public float scaleMultiplierForEndermite = 1f;
    @SectionHeader("Evoker")
    @Comment("Evoker")
    public float healthMultiplierForEvoker = 1f;
    public float damageMultiplierForEvoker = 1f;
    public float speedMultiplierForEvoker = 1f;
    public float scaleMultiplierForEvoker = 1f;
    @SectionHeader("Fox")
    @Comment("Fox")
    public float healthMultiplierForFox = 1f;
    public float damageMultiplierForFox = 1f;
    public float speedMultiplierForFox = 1f;
    public float scaleMultiplierForFox = 1f;
    @SectionHeader("Frog")
    @Comment("Frog")
    public float healthMultiplierForFrog = 1f;
    public float damageMultiplierForFrog = 1f;
    public float speedMultiplierForFrog = 1f;
    public float scaleMultiplierForFrog = 1f;
    @SectionHeader("Ghast")
    @Comment("Ghast")
    public float healthMultiplierForGhast = 1f;
    public float speedMultiplierForGhast = 1f;
    public float scaleMultiplierForGhast = 1f;
    @SectionHeader("Giant")
    @Comment("Giant")
    public float healthMultiplierForGiant = 1f;
    public float damageMultiplierForGiant = 1f;
    public float speedMultiplierForGiant = 1f;
    public float scaleMultiplierForGiant = 1f;
    @SectionHeader("Glow Squid")
    @Comment("Glow Squid")
    public float healthMultiplierForGlowSquid = 1f;
    public float speedMultiplierForGlowSquid = 1f;
    public float scaleMultiplierForGlowSquid = 1f;
    @SectionHeader("Goat")
    @Comment("Goat")
    public float healthMultiplierForGoat = 1f;
    public float damageMultiplierForGoat = 1f;
    public float speedMultiplierForGoat = 1f;
    public float scaleMultiplierForGoat = 1f;
    @SectionHeader("Guardian")
    @Comment("Guardian")
    public float healthMultiplierForGuardian = 1f;
    public float damageMultiplierForGuardian = 1f;
    public float speedMultiplierForGuardian = 1f;
    public float scaleMultiplierForGuardian = 1f;
    @SectionHeader("Hoglin")
    @Comment("Hoglin")
    public float healthMultiplierForHoglin = 1f;
    public float damageMultiplierForHoglin = 1f;
    public float speedMultiplierForHoglin = 1f;
    public float scaleMultiplierForHoglin = 1f;
    @SectionHeader("Horse")
    @Comment("Horse")
    public float healthMultiplierForHorse = 1f;
    public float speedMultiplierForHorse = 1f;
    public float scaleMultiplierForHorse = 1f;
    @SectionHeader("Husk")
    @Comment("Husk")
    public float healthMultiplierForHusk = 1f;
    public float damageMultiplierForHusk = 1f;
    public float speedMultiplierForHusk = 1f;
    public float scaleMultiplierForHusk = 1f;
    @SectionHeader("Illusioner")
    @Comment("Illusioner")
    public float healthMultiplierForIllusioner = 1f;
    public float damageMultiplierForIllusioner = 1f;
    public float speedMultiplierForIllusioner = 1f;
    public float scaleMultiplierForIllusioner = 1f;
    @SectionHeader("Iron Golem")
    @Comment("Iron Golem")
    public float healthMultiplierForIronGolem = 1f;
    public float damageMultiplierForIronGolem = 1f;
    public float speedMultiplierForIronGolem = 1f;
    public float scaleMultiplierForIronGolem = 1f;
    @SectionHeader("Llama")
    @Comment("Llama")
    public float healthMultiplierForLlama = 1f;
    public float speedMultiplierForLlama = 1f;
    public float scaleMultiplierForLlama = 1f;
    @SectionHeader("Magma Cube")
    @Comment("Magma Cube")
    public float healthMultiplierForMagmaCube = 1f;
    public float damageMultiplierForMagmaCube = 1f;
    public float speedMultiplierForMagmaCube = 1f;
    public float scaleMultiplierForMagmaCube = 1f;
    @SectionHeader("Mooshroom")
    @Comment("Mooshroom")
    public float healthMultiplierForMooshroom = 1f;
    public float speedMultiplierForMooshroom = 1f;
    public float scaleMultiplierForMooshroom = 1f;
    @SectionHeader("Mule")
    @Comment("Mule")
    public float healthMultiplierForMule = 1f;
    public float speedMultiplierForMule = 1f;
    public float scaleMultiplierForMule = 1f;
    @SectionHeader("Ocelot")
    @Comment("Ocelot")
    public float healthMultiplierForOcelot = 1f;
    public float damageMultiplierForOcelot = 1f;
    public float speedMultiplierForOcelot = 1f;
    public float scaleMultiplierForOcelot = 1f;
    @SectionHeader("Panda")
    @Comment("Panda")
    public float healthMultiplierForPanda = 1f;
    public float damageMultiplierForPanda = 1f;
    public float speedMultiplierForPanda = 1f;
    public float scaleMultiplierForPanda = 1f;
    @SectionHeader("Parrot")
    @Comment("Parrot")
    public float healthMultiplierForParrot = 1f;
    public float damageMultiplierForParrot = 1f;
    public float speedMultiplierForParrot = 1f;
    public float scaleMultiplierForParrot = 1f;
    @SectionHeader("Phantom")
    @Comment("Phantom")
    public float healthMultiplierForPhantom = 1f;
    public float damageMultiplierForPhantom = 1f;
    public float speedMultiplierForPhantom = 1f;
    public float scaleMultiplierForPhantom = 1f;
    @SectionHeader("Pig")
    @Comment("Pig")
    public float healthMultiplierForPig = 1f;
    public float speedMultiplierForPig = 1f;
    public float scaleMultiplierForPig = 1f;
    @SectionHeader("Piglin")
    @Comment("Piglin")
    public float healthMultiplierForPiglin = 1f;
    public float damageMultiplierForPiglin = 1f;
    public float speedMultiplierForPiglin = 1f;
    public float scaleMultiplierForPiglin = 1f;
    @SectionHeader("Piglin Brute")
    @Comment("Piglin Brute")
    public float healthMultiplierForPiglinBrute = 1f;
    public float damageMultiplierForPiglinBrute = 1f;
    public float speedMultiplierForPiglinBrute = 1f;
    public float scaleMultiplierForPiglinBrute = 1f;
    @SectionHeader("Pillager")
    @Comment("Pillager")
    public float healthMultiplierForPillager = 1f;
    public float damageMultiplierForPillager = 1f;
    public float speedMultiplierForPillager = 1f;
    public float scaleMultiplierForPillager = 1f;
    @SectionHeader("Polar Bear")
    @Comment("Polar Bear")
    public float healthMultiplierForPolarBear = 1f;
    public float damageMultiplierForPolarBear = 1f;
    public float speedMultiplierForPolarBear = 1f;
    public float scaleMultiplierForPolarBear = 1f;
    @SectionHeader("Pufferfish")
    @Comment("Pufferfish")
    public float healthMultiplierForPufferfish = 1f;
    public float speedMultiplierForPufferfish = 1f;
    public float scaleMultiplierForPufferfish = 1f;
    @SectionHeader("Rabbit")
    @Comment("Rabbit")
    public float healthMultiplierForRabbit = 1f;
    public float damageMultiplierForRabbit = 1f;
    public float speedMultiplierForRabbit = 1f;
    public float scaleMultiplierForRabbit = 1f;
    @SectionHeader("Ravager")
    @Comment("Ravager")
    public float healthMultiplierForRavager = 1f;
    public float damageMultiplierForRavager = 1f;
    public float speedMultiplierForRavager = 1f;
    public float scaleMultiplierForRavager = 1f;
    @SectionHeader("Salmon")
    @Comment("Salmon")
    public float healthMultiplierForSalmon = 1f;
    public float speedMultiplierForSalmon = 1f;
    public float scaleMultiplierForSalmon = 1f;
    @SectionHeader("Sheep")
    @Comment("Sheep")
    public float healthMultiplierForSheep = 1f;
    public float speedMultiplierForSheep = 1f;
    public float scaleMultiplierForSheep = 1f;
    @SectionHeader("Shulker")
    @Comment("Shulker")
    public float healthMultiplierForShulker = 1f;
    public float speedMultiplierForShulker = 1f;
    public float scaleMultiplierForShulker = 1f;
    @SectionHeader("Silverfish")
    @Comment("Silverfish")
    public float healthMultiplierForSilverfish = 1f;
    public float damageMultiplierForSilverfish = 1f;
    public float speedMultiplierForSilverfish = 1f;
    public float scaleMultiplierForSilverfish = 1f;
    @SectionHeader("Skeleton")
    @Comment("Skeleton")
    public float healthMultiplierForSkeleton = 1f;
    public float damageMultiplierForSkeleton = 1f;
    public float speedMultiplierForSkeleton = 1f;
    public float scaleMultiplierForSkeleton = 1f;
    @SectionHeader("Skeleton Horse")
    @Comment("Skeleton Horse")
    public float healthMultiplierForSkeletonHorse = 1f;
    public float speedMultiplierForSkeletonHorse = 1f;
    public float scaleMultiplierForSkeletonHorse = 1f;
    @SectionHeader("Slime")
    @Comment("Slime")
    public float healthMultiplierForSlime = 1f;
    public float damageMultiplierForSlime = 1f;
    public float speedMultiplierForSlime = 1f;
    public float scaleMultiplierForSlime = 1f;
    @SectionHeader("Sniffer")
    @Comment("Sniffer")
    public float healthMultiplierForSniffer = 1f;
    public float speedMultiplierForSniffer = 1f;
    public float scaleMultiplierForSniffer = 1f;
    @SectionHeader("Snow Golem")
    @Comment("Snow Golem")
    public float healthMultiplierForSnowGolem = 1f;
    public float speedMultiplierForSnowGolem = 1f;
    public float scaleMultiplierForSnowGolem = 1f;
    @SectionHeader("Spider")
    @Comment("Spider")
    public float healthMultiplierForSpider = 1f;
    public float damageMultiplierForSpider = 1f;
    public float speedMultiplierForSpider = 1f;
    public float scaleMultiplierForSpider = 1f;
    @SectionHeader("Squid")
    @Comment("Squid")
    public float healthMultiplierForSquid = 1f;
    public float speedMultiplierForSquid = 1f;
    public float scaleMultiplierForSquid = 1f;
    @SectionHeader("Stray")
    @Comment("Stray")
    public float healthMultiplierForStray = 1f;
    public float damageMultiplierForStray = 1f;
    public float speedMultiplierForStray = 1f;
    public float scaleMultiplierForStray = 1f;
    @SectionHeader("Spider")
    @Comment("Strider")
    public float healthMultiplierForStrider = 1f;
    public float speedMultiplierForStrider = 1f;
    public float scaleMultiplierForStrider = 1f;
    @SectionHeader("Tadpole")
    @Comment("Tadpole")
    public float healthMultiplierForTadpole = 1f;
    public float speedMultiplierForTadpole = 1f;
    public float scaleMultiplierForTadpole = 1f;
    @SectionHeader("Trader Llama")
    @Comment("Trader Llama")
    public float healthMultiplierForTraderLlama = 1f;
    public float speedMultiplierForTraderLlama = 1f;
    public float scaleMultiplierForTraderLlama = 1f;
    @SectionHeader("Tropical Fish")
    @Comment("Tropical Fish")
    public float healthMultiplierForTropicalFish = 1f;
    public float speedMultiplierForTropicalFish = 1f;
    public float scaleMultiplierForTropicalFish = 1f;
    @SectionHeader("Turtle")
    @Comment("Turtle")
    public float healthMultiplierForTurtle = 1f;
    public float speedMultiplierForTurtle = 1f;
    public float scaleMultiplierForTurtle = 1f;
    @SectionHeader("Vex")
    @Comment("Vex")
    public float healthMultiplierForVex = 1f;
    public float damageMultiplierForVex = 1f;
    public float speedMultiplierForVex = 1f;
    public float scaleMultiplierForVex = 1f;
    @SectionHeader("Villager")
    @Comment("Villager")
    public float healthMultiplierForVillager = 1f;
    public float speedMultiplierForVillager = 1f;
    public float scaleMultiplierForVillager = 1f;
    @SectionHeader("Vindicator")
    @Comment("Vindicator")
    public float healthMultiplierForVindicator = 1f;
    public float damageMultiplierForVindicator = 1f;
    public float speedMultiplierForVindicator = 1f;
    public float scaleMultiplierForVindicator = 1f;
    @SectionHeader("Wandering Trader")
    @Comment("Wandering Trader")
    public float healthMultiplierForWanderingTrader = 1f;
    public float speedMultiplierForWanderingTrader = 1f;
    public float scaleMultiplierForWanderingTrader = 1f;
    @SectionHeader("Warden")
    @Comment("Warden")
    public float healthMultiplierForWarden = 1f;
    public float damageMultiplierForWarden = 1f;
    public float speedMultiplierForWarden = 1f;
    public float scaleMultiplierForWarden = 1f;
    @SectionHeader("Witch")
    @Comment("Witch")
    public float healthMultiplierForWitch = 1f;
    public float damageMultiplierForWitch = 1f;
    public float speedMultiplierForWitch = 1f;
    public float scaleMultiplierForWitch = 1f;
    @SectionHeader("Wither")
    @Comment("Wither")
    public float healthMultiplierForWither = 1f;
    public float damageMultiplierForWither = 1f;
    public float speedMultiplierForWither = 1f;
    public float scaleMultiplierForWither = 1f;
    @SectionHeader("Wither Skeleton")
    @Comment("Wither Skeleton")
    public float healthMultiplierForWitherSkeleton = 1f;
    public float damageMultiplierForWitherSkeleton = 1f;
    public float speedMultiplierForWitherSkeleton = 1f;
    public float scaleMultiplierForWitherSkeleton = 1f;
    @SectionHeader("Wolf")
    @Comment("Wolf")
    public float healthMultiplierForWolf = 1f;
    public float damageMultiplierForWolf = 1f;
    public float speedMultiplierForWolf = 1f;
    public float scaleMultiplierForWolf = 1f;
    @SectionHeader("Zoglin")
    @Comment("Zoglin")
    public float healthMultiplierForZoglin = 1f;
    public float damageMultiplierForZoglin = 1f;
    public float speedMultiplierForZoglin = 1f;
    public float scaleMultiplierForZoglin = 1f;
    @SectionHeader("Zombie")
    @Comment("Zombie")
    public float healthMultiplierForZombie = 1f;
    public float damageMultiplierForZombie = 1f;
    public float speedMultiplierForZombie = 1f;
    public float scaleMultiplierForZombie = 1f;
    @SectionHeader("Zombie Horse")
    @Comment("Zombie Horse")
    public float healthMultiplierForZombieHorse= 1f;
    public float speedMultiplierForZombieHorse = 1f;
    public float scaleMultiplierForZombieHorse = 1f;
    @SectionHeader("Zombie Villager")
    @Comment("Zombie Villager")
    public float healthMultiplierForZombieVillager = 1f;
    public float damageMultiplierForZombieVillager = 1f;
    public float speedMultiplierForZombieVillager = 1f;
    public float scaleMultiplierForZombieVillager = 1f;
    @SectionHeader("Zombified Piglin")
    @Comment("Zombified Piglin")
    public float healthMultiplierForZombifiedPiglin = 1f;
    public float damageMultiplierForZombifiedPiglin = 1f;
    public float speedMultiplierForZombifiedPiglin = 1f;
    public float scaleMultiplierForZombifiedPiglin = 1f;
}
