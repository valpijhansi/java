//reomving char from given String chintti-->chitti
class Removechar {
    public static void main(String args[]) {
        String str = "Slwleeltly";

        System.out.println(RemoveChar(str));
    }

    static String RemoveChar(String str) {
        if (str.length() == 0)
            return "";
        if (str.charAt(0) == 'l')
            return "" + RemoveChar(str.substring(1));
        else
            return str.charAt(0) + RemoveChar(str.substring(1));
    }

}