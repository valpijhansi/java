import java.io.FileInputStream;
import java.io.SequenceInputStream;

class sequenceInputStream {



    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("mock.txt");
        FileInputStream fis1 = new FileInputStream("man.txt");
        SequenceInputStream sc = new SequenceInputStream(fis,fis1);
        int x;
        while((x=sc.read())!=-1)
        {
            System.out.print((char)x);
        }
        sc.close();
        fis.close();
        fis1.close();

    }
}
