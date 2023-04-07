//print unique element in the given Array
class lonelyElement {
    public static void main(String args[]) {
        int a[] = { 1, 2, 2, 3, 4, 3, 4, 1, 5} ; 
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[i] == a[j])
                        break;
                }
            }
            if (j == a.length) {
                System.out.print(a[i]);
                return;
            }
        }
    }
}