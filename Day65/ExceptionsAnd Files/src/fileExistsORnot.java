import java.io.File;
import java.io.IOException;

public class fileExistsORnot {
    public static void main(String[] args) throws IOException {
        File file = new File("mock.txt");
        if(file.exists()){
            System.out.println("file Already exists");

        }
        else {
            file.createNewFile();
        }
    }
}
