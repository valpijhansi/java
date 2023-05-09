import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("git.txt");
        FileReader reader = new FileReader(file);
        int x = reader.read();
        while(x!=1) {
            System.out.println((char)x);
            x = reader.read();

        }
        reader.close();
    }
}
