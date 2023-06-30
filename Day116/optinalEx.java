import java.util.Optional;
public class optinalEx {
    public static void main(String[] args) {
        String name = null;
        String name1 = "Rock";
        Optional<String>nameOptional = Optional.ofNullable(name);
        Optional<String>Name = Optional.ofNullable(name1);
        System.out.println(nameOptional);
        System.out.println(Name.get());
    }
}
