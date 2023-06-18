import java.text.NumberFormat;
import java.util.*;
public class main {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        int amount = 12345;
        String res = nf1.format(amount);
        System.out.println(nf.format(amount));
        System.out.println(res);
        nf.setCurrency(Currency.getInstance(Locale.FRANCE));
        res = nf.format(amount);
        System.out.println(res);


    }
}
