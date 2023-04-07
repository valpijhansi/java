//print the sub arrays of a give array

class Subarrays {
    public static void main(String args[]) {
        int a[] = { 9, 3, 8, 1, 4, 2 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(a[k]);
                System.out.println();

            }
        }
    }
}