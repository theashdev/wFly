package dev.ash.wFly.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class ColorUtil {
    private static final MiniMessage MM = MiniMessage.miniMessage();

    public static Component parse(String text) {
        if (text == null) return Component.empty();

        return MM.deserialize(text).decoration(TextDecoration.ITALIC, false);
    }
}