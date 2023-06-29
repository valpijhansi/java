import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Intstream {
    public static void main(String[] args) {
        IntStream intstream = IntStream.iterate(1,i ->i+1).limit(10);
        intstream.forEach(n-> System.out.println(n));

        Stream<Integer> myIntegerStream = Stream.of(1,2,3,4,5);
        //System.out.println(myIntegerStream);
        DoubleStream myDoubleStream = DoubleStream.of(10,20,30,40,50);

        int data[] = new int[100];
        for (int i = 0; i < data.length; i++) {
                 data[i] = i;
        }
        Arrays.stream(data);
    }
}
