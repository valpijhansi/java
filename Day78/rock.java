import java.util.regex.Matcher;
import java.util.regex.Pattern;

class rock {
    public static void main(String args[]) {
        boolean res = Pattern.matches("[a-zA-Y]", "B");
        boolean res1 = Pattern.matches("[abcdfgh]^[23]","a3");
        System.out.println(res1);
        System.out.println(res);
    }
}