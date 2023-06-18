import java.text.NumberFormat;
import java.util.*;
public class numFormatEx {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        for(var x : Currency.getAvailableCurrencies())
            System.out.println(x);
    }
}
