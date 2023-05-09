import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class scannerFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("git.txt"));
       int i = 0;
        while(scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(str);
            System.out.println(scan.next()+" ");
            i++;
        }
        System.out.println(i);
        scan.close();
    }
}
