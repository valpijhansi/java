import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class bufferedReaderClass {
    public static void main(String[] args)throws Exception {
        FileInputStream f = new FileInputStream("man.txt");
        BufferedInputStream bi = new BufferedInputStream(f);
        System.out.println((char)bi.read());
        System.out.println((char)bi.read());
        bi.mark(2);//it defines that what ever we mark that can be execute upto that limit every time within the limit only
        System.out.println((char)bi.read());
        System.out.println((char)bi.read());
        bi.reset();//the rest method defines that it never go back where ever we mark from that place it will reset again
        System.out.println((char)bi.read());
        System.out.println((char)bi.read());
    }
}
