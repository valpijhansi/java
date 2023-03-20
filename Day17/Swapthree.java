
//swapping three numbers without using another variable
import java.util.*;

class Swapthree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("first value before swapping:" + a);
        System.out.println(" second value before swapping:" + b);
        System.out.println("third value before swapping:" + c);
        b = a + b + c;
        a = b - (a + c);
        c = b - (a + c);
        b = b - (a + c);
        System.out.println("value after swapping:" + a);
        System.out.println("value after swapping:" + b);
        System.out.println("value after swapping:" + c);
    }
}