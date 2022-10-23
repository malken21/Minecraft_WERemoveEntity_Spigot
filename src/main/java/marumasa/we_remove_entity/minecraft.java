package marumasa.we_remove_entity;

import org.bukkit.plugin.java.JavaPlugin;

public final class minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        if (getServer().getPluginManager().isPluginEnabled("FastAsyncWorldEdit")) {
            getServer().getPluginManager().registerEvents(new Events(), this);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
