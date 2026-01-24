package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.util.math.Box;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ShulkerEntity.class)
public class ShulkerHitboxMixin {

    @ModifyReturnValue(method = "calculateBoundingBox()Lnet/minecraft/util/math/Box;", at = @At("RETURN"))
    private Box changeShulkerScale(Box originalBox) {
        ShulkerEntity shulker = (ShulkerEntity)(Object)this;

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

        return new Box(cx - dx, minY, cz - dz, cx + dx, maxY, cz + dz);
    }
}