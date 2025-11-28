package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.projectile.Snowball;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Snowball.class)
public class SnowballMixin {
    @Redirect(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        double multiplier = 1f;
        Snowball snowball = (Snowball)(Object)this;
        if (snowball.getOwner() instanceof SnowGolem) {
            multiplier = Config.VANILLA.damageMultiplierForSnowGolem.get() * Config.VANILLA.damageMultiplierForAll.get();
        }

        double finalDamage = originalDamage * multiplier;
        return entity.hurt(source, (float) finalDamage);
    }
}
