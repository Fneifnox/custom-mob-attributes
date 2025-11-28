package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.projectile.LlamaSpit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LlamaSpit.class)
public class LlamaSpitMixin {
    @ModifyArg(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        double multiplier = Config.VANILLA.damageMultiplierForLlama.get() * Config.VANILLA.damageMultiplierForAll.get();
        return (float) (originalDamage * multiplier);
    }
}
