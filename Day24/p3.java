//pyramid pattern using Arrays
class p3 {
    public static void main(String args[]) {
        int a[][] = {  
                { 1, 2, 3, 9 },
                { 3, 4, 5, 4 },
                { 6, 7, 8 ,5},
                { 4, 6, 8, 7 }
        };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
