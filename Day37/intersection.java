//print the intersection of two Arrays
class intersection {
    public static void main(String args[]) {
        int a[] = { 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 4 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}