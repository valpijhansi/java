import java.util.StringJoiner;
import java.util.*;
class stringjoiner1 {
    public static void main(String args[]) {
        String str = "Can not able to hidden three things sun moon and truth";
        StringTokenizer s = new StringTokenizer(str," ");
        List<String> list = new ArrayList<>();
        while(s.hasMoreTokens()) 
        list.add(s.nextToken());
        StringJoiner sj = new StringJoiner(" ");
        for(var k : list){
            sj.add(k);
        }
        String x = String.valueOf(sj);
        String x1 = sj.toString(); 
        System.out.println(sj);
        System.out.println(x);
        System.out.println(x1);
        
    }
}