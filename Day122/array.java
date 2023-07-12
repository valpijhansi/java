import java.util.Arrays;
import java.util.Scanner;

public class array {
    int arr[] = new int[5];
    

    public void  Fill() {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = scan.nextInt();
            Arrays.fill(arr, i);
            Arrays.fill(arr,1);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        array a1 = new array();
        a1.Fill();
    }
    
}
