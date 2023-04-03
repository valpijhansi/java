//count recursively the total no.of "abc"&"aba" substrings that apper in the given substrings
class countAbc {
    public static void main(String args[]) {
        String str = "abcabab";
        System.out.println(countABC(str));

    }

    static int countABC(String str) {
        if (str.length() <= 2)
            return 0;
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))
            return 1 + countABC(str.substring(1));
        else
            return countABC(str.substring(1));
    }
}