import java.util.Optional;

import static java.lang.Math.random;

public class optional {
    public static void main(String[] args) {
        Optional<String> res = randomString();
        System.out.println(res.toString().length());
        System.out.println("hello");

    }
    static Optional<String> randomString() {
        if(Math.floor(random()*5)==4)
            return null;
            else
                return Optional.ofNullable("Hey.........!");

    }
}
