import java.util.Optional;

public class IsEmpty {
    public static void main(String[] args) {
        String name = "kishore";
        Optional<String> nameOptional = Optional.ofNullable(name);
        System.out.println("OptionalName"+nameOptional);
        if(nameOptional.isEmpty()) {
            System.out.println("Name is empty");
        }
        else {
            System.out.println(nameOptional.get());
        }
    }
}
