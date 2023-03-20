class nlogn {
    public static void main(String args[]) {
        int n = 8;
        int count = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j *= 2) {
                count++;
                System.out.println("Hello lucky:" + i + " " + j);
            }
        }
        System.out.println(count);
    }
}
