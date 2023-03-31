//count the occarance of a number
class countNum {
    public static void main(String args[]) {

        int num = 12343533;
        int k = 3;
        System.out.println(count(num, k));
    }

    static int count(int num, int k) {
        if (num == 0) {
            return 0;
        }

        int digit = num % 10;
        // int dig_t = num % 100;
        // if (dig_t == k)
        // return 2 + count(num / 10, k);
        if (digit == k)

            return 1 + count(num / 10, k);
        return count(num / 10, k);

    }
}