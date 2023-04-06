//print the sum of Array length using recusive function
class ArraySum {
    public static void main(String args[]) {
        int a[] = { 1, 2, 1, 7, 2, 5 };
        int res = sum(a, 0);
        System.out.print(res);
    }

    static int sum(int a[], int index) {
        if (index == a.length)
            return 0;
        return a[index] + sum(a, index + 1);
    }
}