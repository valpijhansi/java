import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class arraysStream {
    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5};
        Stream<Integer> streamArray = Arrays.stream(array);

        List<Integer> list = List.of(21,25,30);
        Stream<Integer> streamfromList = list.stream();

        Stream<Integer> integerStream = list.parallelStream();
        System.out.println(IntStream.of(1,3,5,7,9).min());
    }
}
