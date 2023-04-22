class Encrypt {
    static char A[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void main(String args[]) {
        String str = "hi jaanu";
        String str1 = "";
        int key = 4;

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == ' ')) {
                int index = str.charAt(i) - 97 + key;
                int cur = index % 26;
                if (cur < 0)
                    cur += 26;
                str1 += A[cur];
                System.out.print(str1);
            } else {
                str1 += "";
            }
        }
        System.out.println("");
        decode(str1, key);

    }

    static void decode(String str, int key) {
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == ' ')) {
                int index = str.charAt(i) - 97 - key;
                int cur = index % 26;
                if (cur < 0)
                    cur += 26;
                System.out.print(A[cur]);
            } else {
                System.out.print("");
            }
        }
        System.out.println("");

    }

}
