class AnonymousInterface {
    public static void main(String args[]) {
        A a = new A() {
            public void test() {
                System.out.println("It is one of the Alphabet");

            }
        };
        a.test();
    }

}

interface A {
    public void test();
}