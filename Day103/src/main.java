import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.*;

public class main {
    public static void main(String[] args)throws IOException {
        FileInputStream fos = new FileInputStream("/home/jhansi/Documents/GitHub/java/Day102/rock.txt");
       // BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fos));
        DataInputStream dis = new DataInputStream(fos);
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());

        dis.close();
        fos.close();




    }
}
