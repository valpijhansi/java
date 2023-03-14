class polynomial {
    public static void main(String args[]) {
        int n = 4;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count++;

            for (int j = 1; j <= n; j++) {

                System.out.println("Hello lucky:" + i + " " + j);
            }
        }
        System.out.println(count);
    }
}