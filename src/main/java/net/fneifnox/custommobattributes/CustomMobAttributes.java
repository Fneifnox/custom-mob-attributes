package net.fneifnox.custommobattributes;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fneifnox.custommobattributes.config.CustomMA;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomMobAttributes implements ModInitializer {
	public static final String MOD_ID = "custom-mob-attributes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static MinecraftServer cachedServer;

	@Override
	public void onInitialize() {
		CONFIG.load();
		CONFIG.save();

		ServerLifecycleEvents.SERVER_STARTED.register(server -> {
			cachedServer = server;
			AttributeUpdater.observeAllConfigChanges(() -> {
				System.out.println("Config wurde geändert – lade Attribute neu!");
				AttributeUpdater.reloadConfig(server);
			});
		});

		AttributeUpdater.register();
		System.out.println("TEST 1");
	}

	public static final CustomMA CONFIG = CustomMA.createAndLoad();
}