import java.util.Optional;

public class optionalMethod {
    public static void main(String[] args) {
        String name = "kishore";
        Optional<String> nameOptional = Optional.ofNullable(name);
        nameOptional.ifPresent(n-> System.out.println(n));

        Optional<String> name1 = Optional.ofNullable("Jannu papa");
        name1.ifPresentOrElse((n-> System.out.println(n.length())),()-> System.out.println(0));



        String[] word = new String[10];
        Optional<String> checkNull = Optional.ofNullable(word[5]);
        if(checkNull.isPresent()) {
            String words = word[5].toLowerCase();
            System.out.println(word);
        }
        else
            System.out.println("Word is null");
    }
}
