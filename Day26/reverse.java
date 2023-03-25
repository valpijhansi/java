class reverse {
    public static void main(String args[]) {
        String str = "jaanunaaj";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length() - i - 1);
            // System.out.println(reverse);
        }

        System.out.println(reverse);
        System.out.println();

    }
}