
// H pattern using Arrays
class Hpattern {

    public static void main(String args[]) {
        int a[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 2, 9, 4 },
                { 1, 2, 8, 4, 5 },
                { 4, 5, 6, 7, 8 },
                { 6, 9, 5, 4, 2 }
        };
        int n = a.length;

        for (int i = 0; i < n; i++) {
            {
                for (int j = 0; j < a[0].length; j++) {
                    if (j == 0 || j == a[0].length - 1 | i == n - 3)

                        System.out.print(a[i][j] + " ");
                    else
                        System.out.print("  ");

                }

                System.out.println();

            }

        }

    }

}
