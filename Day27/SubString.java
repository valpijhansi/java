
//finding subString in given String
class SubString {
    public static void main(String args[]) {
        String str = "sweety";
        String str1 = "tee";
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1.charAt(0)) {
                int k = i + 1;

                for (int j = 1; j < str1.length(); j++) {
                    if (str1.charAt(j) != str.charAt(k))
                        c++;
                }
                k++;
            }
            if (c == 0) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}