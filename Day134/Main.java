import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        allPairs(arr);

    }

  static  void allPairs(int arr[]){
        for (int i = 0; i < arr.length-1 ; i++) {
            for(int j=i+1;j<arr.length-1;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
