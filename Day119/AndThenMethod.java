import java.util.function.Consumer;

public class AndThenMethod {
    public static void main(String[] args) {
        Consumer<Integer>consumer = value-> System.out.println(value+40);
        Consumer<Integer>consumer1 = value-> System.out.println(value-10);
        consumer1.andThen(consumer).accept(30);
    }
}
