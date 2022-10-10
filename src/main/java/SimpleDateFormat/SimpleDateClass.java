package SimpleDateFormat;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class SimpleDateClass {
    public static void main(String[] args) {
        SimpleDateClass simple = new SimpleDateClass();
        simple.printDayOfWeek();
    }

    private void printDayOfWeek() {
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        Locale locale = Locale.ENGLISH; //ko-kr
        for (DayOfWeek day : dayOfWeeks) {
            System.out.println("day.getDisplayName(TextStyle.FULL, locale)+\" \" = " + day.getDisplayName(TextStyle.FULL, locale)+" ");
            System.out.println("day.getDisplayName(TextStyle.SHORT, locale)+\" \" = " + day.getDisplayName(TextStyle.SHORT, locale)+" ");
            System.out.println("day.getDisplayName(TextStyle.NARROW, locale)+\" \" = " + day.getDisplayName(TextStyle.NARROW, locale)+" ");
        }
    }
}
