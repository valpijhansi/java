class CharSum {
    public static void main(String args[]) {
        int a[] = new int[128];
        String s = "thoughts";
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            a[index] += 1;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}