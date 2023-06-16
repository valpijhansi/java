import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SE1 {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("hello.ser");
        ObjectInputStream bis = new ObjectInputStream(fis);
        SoftwareEngineer se1 = (SoftwareEngineer) bis.readObject();
        System.out.println(se1.age);
        System.out.println(se1.name);
        System.out.println(se1.weight);
        se1.sayHi();
        System.out.println(se1);
        System.out.println(se1.getClass());
    }
}
