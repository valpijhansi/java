import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    public static void main(String args[]) {
        Pattern mobile = Pattern.compile("..........");
        Scanner sc = new Scanner(System.in);
        Matcher matcher;
        do {
            System.out.println("Enter your phone no :");
            String contactNum = sc.next();
            matcher = mobile.matcher(contactNum);
        } while (!matcher.matches());
        System.out.println("Finally you entered a right number");
    }
}
