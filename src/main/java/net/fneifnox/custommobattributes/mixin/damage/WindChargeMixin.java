package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.BreezeEntity;
import net.minecraft.entity.projectile.AbstractWindChargeEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(AbstractWindChargeEntity.class)
public class WindChargeMixin {
    @WrapOperation(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, ServerWorld serverWorld, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = 1f;
        AbstractWindChargeEntity windCharge = (AbstractWindChargeEntity)(Object)this;
        if (windCharge.getOwner() instanceof BreezeEntity) {
            multiplier = CONFIG.damageMultiplierForBreeze() * CONFIG.damageMultiplierForAll();
        }

        double finalDamage = originalDamage * multiplier;
        return entity.damage(serverWorld, source, (float) finalDamage);
    }
}