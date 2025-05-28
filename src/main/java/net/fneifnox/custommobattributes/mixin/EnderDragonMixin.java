package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(EnderDragonEntity.class)
public abstract class EnderDragonMixin {

    @ModifyReturnValue(method = "createEnderDragonAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyEnderDragonAttributes(DefaultAttributeContainer.Builder original) {
        double health = 200.0 * CONFIG.healthMultiplierForEnderDragon() * CONFIG.healthMultiplierForAll();
        double speed = 0.7 * CONFIG.speedMultiplierForEnderDragon() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForEnderDragon() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
