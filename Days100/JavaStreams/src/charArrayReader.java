import java.io.CharArrayReader;
import java.io.FileInputStream;

public class charArrayReader {
    public static void main(String[] args)throws Exception {
        char bytes[] = {'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader ch = new CharArrayReader(bytes);
        FileInputStream fi = new FileInputStream("man.txt");
        System.out.println((char)ch.read());
        System.out.println((char)ch.read());
        System.out.println((char)ch.read());
        ch.mark(2);//it defines that what ever we mark that can be execute upto that limit only
        System.out.println((char)ch.read());
        System.out.println((char)ch.read());
        ch.reset();//the rest method defines that it never go back where ever we mark from that place it will reset again
        System.out.println((char)ch.read());
        System.out.println((char)ch.read());
    }
}
