public class UpCasting {
    public static void main(String[] args) {
        parent p = new child();
        p.printManiac();


    }
}
class parent {
    void printManiac() {
        System.out.println("parent class");
    }
}
class child extends parent {
    void Print(){
        System.out.println("child class");
    }
}
