// right angle pattern using arrays
class p2 {
    public static void main(String args[]) {
        int a[][] = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 6, 7, 8 },
                { 4, 6, 8 }
        };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
