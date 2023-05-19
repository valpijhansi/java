import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex1 {
    public static void main(String args[]) {
        boolean r = Pattern.matches("x?", "x");// x occurs once or not at all
        boolean r1 = Pattern.matches("x*", "xxaxxx");// x occurs zero or more times
        boolean r2 = Pattern.matches("x+", "xaxbxx"); // x occurs one or more times
        boolean r3 = Pattern.matches("x{4}", "xxxx");// it means x occurs exactly n times
        boolean r4 = Pattern.matches("x{5,}", "xxxxx");// it means x occurs n or ore times
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}