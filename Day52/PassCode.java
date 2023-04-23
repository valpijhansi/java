class PassCode {
    public static void main(String args[]) {
        lock l = new lock();
        boolean res = l.checkPassCode(8431);

        System.out.print(res);
    }

}

class lock {
    int passcode = 8431;

    boolean checkPassCode(int mycode) {
        if (passcode == mycode)
            return true;
        return false;
    }
}