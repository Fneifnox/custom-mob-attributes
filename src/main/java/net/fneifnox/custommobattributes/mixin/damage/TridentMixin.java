package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.projectile.ThrownTrident;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ThrownTrident.class)
public class TridentMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = 1f;
        ThrownTrident trident = (ThrownTrident)(Object)this;
        if (trident.getOwner() instanceof Drowned) {
            if (Config.VANILLA.adultsAlsoAffectBabies.get() && ((Drowned) trident.getOwner()).isBaby()) {
                multiplier = Config.VANILLA.damageMultiplierForBabyDrowned.get() * Config.VANILLA.damageMultiplierForBabyAll.get() * Config.VANILLA.damageMultiplierForDrowned.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else {
                multiplier = ((Drowned) trident.getOwner()).isBaby() ? Config.VANILLA.damageMultiplierForBabyDrowned.get() * Config.VANILLA.damageMultiplierForBabyAll.get() : Config.VANILLA.damageMultiplierForDrowned.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
        }

        double finalDamage = originalDamage * multiplier;
        return entity.hurt(source, (float) finalDamage);
    }
}

