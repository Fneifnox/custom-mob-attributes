package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EvokerFangsEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(EvokerFangsEntity.class)
public class EvokerFangsMixin {
    @WrapOperation(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;serverDamage(Lnet/minecraft/entity/damage/DamageSource;F)V"))
    private boolean injectCustomDamage(LivingEntity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = CONFIG.damageMultiplierForEvoker() * CONFIG.damageMultiplierForAll();
        if (entity.getWorld() instanceof ServerWorld serverWorld) {
            return entity.damage(serverWorld, source, (float) (originalDamage * multiplier));
        }
        return false;
    }
}
