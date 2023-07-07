import java.util.function.Consumer;

// * The person who consumes something and  returns nothing is called consumer
// * In other words it can takes any type of data and nothing to be return
public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<Integer> consumer = value -> System.out.println(value+value+" paid");
        consumer.accept(400);
        Consumer<String> consumer1 = element-> System.out.println(element.equals("hello...janu"));
        consumer1.accept("hello...janu");
        consumer1.accept("hey..papa");
    }
}
