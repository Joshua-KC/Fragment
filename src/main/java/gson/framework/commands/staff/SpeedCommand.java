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

public final class SpeedCommand extends BaseCommand {

    @CommandAlias("speed")
    @CommandPermission("fragment.command.speed")

    @CommandCompletion("@players")
    public void onDefault(final Player player){
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, TimeUtilities.seconds(600), 2), false);
        player.sendMessage(MessageUtilities.colourFormat(SUCCESS + "&aSpeed has been granted!"));
    }
}
