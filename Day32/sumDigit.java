//finding sum of digits of a given number using recursion
class Sumdigit {
    public static void main(String args[]) {
        int n = 1217;
        System.out.println(sumDigit(n));
    }

    static int sumDigit(int n) {
        if (n == 0)
            return 0;
        int x = n % 10;
        int y = n / 10;
        return x + sumDigit(y);
    }
}