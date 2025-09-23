package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.projectile.WitherSkullEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(WitherSkullEntity.class)
public class WitherSkullMixin {
    @ModifyArg(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        double multiplier = CONFIG.damageMultiplierForWither() * CONFIG.damageMultiplierForAll();
        return (float) (originalDamage * multiplier);
    }
}
