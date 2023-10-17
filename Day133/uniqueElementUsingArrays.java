import java.util.Arrays;

public class uniqueElementUsingArrays {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,6,8,7,9,5,4,2,2};
        int count = 1;
        int max = 0;
        int element = 0;
        Arrays.sort(arr);
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else {
                if(count>max){
                    max = count;
                    element = arr[i];
                }
            }
        }
        System.out.println(element);
    }
}
