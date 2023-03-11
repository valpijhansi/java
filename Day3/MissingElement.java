class MissingElement {
    public static void main(String args[]) {
        int n = 5;
        int A[] = { 11, 13, 12, 15 };
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == i)

                    count++;
            }

            if (count == 0) {
                System.out.println(i);

            }
        }
    }
}
