import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.*;

public class Rock {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("/home/jhansi/Documents/GitHub/java/Day102/rock.txt");
       // BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fos));
        DataOutputStream dis = new DataOutputStream(fos);
        System.out.println();
        dis.writeInt(65);
        dis.writeUTF("Jaanu");
        dis.writeDouble(20.5);

        dis.close();
        fos.close();

    }
}
