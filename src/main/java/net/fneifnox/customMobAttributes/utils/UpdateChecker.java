package net.fneifnox.customMobAttributes.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UpdateChecker {

    private final JavaPlugin plugin;
    private String projectId;

    public UpdateChecker(JavaPlugin plugin, String projectId) {
        this.plugin = plugin;
        this.projectId = projectId;
    }

    public void checkForUpdatesOnModrinth(UpdateCallback callback) {
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
            try {
                URL url = new URL("https://api.modrinth.com/v2/project/" + projectId + "/version?loaders=%5B%22paper%22,%22spigot%22%5D");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("User-Agent", "CustomMobAttributes-UpdateChecker");


                if (connection.getResponseCode() == 200) {
                    try (InputStreamReader reader = new InputStreamReader(connection.getInputStream())) {
                        JsonArray jsonResponse = JsonParser.parseReader(reader).getAsJsonArray();

                        if (!jsonResponse.isEmpty()) {
                            String latestVersion = jsonResponse.get(0).getAsJsonObject().get("version_number").getAsString();

                            Bukkit.getScheduler().runTask(plugin, () -> callback.onResult(latestVersion));
                        }
                    }
                }
            }
            catch (Exception e) {
                plugin.getLogger().warning("Failed to check for updates on modrinth");
            }
        });
    }

    public interface UpdateCallback {
        void onResult(String latestVersion);
    }
}
