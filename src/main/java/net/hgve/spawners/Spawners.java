package net.hgve.spawners;

import net.hgve.spawners.listener.SpawnerBreakListener;
import net.hgve.spawners.listener.SpawnerPlaceListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spawners extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Spawners starting");

        this.getServer().getPluginManager().registerEvents(new SpawnerBreakListener(), this);
        this.getServer().getPluginManager().registerEvents(new SpawnerPlaceListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
