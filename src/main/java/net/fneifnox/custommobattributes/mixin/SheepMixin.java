package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.SheepEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SheepEntity.class)
public abstract class SheepMixin {

    @ModifyReturnValue(method = "createSheepAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifySheepAttributes(DefaultAttributeContainer.Builder original) {
        double health = 8.0 * CONFIG.healthMultiplierForSheep() * CONFIG.healthMultiplierForAll();
        double speed = 0.23000000417232513 * CONFIG.speedMultiplierForSheep() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForSheep() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
