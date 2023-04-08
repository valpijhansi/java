//classes & objects
class phone {
    public static void main(String args[]) {
        String model;
        int storageSpace;
        double price;
        String color;
        String songs[] = { "pallaki", "the end", " masakali" };
        phone p = new phone();
        p.changeVolume(false);
        p.play(2);
        p.call("ravi");

    }

    static void changeVolume(boolean increase) {
        if (increase)
            System.out.println("volume increased");
        else
            System.out.println("volume Decreased");
    }

    static void call(String person) {
        System.out.println("I am calling to" + person);
    }

    static void play(int id) {
        System.out.println("playing a song" + id);
    }

}