import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1000,2543,23464,5678,9021,2045);
        Stream<Integer> stream = data.stream();

        long count = stream.map(n -> n*n*n).count();
        System.out.println(count);
    }
}
