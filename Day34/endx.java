//computing new String recursively where the lowercase 'x' chars been moved to end of String
class endX {
    public static void main(String args[]) {
        String str = "xlxoxkxi";
        System.out.println(EndX(str));

    }

    static String EndX(String str) {
        if (str.length() == 0) {
            return "";

        }
        if (str.charAt(0) != 'x')
            return str.charAt(0) + EndX(str.substring(1));
        else
            return EndX(str.substring(1)) + "x";
    }
}