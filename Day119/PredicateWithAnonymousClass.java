import java.util.function.Predicate;

public class PredicateWithAnonymousClass {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return true;
            }

        };
        System.out.println( predicate.test(50));

    }
}
