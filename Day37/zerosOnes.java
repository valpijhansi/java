//given the elements in array contains 0's & 1's sort them without using Any sorting Algorithm
import java.util.*;
class ZeroOnes {
    public static void main(String args[]) {
        int a[] = { 1, 0, 1, 1, 0, 0, 1 };
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int zeros = a.length - sum;
        int ones = sum;
        int i;
        for (i = 0; i < zeros; i++) {
            a[i] = 0;
        }
        while (i < a.length) {
            a[i++] = 1;
        }
        System.out.print(Arrays.toString(a));
    }
}