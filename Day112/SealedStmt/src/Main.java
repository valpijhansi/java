
class Main {

    public static void main(String[] args) {

        Shock s = new Shock();
        s.printName();
        joke j = new joke();
        j.prinName();
        Lock l = new Lock();
        l.printName();



    }

}
sealed interface Rock permits Mock {
    void printName();
}
abstract sealed class Mock  implements  Rock {

    @Override
    public void printName() {
        System.out.println("hllo");

    }
}
non-sealed class Shock extends Mock {
    public void printName() {
        System.out.println("man............!");
    }
}

final class Lock extends Mock {
    public  void printName() {
        System.out.println("print the statement ");
    }
}
class joke extends Shock {
    void prinName() {
        System.out.println("hey you.........!");
    }
}