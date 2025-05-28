package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.TadpoleEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(TadpoleEntity.class)
public abstract class TadpoleMixin {

    @ModifyReturnValue(method = "createTadpoleAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyTadpoleAttributes(DefaultAttributeContainer.Builder original) {
        double health = 6.0 * CONFIG.healthMultiplierForTadpole() * CONFIG.healthMultiplierForAll();
        double speed = 1.0 * CONFIG.speedMultiplierForTadpole() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForTadpole() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
