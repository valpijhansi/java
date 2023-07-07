//Predicate is one of the functional interface it accepts any type of argument and returns the boolean value

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<String> predicate = str-> str.equals("hello");
        System.out.println(predicate.test("Hello"));

        Predicate<Integer> pridcate1 = value ->value <42/3*2;
        System.out.println(pridcate1.test(12));
    }
}
