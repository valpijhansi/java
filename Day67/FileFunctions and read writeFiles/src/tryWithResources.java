import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class tryWithResources {
    public static void main(String[] args) {
        File f = new File("rock.text");
        System.out.println(f.canWrite());
        try {
            FileWriter f1 = new FileWriter(f);
            f1.write("123");
            f1.write("hello jaanu");
            f1.flush();
            f1.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
