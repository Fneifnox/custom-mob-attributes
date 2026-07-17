package net.fneifnox.customMobAttributes;

import net.fneifnox.customMobAttributes.commands.*;
import net.fneifnox.customMobAttributes.config.ConfigManager;
import net.fneifnox.customMobAttributes.config.Internationalization;
import net.fneifnox.customMobAttributes.config.MobMultiplier;
import net.fneifnox.customMobAttributes.utils.MessageUtilsSingleton;
import net.fneifnox.customMobAttributes.utils.UpdateChecker;
import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class Main extends JavaPlugin {
    public Internationalization internationalization;
    public AttributeUpdater attributeUpdater;
    private final ConcurrentHashMap<UUID, Boolean> babyCache = new ConcurrentHashMap<>();
    public Map<String, MobMultiplier> configCache = new HashMap<>();
    public ConfigManager configManager;

    public boolean updateAvailable = false;
    public String latestVersionString = "";

    @Override
    public void onEnable() {
        registerMetrics();

        saveDefaultConfig();
        saveResource("lang.yml", false);

        updateConfig();
        try {
            updateLangFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        internationalization = new Internationalization(this);
        attributeUpdater = new AttributeUpdater(this);
        configManager = new ConfigManager(this);

        getServer().getPluginManager().registerEvents(attributeUpdater, this);

        MessageUtilsSingleton.initialize(internationalization);

        registerCommands();

        checkPluginUpdates();

        this.configManager.registerCorrectConfigValues();
        this.configManager.setConfigCache();

        getServer().getScheduler().runTask(this, () -> {
            this.attributeUpdater.configureEveryEntity();
        });

        getServer().getScheduler().runTaskTimer(this, () -> {
            for (World world : Bukkit.getWorlds()) {
                for (LivingEntity entity : world.getEntitiesByClass(Ageable.class)) {

                    if (babyCache.get(entity.getUniqueId()) == null) {
                        babyCache.put(entity.getUniqueId(), attributeUpdater.isBaby(entity));
                        continue;
                    }

                    if (babyCache.get(entity.getUniqueId()) && !attributeUpdater.isBaby(entity)) {
                        babyCache.put(entity.getUniqueId(), false);
                        attributeUpdater.configureEntityAttributes(entity);
                    }
                }
            }

        }, 0L, 40L);

        getServer().getScheduler().runTaskTimer(this, () -> {
            babyCache.keySet().removeIf(uuid -> {
                Entity e = Bukkit.getEntity(uuid);
                return e == null || !e.isValid();
            });
        }, 0L, 100L);
    }

    private void registerCommands() {
        getCommand("setmultiplier").setExecutor(new SetMultiplierCmd(this));
        getCommand("setmultiplier").setTabCompleter(new SetMultiplierTab());

        getCommand("getmultiplier").setExecutor(new GetMultiplierCmd(this));
        getCommand("getmultiplier").setTabCompleter(new GetMultiplierTab());

        getCommand("adultsalsoaffectbabies").setExecutor(new AdultsAlsoAffectBabiesCmd(this));
        getCommand("adultsalsoaffectbabies").setTabCompleter(new AdultsAlsoAffectBabiesTab());

        getCommand("reloadcustommobattributes").setExecutor(new ReloadCustomMobAttributesCmd(this));
    }

    private void updateConfig() {
        int userVersion = getConfig().getInt("config_version", 1);
        int currentVersion = 1;

        if (userVersion < currentVersion) {
            getConfig().options().copyDefaults(true);

            getConfig().set("config_version", currentVersion);
            saveConfig();

            getLogger().info("Config got updated to version " + currentVersion);
        }
    }

    private void updateLangFile() throws IOException {
        File langFile = new File(getDataFolder(), "lang.yml");
        FileConfiguration langConfig = YamlConfiguration.loadConfiguration(langFile);

        int userVersion = langConfig.getInt("lang_version", 1);
        int currentVersion = 1;

        if (userVersion < currentVersion) {
            try (InputStream defaultStream = getResource("lang.yml")) {
                if (defaultStream != null) {
                    Reader defaultReader = new InputStreamReader(defaultStream, StandardCharsets.UTF_8);
                    YamlConfiguration defaultLangConfig = YamlConfiguration.loadConfiguration(defaultReader);
                    langConfig.setDefaults(defaultLangConfig);
                }
            }

            langConfig.options().copyDefaults(true);

            langConfig.set("lang_version", currentVersion);
            langConfig.save(langFile);

            getLogger().info("Language file got updated to version " + currentVersion);
        }
    }

    private void registerMetrics() {
        int pluginId = 32636;
        Metrics metrics = new Metrics(this, pluginId);
    }

    private void checkPluginUpdates() {
        UpdateChecker checker = new UpdateChecker(this, "f12jSNQc");

        checker.checkForUpdatesOnModrinth(latestVersion -> {
            String currentVersion = getPluginMeta().getVersion();

            if (currentVersion.equalsIgnoreCase(latestVersion)) {
                getLogger().info("You are using the latest version (" + currentVersion + ").");
            } else {
                getLogger().warning("A new version is available: " + latestVersion + "!");
                getLogger().warning("Your version: " + currentVersion);
                getLogger().warning("Download the new version here: https://modrinth.com/project/f12jSNQc");

                this.updateAvailable = true;
                this.latestVersionString = latestVersion;
            }
        });
    }

    @Override
    public void onDisable() {
        getServer().getScheduler().cancelTasks(this);
        babyCache.clear();
    }
}
