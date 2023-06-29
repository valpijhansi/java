import java.util.List;

public class findAny {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list.stream().findAny());
        System.out.println(list.parallelStream().findAny());
    }
}
