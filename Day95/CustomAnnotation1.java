//import java.lang.annotation.Annotation;
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
class CustomAnnotation1 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        mock m = new mock("mock");
        for(Method a : m.getClass().getDeclaredMethods());
        if(m.getName().equals("print")) {
            m.invoke(m);
        }
        else {
            System.out.println("You entered a invalid coice");
        }

    }
}
class mock {
    String name;
    mock(String name){
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void invoke(mock m) {
    }
    mock(){


    }
    void printVIP() {
        System.out.println(name.toUpperCase());
    }

    void print() {
        System.out.println(name);
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