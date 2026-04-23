package dev.ash.wFly;

import dev.ash.wFly.commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class WFly extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new FlyCommand());
    }

}
