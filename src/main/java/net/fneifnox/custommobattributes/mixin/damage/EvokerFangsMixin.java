package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.projectile.EvokerFangs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(EvokerFangs.class)
public class EvokerFangsMixin {
    @ModifyArg(method = "dealDamageTo", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        double multiplier = Config.VANILLA.damageMultiplierForEvoker.get() * Config.VANILLA.damageMultiplierForAll.get();
        return (float) (originalDamage * multiplier);
    }
}
