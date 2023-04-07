
//Arrange the N elements into an Array
import java.util.Arrays;

class NumArray {

    public static void main(String args[]) {
        int n = 11;
        int a[] = new int[n];
        int start = 1;
        int i;
        for (i = 0; i <= n / 2; i++) {
            if (start < n) {
                a[i] = start;
                start += 2;

            } else
                break;

        }
        a[i] = n;
        if (n % 2 == 0)
            start = n - 2;
        else
            start = n - 1;
        for (int j = i + 1; j < n; j++) {
            a[j] = start;
            start -= 2;
        }

        System.out.print(Arrays.toString(a));
    }

}