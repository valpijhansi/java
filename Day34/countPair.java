//count the pairs ex:AxA-->1
class Countpairs {
    public static void main(String args[]) {
        String str = "axaxb";
        System.out.println(countPairs(str));
    }

    static String countPairs(String str) {
        if (str.length() <= 2)
            return "";
        if (str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));
        else
            return countPairs(str.substring(1));
    }

}