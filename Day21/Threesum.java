//write java program of three sum elements 
class Threesum {
    public static void main(String args[]) {
        int a[] = { 1, 3, 4, 5, 7, 9, };
        int sum = 20;
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    int n = a[i] + a[j] + a[k];
                    if (n == sum) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }
}