package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.CamelEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(CamelEntity.class)
public abstract class CamelMixin {

    @ModifyReturnValue(method = "createCamelAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyCamelAttributes(DefaultAttributeContainer.Builder original) {
        double health = 32.0 * CONFIG.healthMultiplierForCamel() * CONFIG.healthMultiplierForAll();
        double speed = 0.09000000357627869 * CONFIG.speedMultiplierForCamel() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForCamel() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
