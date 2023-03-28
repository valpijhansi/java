
//check wether given Paranthesis in a String balanced or
class Parn {
    public static void main(String args[]) {
        String str = "{}()";
        int open = 0;
        int close = 0;
        int mismatch = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{') {
                open++;
            } else if (ch == '}') {
                if (open > 0) {

                    close++;
                }

            } else {
                mismatch++;

            }
            if (ch == '(') {
                open++;

                if (open > 0) {

                    close++;
                }

            } else {
                mismatch++;
                // close++;
            }
        }
        System.out.print(open + " "+mismatch+ " " + close);
    }
}