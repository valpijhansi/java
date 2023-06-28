import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Fun {
        public static void main(String[] args) {
            List<Integer> data = Arrays.asList(1000,2543,23464,5678,9021);
            Stream<Integer> stream = data.stream();
            Function<Integer,Integer> fun = n -> n+5 ;
             Stream integerStream = stream.map(fun);
             integerStream.forEach(System.out::println);
        }

    }


