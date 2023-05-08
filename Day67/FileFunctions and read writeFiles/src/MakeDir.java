import java.io.File;
import java.util.Arrays;

public class MakeDir {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\DELL\\Documents\\GitHub\\java\\Day67\\FileFunctions and read writeFiles\\src\\textFile");
       f.mkdir();
       File f1 = new File("C:\\Users\\DELL\\Documents\\GitHub\\java\\Day67\\FileFunctions and read writeFiles\\src");
        System.out.println(Arrays.toString(f1.list()));//it returns the all files which are in src folder.
    }
}
