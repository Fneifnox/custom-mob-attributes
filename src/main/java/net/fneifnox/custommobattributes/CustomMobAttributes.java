package net.fneifnox.custommobattributes;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fneifnox.custommobattributes.config.CustomMA;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomMobAttributes implements ModInitializer {
	public static final String MOD_ID = "custom-mob-attributes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CONFIG.load();
		CONFIG.save();

		// Moved register() into this so that modded mobs work without any issues
		ServerLifecycleEvents.SERVER_STARTED.register(server -> {
			AttributeUpdater.register();
			AttributeUpdater.observeAllConfigChanges(() -> AttributeUpdater.reloadConfig(server));
		});
	}

	public static final EntityAttribute SCALE = registerAttribute("scale", 1.0, 0.0625, 16.0);

	public static final CustomMA CONFIG = CustomMA.createAndLoad();

	private static EntityAttribute registerAttribute(final String name, double base, double min, double max) {
		EntityAttribute attribute = new ClampedEntityAttribute("attribute.name." + MOD_ID + '.' + name, base, min, max).setTracked(true);
		return Registry.register(Registries.ATTRIBUTE, new Identifier(MOD_ID, name), attribute);
	}

	public static double getScaleAttributeModifierValue(LivingEntity entity, EntityAttribute attribute) {
		double value = 1.0F;

		if (entity == null || entity.getAttributes() == null) {
			return value;
		}

		EntityAttributeInstance instance = entity.getAttributeInstance(attribute);
		if (instance != null) {
			value = instance.getValue();
		}

		return MathHelper.clamp(value, 0.0625, 16.0);
	}
}