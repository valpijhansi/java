class StrCopies {
    public static void main(String args[]) {
        String str = "lokiluckyloki";
        String sub = "loki";
        int n = 3;
        System.out.println(strCopies(str, sub, n));
    }

    static boolean strCopies(String str, String sub, int n) {
        int sublen = sub.length();
        int strlen = str.length();
        if (strlen < sublen) {
            if (n <= 0)
                return true;
            else
                return false;
        }
        if (str.substring(0, sublen).equals(sub))
            return strCopies(str.substring(1), sub, n - 1);
        else
            return strCopies(str.substring(1), sub, n);

    }
}