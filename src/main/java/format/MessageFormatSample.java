package format;

import java.text.MessageFormat;
import java.text.NumberFormat;

public class MessageFormatSample {
    public static void main(String[] args) {
        String format = "{0}님이 구매하신 총액은 {1,number,#,###.00}원입니다.";
        String name = "이상민";
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
//        String price = numberFormat.format(120.585);
        int price = (int) 120585;
        String result = MessageFormat.format(format,name,price);
        System.out.println(result);
    }
}
