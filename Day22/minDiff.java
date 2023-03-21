// Max difference between two elements
class maxDiff {
    public static void main(String args[]) {
        int a[] = { 19, 11, 10, 12, 9, 15, 17, 21 };
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minIndex) {
                minIndex = i;
            }
            int maxindex = minIndex + 1;
            for (int j = minIndex + 2; j < a.length; j++) {
                if (a[j] > a[maxindex])
                    maxindex = j;
            }

            System.out.println(a[maxindex] - a[minIndex]);
            return;

        }
    }
}