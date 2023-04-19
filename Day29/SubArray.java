class SubArray {
    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 7 };
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[j]);

            }
            System.out.println();
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a[j]);

            }

            System.out.println();
        }
        for (int i = 2; i < a.length; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(a[j]);

            }
            // System.out.println();

            System.out.println();
        }
        for (int i = 0; i < a.length-1; i++) {

            for (int j = 0; j < a.length-1; j++) {
                sum += a[j];
                if (sum > maxsum)
                    maxsum = sum;
            }
        }
        System.out.print(maxsum);
    }
}
