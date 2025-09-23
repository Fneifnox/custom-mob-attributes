package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.BreezeEntity;
import net.minecraft.entity.projectile.AbstractWindChargeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(AbstractWindChargeEntity.class)
public class WindChargeMixin {
    @Redirect(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        double multiplier = 1f;
        AbstractWindChargeEntity windCharge = (AbstractWindChargeEntity)(Object)this;
        if (windCharge.getOwner() instanceof BreezeEntity) {
            multiplier = CONFIG.damageMultiplierForBreeze() * CONFIG.damageMultiplierForAll();
        }

        double finalDamage = originalDamage * multiplier;
        return entity.damage(source, (float) finalDamage);
    }
}
