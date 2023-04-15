
class ThisKeyword {
    public static void main(String args[]) {
        A a = new A();
        a.grocery();
        B bb = new B();

    }

}

class A {
    int rock;

    A(B bb) {
        System.out.println(bb.hound);

    }

    A() {
    }

    int grocery() {
        B b = new B(this);
         System.out.println("Grocery");
        return 5;
    }
}

class B extends A {

    int hound = 11;

    B() {
    }

    B(A jl) {

        A x = new A(this);
    }
}
