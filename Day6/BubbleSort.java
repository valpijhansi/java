import java.util.Arrays;

class BubbleSort {
    public static void main(String args[]) {
        int a[] = new int[] { 6, 8, 3, 2, 7 };
        int n = a.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }

}
