package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.projectile.ThrownTrident;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ThrownTrident.class)
public class TridentMixin {
    @Redirect(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        double multiplier = 1f;
        TridentEntity trident = (TridentEntity)(Object)this;
        if (trident.getOwner() instanceof DrownedEntity) {
            if (CONFIG.adultsAlsoAffectBabies() && ((DrownedEntity) trident.getOwner()).isBaby()) {
                multiplier = CONFIG.babyDrowned.damageMultiplierForBabyDrowned() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForDrowned() * CONFIG.damageMultiplierForAll();
            }
            else {
                multiplier = ((DrownedEntity) trident.getOwner()).isBaby() ? CONFIG.babyDrowned.damageMultiplierForBabyDrowned() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForDrowned() * CONFIG.damageMultiplierForAll();
            }
        }

        double finalDamage = originalDamage * multiplier;
        return entity.hurt(source, (float) finalDamage);
    }
}

