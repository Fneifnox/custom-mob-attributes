package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.LlamaEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(LlamaEntity.class)
public abstract class LlamaMixin {

    @ModifyReturnValue(method = "createLlamaAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyLlamaAttributes(DefaultAttributeContainer.Builder original) {
        double health = 23.0 * CONFIG.healthMultiplierForLlama() * CONFIG.healthMultiplierForAll();
        double speed = 0.17499999701976776 * CONFIG.speedMultiplierForLlama() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForLlama() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
