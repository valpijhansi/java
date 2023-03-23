//subtraction oftwo matrices using Arrays
class sub {
    public static void main(String args[]) {
        int a[][] = {
                { 1, 4, 8 },
                { 4, 5, 6 }
        };
        int b[][] = {
                { 0, 3, 7 },
                { 4, 2, 3 }
        };

        int res[][] = new int[a.length][a[0].length];// storing the values after subtract the matrix.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j] - b[i][j];
                System.out.print(res[i][j] + " ");

            }
            System.out.println();
        }
    }

}
