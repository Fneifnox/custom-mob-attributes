package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(EnderDragonEntity.class)
public class DragonPurgeMixin {
    @ModifyArg(method = "damageLivingEntities", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"
    )
    )
    public float modifyDamageAmount(float originalDamage) {
        float multiplier = CONFIG.damageMultiplierForEnderDragon() * CONFIG.damageMultiplierForAll();
        return originalDamage * multiplier;
    }
}
