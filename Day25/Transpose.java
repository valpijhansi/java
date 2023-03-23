//Transpose of matrix using Arrays
class Transpose {
    public static void main(String args[]) {
        int a[][] = {
                { 7, 8, 6 },
                { 4, 5, 3 },
                { 2, 3, 8 }
        };

        int res[][] = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[j][i];
                System.out.print(res[i][j] + " ");
            }

            System.out.println();
        }
    }
}