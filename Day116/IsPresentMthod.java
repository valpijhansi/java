import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class IsPresentMthod
{
    public static void main(String[] args) {


        String name = "kishore";
        Optional<String> nameOptional = Optional.ofNullable(name);
        System.out.println(nameOptional.isPresent());
        if(!nameOptional.isPresent())
            System.out.println("name is Empty");
        else System.out.println(nameOptional.get());
    }

}
