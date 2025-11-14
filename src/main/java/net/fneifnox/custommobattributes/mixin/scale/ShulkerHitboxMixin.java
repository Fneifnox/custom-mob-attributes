package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.util.math.Box;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerEntity.class)
public class ShulkerHitboxMixin {

    @Inject(method = "calculateBoundingBox()Lnet/minecraft/util/math/Box;", at = @At("RETURN"), cancellable = true)
    private void changeShulkerScale(CallbackInfoReturnable<Box> cir) {
        ShulkerEntity shulker = (ShulkerEntity)(Object)this;
        Box originalBox = cir.getReturnValue();

        double scale;
        if (shulker.getAttributes() != null) {
            scale = shulker.getAttributeValue(CustomMobAttributes.SCALE);
        }
        else {
            scale = 1f;
        }

        double cx = (originalBox.minX + originalBox.maxX) / 2.0;
        double cz = (originalBox.minZ + originalBox.maxZ) / 2.0;

        double dx = (originalBox.getXLength() / 2.0) * scale;
        double dz = (originalBox.getZLength() / 2.0) * scale;

        double minY = originalBox.minY;
        double maxY = originalBox.minY + (originalBox.getYLength() * scale);

        Box scaledBox = new Box(cx - dx, minY, cz - dz, cx + dx, maxY, cz + dz);
        cir.setReturnValue(scaledBox);
    }
}