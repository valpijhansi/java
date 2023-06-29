import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeClose {
    public static void main(String[] args) {
        IntStream intstream = IntStream.iterate(1, i ->i+1).limit(10);
        Stream<Integer> myIntegerStream = Stream.of(1,2,3,4,5);

        DoubleStream myDoubleStream = DoubleStream.of(10,20,30,40,50);

        IntStream intStream = IntStream.rangeClosed(1,10);//it gives a stream of values both the start and end values are inclusive
        intStream.forEach(n -> System.out.println(n));

    }
}
