package gson.framework.listeners.crafting;

import gson.framework.utilities.MessageUtilities;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class GodAppleListener implements Listener {

    @EventHandler
    public void onCraftItem(final CraftItemEvent craftItemEvent) {
        final ItemStack itemStack = craftItemEvent.getCurrentItem();
        final Player player = (Player) craftItemEvent.getWhoClicked();
        if(itemStack.getType() == Material.GOLDEN_APPLE && itemStack.getDurability() == 1) {
            craftItemEvent.setCancelled(true);
            craftItemEvent.setCurrentItem(null);
            player.updateInventory();
            player.sendMessage(MessageUtilities.colourFormat("&c&lERROR: &cThe item, &n&lGOD_&n&lAPPLE&c can &n&lNOT&c be crafted!"));
        }
    }
}
