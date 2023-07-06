import java.util.*;
import java.util.stream.Collectors;

public class HasSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,3,5,7,5,2);
      //list.stream().filter(f ->(f%2==0)).forEach(n -> System.out.println(n));
       Set<Integer> newset = list.stream().collect(Collectors.toSet());//Hash Set doesn't allow the duplicate values
        System.out.println(newset);
  }
}
