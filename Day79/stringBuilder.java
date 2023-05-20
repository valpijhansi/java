import java.util.*;

class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("d");
        StringBuilder s1 = new StringBuilder("jaanulucky");

        sb.replace(1, 3, "rock");
        System.out.println(sb);
        System.out.println(s1.delete(2, 4));
        System.out.println(s1.setCharAt(1, 'm'));
    }
}