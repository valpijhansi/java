class ThreadSafe {
    public static void main(String args[]) {
     A.getInstance().getInstance();
     A.getInstance().getInstance();
    }
}
class A {
    private static A myobj;
    private A() {

    }
    synchronized public static A getInstance() {
        if(myobj == null) {
            myobj = new A();

        }
        return myobj;
    }
}