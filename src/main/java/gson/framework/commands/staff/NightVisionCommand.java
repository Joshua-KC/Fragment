package gson.framework.commands.staff;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.CommandPermission;
import gson.framework.utilities.MessageUtilities;
import gson.framework.utilities.TimeUtilities;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static gson.framework.utilities.MessageUtilities.SUCCESS;

public class NightVisionCommand extends BaseCommand {

    @CommandAlias("nightvision|nv")
    @CommandPermission("fragment.command.nightvision")

    @CommandCompletion("@players")
    public void onDefault(final Player player){
        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, TimeUtilities.seconds(600), 1), false);
        player.sendMessage(MessageUtilities.colourFormat(SUCCESS + "&aNightvision has been granted!"));
    }
}
