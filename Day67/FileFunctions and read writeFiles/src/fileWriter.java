import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("src/jocker.java");

        file.createNewFile();
        FileWriter f = new FileWriter(file);
        f.write("hello lucky");

        f.close();
    }
}
