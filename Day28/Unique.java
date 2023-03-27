class Unique {
    public static void main(String args[]) {
        String str = "thoughts";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1])
                System.out.print("Duplicate");
            
        }
        System.out.print("unique");
    }
}