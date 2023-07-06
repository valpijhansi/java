import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class reduceMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,6,7,8);
     int res =   list.stream().reduce(0,((integer, integer2) -> integer+integer2));
        System.out.println(res);

    }
}
