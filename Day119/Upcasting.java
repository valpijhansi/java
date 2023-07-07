public class Upcasting {
    public static void main(String[] args) {
        Parent p = new child();//parent class object is refering to child class it is called upcasting

        p.nokia105();



    }
}
class Parent {
    void nokia105() {
        System.out.println("parent phone");

    }
}
class child extends Parent{
    void iphone() {
        System.out.println("kid's phone");
    }

}
