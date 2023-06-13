import java.io.ByteArrayInputStream;

public class byteArray {
    public static void main(String[] args) {
        byte b[] = {'l','o','k','e','s','h'};
        byte b1[] = {76,79,75,69,83,72};
        ByteArrayInputStream bi = new ByteArrayInputStream(b);
        String str = new String((bi.readAllBytes()));
        System.out.println(str);
//        System.out.println(bi.read());
//        System.out.println(bi.read());
    }
}
