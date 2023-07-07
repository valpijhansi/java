import java.util.function.IntConsumer;

public class Intconsumer {
    public static void main(String[] args) {
        IntConsumer intconsumer = value -> System.out.println(value);
        intconsumer.accept(20);
    }
}
