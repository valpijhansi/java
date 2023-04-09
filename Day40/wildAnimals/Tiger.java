package wildAnimals;

public class Tiger {
    private int legs;
    protected int eyes;

    public void Nature() {
        System.out.println("It is very curel in nature");
    }

    public void run() {
        System.out.println("It runs very fast");
    }

    public int NoOflegs(int legs) {
        System.out.println("It has legs " + legs);
        return legs;
    }

    public int eyes(int eyes) {
        System.out.println("It's have:" + eyes);
        return eyes;
    }

    void display() {
        System.out.println(4 + " " + 2);
    }

}
