//Given a string and a non-empty substring sub,compute recursively the number of times that appears in the string
// Ex:("catcowcat","cat")----->2
class StrCount {
    public static void main(String args[]) {
        String str = "catcowcat";
        String sub = "cat";
        System.out.println(strCount(str, sub));
    }

    static int strCount(String str, String sub) {
        int sublen = sub.length();
        if (str.length() <sublen)
            return 0;
        if (str.substring(0, sublen).equals(sub))
            return 1 + strCount(str.substring(sublen), sub);
        else
            return strCount(str.substring(1), sub);
    }
}