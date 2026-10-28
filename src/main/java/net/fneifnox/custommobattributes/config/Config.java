package net.fneifnox.custommobattributes.config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;
import net.fneifnox.custommobattributes.range.Formula;

@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@io.wispforest.owo.config.annotation.Config(name = "custom-mob-attributes", wrapperName = "CustomMA")
public class Config {
    public static boolean isValidFormula(String formula) {
        return Formula.tryParse(formula) != null;
    }

    // Random range of a multiplier. When enabled, each mob draws its own value between min and max
    // and keeps it. The curve sets how often values close to the center (> 0) or to the extremes (< 0) are drawn.
    public static class ValueRange {
        public boolean enabled = false;
        @PredicateConstraint("isPositive")
        public double min = 0.8;
        @Comment("Must be greater than min")
        @PredicateConstraint("isPositive")
        public double max = 1.25;
        @Comment("0 = uniform, > 0 = values close to the center are more frequent, < 0 = values close to min and max are more frequent")
        @RangeConstraint(min = -5, max = 5, decimalPlaces = 2)
        public double curve = 0;

        public static boolean isPositive(double value) {
            return value > 0;
        }
    }

    @Comment("Whether babies should also be affected by the multipliers of their adult version")
    public boolean adultsAlsoAffectBabies = true;
    @SectionHeader("Range Formulas")
    @Comment("Spread of the random value (sigma) in percent of each side of the range. Variables: x (curve). Functions: abs, sqrt, exp, ln, log10, pow, min, max, floor, ceil. Operators: + - * / ^")
    @PredicateConstraint("isValidFormula")
    public String rangeSigmaFormula = Formula.DEFAULT_SIGMA;
    @Comment("When sigma is between these two bounds, the blend formula weights the curve against a flat distribution")
    public double rangeBlendMinSigma = 50;
    public double rangeBlendMaxSigma = 100;
    @Comment("Weight of the curve (0 = flat, 1 = full curve) while sigma is inside the blend bounds. Variables: x, sigma")
    @PredicateConstraint("isValidFormula")
    public String rangeBlendFormula = Formula.DEFAULT_BLEND;
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
    @Nest
    public ValueRange healthMultiplierForAllayRange = new ValueRange();
    public double speedMultiplierForAllay = 1f;
    @Nest
    public ValueRange speedMultiplierForAllayRange = new ValueRange();
    public double scaleMultiplierForAllay = 1f;
    @Nest
    public ValueRange scaleMultiplierForAllayRange = new ValueRange();
    @SectionHeader("Armadillo")
    @Comment("Armadillo")
    public double healthMultiplierForArmadillo = 1f;
    @Nest
    public ValueRange healthMultiplierForArmadilloRange = new ValueRange();
    public double speedMultiplierForArmadillo = 1f;
    @Nest
    public ValueRange speedMultiplierForArmadilloRange = new ValueRange();
    public double scaleMultiplierForArmadillo = 1f;
    @Nest
    public ValueRange scaleMultiplierForArmadilloRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForAxolotlRange = new ValueRange();
    public double damageMultiplierForAxolotl = 1f;
    @Nest
    public ValueRange damageMultiplierForAxolotlRange = new ValueRange();
    public double speedMultiplierForAxolotl = 1f;
    @Nest
    public ValueRange speedMultiplierForAxolotlRange = new ValueRange();
    public double scaleMultiplierForAxolotl = 1f;
    @Nest
    public ValueRange scaleMultiplierForAxolotlRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForBatRange = new ValueRange();
    public double speedMultiplierForBat = 1f;
    @Nest
    public ValueRange speedMultiplierForBatRange = new ValueRange();
    public double scaleMultiplierForBat = 1f;
    @Nest
    public ValueRange scaleMultiplierForBatRange = new ValueRange();
    @SectionHeader("Bee")
    @Comment("Bee")
    public double healthMultiplierForBee = 1f;
    @Nest
    public ValueRange healthMultiplierForBeeRange = new ValueRange();
    public double damageMultiplierForBee = 1f;
    @Nest
    public ValueRange damageMultiplierForBeeRange = new ValueRange();
    public double speedMultiplierForBee = 1f;
    @Nest
    public ValueRange speedMultiplierForBeeRange = new ValueRange();
    public double scaleMultiplierForBee = 1f;
    @Nest
    public ValueRange scaleMultiplierForBeeRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForBlazeRange = new ValueRange();
    public double damageMultiplierForBlaze = 1f;
    @Nest
    public ValueRange damageMultiplierForBlazeRange = new ValueRange();
    public double speedMultiplierForBlaze = 1f;
    @Nest
    public ValueRange speedMultiplierForBlazeRange = new ValueRange();
    public double scaleMultiplierForBlaze = 1f;
    @Nest
    public ValueRange scaleMultiplierForBlazeRange = new ValueRange();
    @SectionHeader("Bogged")
    @Comment("Bogged")
    public double healthMultiplierForBogged = 1f;
    @Nest
    public ValueRange healthMultiplierForBoggedRange = new ValueRange();
    public double damageMultiplierForBogged = 1f;
    @Nest
    public ValueRange damageMultiplierForBoggedRange = new ValueRange();
    public double speedMultiplierForBogged = 1f;
    @Nest
    public ValueRange speedMultiplierForBoggedRange = new ValueRange();
    public double scaleMultiplierForBogged = 1f;
    @Nest
    public ValueRange scaleMultiplierForBoggedRange = new ValueRange();
    @SectionHeader("Breeze")
    @Comment("Breeze")
    public double healthMultiplierForBreeze = 1f;
    @Nest
    public ValueRange healthMultiplierForBreezeRange = new ValueRange();
    public double damageMultiplierForBreeze = 1f;
    @Nest
    public ValueRange damageMultiplierForBreezeRange = new ValueRange();
    public double speedMultiplierForBreeze = 1f;
    @Nest
    public ValueRange speedMultiplierForBreezeRange = new ValueRange();
    public double scaleMultiplierForBreeze = 1f;
    @Nest
    public ValueRange scaleMultiplierForBreezeRange = new ValueRange();
    @SectionHeader("Camel")
    @Comment("Camel")
    public double healthMultiplierForCamel = 1f;
    @Nest
    public ValueRange healthMultiplierForCamelRange = new ValueRange();
    public double speedMultiplierForCamel = 1f;
    @Nest
    public ValueRange speedMultiplierForCamelRange = new ValueRange();
    public double scaleMultiplierForCamel = 1f;
    @Nest
    public ValueRange scaleMultiplierForCamelRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForCamelHuskRange = new ValueRange();
    public double speedMultiplierForCamelHusk = 1f;
    @Nest
    public ValueRange speedMultiplierForCamelHuskRange = new ValueRange();
    public double scaleMultiplierForCamelHusk = 1f;
    @Nest
    public ValueRange scaleMultiplierForCamelHuskRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForCatRange = new ValueRange();
    public double damageMultiplierForCat = 1f;
    @Nest
    public ValueRange damageMultiplierForCatRange = new ValueRange();
    public double speedMultiplierForCat = 1f;
    @Nest
    public ValueRange speedMultiplierForCatRange = new ValueRange();
    public double scaleMultiplierForCat = 1f;
    @Nest
    public ValueRange scaleMultiplierForCatRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForCaveSpiderRange = new ValueRange();
    public double damageMultiplierForCaveSpider = 1f;
    @Nest
    public ValueRange damageMultiplierForCaveSpiderRange = new ValueRange();
    public double speedMultiplierForCaveSpider = 1f;
    @Nest
    public ValueRange speedMultiplierForCaveSpiderRange = new ValueRange();
    public double scaleMultiplierForCaveSpider = 1f;
    @Nest
    public ValueRange scaleMultiplierForCaveSpiderRange = new ValueRange();
    @SectionHeader("Chicken")
    @Comment("Chicken")
    public double healthMultiplierForChicken = 1f;
    @Nest
    public ValueRange healthMultiplierForChickenRange = new ValueRange();
    public double speedMultiplierForChicken = 1f;
    @Nest
    public ValueRange speedMultiplierForChickenRange = new ValueRange();
    public double scaleMultiplierForChicken = 1f;
    @Nest
    public ValueRange scaleMultiplierForChickenRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForCodRange = new ValueRange();
    public double speedMultiplierForCod = 1f;
    @Nest
    public ValueRange speedMultiplierForCodRange = new ValueRange();
    public double scaleMultiplierForCod = 1f;
    @Nest
    public ValueRange scaleMultiplierForCodRange = new ValueRange();
    @SectionHeader("Copper Golem")
    @Comment("Copper Golem")
    public double healthMultiplierForCopperGolem = 1f;
    @Nest
    public ValueRange healthMultiplierForCopperGolemRange = new ValueRange();
    public double speedMultiplierForCopperGolem = 1f;
    @Nest
    public ValueRange speedMultiplierForCopperGolemRange = new ValueRange();
    public double scaleMultiplierForCopperGolem = 1f;
    @Nest
    public ValueRange scaleMultiplierForCopperGolemRange = new ValueRange();
    @SectionHeader("Cow")
    @Comment("Cow")
    public double healthMultiplierForCow = 1f;
    @Nest
    public ValueRange healthMultiplierForCowRange = new ValueRange();
    public double speedMultiplierForCow = 1f;
    @Nest
    public ValueRange speedMultiplierForCowRange = new ValueRange();
    public double scaleMultiplierForCow = 1f;
    @Nest
    public ValueRange scaleMultiplierForCowRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForCreakingRange = new ValueRange();
    public double damageMultiplierForCreaking = 1f;
    @Nest
    public ValueRange damageMultiplierForCreakingRange = new ValueRange();
    public double speedMultiplierForCreaking = 1f;
    @Nest
    public ValueRange speedMultiplierForCreakingRange = new ValueRange();
    public double scaleMultiplierForCreaking = 1f;
    @Nest
    public ValueRange scaleMultiplierForCreakingRange = new ValueRange();
    @SectionHeader("Creeper")
    @Comment("Creeper")
    public double healthMultiplierForCreeper = 1f;
    @Nest
    public ValueRange healthMultiplierForCreeperRange = new ValueRange();
    public double damageMultiplierForCreeper = 1f;
    @Nest
    public ValueRange damageMultiplierForCreeperRange = new ValueRange();
    public double speedMultiplierForCreeper = 1f;
    @Nest
    public ValueRange speedMultiplierForCreeperRange = new ValueRange();
    public double scaleMultiplierForCreeper = 1f;
    @Nest
    public ValueRange scaleMultiplierForCreeperRange = new ValueRange();
    @SectionHeader("Dolphin")
    @Comment("Dolphin")
    public double healthMultiplierForDolphin = 1f;
    @Nest
    public ValueRange healthMultiplierForDolphinRange = new ValueRange();
    public double damageMultiplierForDolphin = 1f;
    @Nest
    public ValueRange damageMultiplierForDolphinRange = new ValueRange();
    public double speedMultiplierForDolphin = 1f;
    @Nest
    public ValueRange speedMultiplierForDolphinRange = new ValueRange();
    public double scaleMultiplierForDolphin = 1f;
    @Nest
    public ValueRange scaleMultiplierForDolphinRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForDonkeyRange = new ValueRange();
    public double speedMultiplierForDonkey = 1f;
    @Nest
    public ValueRange speedMultiplierForDonkeyRange = new ValueRange();
    public double scaleMultiplierForDonkey = 1f;
    @Nest
    public ValueRange scaleMultiplierForDonkeyRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForDrownedRange = new ValueRange();
    public double damageMultiplierForDrowned = 1f;
    @Nest
    public ValueRange damageMultiplierForDrownedRange = new ValueRange();
    public double speedMultiplierForDrowned = 1f;
    @Nest
    public ValueRange speedMultiplierForDrownedRange = new ValueRange();
    public double scaleMultiplierForDrowned = 1f;
    @Nest
    public ValueRange scaleMultiplierForDrownedRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForElderGuardianRange = new ValueRange();
    public double damageMultiplierForElderGuardian = 1f;
    @Nest
    public ValueRange damageMultiplierForElderGuardianRange = new ValueRange();
    public double speedMultiplierForElderGuardian = 1f;
    @Nest
    public ValueRange speedMultiplierForElderGuardianRange = new ValueRange();
    public double scaleMultiplierForElderGuardian = 1f;
    @Nest
    public ValueRange scaleMultiplierForElderGuardianRange = new ValueRange();
    @SectionHeader("Ender Dragon")
    @Comment("Ender Dragon")
    public double healthMultiplierForEnderDragon = 1f;
    @Nest
    public ValueRange healthMultiplierForEnderDragonRange = new ValueRange();
    public double damageMultiplierForEnderDragon = 1f;
    @Nest
    public ValueRange damageMultiplierForEnderDragonRange = new ValueRange();
    @SectionHeader("Enderman")
    @Comment("Enderman")
    public double healthMultiplierForEnderman = 1f;
    @Nest
    public ValueRange healthMultiplierForEndermanRange = new ValueRange();
    public double damageMultiplierForEnderman = 1f;
    @Nest
    public ValueRange damageMultiplierForEndermanRange = new ValueRange();
    public double speedMultiplierForEnderman = 1f;
    @Nest
    public ValueRange speedMultiplierForEndermanRange = new ValueRange();
    public double scaleMultiplierForEnderman = 1f;
    @Nest
    public ValueRange scaleMultiplierForEndermanRange = new ValueRange();
    @SectionHeader("Endermite")
    @Comment("Endermite")
    public double healthMultiplierForEndermite = 1f;
    @Nest
    public ValueRange healthMultiplierForEndermiteRange = new ValueRange();
    public double damageMultiplierForEndermite = 1f;
    @Nest
    public ValueRange damageMultiplierForEndermiteRange = new ValueRange();
    public double speedMultiplierForEndermite = 1f;
    @Nest
    public ValueRange speedMultiplierForEndermiteRange = new ValueRange();
    public double scaleMultiplierForEndermite = 1f;
    @Nest
    public ValueRange scaleMultiplierForEndermiteRange = new ValueRange();
    @SectionHeader("Evoker")
    @Comment("Evoker")
    public double healthMultiplierForEvoker = 1f;
    @Nest
    public ValueRange healthMultiplierForEvokerRange = new ValueRange();
    public double damageMultiplierForEvoker = 1f;
    @Nest
    public ValueRange damageMultiplierForEvokerRange = new ValueRange();
    public double speedMultiplierForEvoker = 1f;
    @Nest
    public ValueRange speedMultiplierForEvokerRange = new ValueRange();
    public double scaleMultiplierForEvoker = 1f;
    @Nest
    public ValueRange scaleMultiplierForEvokerRange = new ValueRange();
    @SectionHeader("Fox")
    @Comment("Fox")
    public double healthMultiplierForFox = 1f;
    @Nest
    public ValueRange healthMultiplierForFoxRange = new ValueRange();
    public double damageMultiplierForFox = 1f;
    @Nest
    public ValueRange damageMultiplierForFoxRange = new ValueRange();
    public double speedMultiplierForFox = 1f;
    @Nest
    public ValueRange speedMultiplierForFoxRange = new ValueRange();
    public double scaleMultiplierForFox = 1f;
    @Nest
    public ValueRange scaleMultiplierForFoxRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForFrogRange = new ValueRange();
    public double damageMultiplierForFrog = 1f;
    @Nest
    public ValueRange damageMultiplierForFrogRange = new ValueRange();
    public double speedMultiplierForFrog = 1f;
    @Nest
    public ValueRange speedMultiplierForFrogRange = new ValueRange();
    public double scaleMultiplierForFrog = 1f;
    @Nest
    public ValueRange scaleMultiplierForFrogRange = new ValueRange();
    @SectionHeader("Ghast")
    @Comment("Ghast")
    public double healthMultiplierForGhast = 1f;
    @Nest
    public ValueRange healthMultiplierForGhastRange = new ValueRange();
    public double damageMultiplierForGhast = 1f;
    @Nest
    public ValueRange damageMultiplierForGhastRange = new ValueRange();
    public double speedMultiplierForGhast = 1f;
    @Nest
    public ValueRange speedMultiplierForGhastRange = new ValueRange();
    public double scaleMultiplierForGhast = 1f;
    @Nest
    public ValueRange scaleMultiplierForGhastRange = new ValueRange();
    @SectionHeader("Giant")
    @Comment("Giant")
    public double healthMultiplierForGiant = 1f;
    @Nest
    public ValueRange healthMultiplierForGiantRange = new ValueRange();
    public double damageMultiplierForGiant = 1f;
    @Nest
    public ValueRange damageMultiplierForGiantRange = new ValueRange();
    public double speedMultiplierForGiant = 1f;
    @Nest
    public ValueRange speedMultiplierForGiantRange = new ValueRange();
    public double scaleMultiplierForGiant = 1f;
    @Nest
    public ValueRange scaleMultiplierForGiantRange = new ValueRange();
    @SectionHeader("Glow Squid")
    @Comment("Glow Squid")
    public double healthMultiplierForGlowSquid = 1f;
    @Nest
    public ValueRange healthMultiplierForGlowSquidRange = new ValueRange();
    public double speedMultiplierForGlowSquid = 1f;
    @Nest
    public ValueRange speedMultiplierForGlowSquidRange = new ValueRange();
    public double scaleMultiplierForGlowSquid = 1f;
    @Nest
    public ValueRange scaleMultiplierForGlowSquidRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForGoatRange = new ValueRange();
    public double damageMultiplierForGoat = 1f;
    @Nest
    public ValueRange damageMultiplierForGoatRange = new ValueRange();
    public double speedMultiplierForGoat = 1f;
    @Nest
    public ValueRange speedMultiplierForGoatRange = new ValueRange();
    public double scaleMultiplierForGoat = 1f;
    @Nest
    public ValueRange scaleMultiplierForGoatRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForGuardianRange = new ValueRange();
    public double damageMultiplierForGuardian = 1f;
    @Nest
    public ValueRange damageMultiplierForGuardianRange = new ValueRange();
    public double speedMultiplierForGuardian = 1f;
    @Nest
    public ValueRange speedMultiplierForGuardianRange = new ValueRange();
    public double scaleMultiplierForGuardian = 1f;
    @Nest
    public ValueRange scaleMultiplierForGuardianRange = new ValueRange();
    @SectionHeader("Happy Ghast")
    @Comment("Happy Ghast")
    public double healthMultiplierForHappyGhast = 1f;
    @Nest
    public ValueRange healthMultiplierForHappyGhastRange = new ValueRange();
    public double speedMultiplierForHappyGhast = 1f;
    @Nest
    public ValueRange speedMultiplierForHappyGhastRange = new ValueRange();
    public double scaleMultiplierForHappyGhast = 1f;
    @Nest
    public ValueRange scaleMultiplierForHappyGhastRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForHoglinRange = new ValueRange();
    public double damageMultiplierForHoglin = 1f;
    @Nest
    public ValueRange damageMultiplierForHoglinRange = new ValueRange();
    public double speedMultiplierForHoglin = 1f;
    @Nest
    public ValueRange speedMultiplierForHoglinRange = new ValueRange();
    public double scaleMultiplierForHoglin = 1f;
    @Nest
    public ValueRange scaleMultiplierForHoglinRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForHorseRange = new ValueRange();
    public double speedMultiplierForHorse = 1f;
    @Nest
    public ValueRange speedMultiplierForHorseRange = new ValueRange();
    public double scaleMultiplierForHorse = 1f;
    @Nest
    public ValueRange scaleMultiplierForHorseRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForHuskRange = new ValueRange();
    public double damageMultiplierForHusk = 1f;
    @Nest
    public ValueRange damageMultiplierForHuskRange = new ValueRange();
    public double speedMultiplierForHusk = 1f;
    @Nest
    public ValueRange speedMultiplierForHuskRange = new ValueRange();
    public double scaleMultiplierForHusk = 1f;
    @Nest
    public ValueRange scaleMultiplierForHuskRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForIllusionerRange = new ValueRange();
    public double damageMultiplierForIllusioner = 1f;
    @Nest
    public ValueRange damageMultiplierForIllusionerRange = new ValueRange();
    public double speedMultiplierForIllusioner = 1f;
    @Nest
    public ValueRange speedMultiplierForIllusionerRange = new ValueRange();
    public double scaleMultiplierForIllusioner = 1f;
    @Nest
    public ValueRange scaleMultiplierForIllusionerRange = new ValueRange();
    @SectionHeader("Iron Golem")
    @Comment("Iron Golem")
    public double healthMultiplierForIronGolem = 1f;
    @Nest
    public ValueRange healthMultiplierForIronGolemRange = new ValueRange();
    public double damageMultiplierForIronGolem = 1f;
    @Nest
    public ValueRange damageMultiplierForIronGolemRange = new ValueRange();
    public double speedMultiplierForIronGolem = 1f;
    @Nest
    public ValueRange speedMultiplierForIronGolemRange = new ValueRange();
    public double scaleMultiplierForIronGolem = 1f;
    @Nest
    public ValueRange scaleMultiplierForIronGolemRange = new ValueRange();
    @SectionHeader("Llama")
    @Comment("Llama")
    public double healthMultiplierForLlama = 1f;
    @Nest
    public ValueRange healthMultiplierForLlamaRange = new ValueRange();
    public double damageMultiplierForLlama = 1f;
    @Nest
    public ValueRange damageMultiplierForLlamaRange = new ValueRange();
    public double speedMultiplierForLlama = 1f;
    @Nest
    public ValueRange speedMultiplierForLlamaRange = new ValueRange();
    public double scaleMultiplierForLlama = 1f;
    @Nest
    public ValueRange scaleMultiplierForLlamaRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForMagmaCubeRange = new ValueRange();
    public double damageMultiplierForMagmaCube = 1f;
    @Nest
    public ValueRange damageMultiplierForMagmaCubeRange = new ValueRange();
    public double speedMultiplierForMagmaCube = 1f;
    @Nest
    public ValueRange speedMultiplierForMagmaCubeRange = new ValueRange();
    public double scaleMultiplierForMagmaCube = 1f;
    @Nest
    public ValueRange scaleMultiplierForMagmaCubeRange = new ValueRange();
    @SectionHeader("Mooshroom")
    @Comment("Mooshroom")
    public double healthMultiplierForMooshroom = 1f;
    @Nest
    public ValueRange healthMultiplierForMooshroomRange = new ValueRange();
    public double speedMultiplierForMooshroom = 1f;
    @Nest
    public ValueRange speedMultiplierForMooshroomRange = new ValueRange();
    public double scaleMultiplierForMooshroom = 1f;
    @Nest
    public ValueRange scaleMultiplierForMooshroomRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForMuleRange = new ValueRange();
    public double speedMultiplierForMule = 1f;
    @Nest
    public ValueRange speedMultiplierForMuleRange = new ValueRange();
    public double scaleMultiplierForMule = 1f;
    @Nest
    public ValueRange scaleMultiplierForMuleRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForNautilusRange = new ValueRange();
    public double speedMultiplierForNautilus = 1f;
    @Nest
    public ValueRange speedMultiplierForNautilusRange = new ValueRange();
    public double scaleMultiplierForNautilus = 1f;
    @Nest
    public ValueRange scaleMultiplierForNautilusRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForOcelotRange = new ValueRange();
    public double damageMultiplierForOcelot = 1f;
    @Nest
    public ValueRange damageMultiplierForOcelotRange = new ValueRange();
    public double speedMultiplierForOcelot = 1f;
    @Nest
    public ValueRange speedMultiplierForOcelotRange = new ValueRange();
    public double scaleMultiplierForOcelot = 1f;
    @Nest
    public ValueRange scaleMultiplierForOcelotRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForPandaRange = new ValueRange();
    public double damageMultiplierForPanda = 1f;
    @Nest
    public ValueRange damageMultiplierForPandaRange = new ValueRange();
    public double speedMultiplierForPanda = 1f;
    @Nest
    public ValueRange speedMultiplierForPandaRange = new ValueRange();
    public double scaleMultiplierForPanda = 1f;
    @Nest
    public ValueRange scaleMultiplierForPandaRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForParchedRange = new ValueRange();
    public double damageMultiplierForParched = 1f;
    @Nest
    public ValueRange damageMultiplierForParchedRange = new ValueRange();
    public double speedMultiplierForParched = 1f;
    @Nest
    public ValueRange speedMultiplierForParchedRange = new ValueRange();
    public double scaleMultiplierForParched = 1f;
    @Nest
    public ValueRange scaleMultiplierForParchedRange = new ValueRange();
    @SectionHeader("Parrot")
    @Comment("Parrot")
    public double healthMultiplierForParrot = 1f;
    @Nest
    public ValueRange healthMultiplierForParrotRange = new ValueRange();
    public double speedMultiplierForParrot = 1f;
    @Nest
    public ValueRange speedMultiplierForParrotRange = new ValueRange();
    public double scaleMultiplierForParrot = 1f;
    @Nest
    public ValueRange scaleMultiplierForParrotRange = new ValueRange();
    @SectionHeader("Phantom")
    @Comment("Phantom")
    public double healthMultiplierForPhantom = 1f;
    @Nest
    public ValueRange healthMultiplierForPhantomRange = new ValueRange();
    public double damageMultiplierForPhantom = 1f;
    @Nest
    public ValueRange damageMultiplierForPhantomRange = new ValueRange();
    public double scaleMultiplierForPhantom = 1f;
    @Nest
    public ValueRange scaleMultiplierForPhantomRange = new ValueRange();
    @SectionHeader("Pig")
    @Comment("Pig")
    public double healthMultiplierForPig = 1f;
    @Nest
    public ValueRange healthMultiplierForPigRange = new ValueRange();
    public double speedMultiplierForPig = 1f;
    @Nest
    public ValueRange speedMultiplierForPigRange = new ValueRange();
    public double scaleMultiplierForPig = 1f;
    @Nest
    public ValueRange scaleMultiplierForPigRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForPiglinRange = new ValueRange();
    public double damageMultiplierForPiglin = 1f;
    @Nest
    public ValueRange damageMultiplierForPiglinRange = new ValueRange();
    public double speedMultiplierForPiglin = 1f;
    @Nest
    public ValueRange speedMultiplierForPiglinRange = new ValueRange();
    public double scaleMultiplierForPiglin = 1f;
    @Nest
    public ValueRange scaleMultiplierForPiglinRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForPiglinBruteRange = new ValueRange();
    public double damageMultiplierForPiglinBrute = 1f;
    @Nest
    public ValueRange damageMultiplierForPiglinBruteRange = new ValueRange();
    public double speedMultiplierForPiglinBrute = 1f;
    @Nest
    public ValueRange speedMultiplierForPiglinBruteRange = new ValueRange();
    public double scaleMultiplierForPiglinBrute = 1f;
    @Nest
    public ValueRange scaleMultiplierForPiglinBruteRange = new ValueRange();
    @SectionHeader("Pillager")
    @Comment("Pillager")
    public double healthMultiplierForPillager = 1f;
    @Nest
    public ValueRange healthMultiplierForPillagerRange = new ValueRange();
    public double damageMultiplierForPillager = 1f;
    @Nest
    public ValueRange damageMultiplierForPillagerRange = new ValueRange();
    public double speedMultiplierForPillager = 1f;
    @Nest
    public ValueRange speedMultiplierForPillagerRange = new ValueRange();
    public double scaleMultiplierForPillager = 1f;
    @Nest
    public ValueRange scaleMultiplierForPillagerRange = new ValueRange();
    @SectionHeader("Polar Bear")
    @Comment("Polar Bear")
    public double healthMultiplierForPolarBear = 1f;
    @Nest
    public ValueRange healthMultiplierForPolarBearRange = new ValueRange();
    public double damageMultiplierForPolarBear = 1f;
    @Nest
    public ValueRange damageMultiplierForPolarBearRange = new ValueRange();
    public double speedMultiplierForPolarBear = 1f;
    @Nest
    public ValueRange speedMultiplierForPolarBearRange = new ValueRange();
    public double scaleMultiplierForPolarBear = 1f;
    @Nest
    public ValueRange scaleMultiplierForPolarBearRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForPufferfishRange = new ValueRange();
    public double speedMultiplierForPufferfish = 1f;
    @Nest
    public ValueRange speedMultiplierForPufferfishRange = new ValueRange();
    public double scaleMultiplierForPufferfish = 1f;
    @Nest
    public ValueRange scaleMultiplierForPufferfishRange = new ValueRange();
    @SectionHeader("Rabbit")
    @Comment("Rabbit")
    public double healthMultiplierForRabbit = 1f;
    @Nest
    public ValueRange healthMultiplierForRabbitRange = new ValueRange();
    public double damageMultiplierForRabbit = 1f;
    @Nest
    public ValueRange damageMultiplierForRabbitRange = new ValueRange();
    public double speedMultiplierForRabbit = 1f;
    @Nest
    public ValueRange speedMultiplierForRabbitRange = new ValueRange();
    public double scaleMultiplierForRabbit = 1f;
    @Nest
    public ValueRange scaleMultiplierForRabbitRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForRavagerRange = new ValueRange();
    public double damageMultiplierForRavager = 1f;
    @Nest
    public ValueRange damageMultiplierForRavagerRange = new ValueRange();
    public double speedMultiplierForRavager = 1f;
    @Nest
    public ValueRange speedMultiplierForRavagerRange = new ValueRange();
    public double scaleMultiplierForRavager = 1f;
    @Nest
    public ValueRange scaleMultiplierForRavagerRange = new ValueRange();
    @SectionHeader("Salmon")
    @Comment("Salmon")
    public double healthMultiplierForSalmon = 1f;
    @Nest
    public ValueRange healthMultiplierForSalmonRange = new ValueRange();
    public double speedMultiplierForSalmon = 1f;
    @Nest
    public ValueRange speedMultiplierForSalmonRange = new ValueRange();
    public double scaleMultiplierForSalmon = 1f;
    @Nest
    public ValueRange scaleMultiplierForSalmonRange = new ValueRange();
    @SectionHeader("Sheep")
    @Comment("Sheep")
    public double healthMultiplierForSheep = 1f;
    @Nest
    public ValueRange healthMultiplierForSheepRange = new ValueRange();
    public double speedMultiplierForSheep = 1f;
    @Nest
    public ValueRange speedMultiplierForSheepRange = new ValueRange();
    public double scaleMultiplierForSheep = 1f;
    @Nest
    public ValueRange scaleMultiplierForSheepRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForShulkerRange = new ValueRange();
    public double damageMultiplierForShulker = 1f;
    @Nest
    public ValueRange damageMultiplierForShulkerRange = new ValueRange();
    public double scaleMultiplierForShulker = 1f;
    @Nest
    public ValueRange scaleMultiplierForShulkerRange = new ValueRange();
    @SectionHeader("Silverfish")
    @Comment("Silverfish")
    public double healthMultiplierForSilverfish = 1f;
    @Nest
    public ValueRange healthMultiplierForSilverfishRange = new ValueRange();
    public double damageMultiplierForSilverfish = 1f;
    @Nest
    public ValueRange damageMultiplierForSilverfishRange = new ValueRange();
    public double speedMultiplierForSilverfish = 1f;
    @Nest
    public ValueRange speedMultiplierForSilverfishRange = new ValueRange();
    public double scaleMultiplierForSilverfish = 1f;
    @Nest
    public ValueRange scaleMultiplierForSilverfishRange = new ValueRange();
    @SectionHeader("Skeleton")
    @Comment("Skeleton")
    public double healthMultiplierForSkeleton = 1f;
    @Nest
    public ValueRange healthMultiplierForSkeletonRange = new ValueRange();
    public double damageMultiplierForSkeleton = 1f;
    @Nest
    public ValueRange damageMultiplierForSkeletonRange = new ValueRange();
    public double speedMultiplierForSkeleton = 1f;
    @Nest
    public ValueRange speedMultiplierForSkeletonRange = new ValueRange();
    public double scaleMultiplierForSkeleton = 1f;
    @Nest
    public ValueRange scaleMultiplierForSkeletonRange = new ValueRange();
    @SectionHeader("Skeleton Horse")
    @Comment("Skeleton Horse")
    public double healthMultiplierForSkeletonHorse = 1f;
    @Nest
    public ValueRange healthMultiplierForSkeletonHorseRange = new ValueRange();
    public double speedMultiplierForSkeletonHorse = 1f;
    @Nest
    public ValueRange speedMultiplierForSkeletonHorseRange = new ValueRange();
    public double scaleMultiplierForSkeletonHorse = 1f;
    @Nest
    public ValueRange scaleMultiplierForSkeletonHorseRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForSlimeRange = new ValueRange();
    public double damageMultiplierForSlime = 1f;
    @Nest
    public ValueRange damageMultiplierForSlimeRange = new ValueRange();
    public double speedMultiplierForSlime = 1f;
    @Nest
    public ValueRange speedMultiplierForSlimeRange = new ValueRange();
    public double scaleMultiplierForSlime = 1f;
    @Nest
    public ValueRange scaleMultiplierForSlimeRange = new ValueRange();
    @SectionHeader("Sniffer")
    @Comment("Sniffer")
    public double healthMultiplierForSniffer = 1f;
    @Nest
    public ValueRange healthMultiplierForSnifferRange = new ValueRange();
    public double speedMultiplierForSniffer = 1f;
    @Nest
    public ValueRange speedMultiplierForSnifferRange = new ValueRange();
    public double scaleMultiplierForSniffer = 1f;
    @Nest
    public ValueRange scaleMultiplierForSnifferRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForSnowGolemRange = new ValueRange();
    public double damageMultiplierForSnowGolem = 1f;
    @Nest
    public ValueRange damageMultiplierForSnowGolemRange = new ValueRange();
    public double speedMultiplierForSnowGolem = 1f;
    @Nest
    public ValueRange speedMultiplierForSnowGolemRange = new ValueRange();
    public double scaleMultiplierForSnowGolem = 1f;
    @Nest
    public ValueRange scaleMultiplierForSnowGolemRange = new ValueRange();
    @SectionHeader("Spider")
    @Comment("Spider")
    public double healthMultiplierForSpider = 1f;
    @Nest
    public ValueRange healthMultiplierForSpiderRange = new ValueRange();
    public double damageMultiplierForSpider = 1f;
    @Nest
    public ValueRange damageMultiplierForSpiderRange = new ValueRange();
    public double speedMultiplierForSpider = 1f;
    @Nest
    public ValueRange speedMultiplierForSpiderRange = new ValueRange();
    public double scaleMultiplierForSpider = 1f;
    @Nest
    public ValueRange scaleMultiplierForSpiderRange = new ValueRange();
    @SectionHeader("Squid")
    @Comment("Squid")
    public double healthMultiplierForSquid = 1f;
    @Nest
    public ValueRange healthMultiplierForSquidRange = new ValueRange();
    public double speedMultiplierForSquid = 1f;
    @Nest
    public ValueRange speedMultiplierForSquidRange = new ValueRange();
    public double scaleMultiplierForSquid = 1f;
    @Nest
    public ValueRange scaleMultiplierForSquidRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForStrayRange = new ValueRange();
    public double damageMultiplierForStray = 1f;
    @Nest
    public ValueRange damageMultiplierForStrayRange = new ValueRange();
    public double speedMultiplierForStray = 1f;
    @Nest
    public ValueRange speedMultiplierForStrayRange = new ValueRange();
    public double scaleMultiplierForStray = 1f;
    @Nest
    public ValueRange scaleMultiplierForStrayRange = new ValueRange();
    @SectionHeader("Strider")
    @Comment("Strider")
    public double healthMultiplierForStrider = 1f;
    @Nest
    public ValueRange healthMultiplierForStriderRange = new ValueRange();
    public double speedMultiplierForStrider = 1f;
    @Nest
    public ValueRange speedMultiplierForStriderRange = new ValueRange();
    public double scaleMultiplierForStrider = 1f;
    @Nest
    public ValueRange scaleMultiplierForStriderRange = new ValueRange();
    @Nest
    public BabyStrider babyStrider = new BabyStrider();
    public static class BabyStrider {
        public double healthMultiplierForBabyStrider = 1f;
        public double speedMultiplierForBabyStrider = 1f;
        public double scaleMultiplierForBabyStrider = 1f;
    }
    @SectionHeader("Sulfur Cube")
    @Comment("Sulfur Cube")
    public double healthMultiplierForSulfurCube = 1f;
    @Nest
    public ValueRange healthMultiplierForSulfurCubeRange = new ValueRange();
    public double speedMultiplierForSulfurCube = 1f;
    @Nest
    public ValueRange speedMultiplierForSulfurCubeRange = new ValueRange();
    public double scaleMultiplierForSulfurCube = 1f;
    @Nest
    public ValueRange scaleMultiplierForSulfurCubeRange = new ValueRange();
    @Nest
    public BabySulfurCube babySulfurCube = new BabySulfurCube();
    public static class BabySulfurCube {
        public double healthMultiplierForBabySulfurCube = 1f;
        public double speedMultiplierForBabySulfurCube = 1f;
        public double scaleMultiplierForBabySulfurCube = 1f;
    }
    @SectionHeader("Tadpole")
    @Comment("Tadpole")
    public double healthMultiplierForTadpole = 1f;
    @Nest
    public ValueRange healthMultiplierForTadpoleRange = new ValueRange();
    public double speedMultiplierForTadpole = 1f;
    @Nest
    public ValueRange speedMultiplierForTadpoleRange = new ValueRange();
    public double scaleMultiplierForTadpole = 1f;
    @Nest
    public ValueRange scaleMultiplierForTadpoleRange = new ValueRange();
    @SectionHeader("Trader Llama")
    @Comment("Trader Llama")
    public double healthMultiplierForTraderLlama = 1f;
    @Nest
    public ValueRange healthMultiplierForTraderLlamaRange = new ValueRange();
    public double damageMultiplierForTraderLlama = 1f;
    @Nest
    public ValueRange damageMultiplierForTraderLlamaRange = new ValueRange();
    public double speedMultiplierForTraderLlama = 1f;
    @Nest
    public ValueRange speedMultiplierForTraderLlamaRange = new ValueRange();
    public double scaleMultiplierForTraderLlama = 1f;
    @Nest
    public ValueRange scaleMultiplierForTraderLlamaRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForTropicalFishRange = new ValueRange();
    public double speedMultiplierForTropicalFish = 1f;
    @Nest
    public ValueRange speedMultiplierForTropicalFishRange = new ValueRange();
    public double scaleMultiplierForTropicalFish = 1f;
    @Nest
    public ValueRange scaleMultiplierForTropicalFishRange = new ValueRange();
    @SectionHeader("Turtle")
    @Comment("Turtle")
    public double healthMultiplierForTurtle = 1f;
    @Nest
    public ValueRange healthMultiplierForTurtleRange = new ValueRange();
    public double speedMultiplierForTurtle = 1f;
    @Nest
    public ValueRange speedMultiplierForTurtleRange = new ValueRange();
    public double scaleMultiplierForTurtle = 1f;
    @Nest
    public ValueRange scaleMultiplierForTurtleRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForVexRange = new ValueRange();
    public double damageMultiplierForVex = 1f;
    @Nest
    public ValueRange damageMultiplierForVexRange = new ValueRange();
    public double speedMultiplierForVex = 1f;
    @Nest
    public ValueRange speedMultiplierForVexRange = new ValueRange();
    public double scaleMultiplierForVex = 1f;
    @Nest
    public ValueRange scaleMultiplierForVexRange = new ValueRange();
    @SectionHeader("Villager")
    @Comment("Villager")
    public double healthMultiplierForVillager = 1f;
    @Nest
    public ValueRange healthMultiplierForVillagerRange = new ValueRange();
    public double speedMultiplierForVillager = 1f;
    @Nest
    public ValueRange speedMultiplierForVillagerRange = new ValueRange();
    public double scaleMultiplierForVillager = 1f;
    @Nest
    public ValueRange scaleMultiplierForVillagerRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForVindicatorRange = new ValueRange();
    public double damageMultiplierForVindicator = 1f;
    @Nest
    public ValueRange damageMultiplierForVindicatorRange = new ValueRange();
    public double speedMultiplierForVindicator = 1f;
    @Nest
    public ValueRange speedMultiplierForVindicatorRange = new ValueRange();
    public double scaleMultiplierForVindicator = 1f;
    @Nest
    public ValueRange scaleMultiplierForVindicatorRange = new ValueRange();
    @SectionHeader("Wandering Trader")
    @Comment("Wandering Trader")
    public double healthMultiplierForWanderingTrader = 1f;
    @Nest
    public ValueRange healthMultiplierForWanderingTraderRange = new ValueRange();
    public double speedMultiplierForWanderingTrader = 1f;
    @Nest
    public ValueRange speedMultiplierForWanderingTraderRange = new ValueRange();
    public double scaleMultiplierForWanderingTrader = 1f;
    @Nest
    public ValueRange scaleMultiplierForWanderingTraderRange = new ValueRange();
    @SectionHeader("Warden")
    @Comment("Warden")
    public double healthMultiplierForWarden = 1f;
    @Nest
    public ValueRange healthMultiplierForWardenRange = new ValueRange();
    public double damageMultiplierForWarden = 1f;
    @Nest
    public ValueRange damageMultiplierForWardenRange = new ValueRange();
    public double speedMultiplierForWarden = 1f;
    @Nest
    public ValueRange speedMultiplierForWardenRange = new ValueRange();
    public double scaleMultiplierForWarden = 1f;
    @Nest
    public ValueRange scaleMultiplierForWardenRange = new ValueRange();
    @SectionHeader("Witch")
    @Comment("Witch")
    public double healthMultiplierForWitch = 1f;
    @Nest
    public ValueRange healthMultiplierForWitchRange = new ValueRange();
    public double damageMultiplierForWitch = 1f;
    @Nest
    public ValueRange damageMultiplierForWitchRange = new ValueRange();
    public double speedMultiplierForWitch = 1f;
    @Nest
    public ValueRange speedMultiplierForWitchRange = new ValueRange();
    public double scaleMultiplierForWitch = 1f;
    @Nest
    public ValueRange scaleMultiplierForWitchRange = new ValueRange();
    @SectionHeader("Wither")
    @Comment("Wither")
    public double healthMultiplierForWither = 1f;
    @Nest
    public ValueRange healthMultiplierForWitherRange = new ValueRange();
    public double damageMultiplierForWither = 1f;
    @Nest
    public ValueRange damageMultiplierForWitherRange = new ValueRange();
    public double speedMultiplierForWither = 1f;
    @Nest
    public ValueRange speedMultiplierForWitherRange = new ValueRange();
    public double scaleMultiplierForWither = 1f;
    @Nest
    public ValueRange scaleMultiplierForWitherRange = new ValueRange();
    @SectionHeader("Wither Skeleton")
    @Comment("Wither Skeleton")
    public double healthMultiplierForWitherSkeleton = 1f;
    @Nest
    public ValueRange healthMultiplierForWitherSkeletonRange = new ValueRange();
    public double damageMultiplierForWitherSkeleton = 1f;
    @Nest
    public ValueRange damageMultiplierForWitherSkeletonRange = new ValueRange();
    public double speedMultiplierForWitherSkeleton = 1f;
    @Nest
    public ValueRange speedMultiplierForWitherSkeletonRange = new ValueRange();
    public double scaleMultiplierForWitherSkeleton = 1f;
    @Nest
    public ValueRange scaleMultiplierForWitherSkeletonRange = new ValueRange();
    @SectionHeader("Wolf")
    @Comment("Wolf")
    public double healthMultiplierForWolf = 1f;
    @Nest
    public ValueRange healthMultiplierForWolfRange = new ValueRange();
    public double damageMultiplierForWolf = 1f;
    @Nest
    public ValueRange damageMultiplierForWolfRange = new ValueRange();
    public double speedMultiplierForWolf = 1f;
    @Nest
    public ValueRange speedMultiplierForWolfRange = new ValueRange();
    public double scaleMultiplierForWolf = 1f;
    @Nest
    public ValueRange scaleMultiplierForWolfRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForZoglinRange = new ValueRange();
    public double damageMultiplierForZoglin = 1f;
    @Nest
    public ValueRange damageMultiplierForZoglinRange = new ValueRange();
    public double speedMultiplierForZoglin = 1f;
    @Nest
    public ValueRange speedMultiplierForZoglinRange = new ValueRange();
    public double scaleMultiplierForZoglin = 1f;
    @Nest
    public ValueRange scaleMultiplierForZoglinRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForZombieRange = new ValueRange();
    public double damageMultiplierForZombie = 1f;
    @Nest
    public ValueRange damageMultiplierForZombieRange = new ValueRange();
    public double speedMultiplierForZombie = 1f;
    @Nest
    public ValueRange speedMultiplierForZombieRange = new ValueRange();
    public double scaleMultiplierForZombie = 1f;
    @Nest
    public ValueRange scaleMultiplierForZombieRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForZombieHorseRange = new ValueRange();
    public double speedMultiplierForZombieHorse = 1f;
    @Nest
    public ValueRange speedMultiplierForZombieHorseRange = new ValueRange();
    public double scaleMultiplierForZombieHorse = 1f;
    @Nest
    public ValueRange scaleMultiplierForZombieHorseRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForZombieNautilusRange = new ValueRange();
    public double damageMultiplierForZombieNautilus = 1f;
    @Nest
    public ValueRange damageMultiplierForZombieNautilusRange = new ValueRange();
    public double speedMultiplierForZombieNautilus = 1f;
    @Nest
    public ValueRange speedMultiplierForZombieNautilusRange = new ValueRange();
    public double scaleMultiplierForZombieNautilus = 1f;
    @Nest
    public ValueRange scaleMultiplierForZombieNautilusRange = new ValueRange();
    @SectionHeader("Zombie Villager")
    @Comment("Zombie Villager")
    public double healthMultiplierForZombieVillager = 1f;
    @Nest
    public ValueRange healthMultiplierForZombieVillagerRange = new ValueRange();
    public double damageMultiplierForZombieVillager = 1f;
    @Nest
    public ValueRange damageMultiplierForZombieVillagerRange = new ValueRange();
    public double speedMultiplierForZombieVillager = 1f;
    @Nest
    public ValueRange speedMultiplierForZombieVillagerRange = new ValueRange();
    public double scaleMultiplierForZombieVillager = 1f;
    @Nest
    public ValueRange scaleMultiplierForZombieVillagerRange = new ValueRange();
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
    @Nest
    public ValueRange healthMultiplierForZombifiedPiglinRange = new ValueRange();
    public double damageMultiplierForZombifiedPiglin = 1f;
    @Nest
    public ValueRange damageMultiplierForZombifiedPiglinRange = new ValueRange();
    public double speedMultiplierForZombifiedPiglin = 1f;
    @Nest
    public ValueRange speedMultiplierForZombifiedPiglinRange = new ValueRange();
    public double scaleMultiplierForZombifiedPiglin = 1f;
    @Nest
    public ValueRange scaleMultiplierForZombifiedPiglinRange = new ValueRange();
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
        @Nest
        public ValueRange healthMultiplierForCubozoaRange = new ValueRange();
        @SectionHeader("Dragonfly")
        @Comment("Dragonfly")
        public double healthMultiplierForDragonfly = 1f;
        @Nest
        public ValueRange healthMultiplierForDragonflyRange = new ValueRange();
        public double scaleMultiplierForDragonfly = 1f;
        @Nest
        public ValueRange scaleMultiplierForDragonflyRange = new ValueRange();
        @SectionHeader("End Fish")
        @Comment("End Fish")
        public double healthMultiplierForEndFish = 1f;
        @Nest
        public ValueRange healthMultiplierForEndFishRange = new ValueRange();
        @SectionHeader("End Slime")
        @Comment("End Slime")
        public double healthMultiplierForEndSlime = 1f;
        @Nest
        public ValueRange healthMultiplierForEndSlimeRange = new ValueRange();
        public double damageMultiplierForEndSlime = 1f;
        @Nest
        public ValueRange damageMultiplierForEndSlimeRange = new ValueRange();
        public double speedMultiplierForEndSlime = 1f;
        @Nest
        public ValueRange speedMultiplierForEndSlimeRange = new ValueRange();
        public double scaleMultiplierForEndSlime = 1f;
        @Nest
        public ValueRange scaleMultiplierForEndSlimeRange = new ValueRange();
        @SectionHeader("Shadow Walker")
        @Comment("Shadow Walker")
        public double healthMultiplierForShadowWalker = 1f;
        @Nest
        public ValueRange healthMultiplierForShadowWalkerRange = new ValueRange();
        public double damageMultiplierForShadowWalker = 1f;
        @Nest
        public ValueRange damageMultiplierForShadowWalkerRange = new ValueRange();
        public double speedMultiplierForShadowWalker = 1f;
        @Nest
        public ValueRange speedMultiplierForShadowWalkerRange = new ValueRange();
        public double scaleMultiplierForShadowWalker = 1f;
        @Nest
        public ValueRange scaleMultiplierForShadowWalkerRange = new ValueRange();
        @SectionHeader("Silk Moth")
        @Comment("Silk Moth")
        public double healthMultiplierForSilkMoth = 1f;
        @Nest
        public ValueRange healthMultiplierForSilkMothRange = new ValueRange();
        public double scaleMultiplierForSilkMoth = 1f;
        @Nest
        public ValueRange scaleMultiplierForSilkMothRange = new ValueRange();
    }
    @Nest
    public BetterNether betterNether = new BetterNether();
    public static class BetterNether {
        @SectionHeader("Firefly")
        @Comment("Firefly")
        public double healthMultiplierForFirefly = 1f;
        @Nest
        public ValueRange healthMultiplierForFireflyRange = new ValueRange();
        public double damageMultiplierForFirefly = 1f;
        @Nest
        public ValueRange damageMultiplierForFireflyRange = new ValueRange();
        public double scaleMultiplierForFirefly = 1f;
        @Nest
        public ValueRange scaleMultiplierForFireflyRange = new ValueRange();
        @SectionHeader("Flying Pig")
        @Comment("Flying Pig")
        public double healthMultiplierForFlyingPig = 1f;
        @Nest
        public ValueRange healthMultiplierForFlyingPigRange = new ValueRange();
        public double damageMultiplierForFlyingPig = 1f;
        @Nest
        public ValueRange damageMultiplierForFlyingPigRange = new ValueRange();
        public double speedMultiplierForFlyingPig = 1f;
        @Nest
        public ValueRange speedMultiplierForFlyingPigRange = new ValueRange();
        public double scaleMultiplierForFlyingPig = 1f;
        @Nest
        public ValueRange scaleMultiplierForFlyingPigRange = new ValueRange();
        @SectionHeader("Hydrogen Jellyfish")
        @Comment("Hydrogen Jellyfish")
        public double healthMultiplierForHydrogenJellyfish = 1f;
        @Nest
        public ValueRange healthMultiplierForHydrogenJellyfishRange = new ValueRange();
        public double damageMultiplierForHydrogenJellyfish = 1f;
        @Nest
        public ValueRange damageMultiplierForHydrogenJellyfishRange = new ValueRange();
        public double scaleMultiplierForHydrogenJellyfish = 1f;
        @Nest
        public ValueRange scaleMultiplierForHydrogenJellyfishRange = new ValueRange();
        @SectionHeader("Jungle Skeleton")
        @Comment("Jungle Skeleton")
        public double healthMultiplierForJungleSkeleton = 1f;
        @Nest
        public ValueRange healthMultiplierForJungleSkeletonRange = new ValueRange();
        public double damageMultiplierForJungleSkeleton = 1f;
        @Nest
        public ValueRange damageMultiplierForJungleSkeletonRange = new ValueRange();
        public double speedMultiplierForJungleSkeleton = 1f;
        @Nest
        public ValueRange speedMultiplierForJungleSkeletonRange = new ValueRange();
        public double scaleMultiplierForJungleSkeleton = 1f;
        @Nest
        public ValueRange scaleMultiplierForJungleSkeletonRange = new ValueRange();
        @SectionHeader("Naga")
        @Comment("Naga")
        public double healthMultiplierForNaga = 1f;
        @Nest
        public ValueRange healthMultiplierForNagaRange = new ValueRange();
        public double damageMultiplierForNaga = 1f;
        @Nest
        public ValueRange damageMultiplierForNagaRange = new ValueRange();
        public double speedMultiplierForNaga = 1f;
        @Nest
        public ValueRange speedMultiplierForNagaRange = new ValueRange();
        public double scaleMultiplierForNaga = 1f;
        @Nest
        public ValueRange scaleMultiplierForNagaRange = new ValueRange();
        @SectionHeader("Skull")
        @Comment("Skull")
        public double healthMultiplierForSkull = 1f;
        @Nest
        public ValueRange healthMultiplierForSkullRange = new ValueRange();
        public double damageMultiplierForSkull = 1f;
        @Nest
        public ValueRange damageMultiplierForSkullRange = new ValueRange();
        public double scaleMultiplierForSkull = 1f;
        @Nest
        public ValueRange scaleMultiplierForSkullRange = new ValueRange();
    }
    @Nest
    public DeeperAndDarker deeperAndDarker = new DeeperAndDarker();
    public static class DeeperAndDarker {
        @SectionHeader("Angler Fish")
        @Comment("Angler Fish")
        public double healthMultiplierForAnglerFish = 1f;
        @Nest
        public ValueRange healthMultiplierForAnglerFishRange = new ValueRange();
        public double damageMultiplierForAnglerFish = 1f;
        @Nest
        public ValueRange damageMultiplierForAnglerFishRange = new ValueRange();
        public double speedMultiplierForAnglerFish = 1f;
        @Nest
        public ValueRange speedMultiplierForAnglerFishRange = new ValueRange();
        public double scaleMultiplierForAnglerFish = 1f;
        @Nest
        public ValueRange scaleMultiplierForAnglerFishRange = new ValueRange();
        @SectionHeader("Sculk Centipede")
        @Comment("Sculk Centipede")
        public double healthMultiplierForSculkCentipede = 1f;
        @Nest
        public ValueRange healthMultiplierForSculkCentipedeRange = new ValueRange();
        public double damageMultiplierForSculkCentipede = 1f;
        @Nest
        public ValueRange damageMultiplierForSculkCentipedeRange = new ValueRange();
        public double speedMultiplierForSculkCentipede = 1f;
        @Nest
        public ValueRange speedMultiplierForSculkCentipedeRange = new ValueRange();
        public double scaleMultiplierForSculkCentipede = 1f;
        @Nest
        public ValueRange scaleMultiplierForSculkCentipedeRange = new ValueRange();
        @SectionHeader("Sculk Leech")
        @Comment("Sculk Leech")
        public double healthMultiplierForSculkLeech = 1f;
        @Nest
        public ValueRange healthMultiplierForSculkLeechRange = new ValueRange();
        public double damageMultiplierForSculkLeech = 1f;
        @Nest
        public ValueRange damageMultiplierForSculkLeechRange = new ValueRange();
        public double speedMultiplierForSculkLeech = 1f;
        @Nest
        public ValueRange speedMultiplierForSculkLeechRange = new ValueRange();
        public double scaleMultiplierForSculkLeech = 1f;
        @Nest
        public ValueRange scaleMultiplierForSculkLeechRange = new ValueRange();
        @SectionHeader("Sculk Snapper")
        @Comment("Sculk Snapper")
        public double healthMultiplierForSculkSnapper = 1f;
        @Nest
        public ValueRange healthMultiplierForSculkSnapperRange = new ValueRange();
        public double damageMultiplierForSculkSnapper = 1f;
        @Nest
        public ValueRange damageMultiplierForSculkSnapperRange = new ValueRange();
        public double speedMultiplierForSculkSnapper = 1f;
        @Nest
        public ValueRange speedMultiplierForSculkSnapperRange = new ValueRange();
        public double scaleMultiplierForSculkSnapper = 1f;
        @Nest
        public ValueRange scaleMultiplierForSculkSnapperRange = new ValueRange();
        @SectionHeader("Shattered")
        @Comment("Shattered")
        public double healthMultiplierForShattered = 1f;
        @Nest
        public ValueRange healthMultiplierForShatteredRange = new ValueRange();
        public double damageMultiplierForShattered = 1f;
        @Nest
        public ValueRange damageMultiplierForShatteredRange = new ValueRange();
        public double speedMultiplierForShattered = 1f;
        @Nest
        public ValueRange speedMultiplierForShatteredRange = new ValueRange();
        public double scaleMultiplierForShattered = 1f;
        @Nest
        public ValueRange scaleMultiplierForShatteredRange = new ValueRange();
        @SectionHeader("Shriek Worm")
        @Comment("Shriek Worm")
        public double healthMultiplierForShriekWorm = 1f;
        @Nest
        public ValueRange healthMultiplierForShriekWormRange = new ValueRange();
        public double damageMultiplierForShriekWorm = 1f;
        @Nest
        public ValueRange damageMultiplierForShriekWormRange = new ValueRange();
        public double scaleMultiplierForShriekWorm = 1f;
        @Nest
        public ValueRange scaleMultiplierForShriekWormRange = new ValueRange();
        @SectionHeader("Sludge")
        @Comment("Sludge")
        public double healthMultiplierForSludge = 1f;
        @Nest
        public ValueRange healthMultiplierForSludgeRange = new ValueRange();
        public double damageMultiplierForSludge = 1f;
        @Nest
        public ValueRange damageMultiplierForSludgeRange = new ValueRange();
        public double speedMultiplierForSludge = 1f;
        @Nest
        public ValueRange speedMultiplierForSludgeRange = new ValueRange();
        public double scaleMultiplierForSludge = 1f;
        @Nest
        public ValueRange scaleMultiplierForSludgeRange = new ValueRange();
        @SectionHeader("Stalker")
        @Comment("Stalker")
        public double healthMultiplierForStalker = 1f;
        @Nest
        public ValueRange healthMultiplierForStalkerRange = new ValueRange();
        public double damageMultiplierForStalker = 1f;
        @Nest
        public ValueRange damageMultiplierForStalkerRange = new ValueRange();
        public double speedMultiplierForStalker = 1f;
        @Nest
        public ValueRange speedMultiplierForStalkerRange = new ValueRange();
        public double scaleMultiplierForStalker = 1f;
        @Nest
        public ValueRange scaleMultiplierForStalkerRange = new ValueRange();
    }
    @Nest
    public FriendsAndFoes friendsAndFoes = new FriendsAndFoes();
    public static class FriendsAndFoes {
        @SectionHeader("Crab")
        @Comment("Crab")
        public double healthMultiplierForCrab = 1f;
        @Nest
        public ValueRange healthMultiplierForCrabRange = new ValueRange();
        public double damageMultiplierForCrab = 1f;
        @Nest
        public ValueRange damageMultiplierForCrabRange = new ValueRange();
        public double speedMultiplierForCrab = 1f;
        @Nest
        public ValueRange speedMultiplierForCrabRange = new ValueRange();
        public double scaleMultiplierForCrab = 1f;
        @Nest
        public ValueRange scaleMultiplierForCrabRange = new ValueRange();
        @SectionHeader("Glare")
        @Comment("Glare")
        public double healthMultiplierForGlare = 1f;
        @Nest
        public ValueRange healthMultiplierForGlareRange = new ValueRange();
        public double damageMultiplierForGlare = 1f;
        @Nest
        public ValueRange damageMultiplierForGlareRange = new ValueRange();
        public double speedMultiplierForGlare = 1f;
        @Nest
        public ValueRange speedMultiplierForGlareRange = new ValueRange();
        public double scaleMultiplierForGlare = 1f;
        @Nest
        public ValueRange scaleMultiplierForGlareRange = new ValueRange();
        @SectionHeader("Iceologer")
        @Comment("Iceologer")
        public double healthMultiplierForIceologer = 1f;
        @Nest
        public ValueRange healthMultiplierForIceologerRange = new ValueRange();
        public double damageMultiplierForIceologer = 1f;
        @Nest
        public ValueRange damageMultiplierForIceologerRange = new ValueRange();
        public double speedMultiplierForIceologer = 1f;
        @Nest
        public ValueRange speedMultiplierForIceologerRange = new ValueRange();
        public double scaleMultiplierForIceologer = 1f;
        @Nest
        public ValueRange scaleMultiplierForIceologerRange = new ValueRange();
        @SectionHeader("Mauler")
        @Comment("Mauler")
        public double healthMultiplierForMauler = 1f;
        @Nest
        public ValueRange healthMultiplierForMaulerRange = new ValueRange();
        public double damageMultiplierForMauler = 1f;
        @Nest
        public ValueRange damageMultiplierForMaulerRange = new ValueRange();
        public double speedMultiplierForMauler = 1f;
        @Nest
        public ValueRange speedMultiplierForMaulerRange = new ValueRange();
        public double scaleMultiplierForMauler = 1f;
        @Nest
        public ValueRange scaleMultiplierForMaulerRange = new ValueRange();
        @SectionHeader("Moobloom")
        @Comment("Moobloom")
        public double healthMultiplierForMoobloom = 1f;
        @Nest
        public ValueRange healthMultiplierForMoobloomRange = new ValueRange();
        public double damageMultiplierForMoobloom = 1f;
        @Nest
        public ValueRange damageMultiplierForMoobloomRange = new ValueRange();
        public double speedMultiplierForMoobloom = 1f;
        @Nest
        public ValueRange speedMultiplierForMoobloomRange = new ValueRange();
        public double scaleMultiplierForMoobloom = 1f;
        @Nest
        public ValueRange scaleMultiplierForMoobloomRange = new ValueRange();
        @SectionHeader("Rascal")
        @Comment("Rascal")
        public double healthMultiplierForRascal = 1f;
        @Nest
        public ValueRange healthMultiplierForRascalRange = new ValueRange();
        public double damageMultiplierForRascal = 1f;
        @Nest
        public ValueRange damageMultiplierForRascalRange = new ValueRange();
        public double speedMultiplierForRascal = 1f;
        @Nest
        public ValueRange speedMultiplierForRascalRange = new ValueRange();
        public double scaleMultiplierForRascal = 1f;
        @Nest
        public ValueRange scaleMultiplierForRascalRange = new ValueRange();
        @SectionHeader("Tuff Golem")
        @Comment("Tuff Golem")
        public double healthMultiplierForTuffGolem = 1f;
        @Nest
        public ValueRange healthMultiplierForTuffGolemRange = new ValueRange();
        public double damageMultiplierForTuffGolem = 1f;
        @Nest
        public ValueRange damageMultiplierForTuffGolemRange = new ValueRange();
        public double speedMultiplierForTuffGolem = 1f;
        @Nest
        public ValueRange speedMultiplierForTuffGolemRange = new ValueRange();
        public double scaleMultiplierForTuffGolem = 1f;
        @Nest
        public ValueRange scaleMultiplierForTuffGolemRange = new ValueRange();
        @SectionHeader("Wildfire")
        @Comment("Wildfire")
        public double healthMultiplierForWildfire = 1f;
        @Nest
        public ValueRange healthMultiplierForWildfireRange = new ValueRange();
        public double damageMultiplierForWildfire = 1f;
        @Nest
        public ValueRange damageMultiplierForWildfireRange = new ValueRange();
        public double speedMultiplierForWildfire = 1f;
        @Nest
        public ValueRange speedMultiplierForWildfireRange = new ValueRange();
        public double scaleMultiplierForWildfire = 1f;
        @Nest
        public ValueRange scaleMultiplierForWildfireRange = new ValueRange();
    }
    @Nest
    public IllagerInvasion illagerInvasion = new IllagerInvasion();
    public static class IllagerInvasion {
        @SectionHeader("Alchemist")
        @Comment("Alchemist")
        public double healthMultiplierForAlchemist = 1f;
        @Nest
        public ValueRange healthMultiplierForAlchemistRange = new ValueRange();
        public double damageMultiplierForAlchemist = 1f;
        @Nest
        public ValueRange damageMultiplierForAlchemistRange = new ValueRange();
        public double speedMultiplierForAlchemist = 1f;
        @Nest
        public ValueRange speedMultiplierForAlchemistRange = new ValueRange();
        public double scaleMultiplierForAlchemist = 1f;
        @Nest
        public ValueRange scaleMultiplierForAlchemistRange = new ValueRange();
        @SectionHeader("Archivist")
        @Comment("Archivist")
        public double healthMultiplierForArchivist = 1f;
        @Nest
        public ValueRange healthMultiplierForArchivistRange = new ValueRange();
        public double damageMultiplierForArchivist = 1f;
        @Nest
        public ValueRange damageMultiplierForArchivistRange = new ValueRange();
        public double speedMultiplierForArchivist = 1f;
        @Nest
        public ValueRange speedMultiplierForArchivistRange = new ValueRange();
        public double scaleMultiplierForArchivist = 1f;
        @Nest
        public ValueRange scaleMultiplierForArchivistRange = new ValueRange();
        @SectionHeader("Basher")
        @Comment("Basher")
        public double healthMultiplierForBasher = 1f;
        @Nest
        public ValueRange healthMultiplierForBasherRange = new ValueRange();
        public double damageMultiplierForBasher = 1f;
        @Nest
        public ValueRange damageMultiplierForBasherRange = new ValueRange();
        public double speedMultiplierForBasher = 1f;
        @Nest
        public ValueRange speedMultiplierForBasherRange = new ValueRange();
        public double scaleMultiplierForBasher = 1f;
        @Nest
        public ValueRange scaleMultiplierForBasherRange = new ValueRange();
        @SectionHeader("Firecaller")
        @Comment("Firecaller")
        public double healthMultiplierForFirecaller = 1f;
        @Nest
        public ValueRange healthMultiplierForFirecallerRange = new ValueRange();
        public double damageMultiplierForFirecaller = 1f;
        @Nest
        public ValueRange damageMultiplierForFirecallerRange = new ValueRange();
        public double speedMultiplierForFirecaller = 1f;
        @Nest
        public ValueRange speedMultiplierForFirecallerRange = new ValueRange();
        public double scaleMultiplierForFirecaller = 1f;
        @Nest
        public ValueRange scaleMultiplierForFirecallerRange = new ValueRange();
        @SectionHeader("Inquisitor")
        @Comment("Inquisitor")
        public double healthMultiplierForInquisitor = 1f;
        @Nest
        public ValueRange healthMultiplierForInquisitorRange = new ValueRange();
        public double damageMultiplierForInquisitor = 1f;
        @Nest
        public ValueRange damageMultiplierForInquisitorRange = new ValueRange();
        public double speedMultiplierForInquisitor = 1f;
        @Nest
        public ValueRange speedMultiplierForInquisitorRange = new ValueRange();
        public double scaleMultiplierForInquisitor = 1f;
        @Nest
        public ValueRange scaleMultiplierForInquisitorRange = new ValueRange();
        @SectionHeader("Invoker")
        @Comment("Invoker")
        public double healthMultiplierForInvoker = 1f;
        @Nest
        public ValueRange healthMultiplierForInvokerRange = new ValueRange();
        public double damageMultiplierForInvoker = 1f;
        @Nest
        public ValueRange damageMultiplierForInvokerRange = new ValueRange();
        public double speedMultiplierForInvoker = 1f;
        @Nest
        public ValueRange speedMultiplierForInvokerRange = new ValueRange();
        public double scaleMultiplierForInvoker = 1f;
        @Nest
        public ValueRange scaleMultiplierForInvokerRange = new ValueRange();
        @SectionHeader("Marauder")
        @Comment("Marauder")
        public double healthMultiplierForMarauder = 1f;
        @Nest
        public ValueRange healthMultiplierForMarauderRange = new ValueRange();
        public double damageMultiplierForMarauder = 1f;
        @Nest
        public ValueRange damageMultiplierForMarauderRange = new ValueRange();
        public double speedMultiplierForMarauder = 1f;
        @Nest
        public ValueRange speedMultiplierForMarauderRange = new ValueRange();
        public double scaleMultiplierForMarauder = 1f;
        @Nest
        public ValueRange scaleMultiplierForMarauderRange = new ValueRange();
        @SectionHeader("Necromancer")
        @Comment("Necromancer")
        public double healthMultiplierForNecromancer = 1f;
        @Nest
        public ValueRange healthMultiplierForNecromancerRange = new ValueRange();
        public double damageMultiplierForNecromancer = 1f;
        @Nest
        public ValueRange damageMultiplierForNecromancerRange = new ValueRange();
        public double speedMultiplierForNecromancer = 1f;
        @Nest
        public ValueRange speedMultiplierForNecromancerRange = new ValueRange();
        public double scaleMultiplierForNecromancer = 1f;
        @Nest
        public ValueRange scaleMultiplierForNecromancerRange = new ValueRange();
        @SectionHeader("Provoker")
        @Comment("Provoker")
        public double healthMultiplierForProvoker = 1f;
        @Nest
        public ValueRange healthMultiplierForProvokerRange = new ValueRange();
        public double damageMultiplierForProvoker = 1f;
        @Nest
        public ValueRange damageMultiplierForProvokerRange = new ValueRange();
        public double speedMultiplierForProvoker = 1f;
        @Nest
        public ValueRange speedMultiplierForProvokerRange = new ValueRange();
        public double scaleMultiplierForProvoker = 1f;
        @Nest
        public ValueRange scaleMultiplierForProvokerRange = new ValueRange();
        @SectionHeader("Sorcerer")
        @Comment("Sorcerer")
        public double healthMultiplierForSorcerer = 1f;
        @Nest
        public ValueRange healthMultiplierForSorcererRange = new ValueRange();
        public double damageMultiplierForSorcerer = 1f;
        @Nest
        public ValueRange damageMultiplierForSorcererRange = new ValueRange();
        public double speedMultiplierForSorcerer = 1f;
        @Nest
        public ValueRange speedMultiplierForSorcererRange = new ValueRange();
        public double scaleMultiplierForSorcerer = 1f;
        @Nest
        public ValueRange scaleMultiplierForSorcererRange = new ValueRange();
        @SectionHeader("Surrendered")
        @Comment("Surrendered")
        public double healthMultiplierForSurrendered = 1f;
        @Nest
        public ValueRange healthMultiplierForSurrenderedRange = new ValueRange();
        public double damageMultiplierForSurrendered = 1f;
        @Nest
        public ValueRange damageMultiplierForSurrenderedRange = new ValueRange();
        public double scaleMultiplierForSurrendered = 1f;
        @Nest
        public ValueRange scaleMultiplierForSurrenderedRange = new ValueRange();
    }
    @Nest
    public ItTakesAPillageContinuation itTakesAPillageContinuation = new ItTakesAPillageContinuation();
    public static class ItTakesAPillageContinuation {
        @SectionHeader("Archer")
        @Comment("Archer")
        public double healthMultiplierForArcher = 1f;
        @Nest
        public ValueRange healthMultiplierForArcherRange = new ValueRange();
        public double damageMultiplierForArcher = 1f;
        @Nest
        public ValueRange damageMultiplierForArcherRange = new ValueRange();
        public double speedMultiplierForArcher = 1f;
        @Nest
        public ValueRange speedMultiplierForArcherRange = new ValueRange();
        public double scaleMultiplierForArcher = 1f;
        @Nest
        public ValueRange scaleMultiplierForArcherRange = new ValueRange();
        @SectionHeader("Clay Golem")
        @Comment("Clay Golem")
        public double healthMultiplierForClayGolem = 1f;
        @Nest
        public ValueRange healthMultiplierForClayGolemRange = new ValueRange();
        public double damageMultiplierForClayGolem = 1f;
        @Nest
        public ValueRange damageMultiplierForClayGolemRange = new ValueRange();
        public double speedMultiplierForClayGolem = 1f;
        @Nest
        public ValueRange speedMultiplierForClayGolemRange = new ValueRange();
        public double scaleMultiplierForClayGolem = 1f;
        @Nest
        public ValueRange scaleMultiplierForClayGolemRange = new ValueRange();
        @SectionHeader("Legioner")
        @Comment("Legioner")
        public double healthMultiplierForLegioner = 1f;
        @Nest
        public ValueRange healthMultiplierForLegionerRange = new ValueRange();
        public double damageMultiplierForLegioner = 1f;
        @Nest
        public ValueRange damageMultiplierForLegionerRange = new ValueRange();
        public double speedMultiplierForLegioner = 1f;
        @Nest
        public ValueRange speedMultiplierForLegionerRange = new ValueRange();
        public double scaleMultiplierForLegioner = 1f;
        @Nest
        public ValueRange scaleMultiplierForLegionerRange = new ValueRange();
        @SectionHeader("Skirmisher")
        @Comment("Skirmisher")
        public double healthMultiplierForSkirmisher = 1f;
        @Nest
        public ValueRange healthMultiplierForSkirmisherRange = new ValueRange();
        public double damageMultiplierForSkirmisher = 1f;
        @Nest
        public ValueRange damageMultiplierForSkirmisherRange = new ValueRange();
        public double speedMultiplierForSkirmisher = 1f;
        @Nest
        public ValueRange speedMultiplierForSkirmisherRange = new ValueRange();
        public double scaleMultiplierForSkirmisher = 1f;
        @Nest
        public ValueRange scaleMultiplierForSkirmisherRange = new ValueRange();
    }
    @Nest
    public MobVariants mobVariants = new MobVariants();
    public static class MobVariants {
        @SectionHeader("Armored Spider")
        @Comment("Armored Spider")
        public double healthMultiplierForArmoredSpider = 1f;
        @Nest
        public ValueRange healthMultiplierForArmoredSpiderRange = new ValueRange();
        public double damageMultiplierForArmoredSpider = 1f;
        @Nest
        public ValueRange damageMultiplierForArmoredSpiderRange = new ValueRange();
        public double speedMultiplierForArmoredSpider = 1f;
        @Nest
        public ValueRange speedMultiplierForArmoredSpiderRange = new ValueRange();
        public double scaleMultiplierForArmoredSpider = 1f;
        @Nest
        public ValueRange scaleMultiplierForArmoredSpiderRange = new ValueRange();
        @SectionHeader("Bloated Corpse")
        @Comment("Bloated Corpse")
        public double healthMultiplierForBloatedCorpse = 1f;
        @Nest
        public ValueRange healthMultiplierForBloatedCorpseRange = new ValueRange();
        public double damageMultiplierForBloatedCorpse = 1f;
        @Nest
        public ValueRange damageMultiplierForBloatedCorpseRange = new ValueRange();
        public double speedMultiplierForBloatedCorpse = 1f;
        @Nest
        public ValueRange speedMultiplierForBloatedCorpseRange = new ValueRange();
        public double scaleMultiplierForBloatedCorpse = 1f;
        @Nest
        public ValueRange scaleMultiplierForBloatedCorpseRange = new ValueRange();
        @SectionHeader("Cave Creeper")
        @Comment("Cave Creeper")
        public double healthMultiplierForCaveCreeper = 1f;
        @Nest
        public ValueRange healthMultiplierForCaveCreeperRange = new ValueRange();
        public double damageMultiplierForCaveCreeper = 1f;
        @Nest
        public ValueRange damageMultiplierForCaveCreeperRange = new ValueRange();
        public double speedMultiplierForCaveCreeper = 1f;
        @Nest
        public ValueRange speedMultiplierForCaveCreeperRange = new ValueRange();
        public double scaleMultiplierForCaveCreeper = 1f;
        @Nest
        public ValueRange scaleMultiplierForCaveCreeperRange = new ValueRange();
        @SectionHeader("Corsair")
        @Comment("Corsair")
        public double healthMultiplierForCorsair = 1f;
        @Nest
        public ValueRange healthMultiplierForCorsairRange = new ValueRange();
        public double damageMultiplierForCorsair = 1f;
        @Nest
        public ValueRange damageMultiplierForCorsairRange = new ValueRange();
        public double speedMultiplierForCorsair = 1f;
        @Nest
        public ValueRange speedMultiplierForCorsairRange = new ValueRange();
        public double scaleMultiplierForCorsair = 1f;
        @Nest
        public ValueRange scaleMultiplierForCorsairRange = new ValueRange();
        @SectionHeader("Executioner")
        @Comment("Executioner")
        public double healthMultiplierForExecutioner = 1f;
        @Nest
        public ValueRange healthMultiplierForExecutionerRange = new ValueRange();
        public double damageMultiplierForExecutioner = 1f;
        @Nest
        public ValueRange damageMultiplierForExecutionerRange = new ValueRange();
        public double speedMultiplierForExecutioner = 1f;
        @Nest
        public ValueRange speedMultiplierForExecutionerRange = new ValueRange();
        public double scaleMultiplierForExecutioner = 1f;
        @Nest
        public ValueRange scaleMultiplierForExecutionerRange = new ValueRange();
        @SectionHeader("Explorer")
        @Comment("Explorer")
        public double healthMultiplierForExplorer = 1f;
        @Nest
        public ValueRange healthMultiplierForExplorerRange = new ValueRange();
        public double damageMultiplierForExplorer = 1f;
        @Nest
        public ValueRange damageMultiplierForExplorerRange = new ValueRange();
        public double speedMultiplierForExplorer = 1f;
        @Nest
        public ValueRange speedMultiplierForExplorerRange = new ValueRange();
        public double scaleMultiplierForExplorer = 1f;
        @Nest
        public ValueRange scaleMultiplierForExplorerRange = new ValueRange();
        @SectionHeader("Forgotten")
        @Comment("Forgotten")
        public double healthMultiplierForForgotten = 1f;
        @Nest
        public ValueRange healthMultiplierForForgottenRange = new ValueRange();
        public double damageMultiplierForForgotten = 1f;
        @Nest
        public ValueRange damageMultiplierForForgottenRange = new ValueRange();
        public double speedMultiplierForForgotten = 1f;
        @Nest
        public ValueRange speedMultiplierForForgottenRange = new ValueRange();
        public double scaleMultiplierForForgotten = 1f;
        @Nest
        public ValueRange scaleMultiplierForForgottenRange = new ValueRange();
        @SectionHeader("Frozen Zombie")
        @Comment("Frozen Zombie")
        public double healthMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForFrozenZombieRange = new ValueRange();
        public double damageMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForFrozenZombieRange = new ValueRange();
        public double speedMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForFrozenZombieRange = new ValueRange();
        public double scaleMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForFrozenZombieRange = new ValueRange();
        @SectionHeader("Infected Piglin")
        @Comment("Infected Piglin")
        public double healthMultiplierForInfectedPiglin = 1f;
        @Nest
        public ValueRange healthMultiplierForInfectedPiglinRange = new ValueRange();
        public double damageMultiplierForInfectedPiglin = 1f;
        @Nest
        public ValueRange damageMultiplierForInfectedPiglinRange = new ValueRange();
        public double speedMultiplierForInfectedPiglin = 1f;
        @Nest
        public ValueRange speedMultiplierForInfectedPiglinRange = new ValueRange();
        public double scaleMultiplierForInfectedPiglin = 1f;
        @Nest
        public ValueRange scaleMultiplierForInfectedPiglinRange = new ValueRange();
        @SectionHeader("Infected Piglin Brute")
        @Comment("Infected Piglin Brute")
        public double healthMultiplierForInfectedPiglinBrute = 1f;
        @Nest
        public ValueRange healthMultiplierForInfectedPiglinBruteRange = new ValueRange();
        public double damageMultiplierForInfectedPiglinBrute = 1f;
        @Nest
        public ValueRange damageMultiplierForInfectedPiglinBruteRange = new ValueRange();
        public double speedMultiplierForInfectedPiglinBrute = 1f;
        @Nest
        public ValueRange speedMultiplierForInfectedPiglinBruteRange = new ValueRange();
        public double scaleMultiplierForInfectedPiglinBrute = 1f;
        @Nest
        public ValueRange scaleMultiplierForInfectedPiglinBruteRange = new ValueRange();
        @SectionHeader("Lava Slime")
        @Comment("Lava Slime")
        public double healthMultiplierForLavaSlime = 1f;
        @Nest
        public ValueRange healthMultiplierForLavaSlimeRange = new ValueRange();
        public double damageMultiplierForLavaSlime = 1f;
        @Nest
        public ValueRange damageMultiplierForLavaSlimeRange = new ValueRange();
        public double speedMultiplierForLavaSlime = 1f;
        @Nest
        public ValueRange speedMultiplierForLavaSlimeRange = new ValueRange();
        public double scaleMultiplierForLavaSlime = 1f;
        @Nest
        public ValueRange scaleMultiplierForLavaSlimeRange = new ValueRange();
        @SectionHeader("Nightmare")
        @Comment("Nightmare")
        public double healthMultiplierForNightmare = 1f;
        @Nest
        public ValueRange healthMultiplierForNightmareRange = new ValueRange();
        public double damageMultiplierForNightmare = 1f;
        @Nest
        public ValueRange damageMultiplierForNightmareRange = new ValueRange();
        public double speedMultiplierForNightmare = 1f;
        @Nest
        public ValueRange speedMultiplierForNightmareRange = new ValueRange();
        public double scaleMultiplierForNightmare = 1f;
        @Nest
        public ValueRange scaleMultiplierForNightmareRange = new ValueRange();
        @SectionHeader("Soul Stealer")
        @Comment("Soul Stealer")
        public double healthMultiplierForSoulStealer = 1f;
        @Nest
        public ValueRange healthMultiplierForSoulStealerRange = new ValueRange();
        public double damageMultiplierForSoulStealer = 1f;
        @Nest
        public ValueRange damageMultiplierForSoulStealerRange = new ValueRange();
        public double speedMultiplierForSoulStealer = 1f;
        @Nest
        public ValueRange speedMultiplierForSoulStealerRange = new ValueRange();
        public double scaleMultiplierForSoulStealer = 1f;
        @Nest
        public ValueRange scaleMultiplierForSoulStealerRange = new ValueRange();
        @SectionHeader("Toxic Slime")
        @Comment("Toxic Slime")
        public double healthMultiplierForToxicSlime = 1f;
        @Nest
        public ValueRange healthMultiplierForToxicSlimeRange = new ValueRange();
        public double damageMultiplierForToxicSlime = 1f;
        @Nest
        public ValueRange damageMultiplierForToxicSlimeRange = new ValueRange();
        public double speedMultiplierForToxicSlime = 1f;
        @Nest
        public ValueRange speedMultiplierForToxicSlimeRange = new ValueRange();
        public double scaleMultiplierForToxicSlime = 1f;
        @Nest
        public ValueRange scaleMultiplierForToxicSlimeRange = new ValueRange();
        @SectionHeader("Tropical Spider")
        @Comment("Tropical Spider")
        public double healthMultiplierForTropicalSpider = 1f;
        @Nest
        public ValueRange healthMultiplierForTropicalSpiderRange = new ValueRange();
        public double damageMultiplierForTropicalSpider = 1f;
        @Nest
        public ValueRange damageMultiplierForTropicalSpiderRange = new ValueRange();
        public double speedMultiplierForTropicalSpider = 1f;
        @Nest
        public ValueRange speedMultiplierForTropicalSpiderRange = new ValueRange();
        public double scaleMultiplierForTropicalSpider = 1f;
        @Nest
        public ValueRange scaleMultiplierForTropicalSpiderRange = new ValueRange();
        @SectionHeader("Undead Warrior")
        @Comment("Undead Warrior")
        public double healthMultiplierForUndeadWarrior = 1f;
        @Nest
        public ValueRange healthMultiplierForUndeadWarriorRange = new ValueRange();
        public double damageMultiplierForUndeadWarrior = 1f;
        @Nest
        public ValueRange damageMultiplierForUndeadWarriorRange = new ValueRange();
        public double speedMultiplierForUndeadWarrior = 1f;
        @Nest
        public ValueRange speedMultiplierForUndeadWarriorRange = new ValueRange();
        public double scaleMultiplierForUndeadWarrior = 1f;
        @Nest
        public ValueRange scaleMultiplierForUndeadWarriorRange = new ValueRange();
        @SectionHeader("Zombified Piglin Brute")
        @Comment("Zombified Piglin Brute")
        public double healthMultiplierForZombifiedPiglinBrute = 1f;
        @Nest
        public ValueRange healthMultiplierForZombifiedPiglinBruteRange = new ValueRange();
        public double damageMultiplierForZombifiedPiglinBrute = 1f;
        @Nest
        public ValueRange damageMultiplierForZombifiedPiglinBruteRange = new ValueRange();
        public double speedMultiplierForZombifiedPiglinBrute = 1f;
        @Nest
        public ValueRange speedMultiplierForZombifiedPiglinBruteRange = new ValueRange();
        public double scaleMultiplierForZombifiedPiglinBrute = 1f;
        @Nest
        public ValueRange scaleMultiplierForZombifiedPiglinBruteRange = new ValueRange();
    }
    @Nest
    public Ribbits ribbits = new Ribbits();
    public static class Ribbits {
        @SectionHeader("Ribbit")
        @Comment("Ribbit")
        public double healthMultiplierForRibbit = 1f;
        @Nest
        public ValueRange healthMultiplierForRibbitRange = new ValueRange();
        public double damageMultiplierForRibbit = 1f;
        @Nest
        public ValueRange damageMultiplierForRibbitRange = new ValueRange();
        public double speedMultiplierForRibbit = 1f;
        @Nest
        public ValueRange speedMultiplierForRibbitRange = new ValueRange();
        public double scaleMultiplierForRibbit = 1f;
        @Nest
        public ValueRange scaleMultiplierForRibbitRange = new ValueRange();
    }
    @Nest
    public VariantsAndVentures variantsAndVentures = new VariantsAndVentures();
    public static class VariantsAndVentures {
        @SectionHeader("Gelid")
        @Comment("Gelid")
        public double healthMultiplierForGelid = 1f;
        @Nest
        public ValueRange healthMultiplierForGelidRange = new ValueRange();
        public double damageMultiplierForGelid = 1f;
        @Nest
        public ValueRange damageMultiplierForGelidRange = new ValueRange();
        public double speedMultiplierForGelid = 1f;
        @Nest
        public ValueRange speedMultiplierForGelidRange = new ValueRange();
        public double scaleMultiplierForGelid = 1f;
        @Nest
        public ValueRange scaleMultiplierForGelidRange = new ValueRange();
        @SectionHeader("Murk")
        @Comment("Murk")
        public double healthMultiplierForMurk = 1f;
        @Nest
        public ValueRange healthMultiplierForMurkRange = new ValueRange();
        public double damageMultiplierForMurk = 1f;
        @Nest
        public ValueRange damageMultiplierForMurkRange = new ValueRange();
        public double speedMultiplierForMurk = 1f;
        @Nest
        public ValueRange speedMultiplierForMurkRange = new ValueRange();
        public double scaleMultiplierForMurk = 1f;
        @Nest
        public ValueRange scaleMultiplierForMurkRange = new ValueRange();
        @SectionHeader("Thicket")
        @Comment("Thicket")
        public double healthMultiplierForThicket = 1f;
        @Nest
        public ValueRange healthMultiplierForThicketRange = new ValueRange();
        public double damageMultiplierForThicket = 1f;
        @Nest
        public ValueRange damageMultiplierForThicketRange = new ValueRange();
        public double speedMultiplierForThicket = 1f;
        @Nest
        public ValueRange speedMultiplierForThicketRange = new ValueRange();
        public double scaleMultiplierForThicket = 1f;
        @Nest
        public ValueRange scaleMultiplierForThicketRange = new ValueRange();
        @SectionHeader("Verdant")
        @Comment("Verdant")
        public double healthMultiplierForVerdant = 1f;
        @Nest
        public ValueRange healthMultiplierForVerdantRange = new ValueRange();
        public double damageMultiplierForVerdant = 1f;
        @Nest
        public ValueRange damageMultiplierForVerdantRange = new ValueRange();
        public double speedMultiplierForVerdant = 1f;
        @Nest
        public ValueRange speedMultiplierForVerdantRange = new ValueRange();
        public double scaleMultiplierForVerdant = 1f;
        @Nest
        public ValueRange scaleMultiplierForVerdantRange = new ValueRange();
    }
    @Nest
    public ZombieVariants zombieVariants = new ZombieVariants();
    public static class ZombieVariants {
        @SectionHeader("Badlands Zombie")
        @Comment("Badlands Zombie")
        public double healthMultiplierForBadlandsZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForBadlandsZombieRange = new ValueRange();
        public double damageMultiplierForBadlandsZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForBadlandsZombieRange = new ValueRange();
        public double speedMultiplierForBadlandsZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForBadlandsZombieRange = new ValueRange();
        public double scaleMultiplierForBadlandsZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForBadlandsZombieRange = new ValueRange();
        @SectionHeader("Bamboo Zombie")
        @Comment("Bamboo Zombie")
        public double healthMultiplierForBambooZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForBambooZombieRange = new ValueRange();
        public double damageMultiplierForBambooZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForBambooZombieRange = new ValueRange();
        public double speedMultiplierForBambooZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForBambooZombieRange = new ValueRange();
        public double scaleMultiplierForBambooZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForBambooZombieRange = new ValueRange();
        @SectionHeader("Cave Zombie")
        @Comment("Cave Zombie")
        public double healthMultiplierForCaveZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForCaveZombieRange = new ValueRange();
        public double damageMultiplierForCaveZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForCaveZombieRange = new ValueRange();
        public double speedMultiplierForCaveZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForCaveZombieRange = new ValueRange();
        public double scaleMultiplierForCaveZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForCaveZombieRange = new ValueRange();
        @SectionHeader("Cherry Zombie")
        @Comment("Cherry Zombie")
        public double healthMultiplierForCherryZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForCherryZombieRange = new ValueRange();
        public double damageMultiplierForCherryZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForCherryZombieRange = new ValueRange();
        public double speedMultiplierForCherryZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForCherryZombieRange = new ValueRange();
        public double scaleMultiplierForCherryZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForCherryZombieRange = new ValueRange();
        @SectionHeader("Deep Dark Zombie")
        @Comment("Deep Dark Zombie")
        public double healthMultiplierForDeepDarkZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForDeepDarkZombieRange = new ValueRange();
        public double damageMultiplierForDeepDarkZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForDeepDarkZombieRange = new ValueRange();
        public double speedMultiplierForDeepDarkZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForDeepDarkZombieRange = new ValueRange();
        public double scaleMultiplierForDeepDarkZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForDeepDarkZombieRange = new ValueRange();
        @SectionHeader("Desert Zombie")
        @Comment("Desert Zombie")
        public double healthMultiplierForDesertZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForDesertZombieRange = new ValueRange();
        public double damageMultiplierForDesertZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForDesertZombieRange = new ValueRange();
        public double speedMultiplierForDesertZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForDesertZombieRange = new ValueRange();
        public double scaleMultiplierForDesertZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForDesertZombieRange = new ValueRange();
        @SectionHeader("Dripstone Zombie")
        @Comment("Dripstone Zombie")
        public double healthMultiplierForDripstoneZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForDripstoneZombieRange = new ValueRange();
        public double damageMultiplierForDripstoneZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForDripstoneZombieRange = new ValueRange();
        public double speedMultiplierForDripstoneZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForDripstoneZombieRange = new ValueRange();
        public double scaleMultiplierForDripstoneZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForDripstoneZombieRange = new ValueRange();
        @SectionHeader("Frozen Zombie")
        @Comment("Frozen Zombie")
        public double healthMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForFrozenZombieRange = new ValueRange();
        public double damageMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForFrozenZombieRange = new ValueRange();
        public double speedMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForFrozenZombieRange = new ValueRange();
        public double scaleMultiplierForFrozenZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForFrozenZombieRange = new ValueRange();
        @SectionHeader("Jungle Zombie")
        @Comment("Jungle Zombie")
        public double healthMultiplierForJungleZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForJungleZombieRange = new ValueRange();
        public double damageMultiplierForJungleZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForJungleZombieRange = new ValueRange();
        public double speedMultiplierForJungleZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForJungleZombieRange = new ValueRange();
        public double scaleMultiplierForJungleZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForJungleZombieRange = new ValueRange();
        @SectionHeader("Lush Zombie")
        @Comment("Lush Zombie")
        public double healthMultiplierForLushZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForLushZombieRange = new ValueRange();
        public double damageMultiplierForLushZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForLushZombieRange = new ValueRange();
        public double speedMultiplierForLushZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForLushZombieRange = new ValueRange();
        public double scaleMultiplierForLushZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForLushZombieRange = new ValueRange();
        @SectionHeader("Mangrove Zombie")
        @Comment("Mangrove Zombie")
        public double healthMultiplierForMangroveZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForMangroveZombieRange = new ValueRange();
        public double damageMultiplierForMangroveZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForMangroveZombieRange = new ValueRange();
        public double speedMultiplierForMangroveZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForMangroveZombieRange = new ValueRange();
        public double scaleMultiplierForMangroveZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForMangroveZombieRange = new ValueRange();
        @SectionHeader("Mushroom Zombie")
        @Comment("Mushroom Zombie")
        public double healthMultiplierForMushroomZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForMushroomZombieRange = new ValueRange();
        public double damageMultiplierForMushroomZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForMushroomZombieRange = new ValueRange();
        public double speedMultiplierForMushroomZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForMushroomZombieRange = new ValueRange();
        public double scaleMultiplierForMushroomZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForMushroomZombieRange = new ValueRange();
        @SectionHeader("Pale Garden Zombie")
        @Comment("Pale Garden Zombie")
        public double healthMultiplierForPaleGardenZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForPaleGardenZombieRange = new ValueRange();
        public double damageMultiplierForPaleGardenZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForPaleGardenZombieRange = new ValueRange();
        public double speedMultiplierForPaleGardenZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForPaleGardenZombieRange = new ValueRange();
        public double scaleMultiplierForPaleGardenZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForPaleGardenZombieRange = new ValueRange();
        @SectionHeader("Savanna Zombie")
        @Comment("Savanna Zombie")
        public double healthMultiplierForSavannaZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForSavannaZombieRange = new ValueRange();
        public double damageMultiplierForSavannaZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForSavannaZombieRange = new ValueRange();
        public double speedMultiplierForSavannaZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForSavannaZombieRange = new ValueRange();
        public double scaleMultiplierForSavannaZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForSavannaZombieRange = new ValueRange();
        @SectionHeader("Swamp Zombie")
        @Comment("Swamp Zombie")
        public double healthMultiplierForSwampZombie = 1f;
        @Nest
        public ValueRange healthMultiplierForSwampZombieRange = new ValueRange();
        public double damageMultiplierForSwampZombie = 1f;
        @Nest
        public ValueRange damageMultiplierForSwampZombieRange = new ValueRange();
        public double speedMultiplierForSwampZombie = 1f;
        @Nest
        public ValueRange speedMultiplierForSwampZombieRange = new ValueRange();
        public double scaleMultiplierForSwampZombie = 1f;
        @Nest
        public ValueRange scaleMultiplierForSwampZombieRange = new ValueRange();
    }
}
