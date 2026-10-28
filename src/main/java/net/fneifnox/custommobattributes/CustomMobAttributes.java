package net.fneifnox.custommobattributes;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fneifnox.custommobattributes.config.CustomMA;
import net.fneifnox.custommobattributes.config.ScrollableConfigScreen;
import net.fneifnox.custommobattributes.range.RangedMultipliers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomMobAttributes implements ModInitializer {
	public static final String MOD_ID = "custom-mob-attributes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CONFIG.load();
		CONFIG.save();
		RangedMultipliers.init();

		// Replaces the screen @Modmenu would register, the class is client only
		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
			ScrollableConfigScreen.register();
		}

		// Moved register() into this so that modded mobs work without any issues
		ServerLifecycleEvents.SERVER_STARTED.register(server -> {
			AttributeUpdater.register();
			AttributeUpdater.observeAllConfigChanges(() -> AttributeUpdater.reloadConfig(server));
		});
	}

	public static final CustomMA CONFIG = CustomMA.createAndLoad();
}