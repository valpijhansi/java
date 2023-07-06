import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,25,13,34,6,7,7,40,20);

        List<String> list1 = Arrays.asList("Ragini","Kavitha","Vinay","Mukesh");
        System.out.println( list.stream().map(e->e*e).collect(Collectors.toList()));

        System.out.println(list.stream().map(n->n+n).collect(Collectors.toSet()));

    }
}
