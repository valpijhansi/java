import java.lang.annotation.Annotation;
import java .lang.annotation.*;
class getAnnotation {
    public static void main(String args[]) {
        Crane c = new Crane();
        Annotation[] a = c.getClass().getAnnotations();
         for(Annotation n : a) {
            System.out.println(n);
         }
    }
}