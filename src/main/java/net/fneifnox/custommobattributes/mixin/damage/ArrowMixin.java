package net.fneifnox.custommobattributes.mixin.damage;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Objects;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(PersistentProjectileEntity.class)
public class ArrowMixin {
    @Redirect(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;sidedDamage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        PersistentProjectileEntity projectile = (PersistentProjectileEntity)(Object)this;
        if (projectile instanceof SpectralArrowEntity && projectile.getOwner() instanceof LivingEntity || projectile instanceof ArrowEntity && projectile.getOwner() instanceof LivingEntity) {
            double multiplier = 1f;
            if (projectile.getOwner() instanceof SkeletonEntity) {
                multiplier = CONFIG.damageMultiplierForSkeleton() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof StrayEntity) {
                multiplier = CONFIG.damageMultiplierForStray() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof BoggedEntity) {
                multiplier = CONFIG.damageMultiplierForBogged() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof PiglinEntity) {
                multiplier = CONFIG.damageMultiplierForPiglin() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof PillagerEntity) {
                multiplier = CONFIG.damageMultiplierForPillager() * CONFIG.damageMultiplierForAll();
            }
            else {
                if (FabricLoader.getInstance().isModLoaded("frycmobvariants")) {
                    EntityType infectedPiglin = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "infected_piglin"));
                    EntityType undeadWarrior = Registries.ENTITY_TYPE.get(Identifier.of("frycmobvariants", "undead_warrior"));

                    if (projectile.getOwner().getType() == infectedPiglin) {
                        multiplier = CONFIG.mobVariants.damageMultiplierForInfectedPiglin() * CONFIG.damageMultiplierForAll();
                    }
                    else if (projectile.getOwner().getType() == undeadWarrior) {
                        multiplier = CONFIG.mobVariants.damageMultiplierForUndeadWarrior() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("betternether")) {
                    EntityType jungleSkeleton = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "jungle_skeleton"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == jungleSkeleton) {
                        multiplier = CONFIG.betterNether.damageMultiplierForJungleSkeleton() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("variantsandventures")) {
                    EntityType murk = Registries.ENTITY_TYPE.get(Identifier.of("variantsandventures", "murk"));
                    EntityType verdant = Registries.ENTITY_TYPE.get(Identifier.of("variantsandventures", "verdant"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == murk) {
                        multiplier = CONFIG.variantsAndVentures.damageMultiplierForMurk() * CONFIG.damageMultiplierForAll();
                    }
                    else if (Objects.requireNonNull(projectile.getOwner()).getType() == verdant) {
                        multiplier = CONFIG.variantsAndVentures.damageMultiplierForVerdant() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("takesapillage")) {
                    EntityType archer = Registries.ENTITY_TYPE.get(Identifier.of("takesapillage", "archer"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == archer) {
                        multiplier = CONFIG.itTakesAPillageContinuation.damageMultiplierForArcher() * CONFIG.damageMultiplierForAll();
                    }
                }
                if (FabricLoader.getInstance().isModLoaded("illagerinvasion")) {
                    EntityType alchemist = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "alchemist"));
                    EntityType provoker = Registries.ENTITY_TYPE.get(Identifier.of("illagerinvasion", "provoker"));

                    if (Objects.requireNonNull(projectile.getOwner()).getType() == alchemist) {
                        multiplier = CONFIG.illagerInvasion.damageMultiplierForAlchemist() * CONFIG.damageMultiplierForAll();
                    }
                    else if (Objects.requireNonNull(projectile.getOwner()).getType() == provoker) {
                        multiplier = CONFIG.illagerInvasion.damageMultiplierForProvoker() * CONFIG.damageMultiplierForAll();
                    }
                }
            }

            double finalDamage = originalDamage * multiplier;
            if (entity.getEntityWorld() instanceof ServerWorld serverWorld) {
                return entity.damage(serverWorld, source, (float) finalDamage);
            } else {
                return false;
            }
        }
        else {
            if (entity.getEntityWorld() instanceof ServerWorld serverWorld) {
                return entity.damage(serverWorld, source, originalDamage);
            }
            else {
                return false;
            }
        }
    }
}
