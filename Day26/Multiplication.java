//Multiplication of two matrices

class Multiplication {
    public static void main(String args[]) {
        int a[][] = {
                { 1, 2, 3 },
                { 6, 7, 8 }
        };
        int b[][] = {
                { 1, 3 },
                { 4, 5 },
                { 6, 7 }
        };

        int res[][] = new int[a.length][b[0].length];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = 0;

                for (int l = 0; l < a[0].length; l++) {
                    res[i][j] += a[i][l] * b[l][j];

                }
             
            

         System.out.println();
        
        }
    }
}