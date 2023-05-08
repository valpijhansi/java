import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class filePrint {
    public static void main(String[] args) throws IOException {
        File f = new File("src/rock.txt");
        FileWriter f1 = new FileWriter(f,true);
        PrintWriter pw = new PrintWriter(f1);
        pw.println(1);
        pw.println("A");
        pw.println("luckySweety");
        pw.append("Anu");
        pw.print(true);
        pw.close();
    }
}
