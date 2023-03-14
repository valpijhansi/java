class Factorial {
    public static void main(String args[]) {
        int n = 4;
        int k = n * (n - 1) * (n - 2) * (n - 3);
        for (int i = 1; i <= k; i++) {
            System.out.println("Hello lucky:" + i);
        }
    }
}