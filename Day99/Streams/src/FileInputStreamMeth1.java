import java.io.FileInputStream;
import java.io.InputStream;
public class FileInputStreamMeth1{



        public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("rock1.txt");
            byte array[] = new byte[input.available()];
            input.read(array,3,5);
            System.out.println((char)(array[4]));
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

    }
}

