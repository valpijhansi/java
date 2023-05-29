import javafx.util.Pair;
import java.util.*;

class PairClass {
    public static void main(String args[]) {
      char grade[] = {'A','B','A','C','O','D'};
      String names[] = {"sunny","munny","junnu","chinnu","jemmy","lavs"};
      ArrayList<Pair<String,Character>> list = new ArrayList<>();
      for(int i=0;i<grade.length;i++) {
        Pair<String,Character> p = new Pair(names[i],grade[i]);
      }
      System.out.println(list.toString());
    }
}