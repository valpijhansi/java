
//merging of two arrays
import java.util.Arrays;

class mergeArr {
    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 7 };
        int b[] = { 2, 4, 6, 8, 10 };
        int i, j, k;
        int c[] = new int[a.length + b.length];
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (j = i, k = 0; j < a.length + b.length; j++) {
            c[j] = b[k++];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

    }
}