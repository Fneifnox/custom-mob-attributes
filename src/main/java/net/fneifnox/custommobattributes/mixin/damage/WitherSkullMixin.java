package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fneifnox.custommobattributes.range.RangedMultipliers;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.hurtingprojectile.WitherSkull;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(WitherSkull.class)
public class WitherSkullMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean injectCustomDamage(Entity entity, ServerLevel serverWorld, DamageSource source, float originalDamage, Operation<Boolean> original) {
        WitherBoss wither = ((WitherSkull)(Object)this).getOwner() instanceof WitherBoss owner ? owner : null;
        double multiplier = RangedMultipliers.get(wither, "damageMultiplierForWither") * CONFIG.damageMultiplierForAll();
        return entity.hurtServer(serverWorld, source, (float) (originalDamage * multiplier));
    }
}
