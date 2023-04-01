//replace the given String with value of that String
class Svalue {
    public static void main(String args[]) {
        String str = "pi";
        System.out.println(changeVal(str));
    }

    static String changeVal(String str) {
        if (str.length() < 2)
            return str;
        if (str.substring(0, 2).equals("pi"))
            return "3.14" + changeVal(str.substring(2));
        else
            return str.charAt(0) + changeVal(str.substring(1));
    }
}