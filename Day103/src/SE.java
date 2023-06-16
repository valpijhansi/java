import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SE {
    public static void main(String[] args)throws Exception {
        SoftwareEngineer se = new SoftwareEngineer();
        se.name = "Jhansi";
        se.age = 22;
        se.weight = 45;

        FileOutputStream fos = new FileOutputStream("hello.ser");
        ObjectOutputStream obj = new ObjectOutputStream(fos);
        obj.writeObject(se);

    }
}
class SoftwareEngineer implements Serializable {
    String name;
    int age;
    double weight;
    void sayHi() {
        System.out.println("hi"+this.name);

    }
}
