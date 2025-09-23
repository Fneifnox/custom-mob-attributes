package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.DrownedEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(TridentEntity.class)
public class TridentMixin {
    @Redirect(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;sidedDamage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean redirectDamage(Entity entity, DamageSource source, float originalDamage) {
        double multiplier = 1f;
        TridentEntity trident = (TridentEntity)(Object)this;
        if (trident.getOwner() instanceof DrownedEntity) {
            multiplier = CONFIG.damageMultiplierForDrowned() * CONFIG.damageMultiplierForAll();
        }

        double finalDamage = originalDamage * multiplier;
        if (entity.getWorld() instanceof ServerWorld serverWorld) {
            return entity.damage(serverWorld, source, (float) finalDamage);
        }
        else {
            return false;
        }
    }
}

