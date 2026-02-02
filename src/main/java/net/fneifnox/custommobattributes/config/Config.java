package net.fneifnox.custommobattributes.config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;

@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@Modmenu(modId = "custom-mob-attributes")
@io.wispforest.owo.config.annotation.Config(name = "custom-mob-attributes", wrapperName = "CustomMA")
public class Config {
    @Comment("Whether babies should also be affected by the multipliers of their adult version")
    public boolean adultsAlsoAffectBabies = true;
    @SectionHeader("All Mobs")
    @Comment("All Mobs")
    public double healthMultiplierForAll = 1f;
    public double damageMultiplierForAll = 1f;
    public double speedMultiplierForAll = 1f;
    public double scaleMultiplierForAll = 1f;
    @SectionHeader("All Baby Mobs")
    @Comment("All Baby Mobs")
    public double healthMultiplierForBabyAll = 1f;
    public double damageMultiplierForBabyAll = 1f;
    public double speedMultiplierForBabyAll = 1f;
    public double scaleMultiplierForBabyAll = 1f;
    @SectionHeader("Allay")
    @Comment("Allay")
    public double healthMultiplierForAllay = 1f;
    public double speedMultiplierForAllay = 1f;
    public double scaleMultiplierForAllay = 1f;
    @SectionHeader("Armadillo")
    @Comment("Armadillo")
    public double healthMultiplierForArmadillo = 1f;
    public double speedMultiplierForArmadillo = 1f;
    public double scaleMultiplierForArmadillo = 1f;
    @Nest
    public BabyArmadillo babyArmadillo = new BabyArmadillo();
    public static class BabyArmadillo {
        public double healthMultiplierForBabyArmadillo = 1f;
        public double speedMultiplierForBabyArmadillo = 1f;
        public double scaleMultiplierForBabyArmadillo = 1f;
    }
    @SectionHeader("Axolotl")
    @Comment("Axolotl")
    public double healthMultiplierForAxolotl = 1f;
    public double damageMultiplierForAxolotl = 1f;
    public double speedMultiplierForAxolotl = 1f;
    public double scaleMultiplierForAxolotl = 1f;
    @Nest
    public BabyAxolotl babyAxolotl = new BabyAxolotl();
    public static class BabyAxolotl {
        public double healthMultiplierForBabyAxolotl = 1f;
        public double damageMultiplierForBabyAxolotl = 1f;
        public double speedMultiplierForBabyAxolotl = 1f;
        public double scaleMultiplierForBabyAxolotl = 1f;
    }
    @SectionHeader("Bat")
    @Comment("Bat")
    public double healthMultiplierForBat = 1f;
    public double speedMultiplierForBat = 1f;
    public double scaleMultiplierForBat = 1f;
    @SectionHeader("Bee")
    @Comment("Bee")
    public double healthMultiplierForBee = 1f;
    public double damageMultiplierForBee = 1f;
    public double speedMultiplierForBee = 1f;
    public double scaleMultiplierForBee = 1f;
    @Nest
    public BabyBee babyBee = new BabyBee();
    public static class BabyBee {
        public double healthMultiplierForBabyBee = 1f;
        public double damageMultiplierForBabyBee = 1f;
        public double speedMultiplierForBabyBee = 1f;
        public double scaleMultiplierForBabyBee = 1f;
    }
    @SectionHeader("Blaze")
    @Comment("Blaze")
    public double healthMultiplierForBlaze = 1f;
    public double damageMultiplierForBlaze = 1f;
    public double speedMultiplierForBlaze = 1f;
    public double scaleMultiplierForBlaze = 1f;
    @SectionHeader("Bogged")
    @Comment("Bogged")
    public double healthMultiplierForBogged = 1f;
    public double damageMultiplierForBogged = 1f;
    public double speedMultiplierForBogged = 1f;
    public double scaleMultiplierForBogged = 1f;
    @SectionHeader("Breeze")
    @Comment("Breeze")
    public double healthMultiplierForBreeze = 1f;
    public double damageMultiplierForBreeze = 1f;
    public double speedMultiplierForBreeze = 1f;
    public double scaleMultiplierForBreeze = 1f;
    @SectionHeader("Camel")
    @Comment("Camel")
    public double healthMultiplierForCamel = 1f;
    public double speedMultiplierForCamel = 1f;
    public double scaleMultiplierForCamel = 1f;
    @Nest
    public BabyCamel babyCamel = new BabyCamel();
    public static class BabyCamel {
        public double healthMultiplierForBabyCamel = 1f;
        public double speedMultiplierForBabyCamel = 1f;
        public double scaleMultiplierForBabyCamel = 1f;
    }
    @SectionHeader("Camel Husk")
    @Comment("Camel Husk")
    public double healthMultiplierForCamelHusk = 1f;
    public double speedMultiplierForCamelHusk = 1f;
    public double scaleMultiplierForCamelHusk = 1f;
    @Nest
    public BabyCamelHusk babyCamelHusk = new BabyCamelHusk();
    public static class BabyCamelHusk {
        public double healthMultiplierForBabyCamelHusk = 1f;
        public double speedMultiplierForBabyCamelHusk = 1f;
        public double scaleMultiplierForBabyCamelHusk = 1f;
    }
    @SectionHeader("Cat")
    @Comment("Cat")
    public double healthMultiplierForCat = 1f;
    public double damageMultiplierForCat = 1f;
    public double speedMultiplierForCat = 1f;
    public double scaleMultiplierForCat = 1f;
    @Nest
    public BabyCat babyCat = new BabyCat();
    public static class BabyCat {
        public double healthMultiplierForBabyCat = 1f;
        public double damageMultiplierForBabyCat = 1f;
        public double speedMultiplierForBabyCat = 1f;
        public double scaleMultiplierForBabyCat = 1f;
    }
    @SectionHeader("Cave Spider")
    @Comment("Cave Spider")
    public double healthMultiplierForCaveSpider = 1f;
    public double damageMultiplierForCaveSpider = 1f;
    public double speedMultiplierForCaveSpider = 1f;
    public double scaleMultiplierForCaveSpider = 1f;
    @SectionHeader("Chicken")
    @Comment("Chicken")
    public double healthMultiplierForChicken = 1f;
    public double speedMultiplierForChicken = 1f;
    public double scaleMultiplierForChicken = 1f;
    @Nest
    public BabyChicken babyChicken = new BabyChicken();
    public static class BabyChicken {
        public double healthMultiplierForBabyChicken = 1f;
        public double speedMultiplierForBabyChicken = 1f;
        public double scaleMultiplierForBabyChicken = 1f;
    }
    @SectionHeader("Cod")
    @Comment("Cod")
    public double healthMultiplierForCod = 1f;
    public double speedMultiplierForCod = 1f;
    public double scaleMultiplierForCod = 1f;
    @SectionHeader("Copper Golem")
    @Comment("Copper Golem")
    public double healthMultiplierForCopperGolem = 1f;
    public double speedMultiplierForCopperGolem = 1f;
    public double scaleMultiplierForCopperGolem = 1f;
    @SectionHeader("Cow")
    @Comment("Cow")
    public double healthMultiplierForCow = 1f;
    public double speedMultiplierForCow = 1f;
    public double scaleMultiplierForCow = 1f;
    @Nest
    public BabyCow babyCow = new BabyCow();
    public static class BabyCow {
        public double healthMultiplierForBabyCow = 1f;
        public double speedMultiplierForBabyCow = 1f;
        public double scaleMultiplierForBabyCow = 1f;
    }
    @SectionHeader("Creaking")
    @Comment("Creaking")
    public double healthMultiplierForCreaking = 1f;
    public double damageMultiplierForCreaking = 1f;
    public double speedMultiplierForCreaking = 1f;
    public double scaleMultiplierForCreaking = 1f;
    @SectionHeader("Creeper")
    @Comment("Creeper")
    public double healthMultiplierForCreeper = 1f;
    public double damageMultiplierForCreeper = 1f;
    public double speedMultiplierForCreeper = 1f;
    public double scaleMultiplierForCreeper = 1f;
    @SectionHeader("Dolphin")
    @Comment("Dolphin")
    public double healthMultiplierForDolphin = 1f;
    public double damageMultiplierForDolphin = 1f;
    public double speedMultiplierForDolphin = 1f;
    public double scaleMultiplierForDolphin = 1f;
    @Nest
    public BabyDolphin babyDolphin = new BabyDolphin();
    public static class BabyDolphin {
        public double healthMultiplierForBabyDolphin = 1f;
        public double damageMultiplierForBabyDolphin = 1f;
        public double speedMultiplierForBabyDolphin = 1f;
        public double scaleMultiplierForBabyDolphin = 1f;
    }
    @SectionHeader("Donkey")
    @Comment("Donkey")
    public double healthMultiplierForDonkey = 1f;
    public double speedMultiplierForDonkey = 1f;
    public double scaleMultiplierForDonkey = 1f;
    @Nest
    public BabyDonkey babyDonkey = new BabyDonkey();
    public static class BabyDonkey {
        public double healthMultiplierForBabyDonkey = 1f;
        public double speedMultiplierForBabyDonkey = 1f;
        public double scaleMultiplierForBabyDonkey = 1f;
    }
    @SectionHeader("Drowned")
    @Comment("Drowned")
    public double healthMultiplierForDrowned = 1f;
    public double damageMultiplierForDrowned = 1f;
    public double speedMultiplierForDrowned = 1f;
    public double scaleMultiplierForDrowned = 1f;
    @Nest
    public BabyDrowned babyDrowned = new BabyDrowned();
    public static class BabyDrowned {
        public double healthMultiplierForBabyDrowned = 1f;
        public double damageMultiplierForBabyDrowned = 1f;
        public double speedMultiplierForBabyDrowned = 1f;
        public double scaleMultiplierForBabyDrowned = 1f;
    }
    @SectionHeader("Elder Guardian")
    @Comment("Elder Guardian")
    public double healthMultiplierForElderGuardian = 1f;
    public double damageMultiplierForElderGuardian = 1f;
    public double speedMultiplierForElderGuardian = 1f;
    public double scaleMultiplierForElderGuardian = 1f;
    @SectionHeader("Ender Dragon")
    @Comment("Ender Dragon")
    public double healthMultiplierForEnderDragon = 1f;
    public double damageMultiplierForEnderDragon = 1f;
    @SectionHeader("Enderman")
    @Comment("Enderman")
    public double healthMultiplierForEnderman = 1f;
    public double damageMultiplierForEnderman = 1f;
    public double speedMultiplierForEnderman = 1f;
    public double scaleMultiplierForEnderman = 1f;
    @SectionHeader("Endermite")
    @Comment("Endermite")
    public double healthMultiplierForEndermite = 1f;
    public double damageMultiplierForEndermite = 1f;
    public double speedMultiplierForEndermite = 1f;
    public double scaleMultiplierForEndermite = 1f;
    @SectionHeader("Evoker")
    @Comment("Evoker")
    public double healthMultiplierForEvoker = 1f;
    public double damageMultiplierForEvoker = 1f;
    public double speedMultiplierForEvoker = 1f;
    public double scaleMultiplierForEvoker = 1f;
    @SectionHeader("Fox")
    @Comment("Fox")
    public double healthMultiplierForFox = 1f;
    public double damageMultiplierForFox = 1f;
    public double speedMultiplierForFox = 1f;
    public double scaleMultiplierForFox = 1f;
    @Nest
    public BabyFox babyFox = new BabyFox();
    public static class BabyFox {
        public double healthMultiplierForBabyFox = 1f;
        public double damageMultiplierForBabyFox = 1f;
        public double speedMultiplierForBabyFox = 1f;
        public double scaleMultiplierForBabyFox = 1f;
    }
    @SectionHeader("Frog")
    @Comment("Frog")
    public double healthMultiplierForFrog = 1f;
    public double damageMultiplierForFrog = 1f;
    public double speedMultiplierForFrog = 1f;
    public double scaleMultiplierForFrog = 1f;
    @SectionHeader("Ghast")
    @Comment("Ghast")
    public double healthMultiplierForGhast = 1f;
    public double damageMultiplierForGhast = 1f;
    public double speedMultiplierForGhast = 1f;
    public double scaleMultiplierForGhast = 1f;
    @SectionHeader("Giant")
    @Comment("Giant")
    public double healthMultiplierForGiant = 1f;
    public double damageMultiplierForGiant = 1f;
    public double speedMultiplierForGiant = 1f;
    public double scaleMultiplierForGiant = 1f;
    @SectionHeader("Glow Squid")
    @Comment("Glow Squid")
    public double healthMultiplierForGlowSquid = 1f;
    public double speedMultiplierForGlowSquid = 1f;
    public double scaleMultiplierForGlowSquid = 1f;
    @Nest
    public BabyGlowSquid babyGlowSquid = new BabyGlowSquid();
    public static class BabyGlowSquid {
        public double healthMultiplierForBabyGlowSquid = 1f;
        public double speedMultiplierForBabyGlowSquid = 1f;
        public double scaleMultiplierForBabyGlowSquid = 1f;
    }
    @SectionHeader("Goat")
    @Comment("Goat")
    public double healthMultiplierForGoat = 1f;
    public double damageMultiplierForGoat = 1f;
    public double speedMultiplierForGoat = 1f;
    public double scaleMultiplierForGoat = 1f;
    @Nest
    public BabyGoat babyGoat = new BabyGoat();
    public static class BabyGoat {
        public double healthMultiplierForBabyGoat = 1f;
        public double damageMultiplierForBabyGoat = 1f;
        public double speedMultiplierForBabyGoat = 1f;
        public double scaleMultiplierForBabyGoat = 1f;
    }
    @SectionHeader("Guardian")
    @Comment("Guardian")
    public double healthMultiplierForGuardian = 1f;
    public double damageMultiplierForGuardian = 1f;
    public double speedMultiplierForGuardian = 1f;
    public double scaleMultiplierForGuardian = 1f;
    @SectionHeader("Happy Ghast")
    @Comment("Happy Ghast")
    public double healthMultiplierForHappyGhast = 1f;
    public double speedMultiplierForHappyGhast = 1f;
    public double scaleMultiplierForHappyGhast = 1f;
    @Nest
    public BabyHappyGhast babyHappyGhast = new BabyHappyGhast();
    public static class BabyHappyGhast {
        public double healthMultiplierForBabyHappyGhast = 1f;
        public double speedMultiplierForBabyHappyGhast = 1f;
        public double scaleMultiplierForBabyHappyGhast = 1f;
    }
    @SectionHeader("Hoglin")
    @Comment("Hoglin")
    public double healthMultiplierForHoglin = 1f;
    public double damageMultiplierForHoglin = 1f;
    public double speedMultiplierForHoglin = 1f;
    public double scaleMultiplierForHoglin = 1f;
    @Nest
    public BabyHoglin babyHoglin = new BabyHoglin();
    public static class BabyHoglin {
        public double healthMultiplierForBabyHoglin = 1f;
        public double damageMultiplierForBabyHoglin = 1f;
        public double speedMultiplierForBabyHoglin = 1f;
        public double scaleMultiplierForBabyHoglin = 1f;
    }
    @SectionHeader("Horse")
    @Comment("Horse")
    public double healthMultiplierForHorse = 1f;
    public double speedMultiplierForHorse = 1f;
    public double scaleMultiplierForHorse = 1f;
    @Nest
    public BabyHorse babyHorse = new BabyHorse();
    public static class BabyHorse {
        public double healthMultiplierForBabyHorse = 1f;
        public double speedMultiplierForBabyHorse = 1f;
        public double scaleMultiplierForBabyHorse = 1f;
    }
    @SectionHeader("Husk")
    @Comment("Husk")
    public double healthMultiplierForHusk = 1f;
    public double damageMultiplierForHusk = 1f;
    public double speedMultiplierForHusk = 1f;
    public double scaleMultiplierForHusk = 1f;
    @Nest
    public BabyHusk babyHusk = new BabyHusk();
    public static class BabyHusk {
        public double healthMultiplierForBabyHusk = 1f;
        public double damageMultiplierForBabyHusk = 1f;
        public double speedMultiplierForBabyHusk = 1f;
        public double scaleMultiplierForBabyHusk = 1f;
    }
    @SectionHeader("Illusioner")
    @Comment("Illusioner")
    public double healthMultiplierForIllusioner = 1f;
    public double damageMultiplierForIllusioner = 1f;
    public double speedMultiplierForIllusioner = 1f;
    public double scaleMultiplierForIllusioner = 1f;
    @SectionHeader("Iron Golem")
    @Comment("Iron Golem")
    public double healthMultiplierForIronGolem = 1f;
    public double damageMultiplierForIronGolem = 1f;
    public double speedMultiplierForIronGolem = 1f;
    public double scaleMultiplierForIronGolem = 1f;
    @SectionHeader("Llama")
    @Comment("Llama")
    public double healthMultiplierForLlama = 1f;
    public double damageMultiplierForLlama = 1f;
    public double speedMultiplierForLlama = 1f;
    public double scaleMultiplierForLlama = 1f;
    @Nest
    public BabyLlama babyLlama = new BabyLlama();
    public static class BabyLlama {
        public double healthMultiplierForBabyLlama = 1f;
        public double damageMultiplierForBabyLlama = 1f;
        public double speedMultiplierForBabyLlama = 1f;
        public double scaleMultiplierForBabyLlama = 1f;
    }
    @SectionHeader("Magma Cube")
    @Comment("Magma Cube")
    public double healthMultiplierForMagmaCube = 1f;
    public double damageMultiplierForMagmaCube = 1f;
    public double speedMultiplierForMagmaCube = 1f;
    public double scaleMultiplierForMagmaCube = 1f;
    @SectionHeader("Mooshroom")
    @Comment("Mooshroom")
    public double healthMultiplierForMooshroom = 1f;
    public double speedMultiplierForMooshroom = 1f;
    public double scaleMultiplierForMooshroom = 1f;
    @Nest
    public BabyMooshroom babyMooshroom = new BabyMooshroom();
    public static class BabyMooshroom {
        public double healthMultiplierForBabyMooshroom = 1f;
        public double speedMultiplierForBabyMooshroom = 1f;
        public double scaleMultiplierForBabyMooshroom = 1f;
    }
    @SectionHeader("Mule")
    @Comment("Mule")
    public double healthMultiplierForMule = 1f;
    public double speedMultiplierForMule = 1f;
    public double scaleMultiplierForMule = 1f;
    @Nest
    public BabyMule babyMule = new BabyMule();
    public static class BabyMule {
        public double healthMultiplierForBabyMule = 1f;
        public double speedMultiplierForBabyMule = 1f;
        public double scaleMultiplierForBabyMule = 1f;
    }
    @SectionHeader("Nautilus")
    @Comment("Nautilus")
    public double healthMultiplierForNautilus = 1f;
    public double speedMultiplierForNautilus = 1f;
    public double scaleMultiplierForNautilus = 1f;
    @Nest
    public BabyNautilus babyNautilus = new BabyNautilus();
    public static class BabyNautilus {
        public double healthMultiplierForBabyNautilus = 1f;
        public double speedMultiplierForBabyNautilus = 1f;
        public double scaleMultiplierForBabyNautilus = 1f;
    }
    @SectionHeader("Ocelot")
    @Comment("Ocelot")
    public double healthMultiplierForOcelot = 1f;
    public double damageMultiplierForOcelot = 1f;
    public double speedMultiplierForOcelot = 1f;
    public double scaleMultiplierForOcelot = 1f;
    @Nest
    public BabyOcelot babyOcelot = new BabyOcelot();
    public static class BabyOcelot {
        public double healthMultiplierForBabyOcelot = 1f;
        public double damageMultiplierForBabyOcelot = 1f;
        public double speedMultiplierForBabyOcelot = 1f;
        public double scaleMultiplierForBabyOcelot = 1f;
    }
    @SectionHeader("Panda")
    @Comment("Panda")
    public double healthMultiplierForPanda = 1f;
    public double damageMultiplierForPanda = 1f;
    public double speedMultiplierForPanda = 1f;
    public double scaleMultiplierForPanda = 1f;
    @Nest
    public BabyPanda babyPanda = new BabyPanda();
    public static class BabyPanda {
        public double healthMultiplierForBabyPanda = 1f;
        public double damageMultiplierForBabyPanda = 1f;
        public double speedMultiplierForBabyPanda = 1f;
        public double scaleMultiplierForBabyPanda = 1f;
    }
    @SectionHeader("Parched")
    @Comment("Parched")
    public double healthMultiplierForParched = 1f;
    public double damageMultiplierForParched = 1f;
    public double speedMultiplierForParched = 1f;
    public double scaleMultiplierForParched = 1f;
    @SectionHeader("Parrot")
    @Comment("Parrot")
    public double healthMultiplierForParrot = 1f;
    public double speedMultiplierForParrot = 1f;
    public double scaleMultiplierForParrot = 1f;
    @SectionHeader("Phantom")
    @Comment("Phantom")
    public double healthMultiplierForPhantom = 1f;
    public double damageMultiplierForPhantom = 1f;
    public double scaleMultiplierForPhantom = 1f;
    @SectionHeader("Pig")
    @Comment("Pig")
    public double healthMultiplierForPig = 1f;
    public double speedMultiplierForPig = 1f;
    public double scaleMultiplierForPig = 1f;
    @Nest
    public BabyPig babyPig = new BabyPig();
    public static class BabyPig {
        public double healthMultiplierForBabyPig = 1f;
        public double speedMultiplierForBabyPig = 1f;
        public double scaleMultiplierForBabyPig = 1f;
    }
    @SectionHeader("Piglin")
    @Comment("Piglin")
    public double healthMultiplierForPiglin = 1f;
    public double damageMultiplierForPiglin = 1f;
    public double speedMultiplierForPiglin = 1f;
    public double scaleMultiplierForPiglin = 1f;
    @Nest
    public BabyPiglin babyPiglin = new BabyPiglin();
    public static class BabyPiglin {
        public double healthMultiplierForBabyPiglin = 1f;
        public double speedMultiplierForBabyPiglin = 1f;
        public double scaleMultiplierForBabyPiglin = 1f;
    }
    @SectionHeader("Piglin Brute")
    @Comment("Piglin Brute")
    public double healthMultiplierForPiglinBrute = 1f;
    public double damageMultiplierForPiglinBrute = 1f;
    public double speedMultiplierForPiglinBrute = 1f;
    public double scaleMultiplierForPiglinBrute = 1f;
    @SectionHeader("Pillager")
    @Comment("Pillager")
    public double healthMultiplierForPillager = 1f;
    public double damageMultiplierForPillager = 1f;
    public double speedMultiplierForPillager = 1f;
    public double scaleMultiplierForPillager = 1f;
    @SectionHeader("Polar Bear")
    @Comment("Polar Bear")
    public double healthMultiplierForPolarBear = 1f;
    public double damageMultiplierForPolarBear = 1f;
    public double speedMultiplierForPolarBear = 1f;
    public double scaleMultiplierForPolarBear = 1f;
    @Nest
    public BabyPolarBear babyPolarBear = new BabyPolarBear();
    public static class BabyPolarBear {
        public double healthMultiplierForBabyPolarBear = 1f;
        public double speedMultiplierForBabyPolarBear = 1f;
        public double scaleMultiplierForBabyPolarBear = 1f;
    }
    @SectionHeader("Pufferfish")
    @Comment("Pufferfish")
    public double healthMultiplierForPufferfish = 1f;
    public double speedMultiplierForPufferfish = 1f;
    public double scaleMultiplierForPufferfish = 1f;
    @SectionHeader("Rabbit")
    @Comment("Rabbit")
    public double healthMultiplierForRabbit = 1f;
    public double damageMultiplierForRabbit = 1f;
    public double speedMultiplierForRabbit = 1f;
    public double scaleMultiplierForRabbit = 1f;
    @Nest
    public BabyRabbit babyRabbit = new BabyRabbit();
    public static class BabyRabbit {
        public double healthMultiplierForBabyRabbit = 1f;
        public double damageMultiplierForBabyRabbit = 1f;
        public double speedMultiplierForBabyRabbit = 1f;
        public double scaleMultiplierForBabyRabbit = 1f;
    }
    @SectionHeader("Ravager")
    @Comment("Ravager")
    public double healthMultiplierForRavager = 1f;
    public double damageMultiplierForRavager = 1f;
    public double speedMultiplierForRavager = 1f;
    public double scaleMultiplierForRavager = 1f;
    @SectionHeader("Salmon")
    @Comment("Salmon")
    public double healthMultiplierForSalmon = 1f;
    public double speedMultiplierForSalmon = 1f;
    public double scaleMultiplierForSalmon = 1f;
    @SectionHeader("Sheep")
    @Comment("Sheep")
    public double healthMultiplierForSheep = 1f;
    public double speedMultiplierForSheep = 1f;
    public double scaleMultiplierForSheep = 1f;
    @Nest
    public BabySheep babySheep = new BabySheep();
    public static class BabySheep {
        public double healthMultiplierForBabySheep = 1f;
        public double speedMultiplierForBabySheep = 1f;
        public double scaleMultiplierForBabySheep = 1f;
    }
    @SectionHeader("Shulker")
    @Comment("Shulker")
    public double healthMultiplierForShulker = 1f;
    public double damageMultiplierForShulker = 1f;
    public double scaleMultiplierForShulker = 1f;
    @SectionHeader("Silverfish")
    @Comment("Silverfish")
    public double healthMultiplierForSilverfish = 1f;
    public double damageMultiplierForSilverfish = 1f;
    public double speedMultiplierForSilverfish = 1f;
    public double scaleMultiplierForSilverfish = 1f;
    @SectionHeader("Skeleton")
    @Comment("Skeleton")
    public double healthMultiplierForSkeleton = 1f;
    public double damageMultiplierForSkeleton = 1f;
    public double speedMultiplierForSkeleton = 1f;
    public double scaleMultiplierForSkeleton = 1f;
    @SectionHeader("Skeleton Horse")
    @Comment("Skeleton Horse")
    public double healthMultiplierForSkeletonHorse = 1f;
    public double speedMultiplierForSkeletonHorse = 1f;
    public double scaleMultiplierForSkeletonHorse = 1f;
    @Nest
    public BabySkeletonHorse babySkeletonHorse = new BabySkeletonHorse();
    public static class BabySkeletonHorse {
        public double healthMultiplierForBabySkeletonHorse = 1f;
        public double speedMultiplierForBabySkeletonHorse = 1f;
        public double scaleMultiplierForBabySkeletonHorse = 1f;
    }
    @SectionHeader("Slime")
    @Comment("Slime")
    public double healthMultiplierForSlime = 1f;
    public double damageMultiplierForSlime = 1f;
    public double speedMultiplierForSlime = 1f;
    public double scaleMultiplierForSlime = 1f;
    @SectionHeader("Sniffer")
    @Comment("Sniffer")
    public double healthMultiplierForSniffer = 1f;
    public double speedMultiplierForSniffer = 1f;
    public double scaleMultiplierForSniffer = 1f;
    @Nest
    public BabySniffer babySniffer = new BabySniffer();
    public static class BabySniffer {
        public double healthMultiplierForBabySniffer = 1f;
        public double speedMultiplierForBabySniffer = 1f;
        public double scaleMultiplierForBabySniffer = 1f;
    }
    @SectionHeader("Snow Golem")
    @Comment("Snow Golem")
    public double healthMultiplierForSnowGolem = 1f;
    public double damageMultiplierForSnowGolem = 1f;
    public double speedMultiplierForSnowGolem = 1f;
    public double scaleMultiplierForSnowGolem = 1f;
    @SectionHeader("Spider")
    @Comment("Spider")
    public double healthMultiplierForSpider = 1f;
    public double damageMultiplierForSpider = 1f;
    public double speedMultiplierForSpider = 1f;
    public double scaleMultiplierForSpider = 1f;
    @SectionHeader("Squid")
    @Comment("Squid")
    public double healthMultiplierForSquid = 1f;
    public double speedMultiplierForSquid = 1f;
    public double scaleMultiplierForSquid = 1f;
    @Nest
    public BabySquid babySquid = new BabySquid();
    public static class BabySquid {
        public double healthMultiplierForBabySquid = 1f;
        public double speedMultiplierForBabySquid = 1f;
        public double scaleMultiplierForBabySquid = 1f;
    }
    @SectionHeader("Stray")
    @Comment("Stray")
    public double healthMultiplierForStray = 1f;
    public double damageMultiplierForStray = 1f;
    public double speedMultiplierForStray = 1f;
    public double scaleMultiplierForStray = 1f;
    @SectionHeader("Strider")
    @Comment("Strider")
    public double healthMultiplierForStrider = 1f;
    public double speedMultiplierForStrider = 1f;
    public double scaleMultiplierForStrider = 1f;
    @Nest
    public BabyStrider babyStrider = new BabyStrider();
    public static class BabyStrider {
        public double healthMultiplierForBabyStrider = 1f;
        public double speedMultiplierForBabyStrider = 1f;
        public double scaleMultiplierForBabyStrider = 1f;
    }
    @SectionHeader("Tadpole")
    @Comment("Tadpole")
    public double healthMultiplierForTadpole = 1f;
    public double speedMultiplierForTadpole = 1f;
    public double scaleMultiplierForTadpole = 1f;
    @SectionHeader("Trader Llama")
    @Comment("Trader Llama")
    public double healthMultiplierForTraderLlama = 1f;
    public double damageMultiplierForTraderLlama = 1f;
    public double speedMultiplierForTraderLlama = 1f;
    public double scaleMultiplierForTraderLlama = 1f;
    @Nest
    public BabyTraderLlama babyTraderLlama = new BabyTraderLlama();
    public static class BabyTraderLlama {
        public double healthMultiplierForBabyTraderLlama = 1f;
        public double damageMultiplierForBabyTraderLlama = 1f;
        public double speedMultiplierForBabyTraderLlama = 1f;
        public double scaleMultiplierForBabyTraderLlama = 1f;
    }
    @SectionHeader("Tropical Fish")
    @Comment("Tropical Fish")
    public double healthMultiplierForTropicalFish = 1f;
    public double speedMultiplierForTropicalFish = 1f;
    public double scaleMultiplierForTropicalFish = 1f;
    @SectionHeader("Turtle")
    @Comment("Turtle")
    public double healthMultiplierForTurtle = 1f;
    public double speedMultiplierForTurtle = 1f;
    public double scaleMultiplierForTurtle = 1f;
    @Nest
    public BabyTurtle babyTurtle = new BabyTurtle();
    public static class BabyTurtle {
        public double healthMultiplierForBabyTurtle = 1f;
        public double speedMultiplierForBabyTurtle = 1f;
        public double scaleMultiplierForBabyTurtle = 1f;
    }
    @SectionHeader("Vex")
    @Comment("Vex")
    public double healthMultiplierForVex = 1f;
    public double damageMultiplierForVex = 1f;
    public double speedMultiplierForVex = 1f;
    public double scaleMultiplierForVex = 1f;
    @SectionHeader("Villager")
    @Comment("Villager")
    public double healthMultiplierForVillager = 1f;
    public double speedMultiplierForVillager = 1f;
    public double scaleMultiplierForVillager = 1f;
    @Nest
    public BabyVillager babyVillager = new BabyVillager();
    public static class BabyVillager {
        public double healthMultiplierForBabyVillager = 1f;
        public double speedMultiplierForBabyVillager = 1f;
        public double scaleMultiplierForBabyVillager = 1f;
    }
    @SectionHeader("Vindicator")
    @Comment("Vindicator")
    public double healthMultiplierForVindicator = 1f;
    public double damageMultiplierForVindicator = 1f;
    public double speedMultiplierForVindicator = 1f;
    public double scaleMultiplierForVindicator = 1f;
    @SectionHeader("Wandering Trader")
    @Comment("Wandering Trader")
    public double healthMultiplierForWanderingTrader = 1f;
    public double speedMultiplierForWanderingTrader = 1f;
    public double scaleMultiplierForWanderingTrader = 1f;
    @SectionHeader("Warden")
    @Comment("Warden")
    public double healthMultiplierForWarden = 1f;
    public double damageMultiplierForWarden = 1f;
    public double speedMultiplierForWarden = 1f;
    public double scaleMultiplierForWarden = 1f;
    @SectionHeader("Witch")
    @Comment("Witch")
    public double healthMultiplierForWitch = 1f;
    public double damageMultiplierForWitch = 1f;
    public double speedMultiplierForWitch = 1f;
    public double scaleMultiplierForWitch = 1f;
    @SectionHeader("Wither")
    @Comment("Wither")
    public double healthMultiplierForWither = 1f;
    public double damageMultiplierForWither = 1f;
    public double speedMultiplierForWither = 1f;
    public double scaleMultiplierForWither = 1f;
    @SectionHeader("Wither Skeleton")
    @Comment("Wither Skeleton")
    public double healthMultiplierForWitherSkeleton = 1f;
    public double damageMultiplierForWitherSkeleton = 1f;
    public double speedMultiplierForWitherSkeleton = 1f;
    public double scaleMultiplierForWitherSkeleton = 1f;
    @SectionHeader("Wolf")
    @Comment("Wolf")
    public double healthMultiplierForWolf = 1f;
    public double damageMultiplierForWolf = 1f;
    public double speedMultiplierForWolf = 1f;
    public double scaleMultiplierForWolf = 1f;
    @Nest
    public BabyWolf babyWolf = new BabyWolf();
    public static class BabyWolf {
        public double healthMultiplierForBabyWolf = 1f;
        public double damageMultiplierForBabyWolf = 1f;
        public double speedMultiplierForBabyWolf = 1f;
        public double scaleMultiplierForBabyWolf = 1f;
    }
    @SectionHeader("Zoglin")
    @Comment("Zoglin")
    public double healthMultiplierForZoglin = 1f;
    public double damageMultiplierForZoglin = 1f;
    public double speedMultiplierForZoglin = 1f;
    public double scaleMultiplierForZoglin = 1f;
    @Nest
    public BabyZoglin babyZoglin = new BabyZoglin();
    public static class BabyZoglin {
        public double healthMultiplierForBabyZoglin = 1f;
        public double damageMultiplierForBabyZoglin = 1f;
        public double speedMultiplierForBabyZoglin = 1f;
        public double scaleMultiplierForBabyZoglin = 1f;
    }
    @SectionHeader("Zombie")
    @Comment("Zombie")
    public double healthMultiplierForZombie = 1f;
    public double damageMultiplierForZombie = 1f;
    public double speedMultiplierForZombie = 1f;
    public double scaleMultiplierForZombie = 1f;
    @Nest
    public BabyZombie babyZombie = new BabyZombie();
    public static class BabyZombie {
        public double healthMultiplierForBabyZombie = 1f;
        public double damageMultiplierForBabyZombie = 1f;
        public double speedMultiplierForBabyZombie = 1f;
        public double scaleMultiplierForBabyZombie = 1f;
    }
    @SectionHeader("Zombie Horse")
    @Comment("Zombie Horse")
    public double healthMultiplierForZombieHorse= 1f;
    public double speedMultiplierForZombieHorse = 1f;
    public double scaleMultiplierForZombieHorse = 1f;
    @Nest
    public BabyZombieHorse babyZombieHorse = new BabyZombieHorse();
    public static class BabyZombieHorse {
        public double healthMultiplierForBabyZombieHorse = 1f;
        public double speedMultiplierForBabyZombieHorse = 1f;
        public double scaleMultiplierForBabyZombieHorse = 1f;
    }
    @SectionHeader("Zombie Nautilus")
    @Comment("Zombie Nautilus")
    public double healthMultiplierForZombieNautilus = 1f;
    public double damageMultiplierForZombieNautilus = 1f;
    public double speedMultiplierForZombieNautilus = 1f;
    public double scaleMultiplierForZombieNautilus = 1f;
    @SectionHeader("Zombie Villager")
    @Comment("Zombie Villager")
    public double healthMultiplierForZombieVillager = 1f;
    public double damageMultiplierForZombieVillager = 1f;
    public double speedMultiplierForZombieVillager = 1f;
    public double scaleMultiplierForZombieVillager = 1f;
    @Nest
    public BabyZombieVillager babyZombieVillager = new BabyZombieVillager();
    public static class BabyZombieVillager {
        public double healthMultiplierForBabyZombieVillager = 1f;
        public double damageMultiplierForBabyZombieVillager = 1f;
        public double speedMultiplierForBabyZombieVillager = 1f;
        public double scaleMultiplierForBabyZombieVillager = 1f;
    }
    @SectionHeader("Zombified Piglin")
    @Comment("Zombified Piglin")
    public double healthMultiplierForZombifiedPiglin = 1f;
    public double damageMultiplierForZombifiedPiglin = 1f;
    public double speedMultiplierForZombifiedPiglin = 1f;
    public double scaleMultiplierForZombifiedPiglin = 1f;
    @Nest
    public BabyZombifiedPiglin babyZombifiedPiglin = new BabyZombifiedPiglin();
    public static class BabyZombifiedPiglin {
        public double healthMultiplierForBabyZombifiedPiglin = 1f;
        public double damageMultiplierForBabyZombifiedPiglin = 1f;
        public double speedMultiplierForBabyZombifiedPiglin = 1f;
        public double scaleMultiplierForBabyZombifiedPiglin = 1f;
    }

