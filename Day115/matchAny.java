import java.util.List;

public class matchAny {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list.stream().anyMatch(e -> e>10));
        System.out.println(list.stream().allMatch(e -> e>0));
        System.out.println(list.stream().noneMatch(e -> e<0));
    }
}
