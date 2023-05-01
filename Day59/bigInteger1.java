import java.math.BigInteger;

class bigInteger1 {
    public static void main(String[] args) {
        biginteger b = new biginteger("17");
        String s = b.add("3");
        System.out.println(s);
    }
}

class biginteger {
    static String str;

    biginteger(String value) {
        str = value;
    }

    public static String add(String str1) {
        byte carry = 0;
        String res = "";
        int i, j;
        for (i = str.length() - 1, j = str1.length() - 1; i > -1 && j > -1; i--, j--) {
            byte temp = (byte) ((Byte.parseByte(String.valueOf(str.charAt(1)))
                    + Byte.parseByte(String.valueOf(str1.charAt(j)))) + carry);
            res += temp % 10;
            carry = (byte) (temp / 10);
        }
        while (i > -1) {
            byte temp = (byte) (Byte.parseByte(String.valueOf(str.charAt(i))) + carry);
            res += temp % 10;
            carry = (byte) (temp / 10);
            i--;
        }
        while (j > -1) {
            byte temp = (byte) (Byte.parseByte(String.valueOf(str1.charAt(j))) + carry);
            res += temp % 10;
            carry = (byte) (temp / 10);
            j--;
        }
        if (carry > 0) {
            res += carry;
            String ans = "";
            for (int k = ans.length(); k > -1; k--) {
                ans += ans.charAt(k);
            }
            return ans;
        }
        return res;

    }
}