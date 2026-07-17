package net.fneifnox.customMobAttributes.utils;

import net.fneifnox.customMobAttributes.config.Internationalization;

public class MessageUtilsSingleton {
    private static MessageUtils instance;

    public static void initialize(Internationalization internationalization) {
        if (instance == null) {
            instance = new MessageUtils(internationalization);
        }
    }
}