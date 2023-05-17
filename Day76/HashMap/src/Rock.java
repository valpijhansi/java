import java.util.*;
public class Rock {
    public static void main(String[] args) {
    //    HashMap<Integer,String> map = new HashMap<Integer,String>();
        int a[] = {11,2,3,4,5,6,1,13};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            if(!map.containsKey(a[i])) {
                map.put(a[i], 1);

            }
            else {
                int preValue = map.get(a[i]);
                map.put(a[i], preValue+1);
            }
        }
        int count = -1;
        int key = -1;
        for(var x: map.entrySet()){
            if (x.getValue()>count) {
                count = x.getValue();
                key = x.getKey();
            }
        }
        System.out.println(key);
        System.out.println(map);

    }
}
