import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriteAppend {
    public static void main(String[] args) throws IOException {
        File file = new File("mock.txt");
        FileWriter f = new FileWriter(file,true);
        f.write("\nJaanu come here");
        f.close();
    }
}
