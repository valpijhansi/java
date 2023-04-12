
public class Main {
    public static void main(String args[]) {
        Dog d = new Dog();
        System.out.println(d.getnoOflegs());
        kangaroo k = new kangaroo();
        System.out.println(k.getnoOflegs());

    }

}

class Animal {
    private int getnoOflegs = 4;

    public int getnoOflegs() {
        return getnoOflegs;
    }
}

class Dog extends Animal {

}

class Cat extends Animal {

}

class kangaroo extends Animal {
    public int  getnoOflegs() {
        return 2;
    }
}