//count the occarance of number in an array
class countNum {
    public static void main(String args[]) {
        int a[] = { 2, 3, 4, 2, 2, 6 };
        int index = 0;
        System.out.println(arrayNum(a, index + 1));

    }

    static int arrayNum(int a[], int index) {
        if (index == a.length)
            return 0;
        if (a[index] == 3)
            return 1 + arrayNum(a, index + 1);
        else
            return arrayNum(a, index + 1);
    }
}