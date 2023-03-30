
class Palindrome {
    public static void main(String args[]) {
        String str = "malayalam";
        System.out.println(palin_drome(str));
    }

    static boolean palin_drome(String str) {
        int n = str.length();
        if (n == 0 || n == 1)
            return true;
        if (str.charAt(0) != str.charAt(n - 1))
            return false;
        return palin_drome(str.substring(1, n - 1));
    }
}