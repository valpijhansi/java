class CrackPassCode {
    public static void main(String args[]) {
        Lockpad lock = new Lockpad();
        String passcode = carckPasscode(lock);
        System.out.print(passcode);

    }

    static String carckPasscode(Lockpad newLock) {
        String actualPasscode = newLock.getPasscode();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {

                        String curpass = brutePasscode(i, j, k, l);
                        if (curpass.equals(actualPasscode))
                            return actualPasscode;
                    }
                }
            }
        }
        return "";
    }

    static String brutePasscode(int first, int second, int third, int fourth) {
        return String.valueOf(first) + String.valueOf(second) + String.valueOf(third) + String.valueOf(fourth);
    }
}

class Lockpad {
    private int first = randomDigit();
    private int second = randomDigit();
    private int third = randomDigit();
    private int fourth = randomDigit();
    private String passcode = generatePasscode();

    private int randomDigit() {
        return (int) (Math.floor(Math.random() * 10.0));
    }

    public String getPasscode() {
        return passcode;
    }

    private String generatePasscode() {
        return String.valueOf(this.first) + String.valueOf(this.second) + String.valueOf(this.third)
                + String.valueOf(this.fourth);

    }

}
