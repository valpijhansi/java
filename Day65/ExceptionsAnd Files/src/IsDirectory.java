import java.io.File;
public class IsDirectory {
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println(file.isDirectory());//src is a folder so that it prints true
        System.out.println(file.isFile());//it is not a file that's why it prints false
    }
}
