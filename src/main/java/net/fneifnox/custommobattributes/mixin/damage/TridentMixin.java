package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.DrownedEntity;
import net.minecraft.entity.projectile.TridentEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(TridentEntity.class)
public class TridentMixin {
    @Redirect(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        double multiplier = 1f;
        TridentEntity trident = (TridentEntity)(Object)this;
        if (trident.getOwner() instanceof DrownedEntity) {
            if (CONFIG.parentsAlsoAffectBabies() && ((DrownedEntity) trident.getOwner()).isBaby()) {
                multiplier = CONFIG.babyDrowned.damageMultiplierForBabyDrowned() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForDrowned() * CONFIG.damageMultiplierForAll();
            }
            else {
                multiplier = ((DrownedEntity) trident.getOwner()).isBaby() ? CONFIG.babyDrowned.damageMultiplierForBabyDrowned() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForDrowned() * CONFIG.damageMultiplierForAll();
            }
        }

        double finalDamage = originalDamage * multiplier;
        return entity.damage(source, (float) finalDamage);
    }
}

