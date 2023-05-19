import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class password {
    public static void main(String args[]) {
        Pattern p1 = Pattern.compile("........");
        Matcher password = p1.matcher("jaanulke");
        if (password.matches()) {
            System.out.println("Strong password");
        } else {
            System.out.println("It should be eight characters");
        }

    }
}