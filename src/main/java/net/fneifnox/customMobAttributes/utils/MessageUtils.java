package net.fneifnox.customMobAttributes.utils;

import net.fneifnox.customMobAttributes.config.Internationalization;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import org.bukkit.entity.Player;

import java.text.MessageFormat;

public class MessageUtils {
    private static Internationalization internationalization = null;

    public MessageUtils(Internationalization internationalization) {
        MessageUtils.internationalization = internationalization;
    }

    public static void sendLocalizedMessage(Player player, String messageKey, Object... args) {
        String messageTemplate = internationalization.getLanguageConfig().getString(messageKey);
        String prefix = internationalization.getLanguageConfig().getString("prefix");

        if (messageTemplate != null) {
            String formattedMessage = MessageFormat.format(messageTemplate, args);

            String healthKey = internationalization.getLanguageConfig().getString("healthMultiplier.color", "#fa3939");
            String damageKey = internationalization.getLanguageConfig().getString("damageMultiplier.color", "#fab639");
            String speedKey = internationalization.getLanguageConfig().getString("speedMultiplier.color", "#39d7fa");
            String scaleKey = internationalization.getLanguageConfig().getString("scaleMultiplier.color", "#66fa39");

            TagResolver colorResolver = TagResolver.resolver(
                    Placeholder.parsed("health_color", healthKey),
                    Placeholder.parsed("damage_color", damageKey),
                    Placeholder.parsed("speed_color", speedKey),
                    Placeholder.parsed("scale_color", scaleKey)
            );

            Component messageComponent = MiniMessage.miniMessage().deserialize(formattedMessage, colorResolver);
            Component pref = MiniMessage.miniMessage().deserialize(prefix != null ? prefix : "");
            player.sendMessage(pref.append(messageComponent));
        } else {
            Component messageComponent = MiniMessage.miniMessage().deserialize("<#ff1717>Could not find key: " + messageKey + ". Please report this to the server administrator.");
            player.sendMessage(messageComponent);
        }
    }

    public static Component getLocalizedMessageComponent(String messageKey, boolean withPrefix, Object... args) {
        String messageTemplate = internationalization.getLanguageConfig().getString(messageKey);
        String prefix = internationalization.getLanguageConfig().getString("prefix");

        if (messageTemplate != null) {
            String formattedMessage = MessageFormat.format(messageTemplate, args);

            String healthKey = internationalization.getLanguageConfig().getString("healthMultiplier.color", "#fa3939");
            String damageKey = internationalization.getLanguageConfig().getString("damageMultiplier.color", "#fab639");
            String speedKey = internationalization.getLanguageConfig().getString("speedMultiplier.color", "#39d7fa");
            String scaleKey = internationalization.getLanguageConfig().getString("scaleMultiplier.color", "#66fa39");

            TagResolver colorResolver = TagResolver.resolver(
                    Placeholder.parsed("health_color", healthKey),
                    Placeholder.parsed("damage_color", damageKey),
                    Placeholder.parsed("speed_color", speedKey),
                    Placeholder.parsed("scale_color", scaleKey)
            );

            Component messageComponent = MiniMessage.miniMessage().deserialize(formattedMessage, colorResolver);
            Component pref = MiniMessage.miniMessage().deserialize(prefix != null ? prefix : "");

            return withPrefix ? pref.append(messageComponent) : messageComponent;
        }
        return MiniMessage.miniMessage().deserialize("<#ff1717>Could not find key: " + messageKey + ". Please report this to the server administrator.");
    }
}