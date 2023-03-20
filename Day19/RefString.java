class Ref {
    public static void main(String args[]) {
        // char name[] = { 'l', 'o', 'k', 'e', 's', 'h' };
        String str = "lokesh";
        String str1 = " ";
        for (int i = 0; i < str.length(); i++) {
            if (i != 3) {
                str1 += str.charAt(i);
            } else {
                str1 += 'e';

            }

            System.out.println(str);
            System.out.println(str1);
        }
    }

}
