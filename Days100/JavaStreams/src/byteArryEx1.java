import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class byteArryEx1 {
    public static void main(String[] args)throws Exception{
        byte b[] = {'l','o','k','e','s','h'};
        byte b1[] = {76,79,75,69,83,72};
        ByteArrayInputStream bi = new ByteArrayInputStream(b1);
        FileInputStream fis = new FileInputStream("man.txt");
        System.out.println((char)bi.read());
        System.out.println((char)bi.read());
        bi.mark(2);//it defines that what ever we mark that can be execute upto that limit only
        System.out.println((char)bi.read());
        System.out.println((char)bi.read());
        bi.reset();//the rest method defines that it never go back where ever we mark from that place it will reset again
        System.out.println((char)bi.read());
        System.out.println((char)bi.read());


    }
}
