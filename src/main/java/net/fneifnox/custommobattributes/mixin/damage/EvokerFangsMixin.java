package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.EvokerFangs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(EvokerFangs.class)
public class EvokerFangsMixin {
    @WrapOperation(method = "dealDamageTo", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean injectCustomDamage(LivingEntity entity, ServerLevel serverWorld, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = CONFIG.damageMultiplierForEvoker() * CONFIG.damageMultiplierForAll();
        return entity.hurtServer(serverWorld, source, (float) (originalDamage * multiplier));
    }
}
