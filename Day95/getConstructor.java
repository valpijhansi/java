import java.lang.reflect.InvocationTargetException;

class getConstructor {
    public static void main(String args[]) throws IllegalAccessException,InvocationTargetException,NoSuchMethodException {
        Class c = Crane.class;
        for(var x : c.getConstructors()) {
            System.out.println(x.getName());
            System.out.println(x.getParameterCount());
        }
    }
}