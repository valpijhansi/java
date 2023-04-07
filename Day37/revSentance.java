
//reverse the String print middle element if it is odd otherwise print middle two elements
import java.util.*;

class RevSentence {
    public static void main(String args[]) {
        String str = "being alone is the best thing";
        int n = str.length();
        String str1 = "";
        int middle, len;
        char ch[] = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);
        }
        for (var x : ch) {
            System.out.print(x);

        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            str1 += str.charAt(str.length() - i - 1);
        }
        System.out.println(str1);
          
    }
}

            
        
    