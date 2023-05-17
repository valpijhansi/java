import java.util.*;
public class HashmapOperations {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(11,"Rani");
        map.put(33,"Raja");
        map.put(45,"Lokesh");
        map.put(12,"Jaanu");//it adds an element into map
        System.out.println(map.size());//it returns the size of the map
        System.out.println(map.containsKey(11));//it returns true while the element present in map otherwise false
        System.out.println(map.containsValue("loki"));//it returns true while the value present in map otherwise false.
        map.remove(45);//it removes the key and it's respective value in the map
        map.clone();//Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
        System.out.println(map.entrySet());//returns the set view of the mappings conatained in this map
        System.out.println(map.get(12));//returns the value to which  the specified key is mapped,or null if the map contains no mapping for the key
        System.out.println(map.isEmpty());//it checks the elements present in map and returns boolean value
        System.out.println(map.keySet());// it returns the set view of the keys contained in this map
        System.out.println(map.hashCode());//it returns hashcode
        System.out.println(map.putIfAbsent(10,"kavya"));

        System.out.println(map);
    }
}
