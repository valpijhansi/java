class logn {
    public static void main(String args[]) {
        int n = 8;
        int count = 0;
        for (int i = 1; i < n; i *= 2) {
            count++;
            System.out.println("Hello lucky:" + i);
        }
        System.out.println(count++);
    }
}