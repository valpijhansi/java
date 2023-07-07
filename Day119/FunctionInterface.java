
// * function can be used to transform an input value
// * it accepts of an argument of any type of data
// * transfrom it and returns a result


import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<String,Integer> function = str->str.length();
        System.out.println(function.apply("Hello"));

        Function<Character,Integer> function1 = character -> character*2;
        System.out.println(function1.apply('b'));
    }
}
