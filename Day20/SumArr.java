//sum of two arrays
class SumArr {
    public static void main(String args[]) {
        int A[] = { 1, 3, 4, 7 };
        int B[] = { 2, 4, 6, 8 };
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        for (int j = 0; j < B.length; j++) {
            sum += B[j];
        }
        System.out.println(sum);
    }
}