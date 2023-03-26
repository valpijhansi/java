// finding given String is pangaram or not
class Pangram {
    public static void main(String args[]) {
        String str = "abcdf";
        boolean res[] = new boolean[6];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;
            if (index >= 0 && index <= res.length)
                res[index] = true;
        }
        for (var x : res) {
            System.out.println(x);
            if (x == false) {
                System.out.print("not a pangram");
                return;
            }

        }
        System.out.print("pangram");
    }
}