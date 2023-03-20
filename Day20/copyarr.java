
//sum of two arrays and copying into another array
import java.util.Arrays;

class copyArr {
    public static void main(String args[]) {
        int a[] = { 2, 4, 5, 6 };
        int b[] = { 3, 6, 8, 9 };
        int max = a.length > b.length ? a.length : b.length;
        int c[] = new int[max];
        int i, j, k;
        i = a.length - 1;
        j = b.length - 1;
        k = 0;
        int sum = 0;
        int z = 1;
        while (i >= 0 && j >= 0) {
            sum = a[i] + b[j] + k;
            c[max - z] = sum % 10;
            k = sum / 10;
            z++;
            i--;
            j--;
        }
        System.out.println(Arrays.toString(c));
    }
}