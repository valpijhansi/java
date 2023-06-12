package bird;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileStreamToUpperCase{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileInputStream input = new FileInputStream("mock.txt");
            System.out.println("enter the name of your copy");
            String str = sc.next();
            FileOutputStream outputStream = new FileOutputStream(str+"mock.txt");
            byte a[] = new byte[input.available()];
            input.read(a);
            String s = new String(a); 
            System.out.println(str);
            String str1 = str.toUpperCase(); 
            System.out.println(str1);

            byte s1[] = str1.getBytes(); 
            outputStream.write(s1); 
            input.close();
            outputStream.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}