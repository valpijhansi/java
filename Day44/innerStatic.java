
class Rock {
    public static void main(String args[]) {
        Outer o = new Outer();
        o.objCreate();
    }

}

class Outer {
    void objCreate() {
        System.out.println("Lucky");
        class rock {
            int x = 11;

            static int moon() {// this static method also access within outer class Method
                System.out.println("Moon is Cool");
                return 4;
            }
        }
        rock r = new rock();
        System.out.println(r.x);
        System.out.println(r.moon());

    }
}