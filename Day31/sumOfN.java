
//finding sum of N natural numbers using recursion.
import java.util.*;

class sumOfNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the number:");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println(result);
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        int k = n + sum(n - 1);
        return k;
    }
}