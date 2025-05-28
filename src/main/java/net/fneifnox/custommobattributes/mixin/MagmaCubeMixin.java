package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MagmaCubeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(MagmaCubeEntity.class)
public abstract class MagmaCubeMixin {

    @ModifyReturnValue(method = "createMagmaCubeAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyMagmaCubeAttributes(DefaultAttributeContainer.Builder original) {
        double scale = 1.0 * CONFIG.scaleMultiplierForMagmaCube() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_SCALE, scale);
    }
}
