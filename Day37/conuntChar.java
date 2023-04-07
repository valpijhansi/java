//count the occurance of a char in a given String
class countChar {
    public static void main(String args[]) {
        String str = "lillyjjkklllmn";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            int j;
            for (j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
                else
                    break;
            }
            if (count == 1)
                res += str.charAt(i);
            else
                res += str.charAt(i) + Integer.toString(count);
            i = j - 1;
        }
        System.out.print(res);
    }
}