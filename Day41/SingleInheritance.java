//simple java program on single inheritance
class SingleInheritance {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.makeNoise();
        c.sound();

    }
}

class animal {
    int height;
    private int weight;
    String color;

    void makeNoise() {
        System.out.println("Some Noise");
    }
}

class Cat extends animal {
    String dob;

    void sound() {

        System.out.println("Meow Meow");
    }
}