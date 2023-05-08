
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class HiddenFile {
    public static void main(String[] args) throws IOException {
        File f = new File("git.txt");
        f.createNewFile();

        System.out.println(f.isHidden());//it checks the given file is hidden or not and returns boolean value.
        System.out.println(f.canExecute());//it checks whether the given file is execute or not
        System.out.println(f.canRead());//it checks the given file readable or not and returns boolean value
        System.out.println(f.canWrite());//it checks the given file is writeable or not
        System.out.println(new Date(f.lastModified()));//it returns the last modified time of the given file

    }
}
