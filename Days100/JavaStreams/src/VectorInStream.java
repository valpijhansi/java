import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class VectorInStream {
    public static void main(String[] args)throws Exception {
        FileInputStream f = new FileInputStream("mock.txt");
        FileInputStream f1 = new FileInputStream("rock.txt");
        FileInputStream f2 = new FileInputStream("man.txt");
        Vector v = new Vector();
        v.add(f);
        v.add(f1);
        v.add(f2);
        Enumeration e  = v.elements();
        SequenceInputStream sc = new SequenceInputStream(e);
        int i = 0;
        while((i=sc.read())!=-1) {
            System.out.print((char)i);
        }
        sc.close();
        f.close();
        f1.close();
        f2.close();

    }
}
