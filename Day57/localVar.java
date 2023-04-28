//local variable: When ever we declare a variable inside the Method is called local variable
class localVar {
    public void rock() {
        int n = 10;//local variable
        System.out.println(n);
    }

    public static void main(String args[]) {
        localVar lv = new localVar();
        lv.rock();
    }

}