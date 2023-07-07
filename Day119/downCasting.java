public class downCasting {
    public static void main(String[] args) {
        parent p = new Child();
        Child c = (Child) p;//basically it is not able to assign a parent class reference to the child but explicitly we can perform downcasting
         c.print();
         c.travel();

    }
}
class parent {
    void travel() {
        System.out.println("travel by bike ");
    }

}
class Child extends parent {
    void print() {
        System.out.println("Print Hello");
    }
    @Override
    void travel() {
        System.out.println("travel by car");
    }

}
