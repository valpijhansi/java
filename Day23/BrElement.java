class BrElement {
    public static void main(String args[]) {
        int a[][] = {
                { 11, 12, 13 },
                { 14, 15, 16 },
                { 17, 18, 19 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == 0 || j == 0 || i == a.length - 1 || j == a[0].length - 1)
                    System.out.print(a[i][j] + "  ");
                else
                    System.out.print("    ");
            }
            System.out.println();
        }
    }
}
