import java.util.Scanner;

public class secondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        secondLargestNum(arr);

    }
     static int first = 0;
    static int second = 0;

     static int secondLargestNum(int arr[]) {
         int[] res = new int[arr.length];
         int i;
         for (i = 0; i < arr.length; i++) {
             if (arr[i] > first) {
                 second = first;
                 first = arr[i];
             } else if (arr[i] > second) {
                 second = first;
             }

         }

         return res[arr.length];
     }


}
