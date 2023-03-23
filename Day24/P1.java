
class P1 {
    public static void main(String args[]) {
        int a[][] = {
                { 2, 3, 5, 7, 1 },
                { 2, 4, 5, 6, 8 },
                { 6, 7, 8, 9, 5 },
                { 7, 5, 3, 1, 9 } };
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < a[0].length; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == a[3].length - 1)
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < a[0].length; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == a[0].length - 1)
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }
}
