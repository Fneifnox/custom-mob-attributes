package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.illager.Pillager;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.skeleton.Bogged;
import net.minecraft.world.entity.monster.skeleton.Parched;
import net.minecraft.world.entity.monster.skeleton.Skeleton;
import net.minecraft.world.entity.monster.skeleton.Stray;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.entity.projectile.arrow.SpectralArrow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Objects;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(AbstractArrow.class)
public class ArrowMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurtOrSimulate(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        AbstractArrow projectile = (AbstractArrow)(Object)this;
        if (projectile instanceof SpectralArrow && projectile.getOwner() instanceof LivingEntity || projectile instanceof Arrow && projectile.getOwner() instanceof LivingEntity) {
            double multiplier = 1f;
            if (projectile.getOwner() instanceof Skeleton) {
                multiplier = CONFIG.damageMultiplierForSkeleton() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof Stray) {
                multiplier = CONFIG.damageMultiplierForStray() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof Bogged) {
                multiplier = CONFIG.damageMultiplierForBogged() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof Parched) {
                multiplier = CONFIG.damageMultiplierForParched() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof Piglin) {
                multiplier = CONFIG.damageMultiplierForPiglin() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof Pillager) {
                multiplier = CONFIG.damageMultiplierForPillager() * CONFIG.damageMultiplierForAll();
            }
            else {
                if (FabricLoader.getInstance().isModLoaded("frycmobvariants")) {
                    EntityType<?> infectedPiglin = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "infected_piglin"));
                    EntityType<?> undeadWarrior = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("frycmobvariants", "undead_warrior"));

                    if (projectile.getOwner().getType() == infectedPiglin) {
                        multiplier = CONFIG.mobVariants.damageMultiplierForInfectedPiglin() * CONFIG.damageMultiplierForAll();
                    }
                    else if (projectile.getOwner().getType() == undeadWarrior) {
                        multiplier = CONFIG.mobVariants.damageMultiplierForUndeadWarrior() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("betternether")) {
                    EntityType<?>  jungleSkeleton = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("betternether", "jungle_skeleton"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == jungleSkeleton) {
                        multiplier = CONFIG.betterNether.damageMultiplierForJungleSkeleton() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("variantsandventures")) {
                    EntityType<?> murk = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "murk"));
                    EntityType<?> verdant = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("variantsandventures", "verdant"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == murk) {
                        multiplier = CONFIG.variantsAndVentures.damageMultiplierForMurk() * CONFIG.damageMultiplierForAll();
                    }
                    else if (Objects.requireNonNull(projectile.getOwner()).getType() == verdant) {
                        multiplier = CONFIG.variantsAndVentures.damageMultiplierForVerdant() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("takesapillage")) {
                    EntityType<?> archer = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("takesapillage", "archer"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == archer) {
                        multiplier = CONFIG.itTakesAPillageContinuation.damageMultiplierForArcher() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("illagerinvasion")) {
                    EntityType<?> alchemist = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "alchemist"));
                    EntityType<?> provoker = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "provoker"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == alchemist) {
                        multiplier = CONFIG.illagerInvasion.damageMultiplierForAlchemist() * CONFIG.damageMultiplierForAll();
                    }
                    else if (Objects.requireNonNull(projectile.getOwner()).getType() == provoker) {
                        multiplier = CONFIG.illagerInvasion.damageMultiplierForProvoker() * CONFIG.damageMultiplierForAll();
                    }
                }
            }

            double finalDamage = originalDamage * multiplier;
            if (entity.level() instanceof ServerLevel serverWorld) {
                return entity.hurtServer(serverWorld, source, (float) finalDamage);
            } else {
                return false;
            }
        }
        else {
            if (entity.level() instanceof ServerLevel serverWorld) {
                return entity.hurtServer(serverWorld, source, originalDamage);
            }
            else {
                return false;
            }
        }
    }
}
