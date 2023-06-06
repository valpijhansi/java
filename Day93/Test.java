import java.util.*;
import java.io.*;
class Test {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("jaanu");
        list.add("loki");
        list.add("munnu");
        Collections.sort(list,String::compareToIgnoreCase);
        list.forEach(System.out::println);
    }
}