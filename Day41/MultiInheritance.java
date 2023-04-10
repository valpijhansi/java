//A simple program on multi level inheritance
class MultiInheritance {
    public static void main(String[] args) {
        GermanSheperd g = new GermanSheperd();
        g.setColdstamina(-23.45);
        System.out.println("cat will survive:" + g.surviveOrNot());
    }
}

class Animal {
    int height;
    private int weight;
    String color;

    void makeNoise() {
        System.out.println("Some Noise");
    }
}

class Cat extends Animal {
    String dob;

    void sound() {

        System.out.println("Meow Meow");
    }
}

class GermanSheperd extends Cat {
    private double coldStamina;

    boolean surviveOrNot() {
        if (getColdstamina() >= 1.0)
            return true;
        return false;
    }

    void setColdstamina(double temp) {
        this.coldStamina = temp;
    }

    double getColdstamina() {
        return coldStamina;
    }
}