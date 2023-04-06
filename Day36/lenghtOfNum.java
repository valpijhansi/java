//find the length of number using recursion
class lenOfNum {
    public static void main(String args[]) {
        int n = 96814294;
        System.out.println(len(n));

    }

    static int len(int n) {
        if (n == 0)
            return 0;
        return 1 + len(n / 10);
    }
}