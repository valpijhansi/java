 import java.io.FileInputStream;
import java.io.InputStream;
 public class Method2{


    public static void main(String[] args) {

        try {
            InputStream input = new FileInputStream("rock1.txt");
            byte array[] = new byte[input.available()];
            input.skip(4);
            System.out.println((char)input.read());
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        try {
            InputStream input = new FileInputStream("rock1.txt");
            int data = input.read();
            while(data!=-1) {
                System.out.print((char)data);
                data = input.read();
            }
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}

