import java.util.Arrays;

class cyclicRotation {
    public static void main(String args[]) {

        int A[] = { 11, 12, 13, 14, };
        int n = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[0] = n;
        System.out.println(Arrays.toString(A));

    }
}
