package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.breeze.Breeze;
import net.minecraft.world.entity.projectile.hurtingprojectile.windcharge.AbstractWindCharge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(AbstractWindCharge.class)
public class WindChargeMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, ServerLevel serverWorld, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = 1f;
        AbstractWindCharge windCharge = (AbstractWindCharge)(Object)this;
        if (windCharge.getOwner() instanceof Breeze) {
            multiplier = CONFIG.damageMultiplierForBreeze() * CONFIG.damageMultiplierForAll();
        }

        double finalDamage = originalDamage * multiplier;
        return entity.hurtServer(serverWorld, source, (float) finalDamage);
    }
}