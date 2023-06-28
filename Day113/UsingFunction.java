import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class UsingFunction {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1000,2543,23464,5678,9021);
        Stream<Integer> stream = data.stream();
        Function<Integer,Integer> fun = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer;
            }
        };
    }

}
