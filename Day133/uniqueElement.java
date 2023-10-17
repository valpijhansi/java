import java.util.Arrays;

public class uniqueElement {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5,6,7,8,2,3,4};
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
        //System.out.println(arr[arr.length-1]);

    }
}
