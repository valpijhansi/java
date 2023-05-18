
import java.util.*;

public class HashSetFunctions {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);

        set.add(20);

        set.add(30);

        set.add(40);

        System.out.println(set);

        System.out.println(set.size()); // it returns the size of the set

        System.out.println(set.contains(30)); // checks if the element contains in set or not and return boolean values

        System.out.println(set.isEmpty()); // checks whether the set is empty or not and returns boolean values

        set.remove(40); // it removes the specified element from the set

        System.out.println(set);

        set.clear();

        System.out.println(set);
    }
}
