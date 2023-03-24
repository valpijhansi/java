//L pattern using arrays
class p5 {

    public static void main(String args[]) {
        int a[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 2, 9, 4 },
                { 1, 2, 8, 4, 5 },
                { 4, 5, 6, 7, 8 },
                { 6, 9, 5, 4, 2 }
        };
        int n = a.length;
        for (int i = 1; i < n; i++) {
            {
                for (int j = 1; j < a[0].length; j++) {
                    if (i == 0 || j == 0 || i == n || j == a[0].length - 3) {
                        System.out.println(a[i][j] + " ");
                    }

                }

            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < a[0].length; j++) {
                if (i == 0 || j == 0 || i == n - 3 || j == a[0].length) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }

    }
}
