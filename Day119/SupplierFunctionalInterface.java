import java.util.function.Supplier;

// * supplier can be used to produce a value
// * it does not accept any argument
// * but it produces a result of any type of data
public class SupplierFunctionalInterface {
    public static void main(String[] args) {

        Supplier<String> supplier = ()->"can be used to produce a value";
        System.out.println(supplier.get());
        System.out.println(supplier.getClass());
        System.out.println(supplier.equals("hello"));

    }
}
