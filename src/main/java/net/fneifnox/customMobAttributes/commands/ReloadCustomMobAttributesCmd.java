package net.fneifnox.customMobAttributes.commands;

import net.fneifnox.customMobAttributes.Main;
import net.fneifnox.customMobAttributes.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ReloadCustomMobAttributesCmd implements CommandExecutor {
    private final Main plugin;

    public ReloadCustomMobAttributesCmd(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) return false;
        if (!player.hasPermission("custommobattributes.command.reloadcustommobattributes") && !player.hasPermission("custommobattributes.admin")) {
            MessageUtils.sendLocalizedMessage(player, "generell.noPermission");
            return true;
        }
        plugin.reloadConfig();
        plugin.internationalization.getLanguageConfig();

        plugin.configManager.setConfigCache();

        plugin.attributeUpdater.configureEveryEntity();

        MessageUtils.sendLocalizedMessage(player, "reloadCustomMobAttributes.reloaded");
        return true;
    }
}
