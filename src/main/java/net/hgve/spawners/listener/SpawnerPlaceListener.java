package net.hgve.spawners.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class SpawnerPlaceListener implements Listener {

    @EventHandler
    public void onSpawnerPlace(BlockPlaceEvent event) {

        if (!(event.getBlock().getType() == Material.SPAWNER)) {
            return;
        }

        Player player = event.getPlayer();

        if (!(player.hasPermission("spawners.place"))) {
            return;
        }

        // way to make the spawners drop with Zombie, Skeleton etc as lore

    }
}
