package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.RavagerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(RavagerEntity.class)
public abstract class RavagerMixin {

    @ModifyReturnValue(method = "createRavagerAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyRavagerAttributes(DefaultAttributeContainer.Builder original) {
        double health = 100.0 * CONFIG.healthMultiplierForRavager() * CONFIG.healthMultiplierForAll();
        double damage = 12.0 * CONFIG.damageMultiplierForRavager() * CONFIG.damageMultiplierForAll();
        double speed = 0.3 * CONFIG.speedMultiplierForRavager() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForRavager() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
