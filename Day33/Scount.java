//count the occurance of String
class SCount {
    public static void main(String args[]) {

        String str = "xlixlixli";
        System.out.println(count(str));

    }

    static int count(String str) {
        if (str.length() < 2)
            return 0;
        if (str.substring(0, 2).equals("li"))
            return 1 + count(str.substring(1));
        else
            return count(str.substring(1));
    }

}