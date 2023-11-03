import java.util.Arrays;
import java.util.Scanner;

public class mergingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int arr1[] = new int[n];
        for (int j = 0; j < arr1.length ; j++) {
            arr1[j] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mergeArrays(arr, arr1)));
    }

    static int[] mergeArrays(int arr[], int arr1[]) {
        int res[] = new int[arr.length + arr1.length];
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = arr1[j++];
            }
        }
        while (i < arr.length) {
            res[k++] = arr[i++];
        }
        while (j < arr1.length) {
            res[k++] = arr1[j++];
        }
        return res;
    }
}
