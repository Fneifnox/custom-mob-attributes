package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.breeze.Breeze;
import net.minecraft.world.entity.projectile.windcharge.AbstractWindCharge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractWindCharge.class)
public class WindChargeMixin {
    @Redirect(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        double multiplier = 1f;
        AbstractWindCharge windCharge = (AbstractWindCharge)(Object)this;
        if (windCharge.getOwner() instanceof Breeze) {
            multiplier = Config.VANILLA.damageMultiplierForBreeze.get() * Config.VANILLA.damageMultiplierForAll.get();
        }

        double finalDamage = originalDamage * multiplier;
        return entity.hurt(source, (float) finalDamage);
    }
}
