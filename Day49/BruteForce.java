import java.util.*;

class BruteForce {

    static int a[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 } };

    public static void main(String args[]) {
        int count = 0;
        do {
            count++;
            swapCell();
        } while (!isMagicSquare());
        display();
        System.out.println(count);
    }

    public static boolean isMagicSquare() {
        int reqSum = a[0][0] + a[0][1] + a[0][2];
        for (int i = 0; i < 3; i++) {
            if (a[i][0] + a[i][1] + a[i][2] != reqSum)
                return false;
        }
        for (int i = 0; i < 3; i++) {
            if (a[0][i] + a[1][i] + a[2][i] != reqSum)
                return false;
        }
        return (a[0][0] + a[1][1] + a[2][2] == reqSum && a[0][2] + a[1][1] + a[2][0] == reqSum);
    }

    static void swapCell() {
        int firstRow = (int) (Math.random() * 3.0);
        int firstCol = (int) (Math.random() * 3.0);
        int secondRow = (int) (Math.random() * 3.0);
        int secondCol = (int) (Math.random() * 3.0);
        int temp = a[firstRow][firstCol];
        a[firstRow][firstCol] = a[secondRow][secondCol];
        a[secondRow][secondCol] = temp;
    }

    static void display() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
