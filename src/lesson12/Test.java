package lesson12;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Currency.values()));
        String usd = "USD";
        Currency usdConvert = Currency.valueOf(usd);
        System.out.println(Currency.valueOf("USD"));
        System.out.println(usdConvert);
    }
}
