import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class forEachUsingLambnda {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4,5,6);
        data.forEach(n-> System.out.println("Hey.........!"+n+n));
        Stream<Integer> stream = data.stream();

        Stream<Integer> stream1 = data.stream();
        stream.forEach(n-> System.out.println(n));
       // stream.forEach(n-> System.out.println(n)); when ever we print again stream with for each it throws an ecxeption
    }
}
