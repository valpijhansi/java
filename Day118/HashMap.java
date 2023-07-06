import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ragini","Kavitha","Icecream");
        String str  = list.stream().map(e->e).collect(Collectors.joining("*"));
        System.out.println(str);

        Map<String,Integer> list1 = list.stream().collect(Collectors.toMap(n1 -> n1, n2 -> n2.length()));
        System.out.println(list1);
    }
}
