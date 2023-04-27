//DRY principle: DRY means don't repeate yourself
class Power {
    public static void main(String args[]) {
        pow(2, 3);

    }

    static void pow(int x, int y) {//not only integers we can also take byte
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res *= x;
        }
        System.out.print(res);
    }
}