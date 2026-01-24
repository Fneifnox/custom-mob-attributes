package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Shulker.class)
public class ShulkerHitboxMixin {

    @ModifyReturnValue(method = "makeBoundingBox", at = @At("RETURN"))
    private AABB changeShulkerScale(AABB originalBox) {
        Shulker shulker = (Shulker)(Object)this;

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

        return new AABB(cx - dx, minY, cz - dz, cx + dx, maxY, cz + dz);
    }
}