//Adding two matrices using Arrays
class Addition {
    public static void main(String args[]) {
        int a[][] = {
                { 1, 2 },
                { 4, 5 }
        };
        int b[][] = {
                { 7, 3 },
                { 4, 2 }
        };

        int res[][] = new int[a.length][a[0].length];// storing the values after adding the matrix.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j] + " ");

            }
            System.out.println();
        }
    }

}
