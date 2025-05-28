package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.BlazeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(BlazeEntity.class)
public abstract class BlazeMixin {

    @ModifyReturnValue(method = "createBlazeAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyBlazeAttributes(DefaultAttributeContainer.Builder original) {
        double health = 20.0 * CONFIG.healthMultiplierForBlaze() * CONFIG.healthMultiplierForAll();
        double damage = 6.0 * CONFIG.damageMultiplierForBlaze() * CONFIG.damageMultiplierForAll();
        double speed = 0.23000000417232513 * CONFIG.speedMultiplierForBlaze() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForBlaze() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
