
//Max Word in the given String
class Max {
    public static void main(String args[]) {
        String str = "Being alone is the best Thing";
        int max = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {

             if (str.charAt(i) != ' ')
                start++;
            if (str.charAt(i) == ' ' || (i == str.length() - 1)) {
                if (start > max)
                    max = start;
                start = 0;

            }
        }
        System.out.print(max);
    }

}