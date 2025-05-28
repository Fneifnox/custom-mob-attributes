package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.ArmadilloEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ArmadilloEntity.class)
public abstract class ArmadilloMixin {

    @ModifyReturnValue(method = "createArmadilloAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyArmadilloAttributes(DefaultAttributeContainer.Builder original) {
        double health = 12.0 * CONFIG.healthMultiplierForArmadillo() * CONFIG.healthMultiplierForAll();
        double speed = 0.14 * CONFIG.speedMultiplierForArmadillo() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForArmadillo() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
