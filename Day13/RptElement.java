import java.util.Arrays;

class ReptElement {
    public static void main(String args[]) {
        int A[] = { 1, 3, 4, 5, 3, 4, 1 };

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {

                    count++;
                }
            }
            if (count == 0) {
                System.out.println(A[i]);
                return;
            }

        }

    }
}