//finding Unique Character
class Unique {
    public static void main(String args[]) {
        String s = "thoughts";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            int c = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;
                }
            }
            if (c != 1) {
                s1 += s.charAt(i);

            }
        }

        int s2 = 0;
        for (int i = 0; i < s1.length(); i++) {//s1="thht",s="thoughts"
            if (s1.charAt(s2) != s.charAt(i))//compare s1&s if it is not equal
                System.out.print(s1.charAt(i)); //it prints index of s1
            s2 = i;//assign i value to s2
        }

    }
}