package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.golem.SnowGolem;
import net.minecraft.world.entity.projectile.throwableitemprojectile.Snowball;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(Snowball.class)
public class SnowballMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)V"))
    private void redirectDamage(Entity entity, DamageSource source, float originalDamage, Operation<Void> original) {
        double multiplier = 1f;
        Snowball snowball = (Snowball)(Object)this;
        if (snowball.getOwner() instanceof SnowGolem) {
            multiplier = CONFIG.damageMultiplierForSnowGolem() * CONFIG.damageMultiplierForAll();
        }

        double finalDamage = originalDamage * multiplier;
        if (entity.level() instanceof ServerLevel serverWorld) {
            entity.hurtServer(serverWorld, source, (float) finalDamage);
        }
    }
}
