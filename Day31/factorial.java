
//finding factorial of a number using recursive function
import java.util.*;

class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        int res = fac_t(n);
        System.out.println(res);

    }

    static int fac_t(int n) {
        if (n == 1)
            return 1;
        return n * fac_t(n - 1);
    }
}