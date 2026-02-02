package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ShulkerBullet.class)
public class ShulkerBulletMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurtOrSimulate(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean injectCustomDamage(Entity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = CONFIG.damageMultiplierForShulker() * CONFIG.damageMultiplierForAll();
        if (entity.level() instanceof ServerLevel serverWorld) {
            return entity.hurtServer(serverWorld, source, (float) (originalDamage * multiplier));
        }
        return false;
    }
}
