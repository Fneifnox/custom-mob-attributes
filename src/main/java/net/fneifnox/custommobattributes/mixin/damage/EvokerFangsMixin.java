package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.mob.EvokerFangsEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(EvokerFangsEntity.class)
public class EvokerFangsMixin {
    @ModifyArg(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        double multiplier = CONFIG.damageMultiplierForEvoker() * CONFIG.damageMultiplierForAll();
        return (float) (originalDamage * multiplier);
    }
}
