import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParllelStream {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = data.parallelStream();
        stream.forEachOrdered(System.out::println);

    }
}
