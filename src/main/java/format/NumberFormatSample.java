package format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatSample {
    private final int DECIMAL = 1;
    private final int ONLY_INTEGER = 2;
    private final int CURRENCY= 3;
    private final int PERCENTAGE=4;
    public static void main(String[] args) {

        NumberFormat formatter = NumberFormat.getInstance();
        String numArray = formatter.format(3.1415926915);
        System.out.println("numArray Formatting = "+numArray);
        NumberFormatSample sample = new NumberFormatSample();
        sample.printFormattedNumber(86400.1234, Locale.KOREA);
        sample.printFormattedNumber(86400.1234, Locale.CANADA);
        sample.printFormattedNumber(86400.1234, Locale.GERMANY);
        sample.printFormattedNumber(86400.1234, Locale.US);
    }
    public void printFormattedNumber(double number, Locale locale){
        NumberFormat formatter = null;
        int type = DECIMAL;
        switch (type) {
            case DECIMAL:
                formatter = NumberFormat.getInstance(locale);
                formatter.setMinimumFractionDigits(10);
                formatter.setMaximumFractionDigits(10);
                break;
            case ONLY_INTEGER:
                formatter = NumberFormat.getIntegerInstance(locale);
                break;
            case CURRENCY:
                formatter = NumberFormat.getCurrencyInstance(locale);
                break;
            case PERCENTAGE:
                formatter = NumberFormat.getPercentInstance(locale);
                break;
            default:
                return;
        }
        System.out.println(locale.getCountry() + " : "+formatter.format(number));
    }
}
