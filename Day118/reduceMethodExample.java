import java.util.Arrays;
import java.util.List;

public class reduceMethodExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("R","I","S","H","I");
        String  res = list.stream().reduce("Hello",(str1,str2)->str1+str2);
        System.out.println(res.equals("HelloRISHI"));
        System.out.println(res);
        System.out.println(res.length());
        System.out.println(res.toUpperCase());
        System.out.println(res.charAt(4));
        System.out.println(res.contains("I"));
        System.out.println(res.endsWith("H"));
    }
}
