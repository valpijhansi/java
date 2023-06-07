import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CustomAnnotation {
    public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mock m = new mock();
        boolean res = m.getClass().isAnnotationPresent(VIP.class);
        System.out.println(res);
     if(res) {
        for(Method x : m.getClass().getMethods()) {
            if(x.getName().equals("print")){
                var k =x.invoke(m,args,null);
                System.out.println(k);
                //System.out.println(x);

            }
            for(Method a : m.getClass().getMethods()) {
                System.out.println(a);
            }
        }
     }



        Rock r = new Rock();
        boolean res1 = r.getClass().isAnnotationPresent(VIP.class);
        System.out.println(res1);


    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface VIP {
    
}
@VIP
class mock {
    String name;
    mock(String name){
        this.name = name;

    }
    mock(){

    }

}
class Rock {
    String name;
    Rock(String name) {
        this.name = name;
    }
    Rock() {

    }

}