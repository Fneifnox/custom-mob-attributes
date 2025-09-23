package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.projectile.ShulkerBulletEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ShulkerBulletEntity.class)
public class ShulkerBulletMixin {
    @ModifyArg(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;sidedDamage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        double multiplier = CONFIG.damageMultiplierForShulker() * CONFIG.damageMultiplierForAll();
        return (float) (originalDamage * multiplier);
    }
}
