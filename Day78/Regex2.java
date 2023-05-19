import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex2 {
    public static void main(String args[]) {
        boolean r = Pattern.matches("123", "123");// it means any digits,short of[0-9]
        boolean r1 = Pattern.matches("abcd", "abcd");// it means non-digit,short for[^0-9]
        boolean r2 = Pattern.matches("\b", "123"); // it means a word boundary
        boolean r3 = Pattern.matches("Amma", "Amma");// it means x occurs exactly n times
        // boolean r4 = Pattern.matches("x{5,}", "xxxxx");// it means x occurs n or ore
        // times
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}