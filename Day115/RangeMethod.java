import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeMethod {
    public static void main(String[] args) {
        IntStream intstream = IntStream.iterate(1, i ->i+1).limit(10);
        Stream<Integer> myIntegerStream = Stream.of(1,2,3,4,5);

        DoubleStream myDoubleStream = DoubleStream.of(10,20,30,40,50);

        IntStream intstreamRange = IntStream.range(1,20);//it can print the values of a stream it with inclusive of start and exclusive second in the given range
        intstreamRange.forEach(n-> System.out.println(n));

    }
}
