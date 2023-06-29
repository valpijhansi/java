import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        int data[] = {1,2,3,4};
        IntStream data1 = Arrays.stream(data);

        Integer data2[] = {1,3,5,6,7};
        Stream<Integer> s1 = Stream.of(data2);
        //s1.forEach(n -> System.out.println(n));

         int d = s1.map(n ->n+2).filter(n -> n%3==0).reduce(0,(a,b)->a+b);
        System.out.println(d);
        List<Integer> list =  Arrays.asList(1,2,3);
        Stream<Integer> stream = list.stream();
    }
}
