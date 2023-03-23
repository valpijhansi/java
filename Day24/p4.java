//reverse pattern using arrays
class p4 {
    public static void main(String args[]) {
        int a[][] = {
                { 1, 2, 3, 9 },
                { 3, 4, 5, 4 },
                { 6, 7, 8, 5 },
                { 4, 6, 8, 7 }
        };
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }  
            for (int j = i; j <n ;j ++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
