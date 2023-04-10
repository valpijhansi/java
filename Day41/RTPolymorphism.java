//Run_time polymorphism means having same method with different signature
//EX:Method overriding
class RTPolymorphism {
    public static void main(String[] args) {
        parrot p=new parrot();
        Birds b=new Birds();
        b.fly();
        p.fly();

    }
}

class Birds {
    void fly() {
        System.out.println("Birds are fly in the sky");
    }
}

class parrot extends Birds {
    void fly() {
        System.out.println("parrot fly in the sky");
    }
}

class peacock extends Birds {
    void fly() {
        System.out.println("It is not fly");
    }
}