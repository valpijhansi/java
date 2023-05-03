import java.util.*;

class ExcHandling {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a);// when ever we print the value of a is String it will out as
                              // inputmismatchException
                              // because a value is integer
    }
}
