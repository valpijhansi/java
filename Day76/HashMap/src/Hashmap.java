import java.util.*;
public class Hashmap<I extends Number, I1 extends Number> {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(11,"Rani");
        map.put(33,"Raja");
        map.put(45,"lokesh");
        System.out.println(map);
        System.out.println(map.get(33));//it returns the value of given key
    }
}
