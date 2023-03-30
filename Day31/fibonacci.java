//finding fibonacci series using recursive function
class fibonacci {
    public static void main(String args[]) {
        int n = 11;
        int k = fibno(n);
        System.out.println(k);
    }

    static int fibno(int n) {
        if (n == 1 || n == 0)
            return 1;
        int res = fibno(n - 1) + fibno(n - 2);
        return res;
    }
}