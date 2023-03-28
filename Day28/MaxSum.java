class MaxSum {
    public static void main(String args[]) {

        int a[][] = {
                { 1, 3, 5, 7 },
                { 2, 4, 6, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };
        int maxsum = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
            if (sum > maxsum) {
                maxsum = sum;
                index = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j][i];
            }
            if (sum > maxsum) {
                maxsum = sum;
                index = i;
            }
        }
        System.out.print("col "   +(index + 1) + " with sum:" + maxsum);
    }
}