    @SectionHeader("Modded Mobs")
    @Comment("Modded Mobs")
    @Nest
    public BetterEnd betterEnd = new BetterEnd();
    public static class BetterEnd {
        @SectionHeader("Cubozoa")
        @Comment("Cubozoa")
        public double healthMultiplierForCubozoa = 1f;
        @SectionHeader("Dragonfly")
        @Comment("Dragonfly")
        public double healthMultiplierForDragonfly = 1f;
        public double scaleMultiplierForDragonfly = 1f;
        @SectionHeader("End Fish")
        @Comment("End Fish")
        public double healthMultiplierForEndFish = 1f;
        @SectionHeader("End Slime")
        @Comment("End Slime")
        public double healthMultiplierForEndSlime = 1f;
        public double damageMultiplierForEndSlime = 1f;
        public double speedMultiplierForEndSlime = 1f;
        public double scaleMultiplierForEndSlime = 1f;
        @SectionHeader("Shadow Walker")
        @Comment("Shadow Walker")
        public double healthMultiplierForShadowWalker = 1f;
        public double damageMultiplierForShadowWalker = 1f;
        public double speedMultiplierForShadowWalker = 1f;
        public double scaleMultiplierForShadowWalker = 1f;
        @SectionHeader("Silk Moth")
        @Comment("Silk Moth")
        public double healthMultiplierForSilkMoth = 1f;
        public double scaleMultiplierForSilkMoth = 1f;
    }
    @Nest
    public BetterNether betterNether = new BetterNether();
    public static class BetterNether {
        @SectionHeader("Firefly")
        @Comment("Firefly")
        public double healthMultiplierForFirefly = 1f;
        public double damageMultiplierForFirefly = 1f;
        public double scaleMultiplierForFirefly = 1f;
        @SectionHeader("Flying Pig")
        @Comment("Flying Pig")
        public double healthMultiplierForFlyingPig = 1f;
        public double damageMultiplierForFlyingPig = 1f;
        public double speedMultiplierForFlyingPig = 1f;
        public double scaleMultiplierForFlyingPig = 1f;
        @SectionHeader("Hydrogen Jellyfish")
        @Comment("Hydrogen Jellyfish")
        public double healthMultiplierForHydrogenJellyfish = 1f;
        public double damageMultiplierForHydrogenJellyfish = 1f;
        public double scaleMultiplierForHydrogenJellyfish = 1f;
        @SectionHeader("Jungle Skeleton")
        @Comment("Jungle Skeleton")
        public double healthMultiplierForJungleSkeleton = 1f;
        public double damageMultiplierForJungleSkeleton = 1f;
        public double speedMultiplierForJungleSkeleton = 1f;
        public double scaleMultiplierForJungleSkeleton = 1f;
        @SectionHeader("Naga")
        @Comment("Naga")
        public double healthMultiplierForNaga = 1f;
        public double damageMultiplierForNaga = 1f;
        public double speedMultiplierForNaga = 1f;
        public double scaleMultiplierForNaga = 1f;
        @SectionHeader("Skull")
        @Comment("Skull")
        public double healthMultiplierForSkull = 1f;
        public double damageMultiplierForSkull = 1f;
        public double scaleMultiplierForSkull = 1f;
    }
    @Nest
    public DeeperAndDarker deeperAndDarker = new DeeperAndDarker();
    public static class DeeperAndDarker {
        @SectionHeader("Angler Fish")
        @Comment("Angler Fish")
        public double healthMultiplierForAnglerFish = 1f;
        public double damageMultiplierForAnglerFish = 1f;
        public double speedMultiplierForAnglerFish = 1f;
        public double scaleMultiplierForAnglerFish = 1f;
        @SectionHeader("Sculk Centipede")
        @Comment("Sculk Centipede")
        public double healthMultiplierForSculkCentipede = 1f;
        public double damageMultiplierForSculkCentipede = 1f;
        public double speedMultiplierForSculkCentipede = 1f;
        public double scaleMultiplierForSculkCentipede = 1f;
        @SectionHeader("Sculk Leech")
        @Comment("Sculk Leech")
        public double healthMultiplierForSculkLeech = 1f;
        public double damageMultiplierForSculkLeech = 1f;
        public double speedMultiplierForSculkLeech = 1f;
        public double scaleMultiplierForSculkLeech = 1f;
        @SectionHeader("Sculk Snapper")
        @Comment("Sculk Snapper")
        public double healthMultiplierForSculkSnapper = 1f;
        public double damageMultiplierForSculkSnapper = 1f;
        public double speedMultiplierForSculkSnapper = 1f;
        public double scaleMultiplierForSculkSnapper = 1f;
        @SectionHeader("Shattered")
        @Comment("Shattered")
        public double healthMultiplierForShattered = 1f;
        public double damageMultiplierForShattered = 1f;
        public double speedMultiplierForShattered = 1f;
        public double scaleMultiplierForShattered = 1f;
        @SectionHeader("Shriek Worm")
        @Comment("Shriek Worm")
        public double healthMultiplierForShriekWorm = 1f;
        public double damageMultiplierForShriekWorm = 1f;
        public double scaleMultiplierForShriekWorm = 1f;
        @SectionHeader("Sludge")
        @Comment("Sludge")
        public double healthMultiplierForSludge = 1f;
        public double damageMultiplierForSludge = 1f;
        public double speedMultiplierForSludge = 1f;
        public double scaleMultiplierForSludge = 1f;
        @SectionHeader("Stalker")
        @Comment("Stalker")
        public double healthMultiplierForStalker = 1f;
        public double damageMultiplierForStalker = 1f;
        public double speedMultiplierForStalker = 1f;
        public double scaleMultiplierForStalker = 1f;
    }
    @Nest
    public FriendsAndFoes friendsAndFoes = new FriendsAndFoes();
    public static class FriendsAndFoes {
        @SectionHeader("Crab")
        @Comment("Crab")
        public double healthMultiplierForCrab = 1f;
        public double damageMultiplierForCrab = 1f;
        public double speedMultiplierForCrab = 1f;
        public double scaleMultiplierForCrab = 1f;
        @SectionHeader("Glare")
        @Comment("Glare")
        public double healthMultiplierForGlare = 1f;
        public double damageMultiplierForGlare = 1f;
        public double speedMultiplierForGlare = 1f;
        public double scaleMultiplierForGlare = 1f;
        @SectionHeader("Iceologer")
        @Comment("Iceologer")
        public double healthMultiplierForIceologer = 1f;
        public double damageMultiplierForIceologer = 1f;
        public double speedMultiplierForIceologer = 1f;
        public double scaleMultiplierForIceologer = 1f;
        @SectionHeader("Mauler")
        @Comment("Mauler")
        public double healthMultiplierForMauler = 1f;
        public double damageMultiplierForMauler = 1f;
        public double speedMultiplierForMauler = 1f;
        public double scaleMultiplierForMauler = 1f;
        @SectionHeader("Moobloom")
        @Comment("Moobloom")
        public double healthMultiplierForMoobloom = 1f;
        public double damageMultiplierForMoobloom = 1f;
        public double speedMultiplierForMoobloom = 1f;
        public double scaleMultiplierForMoobloom = 1f;
        @SectionHeader("Rascal")
        @Comment("Rascal")
        public double healthMultiplierForRascal = 1f;
        public double damageMultiplierForRascal = 1f;
        public double speedMultiplierForRascal = 1f;
        public double scaleMultiplierForRascal = 1f;
        @SectionHeader("Tuff Golem")
        @Comment("Tuff Golem")
        public double healthMultiplierForTuffGolem = 1f;
        public double damageMultiplierForTuffGolem = 1f;
        public double speedMultiplierForTuffGolem = 1f;
        public double scaleMultiplierForTuffGolem = 1f;
        @SectionHeader("Wildfire")
        @Comment("Wildfire")
        public double healthMultiplierForWildfire = 1f;
        public double damageMultiplierForWildfire = 1f;
        public double speedMultiplierForWildfire = 1f;
        public double scaleMultiplierForWildfire = 1f;
    }
    @Nest
    public IllagerInvasion illagerInvasion = new IllagerInvasion();
    public static class IllagerInvasion {
        @SectionHeader("Alchemist")
        @Comment("Alchemist")
        public double healthMultiplierForAlchemist = 1f;
        public double damageMultiplierForAlchemist = 1f;
        public double speedMultiplierForAlchemist = 1f;
        public double scaleMultiplierForAlchemist = 1f;
        @SectionHeader("Archivist")
        @Comment("Archivist")
        public double healthMultiplierForArchivist = 1f;
        public double damageMultiplierForArchivist = 1f;
        public double speedMultiplierForArchivist = 1f;
        public double scaleMultiplierForArchivist = 1f;
        @SectionHeader("Basher")
        @Comment("Basher")
        public double healthMultiplierForBasher = 1f;
        public double damageMultiplierForBasher = 1f;
        public double speedMultiplierForBasher = 1f;
        public double scaleMultiplierForBasher = 1f;
        @SectionHeader("Firecaller")
        @Comment("Firecaller")
        public double healthMultiplierForFirecaller = 1f;
        public double damageMultiplierForFirecaller = 1f;
        public double speedMultiplierForFirecaller = 1f;
        public double scaleMultiplierForFirecaller = 1f;
        @SectionHeader("Inquisitor")
        @Comment("Inquisitor")
        public double healthMultiplierForInquisitor = 1f;
        public double damageMultiplierForInquisitor = 1f;
        public double speedMultiplierForInquisitor = 1f;
        public double scaleMultiplierForInquisitor = 1f;
        @SectionHeader("Invoker")
        @Comment("Invoker")
        public double healthMultiplierForInvoker = 1f;
        public double damageMultiplierForInvoker = 1f;
        public double speedMultiplierForInvoker = 1f;
        public double scaleMultiplierForInvoker = 1f;
        @SectionHeader("Marauder")
        @Comment("Marauder")
        public double healthMultiplierForMarauder = 1f;
        public double damageMultiplierForMarauder = 1f;
        public double speedMultiplierForMarauder = 1f;
        public double scaleMultiplierForMarauder = 1f;
        @SectionHeader("Necromancer")
        @Comment("Necromancer")
        public double healthMultiplierForNecromancer = 1f;
        public double damageMultiplierForNecromancer = 1f;
        public double speedMultiplierForNecromancer = 1f;
        public double scaleMultiplierForNecromancer = 1f;
        @SectionHeader("Provoker")
        @Comment("Provoker")
        public double healthMultiplierForProvoker = 1f;
        public double damageMultiplierForProvoker = 1f;
        public double speedMultiplierForProvoker = 1f;
        public double scaleMultiplierForProvoker = 1f;
        @SectionHeader("Sorcerer")
        @Comment("Sorcerer")
        public double healthMultiplierForSorcerer = 1f;
        public double damageMultiplierForSorcerer = 1f;
        public double speedMultiplierForSorcerer = 1f;
        public double scaleMultiplierForSorcerer = 1f;
        @SectionHeader("Surrendered")
        @Comment("Surrendered")
        public double healthMultiplierForSurrendered = 1f;
        public double damageMultiplierForSurrendered = 1f;
        public double scaleMultiplierForSurrendered = 1f;
    }
    @Nest
    public ItTakesAPillageContinuation itTakesAPillageContinuation = new ItTakesAPillageContinuation();
    public static class ItTakesAPillageContinuation {
        @SectionHeader("Archer")
        @Comment("Archer")
        public double healthMultiplierForArcher = 1f;
        public double damageMultiplierForArcher = 1f;
        public double speedMultiplierForArcher = 1f;
        public double scaleMultiplierForArcher = 1f;
        @SectionHeader("Clay Golem")
        @Comment("Clay Golem")
        public double healthMultiplierForClayGolem = 1f;
        public double damageMultiplierForClayGolem = 1f;
        public double speedMultiplierForClayGolem = 1f;
        public double scaleMultiplierForClayGolem = 1f;
        @SectionHeader("Legioner")
        @Comment("Legioner")
        public double healthMultiplierForLegioner = 1f;
        public double damageMultiplierForLegioner = 1f;
        public double speedMultiplierForLegioner = 1f;
        public double scaleMultiplierForLegioner = 1f;
        @SectionHeader("Skirmisher")
        @Comment("Skirmisher")
        public double healthMultiplierForSkirmisher = 1f;
        public double damageMultiplierForSkirmisher = 1f;
        public double speedMultiplierForSkirmisher = 1f;
        public double scaleMultiplierForSkirmisher = 1f;
    }
    @Nest
    public MobVariants mobVariants = new MobVariants();
    public static class MobVariants {
        @SectionHeader("Armored Spider")
        @Comment("Armored Spider")
        public double healthMultiplierForArmoredSpider = 1f;
        public double damageMultiplierForArmoredSpider = 1f;
        public double speedMultiplierForArmoredSpider = 1f;
        public double scaleMultiplierForArmoredSpider = 1f;
        @SectionHeader("Bloated Corpse")
        @Comment("Bloated Corpse")
        public double healthMultiplierForBloatedCorpse = 1f;
        public double damageMultiplierForBloatedCorpse = 1f;
        public double speedMultiplierForBloatedCorpse = 1f;
        public double scaleMultiplierForBloatedCorpse = 1f;
        @SectionHeader("Cave Creeper")
        @Comment("Cave Creeper")
        public double healthMultiplierForCaveCreeper = 1f;
        public double damageMultiplierForCaveCreeper = 1f;
        public double speedMultiplierForCaveCreeper = 1f;
        public double scaleMultiplierForCaveCreeper = 1f;
        @SectionHeader("Corsair")
        @Comment("Corsair")
        public double healthMultiplierForCorsair = 1f;
        public double damageMultiplierForCorsair = 1f;
        public double speedMultiplierForCorsair = 1f;
        public double scaleMultiplierForCorsair = 1f;
        @SectionHeader("Executioner")
        @Comment("Executioner")
        public double healthMultiplierForExecutioner = 1f;
        public double damageMultiplierForExecutioner = 1f;
        public double speedMultiplierForExecutioner = 1f;
        public double scaleMultiplierForExecutioner = 1f;
        @SectionHeader("Explorer")
        @Comment("Explorer")
        public double healthMultiplierForExplorer = 1f;
        public double damageMultiplierForExplorer = 1f;
        public double speedMultiplierForExplorer = 1f;
        public double scaleMultiplierForExplorer = 1f;
        @SectionHeader("Forgotten")
        @Comment("Forgotten")
        public double healthMultiplierForForgotten = 1f;
        public double damageMultiplierForForgotten = 1f;
        public double speedMultiplierForForgotten = 1f;
        public double scaleMultiplierForForgotten = 1f;
        @SectionHeader("Frozen Zombie")
        @Comment("Frozen Zombie")
        public double healthMultiplierForFrozenZombie = 1f;
        public double damageMultiplierForFrozenZombie = 1f;
        public double speedMultiplierForFrozenZombie = 1f;
        public double scaleMultiplierForFrozenZombie = 1f;
        @SectionHeader("Infected Piglin")
        @Comment("Infected Piglin")
        public double healthMultiplierForInfectedPiglin = 1f;
        public double damageMultiplierForInfectedPiglin = 1f;
        public double speedMultiplierForInfectedPiglin = 1f;
        public double scaleMultiplierForInfectedPiglin = 1f;
        @SectionHeader("Infected Piglin Brute")
        @Comment("Infected Piglin Brute")
        public double healthMultiplierForInfectedPiglinBrute = 1f;
        public double damageMultiplierForInfectedPiglinBrute = 1f;
        public double speedMultiplierForInfectedPiglinBrute = 1f;
        public double scaleMultiplierForInfectedPiglinBrute = 1f;
        @SectionHeader("Lava Slime")
        @Comment("Lava Slime")
        public double healthMultiplierForLavaSlime = 1f;
        public double damageMultiplierForLavaSlime = 1f;
        public double speedMultiplierForLavaSlime = 1f;
        public double scaleMultiplierForLavaSlime = 1f;
        @SectionHeader("Nightmare")
        @Comment("Nightmare")
        public double healthMultiplierForNightmare = 1f;
        public double damageMultiplierForNightmare = 1f;
        public double speedMultiplierForNightmare = 1f;
        public double scaleMultiplierForNightmare = 1f;
        @SectionHeader("Soul Stealer")
        @Comment("Soul Stealer")
        public double healthMultiplierForSoulStealer = 1f;
        public double damageMultiplierForSoulStealer = 1f;
        public double speedMultiplierForSoulStealer = 1f;
        public double scaleMultiplierForSoulStealer = 1f;
        @SectionHeader("Toxic Slime")
        @Comment("Toxic Slime")
        public double healthMultiplierForToxicSlime = 1f;
        public double damageMultiplierForToxicSlime = 1f;
        public double speedMultiplierForToxicSlime = 1f;
        public double scaleMultiplierForToxicSlime = 1f;
        @SectionHeader("Tropical Spider")
        @Comment("Tropical Spider")
        public double healthMultiplierForTropicalSpider = 1f;
        public double damageMultiplierForTropicalSpider = 1f;
        public double speedMultiplierForTropicalSpider = 1f;
        public double scaleMultiplierForTropicalSpider = 1f;
        @SectionHeader("Undead Warrior")
        @Comment("Undead Warrior")
        public double healthMultiplierForUndeadWarrior = 1f;
        public double damageMultiplierForUndeadWarrior = 1f;
        public double speedMultiplierForUndeadWarrior = 1f;
        public double scaleMultiplierForUndeadWarrior = 1f;
        @SectionHeader("Zombified Piglin Brute")
        @Comment("Zombified Piglin Brute")
        public double healthMultiplierForZombifiedPiglinBrute = 1f;
        public double damageMultiplierForZombifiedPiglinBrute = 1f;
        public double speedMultiplierForZombifiedPiglinBrute = 1f;
        public double scaleMultiplierForZombifiedPiglinBrute = 1f;
    }
    @Nest
    public Ribbits ribbits = new Ribbits();
    public static class Ribbits {
        @SectionHeader("Ribbit")
        @Comment("Ribbit")
        public double healthMultiplierForRibbit = 1f;
        public double damageMultiplierForRibbit = 1f;
        public double speedMultiplierForRibbit = 1f;
        public double scaleMultiplierForRibbit = 1f;
    }
    @Nest
    public VariantsAndVentures variantsAndVentures = new VariantsAndVentures();
    public static class VariantsAndVentures {
        @SectionHeader("Gelid")
        @Comment("Gelid")
        public double healthMultiplierForGelid = 1f;
        public double damageMultiplierForGelid = 1f;
        public double speedMultiplierForGelid = 1f;
        public double scaleMultiplierForGelid = 1f;
        @SectionHeader("Murk")
        @Comment("Murk")
        public double healthMultiplierForMurk = 1f;
        public double damageMultiplierForMurk = 1f;
        public double speedMultiplierForMurk = 1f;
        public double scaleMultiplierForMurk = 1f;
        @SectionHeader("Thicket")
        @Comment("Thicket")
        public double healthMultiplierForThicket = 1f;
        public double damageMultiplierForThicket = 1f;
        public double speedMultiplierForThicket = 1f;
        public double scaleMultiplierForThicket = 1f;
        @SectionHeader("Verdant")
        @Comment("Verdant")
        public double healthMultiplierForVerdant = 1f;
        public double damageMultiplierForVerdant = 1f;
        public double speedMultiplierForVerdant = 1f;
        public double scaleMultiplierForVerdant = 1f;
    }
    @Nest
    public ZombieVariants zombieVariants = new ZombieVariants();
    public static class ZombieVariants {
        @SectionHeader("Badlands Zombie")
        @Comment("Badlands Zombie")
        public double healthMultiplierForBadlandsZombie = 1f;
        public double damageMultiplierForBadlandsZombie = 1f;
        public double speedMultiplierForBadlandsZombie = 1f;
        public double scaleMultiplierForBadlandsZombie = 1f;
        @SectionHeader("Bamboo Zombie")
        @Comment("Bamboo Zombie")
        public double healthMultiplierForBambooZombie = 1f;
        public double damageMultiplierForBambooZombie = 1f;
        public double speedMultiplierForBambooZombie = 1f;
        public double scaleMultiplierForBambooZombie = 1f;
        @SectionHeader("Cave Zombie")
        @Comment("Cave Zombie")
        public double healthMultiplierForCaveZombie = 1f;
        public double damageMultiplierForCaveZombie = 1f;
        public double speedMultiplierForCaveZombie = 1f;
        public double scaleMultiplierForCaveZombie = 1f;
        @SectionHeader("Cherry Zombie")
        @Comment("Cherry Zombie")
        public double healthMultiplierForCherryZombie = 1f;
        public double damageMultiplierForCherryZombie = 1f;
        public double speedMultiplierForCherryZombie = 1f;
        public double scaleMultiplierForCherryZombie = 1f;
        @SectionHeader("Deep Dark Zombie")
        @Comment("Deep Dark Zombie")
        public double healthMultiplierForDeepDarkZombie = 1f;
        public double damageMultiplierForDeepDarkZombie = 1f;
        public double speedMultiplierForDeepDarkZombie = 1f;
        public double scaleMultiplierForDeepDarkZombie = 1f;
        @SectionHeader("Desert Zombie")
        @Comment("Desert Zombie")
        public double healthMultiplierForDesertZombie = 1f;
        public double damageMultiplierForDesertZombie = 1f;
        public double speedMultiplierForDesertZombie = 1f;
        public double scaleMultiplierForDesertZombie = 1f;
        @SectionHeader("Dripstone Zombie")
        @Comment("Dripstone Zombie")
        public double healthMultiplierForDripstoneZombie = 1f;
        public double damageMultiplierForDripstoneZombie = 1f;
        public double speedMultiplierForDripstoneZombie = 1f;
        public double scaleMultiplierForDripstoneZombie = 1f;
        @SectionHeader("Frozen Zombie")
        @Comment("Frozen Zombie")
        public double healthMultiplierForFrozenZombie = 1f;
        public double damageMultiplierForFrozenZombie = 1f;
        public double speedMultiplierForFrozenZombie = 1f;
        public double scaleMultiplierForFrozenZombie = 1f;
        @SectionHeader("Jungle Zombie")
        @Comment("Jungle Zombie")
        public double healthMultiplierForJungleZombie = 1f;
        public double damageMultiplierForJungleZombie = 1f;
        public double speedMultiplierForJungleZombie = 1f;
        public double scaleMultiplierForJungleZombie = 1f;
        @SectionHeader("Lush Zombie")
        @Comment("Lush Zombie")
        public double healthMultiplierForLushZombie = 1f;
        public double damageMultiplierForLushZombie = 1f;
        public double speedMultiplierForLushZombie = 1f;
        public double scaleMultiplierForLushZombie = 1f;
        @SectionHeader("Mangrove Zombie")
        @Comment("Mangrove Zombie")
        public double healthMultiplierForMangroveZombie = 1f;
        public double damageMultiplierForMangroveZombie = 1f;
        public double speedMultiplierForMangroveZombie = 1f;
        public double scaleMultiplierForMangroveZombie = 1f;
        @SectionHeader("Mushroom Zombie")
        @Comment("Mushroom Zombie")
        public double healthMultiplierForMushroomZombie = 1f;
        public double damageMultiplierForMushroomZombie = 1f;
        public double speedMultiplierForMushroomZombie = 1f;
        public double scaleMultiplierForMushroomZombie = 1f;
        @SectionHeader("Pale Garden Zombie")
        @Comment("Pale Garden Zombie")
        public double healthMultiplierForPaleGardenZombie = 1f;
        public double damageMultiplierForPaleGardenZombie = 1f;
        public double speedMultiplierForPaleGardenZombie = 1f;
        public double scaleMultiplierForPaleGardenZombie = 1f;
        @SectionHeader("Savanna Zombie")
        @Comment("Savanna Zombie")
        public double healthMultiplierForSavannaZombie = 1f;
        public double damageMultiplierForSavannaZombie = 1f;
        public double speedMultiplierForSavannaZombie = 1f;
        public double scaleMultiplierForSavannaZombie = 1f;
        @SectionHeader("Swamp Zombie")
        @Comment("Swamp Zombie")
        public double healthMultiplierForSwampZombie = 1f;
        public double damageMultiplierForSwampZombie = 1f;
        public double speedMultiplierForSwampZombie = 1f;
        public double scaleMultiplierForSwampZombie = 1f;
    }
}
