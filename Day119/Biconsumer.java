import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Biconsumer {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (n1,n2)-> System.out.println(n2+n1);
        biConsumer.accept(200,100);

        BiFunction<String,String,Double> b = (n1,n2)->Double.parseDouble(n1)*Double.parseDouble(n2);
        Double str = b.apply("5.2","12.8");
        System.out.println(str);
    }
}
