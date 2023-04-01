//An array is there if we give a number that number presen in that array then return true ,otherwise false
class numsN {
    public static void main(String args[]) {
        int a[] = { 1, 4, 3, 7 };
        int index = 0;
        System.out.println(array(a, index + 1));

    }

    static boolean array(int a[], int index) {
        if (index >= a.length) {
            return false;
        }
        if (a[index] == 8)
            return true;
        else
            return array(a, index + 1);
    }
}
