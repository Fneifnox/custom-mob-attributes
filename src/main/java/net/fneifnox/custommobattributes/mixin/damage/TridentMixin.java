package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.zombie.Drowned;
import net.minecraft.world.entity.projectile.arrow.ThrownTrident;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ThrownTrident.class)
public class TridentMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurtOrSimulate(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage, Operation<Boolean> original) {
        double multiplier = 1f;
        ThrownTrident trident = (ThrownTrident)(Object)this;
        if (trident.getOwner() instanceof Drowned) {
            if (CONFIG.adultsAlsoAffectBabies() && ((Drowned) trident.getOwner()).isBaby()) {
                multiplier = CONFIG.babyDrowned.damageMultiplierForBabyDrowned() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForDrowned() * CONFIG.damageMultiplierForAll();
            }
            else {
                multiplier = ((Drowned) trident.getOwner()).isBaby() ? CONFIG.babyDrowned.damageMultiplierForBabyDrowned() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForDrowned() * CONFIG.damageMultiplierForAll();
            }
        }

        double finalDamage = originalDamage * multiplier;
        if (entity.level() instanceof ServerLevel serverWorld) {
            return entity.hurtServer(serverWorld, source, (float) finalDamage);
        }
        else {
            return false;
        }
    }
}

