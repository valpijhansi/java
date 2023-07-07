// * unaryOpertator takes one argument and returns a result of the same type of it's argument

import java.util.function.*;
public class unaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> converter = str->str.toUpperCase();
        System.out.println(converter.apply("haritha"));
    }
}
