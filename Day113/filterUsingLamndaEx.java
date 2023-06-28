import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class filterUsingLamndaEx {


    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1000, 2543, 23464, 5678, 9021, 2045);
        Stream<Integer> stream = data.stream();
        Predicate<Integer> predicate = n -> n % 2 == 0;


        Stream<Integer> list = stream.filter(predicate);
        list.forEach(System.out::println);

    }
}



