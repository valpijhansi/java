import java.util.Arrays;
import java.util.List;


public class genericLowerBound {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("banana","apple","grapes","orange");

        System.out.println(fruits);

        List<Number> list = Arrays.asList(25,35,45,65);

        System.out.println(list);
    
    }

    public static void numbers(List<? super Number> t) { //here question mark(?), represents the wildcard,stands for unknown type in generics.
                                                         // for lower bound generics we have to use (?) follwed by super keyword.

        System.out.println(t);
    }
}