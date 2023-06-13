import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class byteArrayEx {
    public static void main(String[] args)throws Exception {
        byte b[] = {'l','o','k','e','s','h'};
        byte b1[] = {76,79,75,69,83,72};
        ByteArrayInputStream bi = new ByteArrayInputStream(b1);
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        bo.write('a');
        FileOutputStream fos  = new FileOutputStream("rock.txt");
        FileOutputStream fos1 = new FileOutputStream("mock.txt");
        bo.flush();//it will erase all the contents in the file
        bo.close();
        fos.close();
        fos1.close();

    }
}
