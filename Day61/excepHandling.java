import java.util.*;

class excepHandling {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        try {
            age = sc.nextInt();

        } catch (Exception e) {
            System.out.println(e);//when ever we print the e it gives output but also shows an exception when we give a mismatch value
        }
        int c = 25 + 60;
        System.out.println(c);
    }
}