import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 25, 23, 56, 90, 20);
        Stream<Integer> stream = data.stream();
        Integer s = stream.map(n->n*n).reduce(0,(ans,i)-> ans+i);
        System.out.println(s);

    }
}
