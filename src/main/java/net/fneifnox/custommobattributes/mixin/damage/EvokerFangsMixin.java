package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.EvokerFangs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EvokerFangs.class)
public class EvokerFangsMixin {
    @WrapOperation(method = "dealDamageTo", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean injectCustomDamage(LivingEntity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = Config.VANILLA.damageMultiplierForEvoker.get() * Config.VANILLA.damageMultiplierForAll.get();
        return entity.hurt(source, (float) (originalDamage * multiplier));
    }
}
