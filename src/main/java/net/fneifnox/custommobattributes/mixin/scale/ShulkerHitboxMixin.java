package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerEntity.class)
public class ShulkerHitboxMixin {

    @Inject(method = "calculateBoundingBox()Lnet/minecraft/util/math/Box;", at = @At("RETURN"), cancellable = true)
    private void onCalculateBoundingBox(CallbackInfoReturnable<Box> cir) {
        ShulkerEntity shulker = (ShulkerEntity)(Object)this;
        Box originalBox = cir.getReturnValue();

        double scale = CustomMobAttributes.getScaleAttributeModifierValue(shulker, CustomMobAttributes.SCALE);

        // Mittelpunkt auf X und Z
        double cx = (originalBox.minX + originalBox.maxX) / 2.0;
        double cz = (originalBox.minZ + originalBox.maxZ) / 2.0;

        // Halbe Länge auf X und Z nach Skalierung
        double dx = (originalBox.getLengthX() / 2.0) * scale;
        double dz = (originalBox.getLengthZ() / 2.0) * scale;

        // Y-Achse: minY fix, maxY skaliert
        double minY = originalBox.minY;
        double maxY = originalBox.minY + (originalBox.getLengthY() * scale);

        Box scaledBox = new Box(cx - dx, minY, cz - dz, cx + dx, maxY, cz + dz);
        cir.setReturnValue(scaledBox);
    }
}