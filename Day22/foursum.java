//write program for quadruplets using arrays
class foursum {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 5, 7, 9, 4, 6, 8, 10, 12, 16, 14 };
        int sum = 50;
        int n = a.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int m = k + 1; m < n; m++) {
                        int x = a[i] + a[j] + a[k] + a[m];
                        if (x == sum)
                            System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + a[m]);

                    }
                }
            }
        }
    }
}