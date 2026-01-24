package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(EnderDragonEntity.class)
public class DragonPurgeMixin {
    @WrapOperation(method = "damageLivingEntities", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean modifyDamageAmount(Entity entity, ServerWorld world, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = CONFIG.damageMultiplierForEnderDragon() * CONFIG.damageMultiplierForAll();
        return entity.damage(world, source, (float) (originalDamage * multiplier));
    }
}
