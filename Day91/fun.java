class fun {
    public static void main(String args[]) {
        C c = new C();
        

    }
}

class A {
    A() {
        super();
     System.out.println("A");
     System.out.println("First letter");
    }

}
class B extends A {
    B() {
        super ();
        System.out.println("B");

    }
}
class C extends B {
    C() {
        System.out.println("C");
    }
}