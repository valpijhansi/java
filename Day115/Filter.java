import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        int data[] = {1,2,3,4};
        IntStream data1 = Arrays.stream(data);

        Integer data2[] = {1,3,5,6};
        Stream<Integer> s1 = Stream.of(data2);
       // s1.forEach(n -> System.out.println(n));
      Set d = s1.map(n ->n+2).filter((n ->n%3==0)).collect(Collectors.toSet());
        System.out.println(d.contains(7));//if the set contains the given element it returns true otherwise false

    }
}
