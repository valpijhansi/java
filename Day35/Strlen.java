
//finding the length of a string using recursion

class Strlen {
    public static void main(String args[]) {
        String str = "Lucky";
        System.out.println(countstring(str));
    }

    static int countstring(String str) {
        int n = str.length();

        if (n <= 0)
            return 0;
        else
            return 1+ countstring(str.substring(1)  ) ;

    }
}