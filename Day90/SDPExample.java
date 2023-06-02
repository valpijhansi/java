class SDPExample {
    public static void main(String args[]) {
        System.out.println(A.returnobj().x);

    }
}
class A {
    private static A obj = new A();
    int x = 10;
    private A() {

    }
    public static A returnobj() {
        return obj;
    }
}