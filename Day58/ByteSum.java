class ByteSum {
    public static void main(String[] args) {
        String str1 = "9381";
        String str2 = "8431";
        System.out.println(addNums(str1, str2));
    }

    public static StringBuilder addNums(String str1, String str2) {
        byte carry = 0;
        String sum = "";
        int i, j;
        for (i = str1.length() - 1, j = str2.length() - 1; i > -1 && j > -1; i--, j--) {
            byte temp = (byte) ((Byte.parseByte(String.valueOf(str1.charAt(i))))
                    + Byte.parseByte(String.valueOf(str2.charAt(j))) + carry);
            sum += temp % 10;
            carry = (byte) (temp / 10);
        }
        while (i > -1) {
            byte temp = (byte) (Byte.parseByte(String.valueOf(str1.charAt(i))));
            sum += temp % 10;
            carry = (byte) (temp / 10);
            i--;
        }
        while (j > -1) {
            byte temp = Byte.parseByte(String.valueOf(str2.charAt(j)));
            sum += temp % 10;
            carry = (byte) (temp / 10);
            j--;
        }
        if (carry > 0)
            sum += carry;
        StringBuilder s = new StringBuilder(sum);
        s.reverse();
        return s;
    }
}