package net.fneifnox.customMobAttributes.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Internationalization {
    private final FileConfiguration defaultLangConfig;
    private final JavaPlugin plugin;

    public Internationalization(JavaPlugin plugin) {
        this.plugin = plugin;
        defaultLangConfig = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "lang.yml"));
    }

    public FileConfiguration getLanguageConfig() {
        File langFile = new File(plugin.getDataFolder(), "lang.yml");
        if (langFile.exists()) {
            return YamlConfiguration.loadConfiguration(langFile);
        }
        return defaultLangConfig;
    }
}