//find the reverse of a Number using recursion
class reverse {
    public static void main(String args[]) {
        int n = 9381;
        rev(n);

    }

    static void rev(int n) {
        if (n == 0)
            return;
        int last = n % 10;
        System.out.print(last);
        rev(n / 10);
        return;
    }
}