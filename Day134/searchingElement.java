import java.util.Scanner;

public class searchingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int [n];
        int target = 5;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        searchingAnElement(ar,target);

        firstIsGreaterThanSecond(ar);
    }
    static void searchingAnElement(int ar[],int target){
        for (int i = 0; i < ar.length; i++) {
            for(int j=i+1;j<ar.length-1;j++){
                if(ar[i]+ar[j]==target){
                    System.out.println(ar[i]+"+"+ar[j]+"="+target);
                }
            }

        }

    }
    private static void firstIsGreaterThanSecond(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            for(int j=i+1;j<ar.length-1;j++){
                if(ar[i]>ar[j]||ar[i]<ar[j]){
                    System.out.println(ar[i]+" "+ar[j]);
                }
            }

        }

    }

}
