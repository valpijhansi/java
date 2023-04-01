//Power of N using recusive function
class powerN {
    public static void main(String args[]) {
        int n = 4;
        int base = 2;
        System.out.println(PowerN(base, n));

    }

    static int PowerN(int base, int n) {
        if (n == 1 || n == 0) {
            return base;
        }
        return base * PowerN(base, n - 1);

    }
}