import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    private static Object invoke;

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Fun h = new Fun("virat"); 
        Class c = h.getClass();

        if (h.getClass().isAnnotationPresent(VIP.class)) {

            Method[] methods = h.getClass().getDeclaredMethods();
            System.out.println("yes");

            Annotation a = c.getAnnotation(VIP.class);
        VIP priority = (VIP) a;
        System.out.println(priority.rating());
        for(var x : h.getClass().getAnnotations()){
            System.out.println(x);
        }
            


            for (Method x : methods) {
                for (int i = 0; i < priority.rating(); i++) {
                    if (x.getName().equals("print")) {
                        invoke = x.invoke(h,null);

                        if (priority.star().equals("scorpio")) {
                            System.out.print("*_*");
                        }

                      


                    }
                }
            }
        }
    }

}
