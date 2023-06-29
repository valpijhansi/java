import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MinAndMax {
    public static void main(String[] args) {
        OptionalInt min = OptionalInt.of(IntStream.of(1,2,3,4,5).min().orElse(0));
        System.out.println(min);

        OptionalDouble avg = OptionalDouble.of(DoubleStream.of(2,4,6,8).average().orElse(0));
        System.out.println(avg);
        System.out.println(avg.getAsDouble());

        OptionalLong max = LongStream.of(1,2,3,4,5).max();
        System.out.println(max);
        System.out.println(max.getAsLong());

        List<Integer> list = List.of(1,2,3,4);
        Optional<Integer> listmin = list.stream().min(Comparator.naturalOrder());
        listmin.stream().forEach(System.out::println);

        if(max.isPresent())
            System.out.println(max.getAsLong());
        else
            System.out.println("value is not present");





    }
}
