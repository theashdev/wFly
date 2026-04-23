package dev.ash.wFly;

import dev.ash.wFly.commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class WFly extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getCommand("fly").setExecutor(new FlyCommand(this));

        getLogger().info("WFly enabled");
    }

    @Override
    public void onDisable() {

        getLogger().info("WFly disabled");
    }
}
