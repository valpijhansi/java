import java.lang.annotation.Target;
import  java.io.*;
public class   FileOutputStreamEx {

    public static void main(String[] args) {

        try {
            FileOutputStream output = new FileOutputStream("mock.txt");
            output.write(69);
            output.close();

        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }


}