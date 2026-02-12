package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Shulker.class)
public class ShulkerHitboxMixin {

    @Inject(method = "makeBoundingBox", at = @At("RETURN"), cancellable = true)
    private void changeShulkerScale(CallbackInfoReturnable<AABB> cir) {
        Shulker shulker = (Shulker)(Object)this;
        AABB originalBox = cir.getReturnValue();

        double scale;
        if (shulker.getAttributes() != null) {
            scale = shulker.getAttributeValue(CustomMobAttributes.SCALE.get());
        }
        else {
            scale = 1f;
        }

        double cx = (originalBox.minX + originalBox.maxX) / 2.0;
        double cz = (originalBox.minZ + originalBox.maxZ) / 2.0;

        double dx = (originalBox.getXsize() / 2.0) * scale;
        double dz = (originalBox.getZsize() / 2.0) * scale;

        double minY = originalBox.minY;
        double maxY = originalBox.minY + (originalBox.getYsize() * scale);

        AABB scaledBox = new AABB(cx - dx, minY, cz - dz, cx + dx, maxY, cz + dz);
        cir.setReturnValue(scaledBox);
    }
}