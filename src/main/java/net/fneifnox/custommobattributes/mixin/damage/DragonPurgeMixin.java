package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(EnderDragon.class)
public class DragonPurgeMixin {
    @ModifyArg(method = "hurt(Ljava/util/List;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private float modifyDamageAmount(float originalDamage) {
        double multiplier = Config.VANILLA.damageMultiplierForEnderDragon.get() * Config.VANILLA.damageMultiplierForAll.get();
        return (float) (originalDamage * multiplier);
    }
}
