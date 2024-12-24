package net.hgve.spawners.listener;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class SpawnerBreakListener implements Listener {

    @EventHandler
    public void onSpawnerBreak(BlockBreakEvent event) {

        if (!(event.getBlock().getType() == Material.SPAWNER)) {
            return;
        }

        Player player = event.getPlayer();

        if (!(player.hasPermission("spawners.silktouch"))) {
            return;
        }

        ItemStack tool = player.getInventory().getItemInMainHand();

        if (!(tool.containsEnchantment(Enchantment.SILK_TOUCH))) {
            return;
        }

        // spawner mob storing

    }

}
