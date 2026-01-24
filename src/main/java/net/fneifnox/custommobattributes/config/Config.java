package net.fneifnox.custommobattributes.config;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;

@Mod.EventBusSubscriber(modid = CustomMobAttributes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    public static final ForgeConfigSpec CONFIG;
    public static final Vanilla VANILLA;

    public static final BetterEnd BETTER_END;

    public static final BetterNether BETTER_NETHER;

    public static final DeeperAndDarker DEEPER_AND_DARKER;

    public static final FriendsAndFoes FRIENDS_AND_FOES;

    public static final IllagerInvasion ILLAGER_INVASION;

    public static final ItTakesAPillageContinuation IT_TAKES_A_PILLAGE_CONTINUATION;

    public static final MobVariants MOB_VARIANTS;

    public static final Ribbits RIBBITS;

    public static final VanillaBackport VANILLA_BACKPORT;

    public static final VariantsAndVentures VARIANTS_AND_VENTURES;

    public static final ZombieVariants ZOMBIE_VARIANTS;


    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        VANILLA = new Vanilla(builder);
        BETTER_END = new BetterEnd(builder);
        BETTER_NETHER = new BetterNether(builder);
        DEEPER_AND_DARKER = new DeeperAndDarker(builder);
        FRIENDS_AND_FOES = new FriendsAndFoes(builder);
        ILLAGER_INVASION = new IllagerInvasion(builder);
        IT_TAKES_A_PILLAGE_CONTINUATION = new ItTakesAPillageContinuation(builder);
        MOB_VARIANTS = new MobVariants(builder);
        RIBBITS = new Ribbits(builder);
        VANILLA_BACKPORT = new VanillaBackport(builder);
        VARIANTS_AND_VENTURES = new VariantsAndVentures(builder);
        ZOMBIE_VARIANTS = new ZombieVariants(builder);

        CONFIG = builder.build();
    }

    public static class Vanilla {

        public final ForgeConfigSpec.BooleanValue adultsAlsoAffectBabies;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForAll;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForAll;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForAll;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForAll;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyAll;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyAll;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyAll;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyAll;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForAllay;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForAllay;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForAllay;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForArmadillo;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForArmadillo;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForArmadillo;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyArmadillo;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyArmadillo;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyArmadillo;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForAxolotl;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForAxolotl;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForAxolotl;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForAxolotl;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyAxolotl;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyAxolotl;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyAxolotl;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyAxolotl;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBat;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBat;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBat;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBee;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBee;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBee;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBee;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyBee;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyBee;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyBee;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyBee;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBlaze;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBlaze;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBlaze;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBlaze;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBogged;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBogged;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBogged;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBogged;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBreeze;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBreeze;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBreeze;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBreeze;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCamel;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCamel;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCamel;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyCamel;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyCamel;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyCamel;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCat;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCat;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCat;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCat;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyCat;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyCat;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyCat;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyCat;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCaveSpider;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCaveSpider;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCaveSpider;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCaveSpider;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForChicken;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForChicken;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForChicken;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyChicken;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyChicken;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyChicken;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCod;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCod;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCod;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCow;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCow;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCow;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyCow;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyCow;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyCow;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCreeper;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCreeper;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCreeper;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCreeper;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForDolphin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForDolphin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForDolphin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForDolphin;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyDolphin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyDolphin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyDolphin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyDolphin;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForDonkey;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForDonkey;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForDonkey;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyDonkey;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyDonkey;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyDonkey;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForDrowned;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForDrowned;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForDrowned;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForDrowned;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyDrowned;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyDrowned;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyDrowned;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyDrowned;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForElderGuardian;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForElderGuardian;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForElderGuardian;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForElderGuardian;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForEnderDragon;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForEnderDragon;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForEnderman;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForEnderman;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForEnderman;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForEnderman;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForEndermite;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForEndermite;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForEndermite;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForEndermite;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForEvoker;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForEvoker;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForEvoker;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForEvoker;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForFox;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForFox;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForFox;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForFox;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyFox;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyFox;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyFox;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyFox;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForFrog;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForFrog;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForFrog;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForFrog;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForGhast;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForGhast;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForGhast;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForGhast;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForGiant;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForGiant;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForGiant;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForGiant;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForGlowSquid;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForGlowSquid;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForGlowSquid;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyGlowSquid;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyGlowSquid;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyGlowSquid;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForGoat;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForGoat;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForGoat;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForGoat;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyGoat;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyGoat;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyGoat;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyGoat;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForGuardian;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForGuardian;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForGuardian;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForGuardian;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForHoglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForHoglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForHoglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForHoglin;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyHoglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyHoglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyHoglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyHoglin;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForHorse;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForHorse;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForHorse;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyHorse;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyHorse;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyHorse;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForHusk;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForHusk;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForHusk;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForHusk;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyHusk;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyHusk;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyHusk;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyHusk;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForIllusioner;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForIllusioner;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForIllusioner;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForIllusioner;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForIronGolem;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForIronGolem;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForIronGolem;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForIronGolem;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForLlama;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForLlama;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForLlama;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForLlama;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyLlama;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyLlama;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyLlama;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyLlama;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMagmaCube;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForMagmaCube;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMagmaCube;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMagmaCube;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMooshroom;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMooshroom;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMooshroom;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyMooshroom;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyMooshroom;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyMooshroom;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMule;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMule;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMule;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyMule;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyMule;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyMule;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForOcelot;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForOcelot;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForOcelot;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForOcelot;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyOcelot;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyOcelot;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyOcelot;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyOcelot;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPanda;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForPanda;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPanda;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPanda;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyPanda;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyPanda;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyPanda;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyPanda;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForParrot;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForParrot;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForParrot;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPhantom;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForPhantom;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPhantom;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPig;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPig;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPig;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyPig;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyPig;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyPig;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPiglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForPiglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPiglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPiglin;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyPiglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyPiglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyPiglin;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPiglinBrute;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForPiglinBrute;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPiglinBrute;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPiglinBrute;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPillager;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForPillager;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPillager;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPillager;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPolarBear;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForPolarBear;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPolarBear;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPolarBear;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyPolarBear;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyPolarBear;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyPolarBear;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPufferfish;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPufferfish;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPufferfish;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForRabbit;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForRabbit;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForRabbit;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForRabbit;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyRabbit;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyRabbit;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyRabbit;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyRabbit;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForRavager;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForRavager;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForRavager;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForRavager;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSalmon;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSalmon;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSalmon;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSheep;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSheep;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSheep;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabySheep;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabySheep;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabySheep;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForShulker;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForShulker;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForShulker;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSilverfish;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSilverfish;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSilverfish;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSilverfish;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSkeleton;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSkeleton;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSkeleton;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSkeleton;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSkeletonHorse;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSkeletonHorse;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSkeletonHorse;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabySkeletonHorse;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabySkeletonHorse;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabySkeletonHorse;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSlime;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSlime;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSlime;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSlime;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSniffer;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSniffer;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSniffer;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabySniffer;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabySniffer;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabySniffer;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSnowGolem;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSnowGolem;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSnowGolem;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSnowGolem;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSpider;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSpider;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSpider;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSpider;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSquid;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSquid;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSquid;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabySquid;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabySquid;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabySquid;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForStray;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForStray;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForStray;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForStray;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForStrider;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForStrider;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForStrider;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyStrider;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyStrider;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyStrider;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForTadpole;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForTadpole;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForTadpole;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForTraderLlama;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForTraderLlama;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForTraderLlama;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForTraderLlama;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyTraderLlama;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyTraderLlama;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyTraderLlama;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyTraderLlama;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForTropicalFish;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForTropicalFish;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForTropicalFish;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForTurtle;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForTurtle;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForTurtle;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyTurtle;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyTurtle;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyTurtle;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForVex;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForVex;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForVex;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForVex;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForVillager;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForVillager;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForVillager;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyVillager;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyVillager;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyVillager;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForVindicator;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForVindicator;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForVindicator;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForVindicator;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForWanderingTrader;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForWanderingTrader;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForWanderingTrader;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForWarden;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForWarden;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForWarden;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForWarden;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForWitch;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForWitch;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForWitch;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForWitch;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForWither;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForWither;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForWither;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForWither;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForWitherSkeleton;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForWitherSkeleton;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForWitherSkeleton;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForWitherSkeleton;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForWolf;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForWolf;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForWolf;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForWolf;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyWolf;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyWolf;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyWolf;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyWolf;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForZoglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForZoglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForZoglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForZoglin;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyZoglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyZoglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyZoglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyZoglin;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForZombie;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForZombieHorse;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForZombieHorse;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForZombieHorse;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyZombieHorse;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyZombieHorse;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyZombieHorse;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForZombieVillager;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForZombieVillager;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForZombieVillager;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForZombieVillager;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyZombieVillager;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyZombieVillager;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyZombieVillager;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyZombieVillager;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForZombifiedPiglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForZombifiedPiglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForZombifiedPiglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForZombifiedPiglin;
        public final ForgeConfigSpec.DoubleValue healthMultiplierForBabyZombifiedPiglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBabyZombifiedPiglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBabyZombifiedPiglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBabyZombifiedPiglin;

        Vanilla(ForgeConfigSpec.Builder builder) {

            adultsAlsoAffectBabies = builder.define("whetherBabiesShouldAlsoBeAffectedByTheMultipliersOfTheirAdultVersion", true);

            healthMultiplierForAll = builder.defineInRange("healthMultiplierForAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForAll = builder.defineInRange("damageMultiplierForAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForAll = builder.defineInRange("speedMultiplierForAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForAll = builder.defineInRange("scaleMultiplierForAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);

            healthMultiplierForBabyAll = builder.defineInRange("healthMultiplierForBabyAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyAll = builder.defineInRange("damageMultiplierForBabyAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyAll = builder.defineInRange("speedMultiplierForBabyAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyAll = builder.defineInRange("scaleMultiplierForBabyAll", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);

            builder.push("*Vanilla *");

            builder.push("Allay");
            healthMultiplierForAllay = builder.defineInRange("healthMultiplierForAllay", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForAllay = builder.defineInRange("speedMultiplierForAllay", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForAllay = builder.defineInRange("scaleMultiplierForAllay", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Armadillo");
            healthMultiplierForArmadillo = builder.defineInRange("healthMultiplierForArmadillo", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForArmadillo = builder.defineInRange("speedMultiplierForArmadillo", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForArmadillo = builder.defineInRange("scaleMultiplierForArmadillo", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Armadillo");
            healthMultiplierForBabyArmadillo = builder.defineInRange("healthMultiplierForBabyArmadillo", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyArmadillo = builder.defineInRange("speedMultiplierForBabyArmadillo", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyArmadillo = builder.defineInRange("scaleMultiplierForBabyArmadillo", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Axolotl");
            healthMultiplierForAxolotl = builder.defineInRange("healthMultiplierForAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForAxolotl = builder.defineInRange("damageMultiplierForAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForAxolotl = builder.defineInRange("speedMultiplierForAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForAxolotl = builder.defineInRange("scaleMultiplierForAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Axolotl");
            healthMultiplierForBabyAxolotl = builder.defineInRange("healthMultiplierForBabyAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyAxolotl = builder.defineInRange("damageMultiplierForBabyAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyAxolotl = builder.defineInRange("speedMultiplierForBabyAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyAxolotl = builder.defineInRange("scaleMultiplierForBabyAxolotl", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Bat");
            healthMultiplierForBat = builder.defineInRange("healthMultiplierForBat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBat = builder.defineInRange("speedMultiplierForBat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBat = builder.defineInRange("scaleMultiplierForBat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Bee");
            healthMultiplierForBee = builder.defineInRange("healthMultiplierForBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBee = builder.defineInRange("damageMultiplierForBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBee = builder.defineInRange("speedMultiplierForBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBee = builder.defineInRange("scaleMultiplierForBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Bee");
            healthMultiplierForBabyBee = builder.defineInRange("healthMultiplierForBabyBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyBee = builder.defineInRange("damageMultiplierForBabyBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyBee = builder.defineInRange("speedMultiplierForBabyBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyBee = builder.defineInRange("scaleMultiplierForBabyBee", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Blaze");
            healthMultiplierForBlaze = builder.defineInRange("healthMultiplierForBlaze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBlaze = builder.defineInRange("damageMultiplierForBlaze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBlaze = builder.defineInRange("speedMultiplierForBlaze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBlaze = builder.defineInRange("scaleMultiplierForBlaze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Bogged");
            healthMultiplierForBogged = builder.defineInRange("healthMultiplierForBogged", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBogged = builder.defineInRange("damageMultiplierForBogged", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBogged = builder.defineInRange("speedMultiplierForBogged", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBogged = builder.defineInRange("scaleMultiplierForBogged", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Breeze");
            healthMultiplierForBreeze = builder.defineInRange("healthMultiplierForBreeze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBreeze = builder.defineInRange("damageMultiplierForBreeze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBreeze = builder.defineInRange("speedMultiplierForBreeze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBreeze = builder.defineInRange("scaleMultiplierForBreeze", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Camel");
            healthMultiplierForCamel = builder.defineInRange("healthMultiplierForCamel", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCamel = builder.defineInRange("speedMultiplierForCamel", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCamel = builder.defineInRange("scaleMultiplierForCamel", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Camel");
            healthMultiplierForBabyCamel = builder.defineInRange("healthMultiplierForBabyCamel", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyCamel = builder.defineInRange("speedMultiplierForBabyCamel", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyCamel = builder.defineInRange("scaleMultiplierForBabyCamel", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Cat");
            healthMultiplierForCat = builder.defineInRange("healthMultiplierForCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCat = builder.defineInRange("damageMultiplierForCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCat = builder.defineInRange("speedMultiplierForCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCat = builder.defineInRange("scaleMultiplierForCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Cat");
            healthMultiplierForBabyCat = builder.defineInRange("healthMultiplierForBabyCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyCat = builder.defineInRange("damageMultiplierForBabyCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyCat = builder.defineInRange("speedMultiplierForBabyCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyCat = builder.defineInRange("scaleMultiplierForBabyCat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Cave Spider");
            healthMultiplierForCaveSpider = builder.defineInRange("healthMultiplierForCaveSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCaveSpider = builder.defineInRange("damageMultiplierForCaveSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCaveSpider = builder.defineInRange("speedMultiplierForCaveSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCaveSpider = builder.defineInRange("scaleMultiplierForCaveSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Chicken");
            healthMultiplierForChicken = builder.defineInRange("healthMultiplierForChicken", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForChicken = builder.defineInRange("speedMultiplierForChicken", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForChicken = builder.defineInRange("scaleMultiplierForChicken", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Chicken");
            healthMultiplierForBabyChicken = builder.defineInRange("healthMultiplierForBabyChicken", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyChicken = builder.defineInRange("speedMultiplierForBabyChicken", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyChicken = builder.defineInRange("scaleMultiplierForBabyChicken", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Cod");
            healthMultiplierForCod = builder.defineInRange("healthMultiplierForCod", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCod = builder.defineInRange("speedMultiplierForCod", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCod = builder.defineInRange("scaleMultiplierForCod", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Cow");
            healthMultiplierForCow = builder.defineInRange("healthMultiplierForCow", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCow = builder.defineInRange("speedMultiplierForCow", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCow = builder.defineInRange("scaleMultiplierForCow", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Cow");
            healthMultiplierForBabyCow = builder.defineInRange("healthMultiplierForBabyCow", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyCow = builder.defineInRange("speedMultiplierForBabyCow", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyCow = builder.defineInRange("scaleMultiplierForBabyCow", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Creeper");
            healthMultiplierForCreeper = builder.defineInRange("healthMultiplierForCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCreeper = builder.defineInRange("damageMultiplierForCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCreeper = builder.defineInRange("speedMultiplierForCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCreeper = builder.defineInRange("scaleMultiplierForCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Dolphin");
            healthMultiplierForDolphin = builder.defineInRange("healthMultiplierForDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForDolphin = builder.defineInRange("damageMultiplierForDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForDolphin = builder.defineInRange("speedMultiplierForDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForDolphin = builder.defineInRange("scaleMultiplierForDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Dolphin");
            healthMultiplierForBabyDolphin = builder.defineInRange("healthMultiplierForBabyDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyDolphin = builder.defineInRange("damageMultiplierForBabyDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyDolphin = builder.defineInRange("speedMultiplierForBabyDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyDolphin = builder.defineInRange("scaleMultiplierForBabyDolphin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Donkey");
            healthMultiplierForDonkey = builder.defineInRange("healthMultiplierForDonkey", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForDonkey = builder.defineInRange("speedMultiplierForDonkey", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForDonkey = builder.defineInRange("scaleMultiplierForDonkey", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Donkey");
            healthMultiplierForBabyDonkey = builder.defineInRange("healthMultiplierForBabyDonkey", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyDonkey = builder.defineInRange("speedMultiplierForBabyDonkey", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyDonkey = builder.defineInRange("scaleMultiplierForBabyDonkey", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Drowned");
            healthMultiplierForDrowned = builder.defineInRange("healthMultiplierForDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForDrowned = builder.defineInRange("damageMultiplierForDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForDrowned = builder.defineInRange("speedMultiplierForDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForDrowned = builder.defineInRange("scaleMultiplierForDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Drowned");
            healthMultiplierForBabyDrowned = builder.defineInRange("healthMultiplierForBabyDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyDrowned = builder.defineInRange("damageMultiplierForBabyDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyDrowned = builder.defineInRange("speedMultiplierForBabyDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyDrowned = builder.defineInRange("scaleMultiplierForBabyDrowned", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Elder Guardian");
            healthMultiplierForElderGuardian = builder.defineInRange("healthMultiplierForElderGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForElderGuardian = builder.defineInRange("damageMultiplierForElderGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForElderGuardian = builder.defineInRange("speedMultiplierForElderGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForElderGuardian = builder.defineInRange("scaleMultiplierForElderGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Ender Dragon");
            healthMultiplierForEnderDragon = builder.defineInRange("healthMultiplierForEnderDragon", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForEnderDragon = builder.defineInRange("damageMultiplierForEnderDragon", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Enderman");
            healthMultiplierForEnderman = builder.defineInRange("healthMultiplierForEnderman", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForEnderman = builder.defineInRange("damageMultiplierForEnderman", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForEnderman = builder.defineInRange("speedMultiplierForEnderman", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForEnderman = builder.defineInRange("scaleMultiplierForEnderman", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Endermite");
            healthMultiplierForEndermite = builder.defineInRange("healthMultiplierForEndermite", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForEndermite = builder.defineInRange("damageMultiplierForEndermite", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForEndermite = builder.defineInRange("speedMultiplierForEndermite", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForEndermite = builder.defineInRange("scaleMultiplierForEndermite", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Evoker");
            healthMultiplierForEvoker = builder.defineInRange("healthMultiplierForEvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForEvoker = builder.defineInRange("damageMultiplierForEvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForEvoker = builder.defineInRange("speedMultiplierForEvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForEvoker = builder.defineInRange("scaleMultiplierForEvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Fox");
            healthMultiplierForFox = builder.defineInRange("healthMultiplierForFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForFox = builder.defineInRange("damageMultiplierForFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForFox = builder.defineInRange("speedMultiplierForFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForFox = builder.defineInRange("scaleMultiplierForFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Fox");
            healthMultiplierForBabyFox = builder.defineInRange("healthMultiplierForBabyFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyFox = builder.defineInRange("damageMultiplierForBabyFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyFox = builder.defineInRange("speedMultiplierForBabyFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyFox = builder.defineInRange("scaleMultiplierForBabyFox", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Frog");
            healthMultiplierForFrog = builder.defineInRange("healthMultiplierForFrog", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForFrog = builder.defineInRange("damageMultiplierForFrog", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForFrog = builder.defineInRange("speedMultiplierForFrog", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForFrog = builder.defineInRange("scaleMultiplierForFrog", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Ghast");
            healthMultiplierForGhast = builder.defineInRange("healthMultiplierForGhast", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForGhast = builder.defineInRange("damageMultiplierForGhast", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForGhast = builder.defineInRange("speedMultiplierForGhast", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForGhast = builder.defineInRange("scaleMultiplierForGhast", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Giant");
            healthMultiplierForGiant = builder.defineInRange("healthMultiplierForGiant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForGiant = builder.defineInRange("damageMultiplierForGiant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForGiant = builder.defineInRange("speedMultiplierForGiant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForGiant = builder.defineInRange("scaleMultiplierForGiant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Glow Squid");
            healthMultiplierForGlowSquid = builder.defineInRange("healthMultiplierForGlowSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForGlowSquid = builder.defineInRange("speedMultiplierForGlowSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForGlowSquid = builder.defineInRange("scaleMultiplierForGlowSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Glow Squid");
            healthMultiplierForBabyGlowSquid = builder.defineInRange("healthMultiplierForBabyGlowSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyGlowSquid = builder.defineInRange("speedMultiplierForBabyGlowSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyGlowSquid = builder.defineInRange("scaleMultiplierForBabyGlowSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Goat");
            healthMultiplierForGoat = builder.defineInRange("healthMultiplierForGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForGoat = builder.defineInRange("damageMultiplierForGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForGoat = builder.defineInRange("speedMultiplierForGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForGoat = builder.defineInRange("scaleMultiplierForGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Goat");
            healthMultiplierForBabyGoat = builder.defineInRange("healthMultiplierForBabyGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyGoat = builder.defineInRange("damageMultiplierForBabyGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyGoat = builder.defineInRange("speedMultiplierForBabyGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyGoat = builder.defineInRange("scaleMultiplierForBabyGoat", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Guardian");
            healthMultiplierForGuardian = builder.defineInRange("healthMultiplierForGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForGuardian = builder.defineInRange("damageMultiplierForGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForGuardian = builder.defineInRange("speedMultiplierForGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForGuardian = builder.defineInRange("scaleMultiplierForGuardian", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Hoglin");
            healthMultiplierForHoglin = builder.defineInRange("healthMultiplierForHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForHoglin = builder.defineInRange("damageMultiplierForHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForHoglin = builder.defineInRange("speedMultiplierForHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForHoglin = builder.defineInRange("scaleMultiplierForHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Hoglin");
            healthMultiplierForBabyHoglin = builder.defineInRange("healthMultiplierForBabyHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyHoglin = builder.defineInRange("damageMultiplierForBabyHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyHoglin = builder.defineInRange("speedMultiplierForBabyHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyHoglin = builder.defineInRange("scaleMultiplierForBabyHoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Horse");
            healthMultiplierForHorse = builder.defineInRange("healthMultiplierForHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForHorse = builder.defineInRange("speedMultiplierForHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForHorse = builder.defineInRange("scaleMultiplierForHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Horse");
            healthMultiplierForBabyHorse = builder.defineInRange("healthMultiplierForBabyHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyHorse = builder.defineInRange("speedMultiplierForBabyHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyHorse = builder.defineInRange("scaleMultiplierForBabyHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Husk");
            healthMultiplierForHusk = builder.defineInRange("healthMultiplierForHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForHusk = builder.defineInRange("damageMultiplierForHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForHusk = builder.defineInRange("speedMultiplierForHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForHusk = builder.defineInRange("scaleMultiplierForHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Husk");
            healthMultiplierForBabyHusk = builder.defineInRange("healthMultiplierForBabyHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyHusk = builder.defineInRange("damageMultiplierForBabyHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyHusk = builder.defineInRange("speedMultiplierForBabyHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyHusk = builder.defineInRange("scaleMultiplierForBabyHusk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Illusioner");
            healthMultiplierForIllusioner = builder.defineInRange("healthMultiplierForIllusioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForIllusioner = builder.defineInRange("damageMultiplierForIllusioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForIllusioner = builder.defineInRange("speedMultiplierForIllusioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForIllusioner = builder.defineInRange("scaleMultiplierForIllusioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Iron Golem");
            healthMultiplierForIronGolem = builder.defineInRange("healthMultiplierForIronGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForIronGolem = builder.defineInRange("damageMultiplierForIronGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForIronGolem = builder.defineInRange("speedMultiplierForIronGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForIronGolem = builder.defineInRange("scaleMultiplierForIronGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Llama");
            healthMultiplierForLlama = builder.defineInRange("healthMultiplierForLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForLlama = builder.defineInRange("damageMultiplierForLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForLlama = builder.defineInRange("speedMultiplierForLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForLlama = builder.defineInRange("scaleMultiplierForLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Llama");
            healthMultiplierForBabyLlama = builder.defineInRange("healthMultiplierForBabyLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyLlama = builder.defineInRange("damageMultiplierForBabyLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyLlama = builder.defineInRange("speedMultiplierForBabyLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyLlama = builder.defineInRange("scaleMultiplierForBabyLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Magma Cube");
            healthMultiplierForMagmaCube = builder.defineInRange("healthMultiplierForMagmaCube", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForMagmaCube = builder.defineInRange("damageMultiplierForMagmaCube", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMagmaCube = builder.defineInRange("speedMultiplierForMagmaCube", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMagmaCube = builder.defineInRange("scaleMultiplierForMagmaCube", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Mooshroom");
            healthMultiplierForMooshroom = builder.defineInRange("healthMultiplierForMooshroom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMooshroom = builder.defineInRange("speedMultiplierForMooshroom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMooshroom = builder.defineInRange("scaleMultiplierForMooshroom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Mooshroom");
            healthMultiplierForBabyMooshroom = builder.defineInRange("healthMultiplierForBabyMooshroom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyMooshroom = builder.defineInRange("speedMultiplierForBabyMooshroom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyMooshroom = builder.defineInRange("scaleMultiplierForBabyMooshroom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Mule");
            healthMultiplierForMule = builder.defineInRange("healthMultiplierForMule", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMule = builder.defineInRange("speedMultiplierForMule", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMule = builder.defineInRange("scaleMultiplierForMule", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Mule");
            healthMultiplierForBabyMule = builder.defineInRange("healthMultiplierForBabyMule", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyMule = builder.defineInRange("speedMultiplierForBabyMule", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyMule = builder.defineInRange("scaleMultiplierForBabyMule", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Ocelot");
            healthMultiplierForOcelot = builder.defineInRange("healthMultiplierForOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForOcelot = builder.defineInRange("damageMultiplierForOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForOcelot = builder.defineInRange("speedMultiplierForOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForOcelot = builder.defineInRange("scaleMultiplierForOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Ocelot");
            healthMultiplierForBabyOcelot = builder.defineInRange("healthMultiplierForBabyOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyOcelot = builder.defineInRange("damageMultiplierForBabyOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyOcelot = builder.defineInRange("speedMultiplierForBabyOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyOcelot = builder.defineInRange("scaleMultiplierForBabyOcelot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Panda");
            healthMultiplierForPanda = builder.defineInRange("healthMultiplierForPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForPanda = builder.defineInRange("damageMultiplierForPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPanda = builder.defineInRange("speedMultiplierForPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPanda = builder.defineInRange("scaleMultiplierForPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Panda");
            healthMultiplierForBabyPanda = builder.defineInRange("healthMultiplierForBabyPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyPanda = builder.defineInRange("damageMultiplierForBabyPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyPanda = builder.defineInRange("speedMultiplierForBabyPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyPanda = builder.defineInRange("scaleMultiplierForBabyPanda", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Parrot");
            healthMultiplierForParrot = builder.defineInRange("healthMultiplierForParrot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForParrot = builder.defineInRange("speedMultiplierForParrot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForParrot = builder.defineInRange("scaleMultiplierForParrot", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Phantom");
            healthMultiplierForPhantom = builder.defineInRange("healthMultiplierForPhantom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForPhantom = builder.defineInRange("damageMultiplierForPhantom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPhantom = builder.defineInRange("scaleMultiplierForPhantom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Pig");
            healthMultiplierForPig = builder.defineInRange("healthMultiplierForPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPig = builder.defineInRange("speedMultiplierForPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPig = builder.defineInRange("scaleMultiplierForPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Pig");
            healthMultiplierForBabyPig = builder.defineInRange("healthMultiplierForBabyPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyPig = builder.defineInRange("speedMultiplierForBabyPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyPig = builder.defineInRange("scaleMultiplierForBabyPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Piglin");
            healthMultiplierForPiglin = builder.defineInRange("healthMultiplierForPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForPiglin = builder.defineInRange("damageMultiplierForPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPiglin = builder.defineInRange("speedMultiplierForPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPiglin = builder.defineInRange("scaleMultiplierForPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Piglin");
            healthMultiplierForBabyPiglin = builder.defineInRange("healthMultiplierForBabyPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyPiglin = builder.defineInRange("speedMultiplierForBabyPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyPiglin = builder.defineInRange("scaleMultiplierForBabyPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Piglin Brute");
            healthMultiplierForPiglinBrute = builder.defineInRange("healthMultiplierForPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForPiglinBrute = builder.defineInRange("damageMultiplierForPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPiglinBrute = builder.defineInRange("speedMultiplierForPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPiglinBrute = builder.defineInRange("scaleMultiplierForPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Pillager");
            healthMultiplierForPillager = builder.defineInRange("healthMultiplierForPillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForPillager = builder.defineInRange("damageMultiplierForPillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPillager = builder.defineInRange("speedMultiplierForPillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPillager = builder.defineInRange("scaleMultiplierForPillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Polar Bear");
            healthMultiplierForPolarBear = builder.defineInRange("healthMultiplierForPolarBear", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForPolarBear = builder.defineInRange("damageMultiplierForPolarBear", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPolarBear = builder.defineInRange("speedMultiplierForPolarBear", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPolarBear = builder.defineInRange("scaleMultiplierForPolarBear", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Polar Bear");
            healthMultiplierForBabyPolarBear = builder.defineInRange("healthMultiplierForBabyPolarBear", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyPolarBear = builder.defineInRange("speedMultiplierForBabyPolarBear", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyPolarBear = builder.defineInRange("scaleMultiplierForBabyPolarBear", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Pufferfish");
            healthMultiplierForPufferfish = builder.defineInRange("healthMultiplierForPufferfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPufferfish = builder.defineInRange("speedMultiplierForPufferfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPufferfish = builder.defineInRange("scaleMultiplierForPufferfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Rabbit");
            healthMultiplierForRabbit = builder.defineInRange("healthMultiplierForRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForRabbit = builder.defineInRange("damageMultiplierForRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForRabbit = builder.defineInRange("speedMultiplierForRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForRabbit = builder.defineInRange("scaleMultiplierForRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Rabbit");
            healthMultiplierForBabyRabbit = builder.defineInRange("healthMultiplierForBabyRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyRabbit = builder.defineInRange("damageMultiplierForBabyRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyRabbit = builder.defineInRange("speedMultiplierForBabyRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyRabbit = builder.defineInRange("scaleMultiplierForBabyRabbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Ravager");
            healthMultiplierForRavager = builder.defineInRange("healthMultiplierForRavager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForRavager = builder.defineInRange("damageMultiplierForRavager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForRavager = builder.defineInRange("speedMultiplierForRavager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForRavager = builder.defineInRange("scaleMultiplierForRavager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Salmon");
            healthMultiplierForSalmon = builder.defineInRange("healthMultiplierForSalmon", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSalmon = builder.defineInRange("speedMultiplierForSalmon", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSalmon = builder.defineInRange("scaleMultiplierForSalmon", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Sheep");
            healthMultiplierForSheep = builder.defineInRange("healthMultiplierForSheep", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSheep = builder.defineInRange("speedMultiplierForSheep", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSheep = builder.defineInRange("scaleMultiplierForSheep", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Sheep");
            healthMultiplierForBabySheep = builder.defineInRange("healthMultiplierForBabySheep", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabySheep = builder.defineInRange("speedMultiplierForBabySheep", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabySheep = builder.defineInRange("scaleMultiplierForBabySheep", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Shulker");
            healthMultiplierForShulker = builder.defineInRange("healthMultiplierForShulker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForShulker = builder.defineInRange("damageMultiplierForShulker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForShulker = builder.defineInRange("scaleMultiplierForShulker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Silverfish");
            healthMultiplierForSilverfish = builder.defineInRange("healthMultiplierForSilverfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSilverfish = builder.defineInRange("damageMultiplierForSilverfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSilverfish = builder.defineInRange("speedMultiplierForSilverfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSilverfish = builder.defineInRange("scaleMultiplierForSilverfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Skeleton");
            healthMultiplierForSkeleton = builder.defineInRange("healthMultiplierForSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSkeleton = builder.defineInRange("damageMultiplierForSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSkeleton = builder.defineInRange("speedMultiplierForSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSkeleton = builder.defineInRange("scaleMultiplierForSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Skeleton Horse");
            healthMultiplierForSkeletonHorse = builder.defineInRange("healthMultiplierForSkeletonHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSkeletonHorse = builder.defineInRange("speedMultiplierForSkeletonHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSkeletonHorse = builder.defineInRange("scaleMultiplierForSkeletonHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Skeleton Horse");
            healthMultiplierForBabySkeletonHorse = builder.defineInRange("healthMultiplierForBabySkeletonHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabySkeletonHorse = builder.defineInRange("speedMultiplierForBabySkeletonHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabySkeletonHorse = builder.defineInRange("scaleMultiplierForBabySkeletonHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Slime");
            healthMultiplierForSlime = builder.defineInRange("healthMultiplierForSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSlime = builder.defineInRange("damageMultiplierForSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSlime = builder.defineInRange("speedMultiplierForSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSlime = builder.defineInRange("scaleMultiplierForSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Sniffer");
            healthMultiplierForSniffer = builder.defineInRange("healthMultiplierForSniffer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSniffer = builder.defineInRange("speedMultiplierForSniffer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSniffer = builder.defineInRange("scaleMultiplierForSniffer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Sniffer");
            healthMultiplierForBabySniffer = builder.defineInRange("healthMultiplierForBabySniffer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabySniffer = builder.defineInRange("speedMultiplierForBabySniffer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabySniffer = builder.defineInRange("scaleMultiplierForBabySniffer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Snow Golem");
            healthMultiplierForSnowGolem = builder.defineInRange("healthMultiplierForSnowGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSnowGolem = builder.defineInRange("damageMultiplierForSnowGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSnowGolem = builder.defineInRange("speedMultiplierForSnowGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSnowGolem = builder.defineInRange("scaleMultiplierForSnowGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Spider");
            healthMultiplierForSpider = builder.defineInRange("healthMultiplierForSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSpider = builder.defineInRange("damageMultiplierForSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSpider = builder.defineInRange("speedMultiplierForSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSpider = builder.defineInRange("scaleMultiplierForSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Squid");
            healthMultiplierForSquid = builder.defineInRange("healthMultiplierForSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSquid = builder.defineInRange("speedMultiplierForSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSquid = builder.defineInRange("scaleMultiplierForSquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Squid");
            healthMultiplierForBabySquid = builder.defineInRange("healthMultiplierForBabySquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabySquid = builder.defineInRange("speedMultiplierForBabySquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabySquid = builder.defineInRange("scaleMultiplierForBabySquid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Stray");
            healthMultiplierForStray = builder.defineInRange("healthMultiplierForStray", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForStray = builder.defineInRange("damageMultiplierForStray", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForStray = builder.defineInRange("speedMultiplierForStray", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForStray = builder.defineInRange("scaleMultiplierForStray", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Strider");
            healthMultiplierForStrider = builder.defineInRange("healthMultiplierForStrider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForStrider = builder.defineInRange("speedMultiplierForStrider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForStrider = builder.defineInRange("scaleMultiplierForStrider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Strider");
            healthMultiplierForBabyStrider = builder.defineInRange("healthMultiplierForBabyStrider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyStrider = builder.defineInRange("speedMultiplierForBabyStrider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyStrider = builder.defineInRange("scaleMultiplierForBabyStrider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Tadpole");
            healthMultiplierForTadpole = builder.defineInRange("healthMultiplierForTadpole", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForTadpole = builder.defineInRange("speedMultiplierForTadpole", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForTadpole = builder.defineInRange("scaleMultiplierForTadpole", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Trader Llama");
            healthMultiplierForTraderLlama = builder.defineInRange("healthMultiplierForTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForTraderLlama = builder.defineInRange("damageMultiplierForTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForTraderLlama = builder.defineInRange("speedMultiplierForTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForTraderLlama = builder.defineInRange("scaleMultiplierForTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Trader Llama");
            healthMultiplierForBabyTraderLlama = builder.defineInRange("healthMultiplierForBabyTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyTraderLlama = builder.defineInRange("damageMultiplierForBabyTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyTraderLlama = builder.defineInRange("speedMultiplierForBabyTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyTraderLlama = builder.defineInRange("scaleMultiplierForBabyTraderLlama", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Tropical Fish");
            healthMultiplierForTropicalFish = builder.defineInRange("healthMultiplierForTropicalFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForTropicalFish = builder.defineInRange("speedMultiplierForTropicalFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForTropicalFish = builder.defineInRange("scaleMultiplierForTropicalFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Turtle");
            healthMultiplierForTurtle = builder.defineInRange("healthMultiplierForTurtle", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForTurtle = builder.defineInRange("speedMultiplierForTurtle", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForTurtle = builder.defineInRange("scaleMultiplierForTurtle", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Turtle");
            healthMultiplierForBabyTurtle = builder.defineInRange("healthMultiplierForBabyTurtle", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyTurtle = builder.defineInRange("speedMultiplierForBabyTurtle", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyTurtle = builder.defineInRange("scaleMultiplierForBabyTurtle", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Vex");
            healthMultiplierForVex = builder.defineInRange("healthMultiplierForVex", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForVex = builder.defineInRange("damageMultiplierForVex", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForVex = builder.defineInRange("speedMultiplierForVex", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForVex = builder.defineInRange("scaleMultiplierForVex", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Villager");
            healthMultiplierForVillager = builder.defineInRange("healthMultiplierForVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForVillager = builder.defineInRange("speedMultiplierForVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForVillager = builder.defineInRange("scaleMultiplierForVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Villager");
            healthMultiplierForBabyVillager = builder.defineInRange("healthMultiplierForBabyVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyVillager = builder.defineInRange("speedMultiplierForBabyVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyVillager = builder.defineInRange("scaleMultiplierForBabyVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Vindicator");
            healthMultiplierForVindicator = builder.defineInRange("healthMultiplierForVindicator", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForVindicator = builder.defineInRange("damageMultiplierForVindicator", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForVindicator = builder.defineInRange("speedMultiplierForVindicator", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForVindicator = builder.defineInRange("scaleMultiplierForVindicator", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Wandering Trader");
            healthMultiplierForWanderingTrader = builder.defineInRange("healthMultiplierForWanderingTrader", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForWanderingTrader = builder.defineInRange("speedMultiplierForWanderingTrader", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForWanderingTrader = builder.defineInRange("scaleMultiplierForWanderingTrader", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Warden");
            healthMultiplierForWarden = builder.defineInRange("healthMultiplierForWarden", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForWarden = builder.defineInRange("damageMultiplierForWarden", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForWarden = builder.defineInRange("speedMultiplierForWarden", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForWarden = builder.defineInRange("scaleMultiplierForWarden", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Witch");
            healthMultiplierForWitch = builder.defineInRange("healthMultiplierForWitch", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForWitch = builder.defineInRange("damageMultiplierForWitch", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForWitch = builder.defineInRange("speedMultiplierForWitch", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForWitch = builder.defineInRange("scaleMultiplierForWitch", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Wither");
            healthMultiplierForWither = builder.defineInRange("healthMultiplierForWither", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForWither = builder.defineInRange("damageMultiplierForWither", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForWither = builder.defineInRange("speedMultiplierForWither", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForWither = builder.defineInRange("scaleMultiplierForWither", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Wither Skeleton");
            healthMultiplierForWitherSkeleton = builder.defineInRange("healthMultiplierForWitherSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForWitherSkeleton = builder.defineInRange("damageMultiplierForWitherSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForWitherSkeleton = builder.defineInRange("speedMultiplierForWitherSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForWitherSkeleton = builder.defineInRange("scaleMultiplierForWitherSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Wolf");
            healthMultiplierForWolf = builder.defineInRange("healthMultiplierForWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForWolf = builder.defineInRange("damageMultiplierForWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForWolf = builder.defineInRange("speedMultiplierForWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForWolf = builder.defineInRange("scaleMultiplierForWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Wolf");
            healthMultiplierForBabyWolf = builder.defineInRange("healthMultiplierForBabyWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyWolf = builder.defineInRange("damageMultiplierForBabyWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyWolf = builder.defineInRange("speedMultiplierForBabyWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyWolf = builder.defineInRange("scaleMultiplierForBabyWolf", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Zoglin");
            healthMultiplierForZoglin = builder.defineInRange("healthMultiplierForZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForZoglin = builder.defineInRange("damageMultiplierForZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForZoglin = builder.defineInRange("speedMultiplierForZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForZoglin = builder.defineInRange("scaleMultiplierForZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Zoglin");
            healthMultiplierForBabyZoglin = builder.defineInRange("healthMultiplierForBabyZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyZoglin = builder.defineInRange("damageMultiplierForBabyZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyZoglin = builder.defineInRange("speedMultiplierForBabyZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyZoglin = builder.defineInRange("scaleMultiplierForBabyZoglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Zombie");
            healthMultiplierForZombie = builder.defineInRange("healthMultiplierForZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForZombie = builder.defineInRange("damageMultiplierForZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForZombie = builder.defineInRange("speedMultiplierForZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForZombie = builder.defineInRange("scaleMultiplierForZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Zombie");
            healthMultiplierForBabyZombie = builder.defineInRange("healthMultiplierForBabyZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyZombie = builder.defineInRange("damageMultiplierForBabyZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyZombie = builder.defineInRange("speedMultiplierForBabyZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyZombie = builder.defineInRange("scaleMultiplierForBabyZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Zombie Horse");
            healthMultiplierForZombieHorse = builder.defineInRange("healthMultiplierForZombieHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForZombieHorse = builder.defineInRange("speedMultiplierForZombieHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForZombieHorse = builder.defineInRange("scaleMultiplierForZombieHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Zombie Horse");
            healthMultiplierForBabyZombieHorse = builder.defineInRange("healthMultiplierForBabyZombieHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyZombieHorse = builder.defineInRange("speedMultiplierForBabyZombieHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyZombieHorse = builder.defineInRange("scaleMultiplierForBabyZombieHorse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Zombie Villager");
            healthMultiplierForZombieVillager = builder.defineInRange("healthMultiplierForZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForZombieVillager = builder.defineInRange("damageMultiplierForZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForZombieVillager = builder.defineInRange("speedMultiplierForZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForZombieVillager = builder.defineInRange("scaleMultiplierForZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Zombie Villager");
            healthMultiplierForBabyZombieVillager = builder.defineInRange("healthMultiplierForBabyZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyZombieVillager = builder.defineInRange("damageMultiplierForBabyZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyZombieVillager = builder.defineInRange("speedMultiplierForBabyZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyZombieVillager = builder.defineInRange("scaleMultiplierForBabyZombieVillager", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.push("Zombified Piglin");
            healthMultiplierForZombifiedPiglin = builder.defineInRange("healthMultiplierForZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForZombifiedPiglin = builder.defineInRange("damageMultiplierForZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForZombifiedPiglin = builder.defineInRange("speedMultiplierForZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForZombifiedPiglin = builder.defineInRange("scaleMultiplierForZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.push("Baby Zombified Piglin");
            healthMultiplierForBabyZombifiedPiglin = builder.defineInRange("healthMultiplierForBabyZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBabyZombifiedPiglin = builder.defineInRange("damageMultiplierForBabyZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBabyZombifiedPiglin = builder.defineInRange("speedMultiplierForBabyZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBabyZombifiedPiglin = builder.defineInRange("scaleMultiplierForBabyZombifiedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();
            builder.pop();

            builder.pop();
        }
    }

    public static class BetterEnd {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCubozoa;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForDragonfly;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForDragonfly;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForEndFish;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForEndSlime;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForEndSlime;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForEndSlime;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForEndSlime;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForShadowWalker;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForShadowWalker;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForShadowWalker;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForShadowWalker;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSilkMoth;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSilkMoth;

        BetterEnd(ForgeConfigSpec.Builder builder) {

            builder.push("BetterEnd");

            builder.push("Cubozoa");
            healthMultiplierForCubozoa = builder.defineInRange("healthMultiplierForCubozoa", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Dragonfly");
            healthMultiplierForDragonfly = builder.defineInRange("healthMultiplierForDragonfly", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForDragonfly = builder.defineInRange("scaleMultiplierForDragonfly", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("End Fish");
            healthMultiplierForEndFish = builder.defineInRange("healthMultiplierForEndFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("End Slime");
            healthMultiplierForEndSlime = builder.defineInRange("healthMultiplierForEndSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForEndSlime = builder.defineInRange("damageMultiplierForEndSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForEndSlime = builder.defineInRange("speedMultiplierForEndSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForEndSlime = builder.defineInRange("scaleMultiplierForEndSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Shadow Walker");
            healthMultiplierForShadowWalker = builder.defineInRange("healthMultiplierForShadowWalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForShadowWalker = builder.defineInRange("damageMultiplierForShadowWalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForShadowWalker = builder.defineInRange("speedMultiplierForShadowWalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForShadowWalker = builder.defineInRange("scaleMultiplierForShadowWalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Silk Moth");
            healthMultiplierForSilkMoth = builder.defineInRange("healthMultiplierForSilkMoth", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSilkMoth = builder.defineInRange("scaleMultiplierForSilkMoth", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class BetterNether {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForFirefly;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForFirefly;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForFirefly;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForFlyingPig;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForFlyingPig;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForFlyingPig;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForFlyingPig;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForHydrogenJellyfish;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForHydrogenJellyfish;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForHydrogenJellyfish;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForJungleSkeleton;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForJungleSkeleton;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForJungleSkeleton;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForJungleSkeleton;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForNaga;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForNaga;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForNaga;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForNaga;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSkull;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSkull;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSkull;

        BetterNether(ForgeConfigSpec.Builder builder) {

            builder.push("BetterNether");

            builder.push("Firefly");
            healthMultiplierForFirefly = builder.defineInRange("healthMultiplierForFirefly", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForFirefly = builder.defineInRange("damageMultiplierForFirefly", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForFirefly = builder.defineInRange("scaleMultiplierForFirefly", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Flying Pig");
            healthMultiplierForFlyingPig = builder.defineInRange("healthMultiplierForFlyingPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForFlyingPig = builder.defineInRange("damageMultiplierForFlyingPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForFlyingPig = builder.defineInRange("speedMultiplierForFlyingPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForFlyingPig = builder.defineInRange("scaleMultiplierForFlyingPig", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Hydrogen Jellyfish");
            healthMultiplierForHydrogenJellyfish = builder.defineInRange("healthMultiplierForHydrogenJellyfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForHydrogenJellyfish = builder.defineInRange("damageMultiplierForHydrogenJellyfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForHydrogenJellyfish = builder.defineInRange("scaleMultiplierForHydrogenJellyfish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Jungle Skeleton");
            healthMultiplierForJungleSkeleton = builder.defineInRange("healthMultiplierForJungleSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForJungleSkeleton = builder.defineInRange("damageMultiplierForJungleSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForJungleSkeleton = builder.defineInRange("speedMultiplierForJungleSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForJungleSkeleton = builder.defineInRange("scaleMultiplierForJungleSkeleton", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Naga");
            healthMultiplierForNaga = builder.defineInRange("healthMultiplierForNaga", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForNaga = builder.defineInRange("damageMultiplierForNaga", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForNaga = builder.defineInRange("speedMultiplierForNaga", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForNaga = builder.defineInRange("scaleMultiplierForNaga", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Skull");
            healthMultiplierForSkull = builder.defineInRange("healthMultiplierForSkull", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSkull = builder.defineInRange("damageMultiplierForSkull", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSkull = builder.defineInRange("scaleMultiplierForSkull", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class DeeperAndDarker {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForAnglerFish;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForAnglerFish;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForAnglerFish;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForAnglerFish;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSculkCentipede;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSculkCentipede;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSculkCentipede;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSculkCentipede;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSculkLeech;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSculkLeech;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSculkLeech;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSculkLeech;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSculkSnapper;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSculkSnapper;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSculkSnapper;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSculkSnapper;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForShattered;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForShattered;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForShattered;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForShattered;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForShriekWorm;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForShriekWorm;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForShriekWorm;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSludge;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSludge;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSludge;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSludge;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForStalker;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForStalker;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForStalker;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForStalker;

        DeeperAndDarker(ForgeConfigSpec.Builder builder) {

            builder.push("Deeper and Darker");

            builder.push("Angler Fish");
            healthMultiplierForAnglerFish = builder.defineInRange("healthMultiplierForAnglerFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForAnglerFish = builder.defineInRange("damageMultiplierForAnglerFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForAnglerFish = builder.defineInRange("speedMultiplierForAnglerFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForAnglerFish = builder.defineInRange("scaleMultiplierForAnglerFish", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Sculk Centipede");
            healthMultiplierForSculkCentipede = builder.defineInRange("healthMultiplierForSculkCentipede", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSculkCentipede = builder.defineInRange("damageMultiplierForSculkCentipede", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSculkCentipede = builder.defineInRange("speedMultiplierForSculkCentipede", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSculkCentipede = builder.defineInRange("scaleMultiplierForSculkCentipede", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Sculk Leech");
            healthMultiplierForSculkLeech = builder.defineInRange("healthMultiplierForSculkLeech", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSculkLeech = builder.defineInRange("damageMultiplierForSculkLeech", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSculkLeech = builder.defineInRange("speedMultiplierForSculkLeech", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSculkLeech = builder.defineInRange("scaleMultiplierForSculkLeech", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Sculk Snapper");
            healthMultiplierForSculkSnapper = builder.defineInRange("healthMultiplierForSculkSnapper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSculkSnapper = builder.defineInRange("damageMultiplierForSculkSnapper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSculkSnapper = builder.defineInRange("speedMultiplierForSculkSnapper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSculkSnapper = builder.defineInRange("scaleMultiplierForSculkSnapper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Shattered");
            healthMultiplierForShattered = builder.defineInRange("healthMultiplierForShattered", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForShattered = builder.defineInRange("damageMultiplierForShattered", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForShattered = builder.defineInRange("speedMultiplierForShattered", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForShattered = builder.defineInRange("scaleMultiplierForShattered", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Shriek Worm");
            healthMultiplierForShriekWorm = builder.defineInRange("healthMultiplierForShriekWorm", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForShriekWorm = builder.defineInRange("damageMultiplierForShriekWorm", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForShriekWorm = builder.defineInRange("scaleMultiplierForShriekWorm", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Sludge");
            healthMultiplierForSludge = builder.defineInRange("healthMultiplierForSludge", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSludge = builder.defineInRange("damageMultiplierForSludge", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSludge = builder.defineInRange("speedMultiplierForSludge", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSludge = builder.defineInRange("scaleMultiplierForSludge", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Stalker");
            healthMultiplierForStalker = builder.defineInRange("healthMultiplierForStalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForStalker = builder.defineInRange("damageMultiplierForStalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForStalker = builder.defineInRange("speedMultiplierForStalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForStalker = builder.defineInRange("scaleMultiplierForStalker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class FriendsAndFoes {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCopperGolem;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCopperGolem;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCopperGolem;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCopperGolem;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCrab;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCrab;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCrab;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCrab;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForGlare;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForGlare;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForGlare;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForGlare;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForIceologer;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForIceologer;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForIceologer;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForIceologer;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMauler;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForMauler;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMauler;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMauler;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMoobloom;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForMoobloom;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMoobloom;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMoobloom;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForRascal;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForRascal;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForRascal;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForRascal;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForTuffGolem;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForTuffGolem;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForTuffGolem;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForTuffGolem;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForWildfire;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForWildfire;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForWildfire;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForWildfire;

        FriendsAndFoes(ForgeConfigSpec.Builder builder) {

            builder.push("Friends & Foes");

            builder.push("Copper Golem");
            healthMultiplierForCopperGolem = builder.defineInRange("healthMultiplierForCopperGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCopperGolem = builder.defineInRange("damageMultiplierForCopperGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCopperGolem = builder.defineInRange("speedMultiplierForCopperGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCopperGolem = builder.defineInRange("scaleMultiplierForCopperGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Crab");
            healthMultiplierForCrab = builder.defineInRange("healthMultiplierForCrab", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCrab = builder.defineInRange("damageMultiplierForCrab", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCrab = builder.defineInRange("speedMultiplierForCrab", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCrab = builder.defineInRange("scaleMultiplierForCrab", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Glare");
            healthMultiplierForGlare = builder.defineInRange("healthMultiplierForGlare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForGlare = builder.defineInRange("damageMultiplierForGlare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForGlare = builder.defineInRange("speedMultiplierForGlare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForGlare = builder.defineInRange("scaleMultiplierForGlare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Iceologer");
            healthMultiplierForIceologer = builder.defineInRange("healthMultiplierForIceologer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForIceologer = builder.defineInRange("damageMultiplierForIceologer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForIceologer = builder.defineInRange("speedMultiplierForIceologer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForIceologer = builder.defineInRange("scaleMultiplierForIceologer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Mauler");
            healthMultiplierForMauler = builder.defineInRange("healthMultiplierForMauler", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForMauler = builder.defineInRange("damageMultiplierForMauler", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMauler = builder.defineInRange("speedMultiplierForMauler", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMauler = builder.defineInRange("scaleMultiplierForMauler", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Moobloom");
            healthMultiplierForMoobloom = builder.defineInRange("healthMultiplierForMoobloom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForMoobloom = builder.defineInRange("damageMultiplierForMoobloom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMoobloom = builder.defineInRange("speedMultiplierForMoobloom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMoobloom = builder.defineInRange("scaleMultiplierForMoobloom", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Rascal");
            healthMultiplierForRascal = builder.defineInRange("healthMultiplierForRascal", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForRascal = builder.defineInRange("damageMultiplierForRascal", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForRascal = builder.defineInRange("speedMultiplierForRascal", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForRascal = builder.defineInRange("scaleMultiplierForRascal", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Tuff Golem");
            healthMultiplierForTuffGolem = builder.defineInRange("healthMultiplierForTuffGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForTuffGolem = builder.defineInRange("damageMultiplierForTuffGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForTuffGolem = builder.defineInRange("speedMultiplierForTuffGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForTuffGolem = builder.defineInRange("scaleMultiplierForTuffGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Wildfire");
            healthMultiplierForWildfire = builder.defineInRange("healthMultiplierForWildfire", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForWildfire = builder.defineInRange("damageMultiplierForWildfire", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForWildfire = builder.defineInRange("speedMultiplierForWildfire", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForWildfire = builder.defineInRange("scaleMultiplierForWildfire", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class IllagerInvasion {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForAlchemist;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForAlchemist;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForAlchemist;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForAlchemist;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForArchivist;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForArchivist;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForArchivist;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForArchivist;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBasher;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBasher;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBasher;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBasher;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForFirecaller;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForFirecaller;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForFirecaller;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForFirecaller;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForInquisitor;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForInquisitor;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForInquisitor;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForInquisitor;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForInvoker;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForInvoker;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForInvoker;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForInvoker;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMarauder;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForMarauder;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMarauder;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMarauder;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForNecromancer;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForNecromancer;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForNecromancer;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForNecromancer;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForProvoker;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForProvoker;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForProvoker;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForProvoker;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSorcerer;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSorcerer;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSorcerer;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSorcerer;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSurrendered;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSurrendered;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSurrendered;

        IllagerInvasion(ForgeConfigSpec.Builder builder) {

            builder.push("Illager Invasion");

            builder.push("Alchemist");
            healthMultiplierForAlchemist = builder.defineInRange("healthMultiplierForAlchemist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForAlchemist = builder.defineInRange("damageMultiplierForAlchemist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForAlchemist = builder.defineInRange("speedMultiplierForAlchemist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForAlchemist = builder.defineInRange("scaleMultiplierForAlchemist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Archivist");
            healthMultiplierForArchivist = builder.defineInRange("healthMultiplierForArchivist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForArchivist = builder.defineInRange("damageMultiplierForArchivist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForArchivist = builder.defineInRange("speedMultiplierForArchivist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForArchivist = builder.defineInRange("scaleMultiplierForArchivist", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Basher");
            healthMultiplierForBasher = builder.defineInRange("healthMultiplierForBasher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBasher = builder.defineInRange("damageMultiplierForBasher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBasher = builder.defineInRange("speedMultiplierForBasher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBasher = builder.defineInRange("scaleMultiplierForBasher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Firecaller");
            healthMultiplierForFirecaller = builder.defineInRange("healthMultiplierForFirecaller", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForFirecaller = builder.defineInRange("damageMultiplierForFirecaller", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForFirecaller = builder.defineInRange("speedMultiplierForFirecaller", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForFirecaller = builder.defineInRange("scaleMultiplierForFirecaller", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Inquisitor");
            healthMultiplierForInquisitor = builder.defineInRange("healthMultiplierForInquisitor", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForInquisitor = builder.defineInRange("damageMultiplierForInquisitor", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForInquisitor = builder.defineInRange("speedMultiplierForInquisitor", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForInquisitor = builder.defineInRange("scaleMultiplierForInquisitor", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Invoker");
            healthMultiplierForInvoker = builder.defineInRange("healthMultiplierForInvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForInvoker = builder.defineInRange("damageMultiplierForInvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForInvoker = builder.defineInRange("speedMultiplierForInvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForInvoker = builder.defineInRange("scaleMultiplierForInvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Marauder");
            healthMultiplierForMarauder = builder.defineInRange("healthMultiplierForMarauder", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForMarauder = builder.defineInRange("damageMultiplierForMarauder", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMarauder = builder.defineInRange("speedMultiplierForMarauder", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMarauder = builder.defineInRange("scaleMultiplierForMarauder", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Necromancer");
            healthMultiplierForNecromancer = builder.defineInRange("healthMultiplierForNecromancer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForNecromancer = builder.defineInRange("damageMultiplierForNecromancer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForNecromancer = builder.defineInRange("speedMultiplierForNecromancer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForNecromancer = builder.defineInRange("scaleMultiplierForNecromancer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Provoker");
            healthMultiplierForProvoker = builder.defineInRange("healthMultiplierForProvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForProvoker = builder.defineInRange("damageMultiplierForProvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForProvoker = builder.defineInRange("speedMultiplierForProvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForProvoker = builder.defineInRange("scaleMultiplierForProvoker", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Sorcerer");
            healthMultiplierForSorcerer = builder.defineInRange("healthMultiplierForSorcerer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSorcerer = builder.defineInRange("damageMultiplierForSorcerer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSorcerer = builder.defineInRange("speedMultiplierForSorcerer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSorcerer = builder.defineInRange("scaleMultiplierForSorcerer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Surrendered");
            healthMultiplierForSurrendered = builder.defineInRange("healthMultiplierForSurrendered", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSurrendered = builder.defineInRange("damageMultiplierForSurrendered", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSurrendered = builder.defineInRange("scaleMultiplierForSurrendered", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class ItTakesAPillageContinuation {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForArcher;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForArcher;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForArcher;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForArcher;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForClayGolem;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForClayGolem;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForClayGolem;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForClayGolem;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForLegioner;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForLegioner;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForLegioner;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForLegioner;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSkirmisher;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSkirmisher;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSkirmisher;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSkirmisher;

        ItTakesAPillageContinuation(ForgeConfigSpec.Builder builder) {

            builder.push("It Takes a Pillage Continuation");

            builder.push("Archer");
            healthMultiplierForArcher = builder.defineInRange("healthMultiplierForArcher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForArcher = builder.defineInRange("damageMultiplierForArcher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForArcher = builder.defineInRange("speedMultiplierForArcher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForArcher = builder.defineInRange("scaleMultiplierForArcher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Clay Golem");
            healthMultiplierForClayGolem = builder.defineInRange("healthMultiplierForClayGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForClayGolem = builder.defineInRange("damageMultiplierForClayGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForClayGolem = builder.defineInRange("speedMultiplierForClayGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForClayGolem = builder.defineInRange("scaleMultiplierForClayGolem", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Legioner");
            healthMultiplierForLegioner = builder.defineInRange("healthMultiplierForLegioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForLegioner = builder.defineInRange("damageMultiplierForLegioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForLegioner = builder.defineInRange("speedMultiplierForLegioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForLegioner = builder.defineInRange("scaleMultiplierForLegioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Skirmisher");
            healthMultiplierForSkirmisher = builder.defineInRange("healthMultiplierForSkirmisher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSkirmisher = builder.defineInRange("damageMultiplierForSkirmisher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSkirmisher = builder.defineInRange("speedMultiplierForSkirmisher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSkirmisher = builder.defineInRange("scaleMultiplierForSkirmisher", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class MobVariants {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForArmoredSpider;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForArmoredSpider;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForArmoredSpider;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForArmoredSpider;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBloatedCorpse;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBloatedCorpse;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBloatedCorpse;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBloatedCorpse;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCaveCreeper;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCaveCreeper;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCaveCreeper;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCaveCreeper;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCorsair;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCorsair;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCorsair;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCorsair;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForExecutioner;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForExecutioner;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForExecutioner;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForExecutioner;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForExplorer;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForExplorer;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForExplorer;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForExplorer;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForForgotten;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForForgotten;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForForgotten;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForForgotten;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForFrozenZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForFrozenZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForFrozenZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForFrozenZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForInfectedPiglin;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForInfectedPiglin;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForInfectedPiglin;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForInfectedPiglin;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForInfectedPiglinBrute;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForInfectedPiglinBrute;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForInfectedPiglinBrute;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForInfectedPiglinBrute;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForLavaSlime;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForLavaSlime;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForLavaSlime;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForLavaSlime;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForNightmare;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForNightmare;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForNightmare;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForNightmare;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSoulStealer;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSoulStealer;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSoulStealer;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSoulStealer;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForToxicSlime;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForToxicSlime;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForToxicSlime;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForToxicSlime;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForTropicalSpider;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForTropicalSpider;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForTropicalSpider;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForTropicalSpider;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForUndeadWarrior;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForUndeadWarrior;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForUndeadWarrior;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForUndeadWarrior;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForZombifiedPiglinBrute;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForZombifiedPiglinBrute;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForZombifiedPiglinBrute;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForZombifiedPiglinBrute;

        MobVariants(ForgeConfigSpec.Builder builder) {

            builder.push("Mob Variants");

            builder.push("Armored Spider");
            healthMultiplierForArmoredSpider = builder.defineInRange("healthMultiplierForArmoredSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForArmoredSpider = builder.defineInRange("damageMultiplierForArmoredSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForArmoredSpider = builder.defineInRange("speedMultiplierForArmoredSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForArmoredSpider = builder.defineInRange("scaleMultiplierForArmoredSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Bloated Corpse");
            healthMultiplierForBloatedCorpse = builder.defineInRange("healthMultiplierForBloatedCorpse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBloatedCorpse = builder.defineInRange("damageMultiplierForBloatedCorpse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBloatedCorpse = builder.defineInRange("speedMultiplierForBloatedCorpse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBloatedCorpse = builder.defineInRange("scaleMultiplierForBloatedCorpse", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Cave Creeper");
            healthMultiplierForCaveCreeper = builder.defineInRange("healthMultiplierForCaveCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCaveCreeper = builder.defineInRange("damageMultiplierForCaveCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCaveCreeper = builder.defineInRange("speedMultiplierForCaveCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCaveCreeper = builder.defineInRange("scaleMultiplierForCaveCreeper", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Corsair");
            healthMultiplierForCorsair = builder.defineInRange("healthMultiplierForCorsair", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCorsair = builder.defineInRange("damageMultiplierForCorsair", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCorsair = builder.defineInRange("speedMultiplierForCorsair", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCorsair = builder.defineInRange("scaleMultiplierForCorsair", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Executioner");
            healthMultiplierForExecutioner = builder.defineInRange("healthMultiplierForExecutioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForExecutioner = builder.defineInRange("damageMultiplierForExecutioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForExecutioner = builder.defineInRange("speedMultiplierForExecutioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForExecutioner = builder.defineInRange("scaleMultiplierForExecutioner", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Explorer");
            healthMultiplierForExplorer = builder.defineInRange("healthMultiplierForExplorer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForExplorer = builder.defineInRange("damageMultiplierForExplorer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForExplorer = builder.defineInRange("speedMultiplierForExplorer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForExplorer = builder.defineInRange("scaleMultiplierForExplorer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Forgotten");
            healthMultiplierForForgotten = builder.defineInRange("healthMultiplierForForgotten", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForForgotten = builder.defineInRange("damageMultiplierForForgotten", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForForgotten = builder.defineInRange("speedMultiplierForForgotten", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForForgotten = builder.defineInRange("scaleMultiplierForForgotten", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Frozen Zombie");
            healthMultiplierForFrozenZombie = builder.defineInRange("healthMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForFrozenZombie = builder.defineInRange("damageMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForFrozenZombie = builder.defineInRange("speedMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForFrozenZombie = builder.defineInRange("scaleMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Infected Piglin");
            healthMultiplierForInfectedPiglin = builder.defineInRange("healthMultiplierForInfectedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForInfectedPiglin = builder.defineInRange("damageMultiplierForInfectedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForInfectedPiglin = builder.defineInRange("speedMultiplierForInfectedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForInfectedPiglin = builder.defineInRange("scaleMultiplierForInfectedPiglin", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Infected Piglin Brute");
            healthMultiplierForInfectedPiglinBrute = builder.defineInRange("healthMultiplierForInfectedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForInfectedPiglinBrute = builder.defineInRange("damageMultiplierForInfectedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForInfectedPiglinBrute = builder.defineInRange("speedMultiplierForInfectedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForInfectedPiglinBrute = builder.defineInRange("scaleMultiplierForInfectedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Lava Slime");
            healthMultiplierForLavaSlime = builder.defineInRange("healthMultiplierForLavaSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForLavaSlime = builder.defineInRange("damageMultiplierForLavaSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForLavaSlime = builder.defineInRange("speedMultiplierForLavaSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForLavaSlime = builder.defineInRange("scaleMultiplierForLavaSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Nightmare");
            healthMultiplierForNightmare = builder.defineInRange("healthMultiplierForNightmare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForNightmare = builder.defineInRange("damageMultiplierForNightmare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForNightmare = builder.defineInRange("speedMultiplierForNightmare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForNightmare = builder.defineInRange("scaleMultiplierForNightmare", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Soul Stealer");
            healthMultiplierForSoulStealer = builder.defineInRange("healthMultiplierForSoulStealer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSoulStealer = builder.defineInRange("damageMultiplierForSoulStealer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSoulStealer = builder.defineInRange("speedMultiplierForSoulStealer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSoulStealer = builder.defineInRange("scaleMultiplierForSoulStealer", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Toxic Slime");
            healthMultiplierForToxicSlime = builder.defineInRange("healthMultiplierForToxicSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForToxicSlime = builder.defineInRange("damageMultiplierForToxicSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForToxicSlime = builder.defineInRange("speedMultiplierForToxicSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForToxicSlime = builder.defineInRange("scaleMultiplierForToxicSlime", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Tropical Spider");
            healthMultiplierForTropicalSpider = builder.defineInRange("healthMultiplierForTropicalSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForTropicalSpider = builder.defineInRange("damageMultiplierForTropicalSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForTropicalSpider = builder.defineInRange("speedMultiplierForTropicalSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForTropicalSpider = builder.defineInRange("scaleMultiplierForTropicalSpider", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Undead Warrior");
            healthMultiplierForUndeadWarrior = builder.defineInRange("healthMultiplierForUndeadWarrior", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForUndeadWarrior = builder.defineInRange("damageMultiplierForUndeadWarrior", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForUndeadWarrior = builder.defineInRange("speedMultiplierForUndeadWarrior", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForUndeadWarrior = builder.defineInRange("scaleMultiplierForUndeadWarrior", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Zombified Piglin Brute");
            healthMultiplierForZombifiedPiglinBrute = builder.defineInRange("healthMultiplierForZombifiedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForZombifiedPiglinBrute = builder.defineInRange("damageMultiplierForZombifiedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForZombifiedPiglinBrute = builder.defineInRange("speedMultiplierForZombifiedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForZombifiedPiglinBrute = builder.defineInRange("scaleMultiplierForZombifiedPiglinBrute", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class Ribbits {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForRibbit;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForRibbit;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForRibbit;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForRibbit;

        Ribbits(ForgeConfigSpec.Builder builder) {

            builder.push("Ribbits");

            builder.push("Ribbit");
            healthMultiplierForRibbit = builder.defineInRange("healthMultiplierForRibbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForRibbit = builder.defineInRange("damageMultiplierForRibbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForRibbit = builder.defineInRange("speedMultiplierForRibbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForRibbit = builder.defineInRange("scaleMultiplierForRibbit", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class VanillaBackport {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCreaking;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCreaking;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCreaking;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCreaking;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForHappyGhast;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForHappyGhast;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForHappyGhast;

        VanillaBackport(ForgeConfigSpec.Builder builder) {

            builder.push("Vanilla Backport");

            builder.push("Creaking");
            healthMultiplierForCreaking = builder.defineInRange("healthMultiplierForCreaking", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCreaking = builder.defineInRange("damageMultiplierForCreaking", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCreaking = builder.defineInRange("speedMultiplierForCreaking", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCreaking = builder.defineInRange("scaleMultiplierForCreaking", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Happy Ghast");
            healthMultiplierForHappyGhast = builder.defineInRange("healthMultiplierForHappyGhast", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForHappyGhast = builder.defineInRange("damageMultiplierForHappyGhast", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForHappyGhast = builder.defineInRange("speedMultiplierForHappyGhast", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class VariantsAndVentures {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForGelid;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForGelid;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForGelid;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForGelid;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMurk;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForMurk;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMurk;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMurk;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForThicket;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForThicket;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForThicket;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForThicket;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForVerdant;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForVerdant;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForVerdant;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForVerdant;

        VariantsAndVentures(ForgeConfigSpec.Builder builder) {

            builder.push("Variants and Ventures");

            builder.push("Gelid");
            healthMultiplierForGelid = builder.defineInRange("healthMultiplierForGelid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForGelid = builder.defineInRange("damageMultiplierForGelid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForGelid = builder.defineInRange("speedMultiplierForGelid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForGelid = builder.defineInRange("scaleMultiplierForGelid", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Murk");
            healthMultiplierForMurk = builder.defineInRange("healthMultiplierForMurk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForMurk = builder.defineInRange("damageMultiplierForMurk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMurk = builder.defineInRange("speedMultiplierForMurk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMurk = builder.defineInRange("scaleMultiplierForMurk", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Thicket");
            healthMultiplierForThicket = builder.defineInRange("healthMultiplierForThicket", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForThicket = builder.defineInRange("damageMultiplierForThicket", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForThicket = builder.defineInRange("speedMultiplierForThicket", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForThicket = builder.defineInRange("scaleMultiplierForThicket", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Verdant");
            healthMultiplierForVerdant = builder.defineInRange("healthMultiplierForVerdant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForVerdant = builder.defineInRange("damageMultiplierForVerdant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForVerdant = builder.defineInRange("speedMultiplierForVerdant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForVerdant = builder.defineInRange("scaleMultiplierForVerdant", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    public static class ZombieVariants {

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBadlandsZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBadlandsZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBadlandsZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBadlandsZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForBambooZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForBambooZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForBambooZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForBambooZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCaveZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCaveZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCaveZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCaveZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForCherryZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForCherryZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForCherryZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForCherryZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForDeepDarkZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForDeepDarkZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForDeepDarkZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForDeepDarkZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForDesertZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForDesertZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForDesertZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForDesertZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForDripstoneZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForDripstoneZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForDripstoneZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForDripstoneZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForFrozenZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForFrozenZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForFrozenZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForFrozenZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForJungleZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForJungleZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForJungleZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForJungleZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForLushZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForLushZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForLushZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForLushZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMangroveZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForMangroveZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMangroveZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMangroveZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForMushroomZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForMushroomZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForMushroomZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForMushroomZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForPaleGardenZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForPaleGardenZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForPaleGardenZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForPaleGardenZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSavannaZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSavannaZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSavannaZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSavannaZombie;

        public final ForgeConfigSpec.DoubleValue healthMultiplierForSwampZombie;
        public final ForgeConfigSpec.DoubleValue damageMultiplierForSwampZombie;
        public final ForgeConfigSpec.DoubleValue speedMultiplierForSwampZombie;
        public final ForgeConfigSpec.DoubleValue scaleMultiplierForSwampZombie;

        ZombieVariants(ForgeConfigSpec.Builder builder) {

            builder.push("Zombie Variants");

            builder.push("Badlands Zombie");
            healthMultiplierForBadlandsZombie = builder.defineInRange("healthMultiplierForBadlandsZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBadlandsZombie = builder.defineInRange("damageMultiplierForBadlandsZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBadlandsZombie = builder.defineInRange("speedMultiplierForBadlandsZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBadlandsZombie = builder.defineInRange("scaleMultiplierForBadlandsZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Bamboo Zombie");
            healthMultiplierForBambooZombie = builder.defineInRange("healthMultiplierForBambooZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForBambooZombie = builder.defineInRange("damageMultiplierForBambooZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForBambooZombie = builder.defineInRange("speedMultiplierForBambooZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForBambooZombie = builder.defineInRange("scaleMultiplierForBambooZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Cave Zombie");
            healthMultiplierForCaveZombie = builder.defineInRange("healthMultiplierForCaveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCaveZombie = builder.defineInRange("damageMultiplierForCaveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCaveZombie = builder.defineInRange("speedMultiplierForCaveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCaveZombie = builder.defineInRange("scaleMultiplierForCaveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Cherry Zombie");
            healthMultiplierForCherryZombie = builder.defineInRange("healthMultiplierForCherryZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForCherryZombie = builder.defineInRange("damageMultiplierForCherryZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForCherryZombie = builder.defineInRange("speedMultiplierForCherryZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForCherryZombie = builder.defineInRange("scaleMultiplierForCherryZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Deep Dark Zombie");
            healthMultiplierForDeepDarkZombie = builder.defineInRange("healthMultiplierForDeepDarkZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForDeepDarkZombie = builder.defineInRange("damageMultiplierForDeepDarkZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForDeepDarkZombie = builder.defineInRange("speedMultiplierForDeepDarkZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForDeepDarkZombie = builder.defineInRange("scaleMultiplierForDeepDarkZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Desert Zombie");
            healthMultiplierForDesertZombie = builder.defineInRange("healthMultiplierForDesertZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForDesertZombie = builder.defineInRange("damageMultiplierForDesertZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForDesertZombie = builder.defineInRange("speedMultiplierForDesertZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForDesertZombie = builder.defineInRange("scaleMultiplierForDesertZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Dripstone Zombie");
            healthMultiplierForDripstoneZombie = builder.defineInRange("healthMultiplierForDripstoneZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForDripstoneZombie = builder.defineInRange("damageMultiplierForDripstoneZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForDripstoneZombie = builder.defineInRange("speedMultiplierForDripstoneZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForDripstoneZombie = builder.defineInRange("scaleMultiplierForDripstoneZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Frozen Zombie");
            healthMultiplierForFrozenZombie = builder.defineInRange("healthMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForFrozenZombie = builder.defineInRange("damageMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForFrozenZombie = builder.defineInRange("speedMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForFrozenZombie = builder.defineInRange("scaleMultiplierForFrozenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Jungle Zombie");
            healthMultiplierForJungleZombie = builder.defineInRange("healthMultiplierForJungleZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForJungleZombie = builder.defineInRange("damageMultiplierForJungleZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForJungleZombie = builder.defineInRange("speedMultiplierForJungleZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForJungleZombie = builder.defineInRange("scaleMultiplierForJungleZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Lush Zombie");
            healthMultiplierForLushZombie = builder.defineInRange("healthMultiplierForLushZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForLushZombie = builder.defineInRange("damageMultiplierForLushZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForLushZombie = builder.defineInRange("speedMultiplierForLushZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForLushZombie = builder.defineInRange("scaleMultiplierForLushZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Mangrove Zombie");
            healthMultiplierForMangroveZombie = builder.defineInRange("healthMultiplierForMangroveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForMangroveZombie = builder.defineInRange("damageMultiplierForMangroveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMangroveZombie = builder.defineInRange("speedMultiplierForMangroveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMangroveZombie = builder.defineInRange("scaleMultiplierForMangroveZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Mushroom Zombie");
            healthMultiplierForMushroomZombie = builder.defineInRange("healthMultiplierForMushroomZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForMushroomZombie = builder.defineInRange("damageMultiplierForMushroomZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForMushroomZombie = builder.defineInRange("speedMultiplierForMushroomZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForMushroomZombie = builder.defineInRange("scaleMultiplierForMushroomZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Pale Garden Zombie");
            healthMultiplierForPaleGardenZombie = builder.defineInRange("healthMultiplierForPaleGardenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForPaleGardenZombie = builder.defineInRange("damageMultiplierForPaleGardenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForPaleGardenZombie = builder.defineInRange("speedMultiplierForPaleGardenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForPaleGardenZombie = builder.defineInRange("scaleMultiplierForPaleGardenZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Savanna Zombie");
            healthMultiplierForSavannaZombie = builder.defineInRange("healthMultiplierForSavannaZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSavannaZombie = builder.defineInRange("damageMultiplierForSavannaZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSavannaZombie = builder.defineInRange("speedMultiplierForSavannaZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSavannaZombie = builder.defineInRange("scaleMultiplierForSavannaZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.push("Swamp Zombie");
            healthMultiplierForSwampZombie = builder.defineInRange("healthMultiplierForSwampZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            damageMultiplierForSwampZombie = builder.defineInRange("damageMultiplierForSwampZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            speedMultiplierForSwampZombie = builder.defineInRange("speedMultiplierForSwampZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            scaleMultiplierForSwampZombie = builder.defineInRange("scaleMultiplierForSwampZombie", 1.0, Double.MIN_VALUE, Double.MAX_VALUE);
            builder.pop();

            builder.pop();
        }
    }

    @Mod.EventBusSubscriber(modid = CustomMobAttributes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    private static class EventHandler {

        private static MinecraftServer server;
        private static final java.util.Map<String, Object> oldValues = new java.util.HashMap<>();

        private static int ticks = 0;

        private static final List<Object> CONFIGS = List.of(
                Config.VANILLA,
                Config.BETTER_END,
                Config.BETTER_NETHER,
                Config.DEEPER_AND_DARKER,
                Config.FRIENDS_AND_FOES,
                Config.ILLAGER_INVASION,
                Config.IT_TAKES_A_PILLAGE_CONTINUATION,
                Config.MOB_VARIANTS,
                Config.RIBBITS,
                Config.VANILLA_BACKPORT,
                Config.VARIANTS_AND_VENTURES,
                Config.ZOMBIE_VARIANTS);

        @SubscribeEvent
        public static void onServerStart(net.minecraftforge.event.server.ServerStartingEvent event) {
            server = event.getServer();
            rememberCurrentValues();
        }

        @SubscribeEvent
        public static void onServerTick(TickEvent.ServerTickEvent event) {
            if (event.phase != TickEvent.Phase.END) return;
            if (server == null) return;

            if (++ticks < 20) return;
            ticks = 0;

            boolean changed = false;

            for (Object configs : CONFIGS) {

                String cfgName = configs.getClass().getSimpleName();

                for (Field field : configs.getClass().getDeclaredFields()) {
                    field.setAccessible(true);

                    try {
                        Object fieldObj = field.get(configs);
                        Object current = unwrapConfigValue(fieldObj);

                        String key = cfgName + "." + field.getName();

                        Object old = oldValues.get(key);
                        if (!Objects.equals(old, current)) {
                            changed = true;
                            oldValues.put(key, current);
                        }

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (changed) {
                AABB worldBox = new AABB(-1_000_000, -1_000_000, -1_000_000, 1_000_000, 1_000_000, 1_000_000);
                for (ServerLevel world : server.getAllLevels()) {
                    world.getEntitiesOfClass(LivingEntity.class, worldBox).forEach(entity -> {
                        Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(entity.getType());
                        if (handler != null) handler.accept(entity);
                    });
                }
            }
        }

        private static void rememberCurrentValues() {
            for (Object cfg : CONFIGS) {

                String cfgName = cfg.getClass().getSimpleName();

                for (Field field : cfg.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    try {
                        Object fieldObj = field.get(cfg);
                        Object val = unwrapConfigValue(fieldObj);

                        oldValues.put(cfgName + "." + field.getName(), val);

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        private static Object unwrapConfigValue(Object maybeValue) {
            if (maybeValue == null) return null;

            if (maybeValue instanceof ForgeConfigSpec.ConfigValue) {
                return ((ForgeConfigSpec.ConfigValue<?>) maybeValue).get();
            }

            try {
                Method get = maybeValue.getClass().getMethod("get");
                if (get != null) {
                    return get.invoke(maybeValue);
                }
            } catch (NoSuchMethodException ignored) {

            } catch (Exception e) {
                e.printStackTrace();
            }

            return maybeValue;
        }
    }
}
