import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
public class FileInputStreamEx1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("man.txt");
        FileInputStream fis2 = new FileInputStream("mock.txt");
        FileOutputStream fos = new FileOutputStream("rock.txt");
        int x = fis.available();
        while(x-->0){
            char y = (char)fis.read();
            if(y==' ')
                fos.write(y);
            else
                fos.write(y-32);
        }
        int y = fis2.available();
        while(y-->0) {
            char z = (char)fis2.read();
            if(z== ' ')
                fos.write(y);
            else
                fos.write(y-32);
        }
        fis.close();
        fis2.close();
        fos.close();
    }
    }

