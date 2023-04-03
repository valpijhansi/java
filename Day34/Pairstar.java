//identical chars that are adjacent in the original string are separated from each other by "*"
class Idcharacter {
    public static void main(String args[]) {
        String str = "hello villan";

        System.out.println(Pairstar(str));

    }

    static String Pairstar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*"+Pairstar(str.substring(1));
        else
            return str.charAt(0)+Pairstar(str.substring(1));
    }
}