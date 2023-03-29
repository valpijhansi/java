//recursive function example:
class Recur {
    public static void main(String args[]) {
        int n = 10;
        int m_t = charges(n);
        System.out.println(m_t);
    }

    static int charges(int n) {
        if (n == 1)
            return 1;
        int m_ts = n + charges(n - 1);
        return m_ts;

    }
}