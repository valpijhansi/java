import java.io.File;
public class AbsolutePath {
    public static void main(String[] args) {
        File file = new File("src/mock.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
    }
}
