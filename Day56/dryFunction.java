class dryFunction {
    public static void main(String args[]) {
        Dog d = new Dog();
        Cat c = new Cat();
        c.eat();
        d.eat();

    }
}

class animal {
    void run() {
        System.out.println("it will run fast");
    }

    void eat() {
        System.out.println("Eat food");
    }
}

class Dog extends animal {
    // void eat() {
    //     System.out.println("Eat food"); by using dry principle we cannot write a method more than once.when ever we want to repeate a method in child class also simply that method can declare in parent class.
                                                
    // }

}

class Cat extends animal {

}