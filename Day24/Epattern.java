
//E pattern using Arrays
class p7 {

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
                    if (i == 0 || j == 0 || i == n || j == a[0].length)

                        System.out.print(a[i][j] + " ");
                    // System.out.print(" ");

                }

                System.out.println();

            }

        }
        for (int i = 0; i < n; i++) {
            {
                for (int j = 0; j < a[0].length; j++) {
                    if (i == 0 || j == 0 || i == n - 1 || j == a[0].length)

                        System.out.print(a[i][j] + " ");
                    // System.out.print(" ");

                }

                System.out.println();

            }

        }

    }

}
