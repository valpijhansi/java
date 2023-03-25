//Check weather given String Palindrome or not
class Plaindrome {
    public static void main(String args[]) {
        String str = "malayalam";
        String rev = "";
        String rev1 = "";
        for (int i = 0; i < str.length(); i++) {
            rev += str.charAt(str.length() - i - 1);
            // System.out.println(reverse);
        }

        System.out.println(rev);
        System.out.println();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev1 = rev1 + str.charAt(i);

        }
        if (str.equals(rev1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}