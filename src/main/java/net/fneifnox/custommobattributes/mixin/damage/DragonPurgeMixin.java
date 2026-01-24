package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EnderDragon.class)
public class DragonPurgeMixin {
    @WrapOperation(method = "hurt(Ljava/util/List;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean modifyDamageAmount(Entity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = Config.VANILLA.damageMultiplierForEnderDragon.get() * Config.VANILLA.damageMultiplierForAll.get();
        return entity.hurt(source, (float) (originalDamage * multiplier));
    }
}
