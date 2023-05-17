import java.util.*;
public class sumOfTwoElements {
    public static void main(String[] args) {
        int a[] = {11,2,3,4,5,7,6,13,1};
        int target = 7;
        HashMap<Integer,String> set = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            set.put(a[i],"x");

        }
        for(var x : set.keySet()) {
            int cur = x;
            int reqTar = target - cur;
            if(set.containsKey(reqTar)){
                System.out.println(x+" + "+reqTar+" = "+target);
            }
        }
    }
}
