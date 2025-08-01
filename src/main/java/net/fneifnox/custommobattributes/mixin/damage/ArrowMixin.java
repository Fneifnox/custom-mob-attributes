package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(PersistentProjectileEntity.class)
public class ArrowMixin {
    @Redirect(
            method = "onEntityHit", at = @At(
                value = "INVOKE",
                target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"
            )
    )
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        PersistentProjectileEntity projectile = (PersistentProjectileEntity)(Object)this;
        if (projectile instanceof SpectralArrowEntity || projectile instanceof ArrowEntity) {
            float multiplier = 1f;
            if ((projectile.getOwner() instanceof SkeletonEntity)) {
                multiplier = CONFIG.damageMultiplierForSkeleton() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof StrayEntity) {
                multiplier = CONFIG.damageMultiplierForStray() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof PiglinEntity) {
                multiplier = CONFIG.damageMultiplierForPiglin() * CONFIG.damageMultiplierForAll();
            }
            else if (projectile.getOwner() instanceof PillagerEntity) {
                multiplier = CONFIG.damageMultiplierForPillager() * CONFIG.damageMultiplierForAll();
            }

            float finalDamage = originalDamage * multiplier;
            return entity.damage(source, finalDamage);
        }
        else {
            return entity.damage(source, originalDamage);
        }
    }
}
