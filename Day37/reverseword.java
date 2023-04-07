//reverse the String print middle element if it is odd otherwise print middle two elements
class RevWord {
    public static void main(String args[]) {
        String str = "Sweetloki";
        int n = str.length();
        String res = "";
        int middle;
        int len;
        char ch;
        for (int i = 0; i < n; i++) {
            ch = str.charAt(i);
            res = ch + res;
        }
        if (n % 2 == 0) {
            middle = n / 2 - 1;
            len = 2;
        } else {
            middle = n / 2;
            len = 1;
        }

        System.out.println(res);
        System.out.println("middle character is:" + str.substring(middle, middle + len));

    }
}