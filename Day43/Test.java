class Test {
    public static void main(String[] args) {
        animal1 a = new animal1();
        animal1.dog dog = a.new dog();
        dog.Sum();

    }
}

class animal1 {
    static int x = 7;

    static int sayHi() {
        System.out.println("Hello lucky");
        return 9;

    }

    class dog {
        static int y = 10 + 5;

        static void Sum() {
            System.out.println(y + x);
            sayHi();
        }
    }
}