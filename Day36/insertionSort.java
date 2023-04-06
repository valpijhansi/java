//print insertionSort Algorithm
class insertionSort {
    public static void main(String args[]) {
        int A[] = { 2, 5, 7, 1, 8, 9 };
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int temp = A[i];
            int j = i - 1;
            while (j >= 0 && temp < A[j]) {
                A[j + 1] = A[j];
                j--;

            }
            A[j + 1] = temp;
        }
        for (int k : A)
            System.out.print(k+"   ");
    }
}
