import java.util.Arrays;

class Anagram {
    public static void main(String args[]) {
        String s1 = "keep";
        String s2 = "peek";
        if (s1.length() != s2.length()) {
            System.out.print("Not a anagram");
        }
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.print("Not a anagram");
                return;
            }
        }
        System.out.print("Anagram");
    }
}