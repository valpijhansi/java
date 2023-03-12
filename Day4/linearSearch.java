class linearSearch {
    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 7, 6, 4 };
        int k = 5;
        for (int i = 0; i < a.length; i++) {
            if (k == a[i])

            {
                System.out.println("element found");
                return;
            } else {
                System.out.println("element not found");
                return;
            }

        }
    }
}