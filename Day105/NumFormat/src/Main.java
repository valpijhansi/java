import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(2345));


    }
}