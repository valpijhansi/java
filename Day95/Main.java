import java.lang.reflect.Field;
import java.lang.reflect.Method;


class Main {
    public static void main(String args[]) {
        Crane c = new Crane();
         Field[] fields = c.getClass().getDeclaredFields();
         for(Field f  : fields) {
            System.out.println(f);
         }

         Method[] methods = c.getClass().getDeclaredMethods();
         for(Method x : methods) {
            System.out.println(x);
         }

         
         
    }   

}