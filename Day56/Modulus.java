class Modulus {
    public static void main(String args[]) {
        byte x = 4;
        byte y = 2;
        pow(x, y);
          
    }

    static void pow(byte x, byte y) {
        byte res = 1;
        for (byte i = 1; i <= y; i++) {
            res *= x;
        }
        System.out.print(res % 128);
    }
}