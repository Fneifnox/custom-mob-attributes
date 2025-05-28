package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.SilverfishEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SilverfishEntity.class)
public abstract class SilverfishMixin {

    @ModifyReturnValue(method = "createSilverfishAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifySilverfishAttributes(DefaultAttributeContainer.Builder original) {
        double health = 8.0 * CONFIG.healthMultiplierForSilverfish() * CONFIG.healthMultiplierForAll();
        double damage = 1.0 * CONFIG.damageMultiplierForSilverfish() * CONFIG.damageMultiplierForAll();
        double speed = 0.25 * CONFIG.speedMultiplierForSilverfish() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForSilverfish() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
