package gson.framework.utilities;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

@UtilityClass
public class MessageUtilities {
    //Don't actually handle it like this, this can be handled via an ENUM.
    public static String SUCCESS = colourFormat("&a&lSUCCESS: ");
    public static String ACTION = colourFormat("&e&lACTION: ");
    public static String ERROR = colourFormat("&c&lERROR: ");
    public static String CONSOLE = colourFormat("&4&lCONSOLE: ");
    public static String TEST_MESSAGE = colourFormat("&7testing messsage!");
    public static String ERROR_MESSAGE = colourFormat("&cSorry, you lack sufficient permissions to perform this action!");
    public static String SUCCESS_MESSAGE = colourFormat("&a&lSUCCESS: &aRequested function was performed!");
    public static String DOUBLE_ARROW_HEAD = colourFormat(" &8» ");

    // &: Allows for colour codes.
    public String colourFormat(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

}
