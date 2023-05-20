import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PanCard {
    public static void main(String args[]) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String regex = "[A-z]{3}[PFCHAT][A-Z]{1}[0-9]{4}[A-Z]";
        boolean res;
        int wait = 1000;
        int start = 0;
        do {
            System.out.println("Enter your Pan Number : ");
            String input = scan.next();
            res = Pattern.matches(regex, input);
            if (res)
                System.out.println("your pan card number has been noted!");
            else
                System.out.println("Please enter the valid pan number");
            start++;
            if (start >= 5) {
                int time = wait / 1000;
                int time2 = time;
                for (int i = 0; i < time; i++) {
                    System.out.println("try again in" + time2 + "seconds");
                    time2--;
                    Thread.sleep(1000);
                }
                wait *= 2;

            }
        } while (!res);
    }
}