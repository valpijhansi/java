import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {




    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1000,2543,23464,5678,9021,2045);
        Stream<Integer> stream = data.stream();
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if(n%2==0)
                    return true;
                return false;

            }
        };
        Stream<Integer> list = stream.filter(predicate);
        list.forEach(System.out::println);

//        List lis = stream.map(n -> n*n).collect(Collectors.toList());
//        System.out.println(list);
    }
}
