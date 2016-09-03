package testplugin.main;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().log(Level.INFO, "TestPlugin has been enabled!");
    }

    @Override
    public void onDisable() {

    }

}
