package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Bogged;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.SpectralArrow;
import net.minecraftforge.fml.ModList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Objects;

@Mixin(AbstractArrow.class)
public class ArrowMixin {
    @Redirect(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        AbstractArrow projectile = (AbstractArrow)(Object)this;
        if (projectile instanceof SpectralArrow && projectile.getOwner() instanceof LivingEntity || projectile instanceof Arrow && projectile.getOwner() instanceof LivingEntity) {
            double multiplier = 1f;
            if (projectile.getOwner() instanceof Skeleton) {
                multiplier = Config.VANILLA.damageMultiplierForSkeleton.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else if (projectile.getOwner() instanceof Stray) {
                multiplier = Config.VANILLA.damageMultiplierForStray.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else if (projectile.getOwner() instanceof Bogged) {
                multiplier = Config.VANILLA.damageMultiplierForBogged.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else if (projectile.getOwner() instanceof Piglin) {
                multiplier = Config.VANILLA.damageMultiplierForPiglin.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else if (projectile.getOwner() instanceof Pillager) {
                multiplier = Config.VANILLA.damageMultiplierForPillager.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else {
                if (ModList.get().isLoaded("frycmobvariants")) {
                    EntityType infectedPiglin = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "infected_piglin"));
                    EntityType undeadWarrior = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("frycmobvariants", "undead_warrior"));

                    if (projectile.getOwner().getType() == infectedPiglin) {
                        multiplier = Config.MOB_VARIANTS.damageMultiplierForInfectedPiglin.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                    else if (projectile.getOwner().getType() == undeadWarrior) {
                        multiplier = Config.MOB_VARIANTS.damageMultiplierForUndeadWarrior.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                }
                if (ModList.get().isLoaded("betternether")) {
                    EntityType jungleSkeleton = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("betternether", "jungle_skeleton"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == jungleSkeleton) {
                        multiplier = Config.BETTER_NETHER.damageMultiplierForJungleSkeleton.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                }
                if (ModList.get().isLoaded("variantsandventures")) {
                    EntityType murk = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("variantsandventures", "murk"));
                    EntityType verdant = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("variantsandventures", "verdant"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == murk) {
                        multiplier = Config.VARIANTS_AND_VENTURES.damageMultiplierForMurk.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                    else if (Objects.requireNonNull(projectile.getOwner()).getType() == verdant) {
                        multiplier = Config.VARIANTS_AND_VENTURES.damageMultiplierForVerdant.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                }
                if (ModList.get().isLoaded("takesapillage")) {
                    EntityType archer = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("takesapillage", "archer"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == archer) {
                        multiplier = Config.IT_TAKES_A_PILLAGE_CONTINUATION.damageMultiplierForArcher.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                }
                if (ModList.get().isLoaded("illagerinvasion")) {
                    EntityType alchemist = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "alchemist"));
                    EntityType provoker = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.fromNamespaceAndPath("illagerinvasion", "provoker"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == alchemist) {
                        multiplier = Config.ILLAGER_INVASION.damageMultiplierForAlchemist.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                    else if (Objects.requireNonNull(projectile.getOwner()).getType() == provoker) {
                        multiplier = Config.ILLAGER_INVASION.damageMultiplierForProvoker.get() * Config.VANILLA.damageMultiplierForAll.get();
                    }
                }
            }

            double finalDamage = originalDamage * multiplier;
            return entity.hurt(source, (float) finalDamage);
        }
        else {
            return entity.hurt(source, originalDamage);
        }
    }
}
