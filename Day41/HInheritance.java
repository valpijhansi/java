//A simple program on Hirerachial inheritance
//In this one each subclass extends only super super class
class HInheritance {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.sum(12, 13));
        System.out.println(c.multiply(2, 3));

    }
}

class A {
    int sum(int a, int b) {
        return a + b;

    }
}

class B extends A {
    int sub(int c, int d) {
        return (c - d);
    }
}

class C extends A { // it can sum method also because it extends methods from Super class that is A
    int multiply(int x, int y) {
        return (x * y);
    }
}