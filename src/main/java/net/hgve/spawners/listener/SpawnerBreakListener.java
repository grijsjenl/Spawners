package net.hgve.spawners.listener;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SpawnerBreakListener implements Listener {

    @EventHandler
    public void onSpawnerBreak(BlockBreakEvent event) {

        if (!(event.getBlock().getType() == Material.SPAWNER)) {
            return;
        }

        Player player = event.getPlayer();

        if (!(player.hasPermission("spawners.break"))) {
            return;
        }

        ItemStack tool = player.getInventory().getItemInMainHand();

        // check for allowed tools

        if (!(tool.containsEnchantment(Enchantment.SILK_TOUCH))) {
            return;
        }

        // spawner mob storing
        CreatureSpawner spawner = (CreatureSpawner) event.getBlock();

        EntityType spawnerEntity = spawner.getSpawnedType();
        ItemStack spawnerItem = new ItemStack(Material.SPAWNER);

        // maybe a better way?
        event.setCancelled(true);
        event.getBlock().setType(Material.AIR);

        // way to drop spawner as item

    }

}
