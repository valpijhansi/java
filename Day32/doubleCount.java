//count the occarance of a number it occur consecutively then double the count
class doubleCount {
    public static void main(String args[]) {

        int num = 212232422;

        System.out.println(count(num));
    }

    static int count(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 100 == 22)
            return 2 + count(num / 10);
        if (num % 10 == 2)
            return 1 + count(num / 10);

        return count(num / 10);

    }
}