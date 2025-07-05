package net.fneifnox.custommobattributes;

import io.wispforest.owo.config.Option;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class AttributeUpdater {

    private static final Identifier HEALTH_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "health_modifier");
    private static final Identifier DAMAGE_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "damage_modifier");
    private static final Identifier SPEED_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "speed_modifier");
    private static final Identifier SCALE_MODIFIER_UUID = Identifier.of("custom_mob_attributes", "scale_modifier");

    private static final Map<EntityType<?>, Consumer<LivingEntity>> ATTRIBUTE_HANDLERS = new HashMap<>();

    public static void initAttributeHandlers() {
        ATTRIBUTE_HANDLERS.put(EntityType.ALLAY, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ALLAY, CONFIG::healthMultiplierForAllay, CONFIG::damageMultiplierForAllay, CONFIG::speedMultiplierForAllay, CONFIG::scaleMultiplierForAllay
            );
            setHealthMultiplier(world, EntityType.ALLAY, CONFIG::healthMultiplierForAllay);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ARMADILLO, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ARMADILLO, CONFIG::healthMultiplierForArmadillo, null, CONFIG::speedMultiplierForArmadillo, CONFIG::scaleMultiplierForArmadillo
            );
            setHealthMultiplier(world, EntityType.ARMADILLO, CONFIG::healthMultiplierForArmadillo);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.AXOLOTL, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.AXOLOTL, CONFIG::healthMultiplierForAxolotl, CONFIG::damageMultiplierForAxolotl, CONFIG::speedMultiplierForAxolotl, CONFIG::scaleMultiplierForAxolotl
            );
            setHealthMultiplier(world, EntityType.AXOLOTL, CONFIG::healthMultiplierForAxolotl);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BAT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BAT, CONFIG::healthMultiplierForBat, null, null, CONFIG::scaleMultiplierForBat
            );
            setHealthMultiplier(world, EntityType.BAT, CONFIG::healthMultiplierForBat);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BEE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BEE, CONFIG::healthMultiplierForBee, CONFIG::damageMultiplierForBee, null, CONFIG::scaleMultiplierForBee
            );
            setHealthMultiplier(world, EntityType.BEE, CONFIG::healthMultiplierForBee);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BLAZE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BLAZE, CONFIG::healthMultiplierForBlaze, CONFIG::damageMultiplierForBlaze, CONFIG::speedMultiplierForBlaze, CONFIG::scaleMultiplierForBlaze
            );
            setHealthMultiplier(world, EntityType.BLAZE, CONFIG::healthMultiplierForBlaze);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BOGGED, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BOGGED, CONFIG::healthMultiplierForBogged, CONFIG::damageMultiplierForBogged, CONFIG::speedMultiplierForBogged, CONFIG::scaleMultiplierForBogged
            );
            setHealthMultiplier(world, EntityType.BOGGED, CONFIG::healthMultiplierForBogged);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.BREEZE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.BREEZE, CONFIG::healthMultiplierForBreeze, CONFIG::damageMultiplierForBreeze, CONFIG::speedMultiplierForBreeze, CONFIG::scaleMultiplierForBreeze
            );
            setHealthMultiplier(world, EntityType.BREEZE, CONFIG::healthMultiplierForBreeze);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAVE_SPIDER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CAVE_SPIDER, CONFIG::healthMultiplierForCaveSpider, CONFIG::damageMultiplierForCaveSpider, CONFIG::speedMultiplierForCaveSpider, CONFIG::scaleMultiplierForCaveSpider
            );
            setHealthMultiplier(world, EntityType.CAVE_SPIDER, CONFIG::healthMultiplierForCaveSpider);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CAT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CAT, CONFIG::healthMultiplierForCat, CONFIG::damageMultiplierForCat, CONFIG::speedMultiplierForCat, CONFIG::scaleMultiplierForCat
            );
            setHealthMultiplier(world, EntityType.CAT, CONFIG::healthMultiplierForCat);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.CHICKEN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.CHICKEN, CONFIG::healthMultiplierForChicken, null, CONFIG::speedMultiplierForChicken, CONFIG::scaleMultiplierForChicken
            );
            setHealthMultiplier(world, EntityType.CHICKEN, CONFIG::healthMultiplierForChicken);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COD, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.COD, CONFIG::healthMultiplierForCod, null, CONFIG::speedMultiplierForCod, CONFIG::scaleMultiplierForCod
            );
            setHealthMultiplier(world, EntityType.COD, CONFIG::healthMultiplierForCod);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.COW, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.COW, CONFIG::healthMultiplierForCow, null, CONFIG::speedMultiplierForCow, CONFIG::scaleMultiplierForCow
            );
            setHealthMultiplier(world, EntityType.COW, CONFIG::healthMultiplierForCow);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DONKEY, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.DONKEY, CONFIG::healthMultiplierForDonkey, null, CONFIG::speedMultiplierForDonkey, CONFIG::scaleMultiplierForDonkey
            );
            setHealthMultiplier(world, EntityType.DONKEY, CONFIG::healthMultiplierForDonkey);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DOLPHIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.DOLPHIN, CONFIG::healthMultiplierForDolphin, CONFIG::damageMultiplierForDolphin, CONFIG::speedMultiplierForDolphin, CONFIG::scaleMultiplierForDolphin
            );
            setHealthMultiplier(world, EntityType.DOLPHIN, CONFIG::healthMultiplierForDolphin);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.DROWNED, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.DROWNED, CONFIG::healthMultiplierForDrowned, CONFIG::damageMultiplierForDrowned, CONFIG::speedMultiplierForDrowned, CONFIG::scaleMultiplierForDrowned
            );
            setHealthMultiplier(world, EntityType.DROWNED, CONFIG::healthMultiplierForDrowned);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ELDER_GUARDIAN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ELDER_GUARDIAN, CONFIG::healthMultiplierForElderGuardian, CONFIG::damageMultiplierForElderGuardian, CONFIG::speedMultiplierForElderGuardian, CONFIG::scaleMultiplierForElderGuardian
            );
            setHealthMultiplier(world, EntityType.ELDER_GUARDIAN, CONFIG::healthMultiplierForElderGuardian);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMAN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ENDERMAN, CONFIG::healthMultiplierForEnderman, CONFIG::damageMultiplierForEnderman, CONFIG::speedMultiplierForEnderman, CONFIG::scaleMultiplierForEnderman
            );
            setHealthMultiplier(world, EntityType.ENDERMAN, CONFIG::healthMultiplierForEnderman);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDERMITE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ENDERMITE, CONFIG::healthMultiplierForEndermite, CONFIG::damageMultiplierForEndermite, CONFIG::speedMultiplierForEndermite, CONFIG::scaleMultiplierForEndermite
            );
            setHealthMultiplier(world, EntityType.ENDERMITE, CONFIG::healthMultiplierForEndermite);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ENDER_DRAGON, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ENDER_DRAGON, CONFIG::healthMultiplierForEnderDragon, null, CONFIG::speedMultiplierForEnderDragon, CONFIG::scaleMultiplierForEnderDragon
            );
            setHealthMultiplier(world, EntityType.ENDER_DRAGON, CONFIG::healthMultiplierForEnderDragon);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.EVOKER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.EVOKER, CONFIG::healthMultiplierForEvoker, CONFIG::damageMultiplierForEvoker, CONFIG::speedMultiplierForEvoker, CONFIG::scaleMultiplierForEvoker
            );
            setHealthMultiplier(world, EntityType.EVOKER, CONFIG::healthMultiplierForEvoker);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.FOX, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.FOX, CONFIG::healthMultiplierForFox, CONFIG::damageMultiplierForFox, CONFIG::speedMultiplierForFox, CONFIG::scaleMultiplierForFox
            );
            setHealthMultiplier(world, EntityType.FOX, CONFIG::healthMultiplierForFox);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GHAST, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GHAST, CONFIG::healthMultiplierForGhast, null, CONFIG::speedMultiplierForGhast, CONFIG::scaleMultiplierForGhast
            );
            setHealthMultiplier(world, EntityType.GHAST, CONFIG::healthMultiplierForGhast);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GLOW_SQUID, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GLOW_SQUID, CONFIG::healthMultiplierForGlowSquid, null, CONFIG::speedMultiplierForGlowSquid, CONFIG::scaleMultiplierForGlowSquid
            );
            setHealthMultiplier(world, EntityType.GLOW_SQUID, CONFIG::healthMultiplierForGlowSquid);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GOAT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GOAT, CONFIG::healthMultiplierForGoat, CONFIG::damageMultiplierForGoat, CONFIG::speedMultiplierForGoat, CONFIG::scaleMultiplierForGoat
            );
            setHealthMultiplier(world, EntityType.GOAT, CONFIG::healthMultiplierForGoat);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.GUARDIAN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.GUARDIAN, CONFIG::healthMultiplierForGuardian, CONFIG::damageMultiplierForGuardian, CONFIG::speedMultiplierForGuardian, CONFIG::scaleMultiplierForGuardian
            );
            setHealthMultiplier(world, EntityType.GUARDIAN, CONFIG::healthMultiplierForGuardian);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HOGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.HOGLIN, CONFIG::healthMultiplierForHoglin, CONFIG::damageMultiplierForHoglin, CONFIG::speedMultiplierForHoglin, CONFIG::scaleMultiplierForHoglin
            );
            setHealthMultiplier(world, EntityType.HOGLIN, CONFIG::healthMultiplierForHoglin);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HORSE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.HORSE, CONFIG::healthMultiplierForHorse, null, CONFIG::speedMultiplierForHorse, CONFIG::scaleMultiplierForHorse
            );
            setHealthMultiplier(world, EntityType.HORSE, CONFIG::healthMultiplierForHorse);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.HUSK, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.HUSK, CONFIG::healthMultiplierForHusk, CONFIG::damageMultiplierForHusk, CONFIG::speedMultiplierForHusk, CONFIG::scaleMultiplierForHusk
            );
            setHealthMultiplier(world, EntityType.HUSK, CONFIG::healthMultiplierForHusk);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.IRON_GOLEM, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.IRON_GOLEM, CONFIG::healthMultiplierForIronGolem, CONFIG::damageMultiplierForIronGolem, CONFIG::speedMultiplierForIronGolem, CONFIG::scaleMultiplierForIronGolem
            );
            setHealthMultiplier(world, EntityType.IRON_GOLEM, CONFIG::healthMultiplierForIronGolem);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MAGMA_CUBE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.MAGMA_CUBE, null, null, null, CONFIG::scaleMultiplierForMagmaCube
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.MULE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.MULE, CONFIG::healthMultiplierForMule, null, CONFIG::speedMultiplierForMule, CONFIG::scaleMultiplierForMule
            );
            setHealthMultiplier(world, EntityType.MULE, CONFIG::healthMultiplierForMule);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.OCELOT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.OCELOT, CONFIG::healthMultiplierForOcelot, CONFIG::damageMultiplierForOcelot, CONFIG::speedMultiplierForOcelot, CONFIG::scaleMultiplierForOcelot
            );
            setHealthMultiplier(world, EntityType.OCELOT, CONFIG::healthMultiplierForOcelot);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PANDA, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PANDA, CONFIG::healthMultiplierForPanda, CONFIG::damageMultiplierForPanda, CONFIG::speedMultiplierForPanda, CONFIG::scaleMultiplierForPanda
            );
            setHealthMultiplier(world, EntityType.PANDA, CONFIG::healthMultiplierForPanda);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PARROT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PARROT, CONFIG::healthMultiplierForParrot, CONFIG::damageMultiplierForParrot, CONFIG::speedMultiplierForParrot, CONFIG::scaleMultiplierForParrot
            );
            setHealthMultiplier(world, EntityType.PARROT, CONFIG::healthMultiplierForParrot);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PHANTOM, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PHANTOM, CONFIG::healthMultiplierForPhantom, CONFIG::damageMultiplierForPhantom, CONFIG::speedMultiplierForPhantom, CONFIG::scaleMultiplierForPhantom
            );
            setHealthMultiplier(world, EntityType.PHANTOM, CONFIG::healthMultiplierForPhantom);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIG, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PIG, CONFIG::healthMultiplierForPig, null, CONFIG::speedMultiplierForPig, CONFIG::scaleMultiplierForPig
            );
            setHealthMultiplier(world, EntityType.PIG, CONFIG::healthMultiplierForPig);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PIGLIN, CONFIG::healthMultiplierForPiglin, CONFIG::damageMultiplierForPiglin, CONFIG::speedMultiplierForPiglin, CONFIG::scaleMultiplierForPiglin
            );
            setHealthMultiplier(world, EntityType.PIGLIN, CONFIG::healthMultiplierForPiglin);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PIGLIN_BRUTE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PIGLIN_BRUTE, CONFIG::healthMultiplierForPiglinBrute, CONFIG::damageMultiplierForPiglinBrute, CONFIG::speedMultiplierForPiglinBrute, CONFIG::scaleMultiplierForPiglinBrute
            );
            setHealthMultiplier(world, EntityType.PIGLIN_BRUTE, CONFIG::healthMultiplierForPiglinBrute);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PILLAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PILLAGER, CONFIG::healthMultiplierForPillager, CONFIG::damageMultiplierForPillager, CONFIG::speedMultiplierForPillager, CONFIG::scaleMultiplierForPillager
            );
            setHealthMultiplier(world, EntityType.PILLAGER, CONFIG::healthMultiplierForPillager);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.POLAR_BEAR, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.POLAR_BEAR, CONFIG::healthMultiplierForPolarBear, CONFIG::damageMultiplierForPolarBear, CONFIG::speedMultiplierForPolarBear, CONFIG::scaleMultiplierForPolarBear
            );
            setHealthMultiplier(world, EntityType.POLAR_BEAR, CONFIG::healthMultiplierForPolarBear);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.PUFFERFISH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.PUFFERFISH, CONFIG::healthMultiplierForPufferfish, null, CONFIG::speedMultiplierForPufferfish, CONFIG::scaleMultiplierForPufferfish
            );
            setHealthMultiplier(world, EntityType.PUFFERFISH, CONFIG::healthMultiplierForPufferfish);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RABBIT, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.RABBIT, CONFIG::healthMultiplierForRabbit, CONFIG::damageMultiplierForRabbit, CONFIG::speedMultiplierForRabbit, CONFIG::scaleMultiplierForRabbit
            );
            setHealthMultiplier(world, EntityType.RABBIT, CONFIG::healthMultiplierForRabbit);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.RAVAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.RAVAGER, CONFIG::healthMultiplierForRavager, CONFIG::damageMultiplierForRavager, CONFIG::speedMultiplierForRavager, CONFIG::scaleMultiplierForRavager
            );
            setHealthMultiplier(world, EntityType.RAVAGER, CONFIG::healthMultiplierForRavager);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SALMON, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SALMON, CONFIG::healthMultiplierForSalmon, null, CONFIG::speedMultiplierForSalmon, CONFIG::scaleMultiplierForSalmon
            );
            setHealthMultiplier(world, EntityType.SALMON, CONFIG::healthMultiplierForSalmon);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHEEP, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SHEEP, CONFIG::healthMultiplierForSheep, null, CONFIG::speedMultiplierForSheep, CONFIG::scaleMultiplierForSheep
            );
            setHealthMultiplier(world, EntityType.SHEEP, CONFIG::healthMultiplierForSheep);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SHULKER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SHULKER, CONFIG::healthMultiplierForShulker, null, CONFIG::speedMultiplierForShulker, CONFIG::scaleMultiplierForShulker
            );
            setHealthMultiplier(world, EntityType.SHULKER, CONFIG::healthMultiplierForShulker);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SILVERFISH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SILVERFISH, CONFIG::healthMultiplierForSilverfish, CONFIG::damageMultiplierForSilverfish, CONFIG::speedMultiplierForSilverfish, CONFIG::scaleMultiplierForSilverfish
            );
            setHealthMultiplier(world, EntityType.SILVERFISH, CONFIG::healthMultiplierForSilverfish);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SKELETON, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SKELETON, CONFIG::healthMultiplierForSkeleton, CONFIG::damageMultiplierForSkeleton, CONFIG::speedMultiplierForSkeleton, CONFIG::scaleMultiplierForSkeleton
            );
            setHealthMultiplier(world, EntityType.SKELETON, CONFIG::healthMultiplierForSkeleton);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SLIME, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SLIME, null, null, null, CONFIG::scaleMultiplierForSlime
            );
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SNOW_GOLEM, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SNOW_GOLEM, CONFIG::healthMultiplierForSnowGolem, null, CONFIG::speedMultiplierForSnowGolem, CONFIG::scaleMultiplierForSnowGolem
            );
            setHealthMultiplier(world, EntityType.SNOW_GOLEM, CONFIG::healthMultiplierForSnowGolem);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SPIDER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SPIDER, CONFIG::healthMultiplierForSpider, CONFIG::damageMultiplierForSpider, CONFIG::speedMultiplierForSpider, CONFIG::scaleMultiplierForSpider
            );
            setHealthMultiplier(world, EntityType.SPIDER, CONFIG::healthMultiplierForSpider);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.SQUID, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.SQUID, CONFIG::healthMultiplierForSquid, null, CONFIG::speedMultiplierForSquid, CONFIG::scaleMultiplierForSquid
            );
            setHealthMultiplier(world, EntityType.SQUID, CONFIG::healthMultiplierForSquid);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRAY, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.STRAY, CONFIG::healthMultiplierForStray, CONFIG::damageMultiplierForStray, CONFIG::speedMultiplierForStray, CONFIG::scaleMultiplierForStray
            );
            setHealthMultiplier(world, EntityType.STRAY, CONFIG::healthMultiplierForStray);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.STRIDER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.STRIDER, CONFIG::healthMultiplierForStrider, null, CONFIG::speedMultiplierForStrider, CONFIG::scaleMultiplierForStrider
            );
            setHealthMultiplier(world, EntityType.STRIDER, CONFIG::healthMultiplierForStrider);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TADPOLE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.TADPOLE, CONFIG::healthMultiplierForTadpole, null, CONFIG::speedMultiplierForTadpole, CONFIG::scaleMultiplierForTadpole
            );
            setHealthMultiplier(world, EntityType.TADPOLE, CONFIG::healthMultiplierForTadpole);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TROPICAL_FISH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.TROPICAL_FISH, CONFIG::healthMultiplierForTropicalFish, null, CONFIG::speedMultiplierForTropicalFish, CONFIG::scaleMultiplierForTropicalFish
            );
            setHealthMultiplier(world, EntityType.TROPICAL_FISH, CONFIG::healthMultiplierForTropicalFish);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.TURTLE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.TURTLE, CONFIG::healthMultiplierForTurtle, null, CONFIG::speedMultiplierForTurtle, CONFIG::scaleMultiplierForTurtle
            );
            setHealthMultiplier(world, EntityType.TURTLE, CONFIG::healthMultiplierForTurtle);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VEX, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.VEX, CONFIG::healthMultiplierForVex, CONFIG::damageMultiplierForVex, CONFIG::speedMultiplierForVex, CONFIG::scaleMultiplierForVex
            );
            setHealthMultiplier(world, EntityType.VEX, CONFIG::healthMultiplierForVex);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VILLAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.VILLAGER, CONFIG::healthMultiplierForVillager, null, CONFIG::speedMultiplierForVillager, CONFIG::scaleMultiplierForVillager
            );
            setHealthMultiplier(world, EntityType.VILLAGER, CONFIG::healthMultiplierForVillager);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.VINDICATOR, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.VINDICATOR, CONFIG::healthMultiplierForVindicator, CONFIG::damageMultiplierForVindicator, CONFIG::speedMultiplierForVindicator, CONFIG::scaleMultiplierForVindicator
            );
            setHealthMultiplier(world, EntityType.VINDICATOR, CONFIG::healthMultiplierForVindicator);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WARDEN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WARDEN, CONFIG::healthMultiplierForWarden, CONFIG::damageMultiplierForWarden, CONFIG::speedMultiplierForWarden, CONFIG::scaleMultiplierForWarden
            );
            setHealthMultiplier(world, EntityType.WARDEN, CONFIG::healthMultiplierForWarden);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITCH, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WITCH, CONFIG::healthMultiplierForWitch, CONFIG::damageMultiplierForWitch, CONFIG::speedMultiplierForWitch, CONFIG::scaleMultiplierForWitch
            );
            setHealthMultiplier(world, EntityType.WITCH, CONFIG::healthMultiplierForWitch);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WITHER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WITHER, CONFIG::healthMultiplierForWither, CONFIG::damageMultiplierForWither, CONFIG::speedMultiplierForWither, CONFIG::scaleMultiplierForWither
            );
            setHealthMultiplier(world, EntityType.WITHER, CONFIG::healthMultiplierForWither);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.WOLF, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.WOLF, CONFIG::healthMultiplierForWolf, CONFIG::damageMultiplierForWolf, CONFIG::speedMultiplierForWolf, CONFIG::scaleMultiplierForWolf
            );
            setHealthMultiplier(world, EntityType.WOLF, CONFIG::healthMultiplierForWolf);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOGLIN, CONFIG::healthMultiplierForZoglin, CONFIG::damageMultiplierForZoglin, CONFIG::speedMultiplierForZoglin, CONFIG::scaleMultiplierForZoglin
            );
            setHealthMultiplier(world, EntityType.ZOGLIN, CONFIG::healthMultiplierForZoglin);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOMBIE, CONFIG::healthMultiplierForZombie, CONFIG::damageMultiplierForZombie, CONFIG::speedMultiplierForZombie, CONFIG::scaleMultiplierForZombie
            );
            setHealthMultiplier(world, EntityType.ZOMBIE, CONFIG::healthMultiplierForZombie);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIE_VILLAGER, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOMBIE_VILLAGER, CONFIG::healthMultiplierForZombieVillager, CONFIG::damageMultiplierForZombieVillager, CONFIG::speedMultiplierForZombieVillager, CONFIG::scaleMultiplierForZombieVillager
            );
            setHealthMultiplier(world, EntityType.ZOMBIE_VILLAGER, CONFIG::healthMultiplierForZombieVillager);
        });

        ATTRIBUTE_HANDLERS.put(EntityType.ZOMBIFIED_PIGLIN, entity -> {
            World world = entity.getWorld();
            configureEntityAttributes(world, EntityType.ZOMBIFIED_PIGLIN, CONFIG::healthMultiplierForZombifiedPiglin, CONFIG::damageMultiplierForZombifiedPiglin, CONFIG::speedMultiplierForZombifiedPiglin, CONFIG::scaleMultiplierForZombifiedPiglin
            );
            setHealthMultiplier(world, EntityType.ZOMBIFIED_PIGLIN, CONFIG::healthMultiplierForZombifiedPiglin);
        });
    }


    public static void register() {
        initAttributeHandlers();

        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof LivingEntity living && !world.isClient) {
                Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(entity.getType());
                if (handler != null) {
                    handler.accept(living);
                }
            }
        });
    }

    public static void reloadConfig(MinecraftServer server) {
        for (ServerWorld world : server.getWorlds()) {
            for (Entity entity : world.iterateEntities()) {
                if (!(entity instanceof LivingEntity living)) continue;

                Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(entity.getType());
                if (handler != null) {
                    handler.accept(living);
                }
            }
        }
    }

    public static void observeAllConfigChanges(Runnable callback) {
        for (Field field : CONFIG.getClass().getDeclaredFields()) {
            if (!Option.class.isAssignableFrom(field.getType())) continue;
            field.setAccessible(true);
            try {
                @SuppressWarnings("unchecked")
                Option<Object> option = (Option<Object>) field.get(CONFIG);
                option.observe(val -> callback.run());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static <T extends LivingEntity> void setHealthMultiplier(
            World world,
            EntityType<T> entityType,
            Supplier<Float> healthMultiplier
    ) {
        Box box = new Box(new Vec3d(-1_000_000, -1_000_000, -1_000_000), new Vec3d(1_000_000, 1_000_000, 1_000_000));
        Predicate<T> predicate = e -> true;
        for (T entity : world.getEntitiesByType(entityType, box, predicate)) {

            var health = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
            if (health != null) {
                float val = (float) health.getBaseValue() * healthMultiplier.get() * CONFIG.healthMultiplierForAll();
                if (health.getValue() != val) {
                    updateModifier(entity, EntityAttributes.GENERIC_MAX_HEALTH, HEALTH_MODIFIER_UUID, healthMultiplier.get() * CONFIG.healthMultiplierForAll());
                    entity.setHealth(val);
                }
            }
        }
    }

    public static <T extends LivingEntity> void configureEntityAttributes(
            World world,
            EntityType<T> entityType,
            @Nullable Supplier<Float> healthMultiplier,
            @Nullable Supplier<Float> damageMultiplier,
            @Nullable Supplier<Float> speedMultiplier,
            @Nullable Supplier<Float> scaleMultiplier
    ) {
        Box box = new Box(new Vec3d(-1_000_000, -1_000_000, -1_000_000), new Vec3d(1_000_000, 1_000_000, 1_000_000));
        Predicate<T> predicate = e -> true;

        for (T entity : world.getEntitiesByType(entityType, box, predicate)) {
            if (damageMultiplier != null) {
                updateModifier(entity, EntityAttributes.GENERIC_ATTACK_DAMAGE, DAMAGE_MODIFIER_UUID, damageMultiplier.get() * CONFIG.damageMultiplierForAll());
            }
            if (speedMultiplier != null) {
                updateModifier(entity, EntityAttributes.GENERIC_MOVEMENT_SPEED, SPEED_MODIFIER_UUID, speedMultiplier.get() * CONFIG.speedMultiplierForAll());
            }
            if (scaleMultiplier != null) {
                updateModifier(entity, EntityAttributes.GENERIC_SCALE, SCALE_MODIFIER_UUID, scaleMultiplier.get() * CONFIG.scaleMultiplierForAll());
            }
        }
    }

    private static void updateModifier(
            LivingEntity entity,
            RegistryEntry<EntityAttribute> entry,
            Identifier id,
            double multiplier
    ) {
        var attrInstance = entity.getAttributeInstance(entry);
        if (attrInstance == null) return;

        var oldModifier = attrInstance.getModifier(id);
        if (oldModifier != null) {
            attrInstance.removeModifier(oldModifier);
        }

        if (multiplier == 1.0) return;

        double amount = attrInstance.getBaseValue() * (multiplier - 1);
        EntityAttributeModifier modifier = new EntityAttributeModifier(
                id,
                amount,
                EntityAttributeModifier.Operation.ADD_VALUE
        );
        attrInstance.addPersistentModifier(modifier);
    }

}

