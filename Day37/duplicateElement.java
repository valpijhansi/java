//print the duplicate element of an Array
class dulicateElement {
    public static void main(String args[]) {
        int a[] = { 1, 4, 2, 5, 7, 7 ,2};
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    return;
                }
            }
        }
    }
}