import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class setMethod {
    public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Crane c = new Crane();
        Method[] methods = c.getClass().getDeclaredMethods();
        for(Method x : methods) {
            if(x.getName().equals("rocks")) {
                x.setAccessible(true);
                x.invoke(c,args, "janu");
                
            }
           System.out.println(x);
        }

    }
}