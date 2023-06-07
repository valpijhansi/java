import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class RetentionAnnotation {
    public static void main(String args[]) {
        int x = 10;
        System.out.println(x);

    }
}
@VIP
enum Sizes {
    SMALL,LARGE;
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VIP {

    }