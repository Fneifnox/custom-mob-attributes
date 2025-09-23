package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.projectile.LlamaSpitEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(LlamaSpitEntity.class)
public class LlamaSpitMixin {
    @ModifyArg(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        double multiplier = CONFIG.damageMultiplierForLlama() * CONFIG.damageMultiplierForAll();
        return (float) (originalDamage * multiplier);
    }
}
