class key {
    public static void main(String[] args) {
        Lock1 l = new Lock1();

        for (int i = 1000; i < 10000; i++) {
            if (l.CheckPassCode(i))
                System.out.println("key:" + i);
        }
    }
}

class Lock1 {
    int passcode = (int) Math.floor((Math.random() * 9000.0 + 1000.0));

    boolean CheckPassCode(int mycode) {
        if (passcode == mycode)
            return true;
        return false;
    }
}