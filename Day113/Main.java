import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8);
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("rock "+integer);

            }
        };

        data.forEach(consumer);
    }
}
