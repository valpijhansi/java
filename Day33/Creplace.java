//replacing one char with another Ex:"chintu"-->"chotu"
class Creplace {
    public static void main(String args[]) {
        String str = "chitu";
        System.out.println(change(str));
    }

    static String change(String str) {
        if (str.length() == 0)
            return "";
        if (str.charAt(0) == 'i')
            return "o" + change(str.substring(1));
        else
            return str.charAt(0) + change(str.substring(1));
    }
}