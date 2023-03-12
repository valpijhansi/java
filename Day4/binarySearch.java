class binarySearch {
    public static void main(String args[]) {
        int a[] = { 2, 3, 4, 5, 6, 7, 8 };
        int start = 0;
        int end = a.length - 1;
        int k = 6;
        while (start <= end) {
            int mid = start + end / 2;
            if (a[mid] == k) {
                System.out.println("found");
                return;
            } else if (a[mid] > k) {
                // end = mid - 1;
            } else if (a[mid] < k) {
               // start = mid + 1;
            }
            System.out.println("Not found");
            return;
        }
    }
}