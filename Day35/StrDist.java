class StrDist {
    public static void main(String args[]) {
        String str = "catcowcat";
        String sub = "cat";
        System.out.println(strDist(str, sub));
    }

    static int strDist(String str, String sub) {
        int x = sub.length();
        int y = str.length();
        if (y < x)
            return 0;
        if (str.substring(0, x).equals(sub)) {
            if (str.substring(y - x).equals(sub))
                return y;
            else
                return strDist(str.substring(0, y - 1), sub);
        }
        return strDist(str.substring(1), sub);
    }
}