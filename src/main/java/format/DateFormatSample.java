package format;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DateFormatSample {
    public static void main(String[] args) {
        DateFormatSample sample = new DateFormatSample();
        sample.checkDateFormat();
    }
    private static final int DATE = 1;
    private static final int TIME = 2;
    private static final int DATE_TIME = 3;
    public void checkDateFormat(){
        Date currentDate = new Date(1328054400000L);
        int style = DateFormat.MEDIUM;
        int formatType =DATE_TIME;
        printFormattedDateTime(currentDate, Locale.KOREA, style, formatType);
        printFormattedDateTime(currentDate, Locale.US, style, formatType);
        printFormattedDateTime(currentDate, Locale.FRANCE, style, formatType);
        printFormattedDateTime(currentDate, Locale.GERMANY, style, formatType);
        printFormattedDateTime(currentDate, Locale.CANADA, style, formatType);
    }

    public void printFormattedDateTime(Date date , Locale locale, int style , int formatType){
        DateFormat formatter;
        switch (formatType){
            case DATE:
                formatter =DateFormat.getDateInstance(style,locale);
                break;
            case DATE_TIME:
                formatter = DateFormat.getDateTimeInstance(style,style,locale);
                break;
            case TIME:
                formatter = DateFormat.getTimeInstance(style,locale);
                break;
            default:
                return;
        }
        String result = formatter.format(date);
        System.out.println(locale.getCountry()+" : "+result);
    }
}
