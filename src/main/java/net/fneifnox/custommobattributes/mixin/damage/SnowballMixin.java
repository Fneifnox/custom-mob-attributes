package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SnowballEntity.class)
public class SnowballMixin {
    @WrapOperation(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;serverDamage(Lnet/minecraft/entity/damage/DamageSource;F)V"))
    private void redirectDamage(Entity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = 1f;
        SnowballEntity snowball = (SnowballEntity)(Object)this;
        if (snowball.getOwner() instanceof SnowGolemEntity) {
            multiplier = CONFIG.damageMultiplierForSnowGolem() * CONFIG.damageMultiplierForAll();
        }

        double finalDamage = originalDamage * multiplier;
        if (entity.getWorld() instanceof ServerWorld serverWorld) {
            entity.damage(serverWorld, source, (float) finalDamage);
        }
    }
}
