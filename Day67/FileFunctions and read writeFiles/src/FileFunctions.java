import java.io.File;
import java.io.IOException;

public class FileFunctions {
    public static void main(String[] args) throws IOException {

        File f = new File("src/rock.txt");
        f.createNewFile();
        File f1 = new File("src/boon");
        File f2 = new File("src/mock.txt");
        f2.createNewFile();
        f1.createNewFile();
        System.out.println(f.length()/1000.0);
        System.out.println(f.isFile());//it checks that given one is file or not returns boolean value.
        System.out.println(f1.isFile());
        System.out.println(f.isDirectory());//it checks that given one is Directory or not and returns boolean value
        System.out.println(f1.isDirectory());
        System.out.println(f.getAbsolutePath());//it returns the entire path of the given file
        System.out.println(f.getName());//it returns name of the file
        System.out.println(f2.exists());//it checks wether given file exists or not
        System.out.println(f.compareTo(new File("src/mock.txt")));//it checks whether given file contents are equal or not ,if f is equal to f2 returns 0,f>f2 it returns positive value and viceversa
        System.out.println(f1.equals("nick.txt"));//it checks if two files are equal or not and returns boolean value
        f1.renameTo(new File("nick.txt"));//it change the name of the file.
    }
}
