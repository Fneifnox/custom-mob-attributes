package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.BatEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(BatEntity.class)
public abstract class BatMixin {

    @ModifyReturnValue(method = "createBatAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyBatAttributes(DefaultAttributeContainer.Builder original) {
        double health = 6.0 * CONFIG.healthMultiplierForBat() * CONFIG.healthMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForBat() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}