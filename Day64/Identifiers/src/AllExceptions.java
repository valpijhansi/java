import java.util.*;

public class AllExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        duck d = new duck();
        int a[] = new int[5];
        String s1 = null;

        int start = 0;
        try {
            int x = Integer.parseInt(d.s2);
            start = 1;
            int y = a[7];
            start = 2;
            int z = 5 / sc.nextInt();
            start = 3;
            s1.length();

        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException
                | NullPointerException e) {
            if (start == 0)
                System.out.println("Num format excep");
            if (start == 1)
                System.out.println("arithmeticException");
            if (start == 2)
                System.out.println("index out of bound Exception");
            if (start == 3)
                System.out.println("NullPointerException");

        }
    }
}

class duck {
    String s2 = "123";
    int x = 0;

}
