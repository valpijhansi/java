import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("rock.text");
        if(file.exists()){
            System.out.println("file already exists");
            System.out.println("Delete the file");
            file.delete();
        }
        else {
            System.out.println("file is not there");
            System.out.println("create the file");
            file.createNewFile();
            System.out.println("file has been created successfully");
        }
    }
}
