class constructorWithInMethod {
    public static void main(String args[]) {
        Outer1 o = new Outer1();
        o.objCreate();
    }
}

class Outer1 {
    void objCreate() {
        System.out.println("Creating the object");
        class rock {
            int x = 11;

            rock() {
                System.out.println("Default Constructor");

            }

            rock(int x) {
                System.out.println("1 parameter with " + x);
            }

            void moon() {
                System.out.println("Moon Parent");

            }

        }
        class Stone extends rock {
            int x = 10;

            void moon() {
                System.out.println("Moon child");

            }

            Stone() {
                // super();
                super(12);
            }
        }
        Stone s = new Stone();

    }
}
