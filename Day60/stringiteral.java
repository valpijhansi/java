class stringiteral {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        // System.out.println(milli);
        String str = "";// Sting literal store in the SringPool
        for (int i = 0; i < 10000; i++) {
            str = "luckyJaanu";

        }
        String str1 = "";
        for (int i = 0; i < 10000000; i++) {
            str1 = "luckyJaanu" + String.valueOf(i);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}