package gson.framework.utilities;

import java.time.format.DateTimeFormatter;

public final class TimeUtilities {

    /*
     * DateTimeFormater: Allowing to track when player joined & if player was punished.
     */
    public static final DateTimeFormatter JOIN_DATE_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss' on 'yyyy-MM-dd zzz");
    public static final DateTimeFormatter PUNISHMENT_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss' on 'yyyy-MM-dd zzz");

    /*
     * Amount of TICKS per second, minute & hour.
     */
    private static final int HOURS = 20 * 60 * 60;
    private static final int MINUTES = 20 * 60;
    private static final int SECONDS = 20;

    /*
     * INTEGER converters for ticks.
     */
    public static int hours(int hours) {
        return HOURS * hours;
    }

    public static int minutes(int minutes) {
        return MINUTES * minutes;
    }

    public static int seconds(int seconds) {
        return SECONDS * seconds;
    }

}
