//find the length of Array using recursion
class Arraylen {
    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 3 };
        int count = 0;
        System.out.println(arrayLen(a));
    }

    static int arrayLen(int a[]) {
        if (a.length <= 0)
            return 0;
        else

            return 1 + arrayLen(a);

    }
}