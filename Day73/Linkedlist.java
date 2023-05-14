import java.util.*;

class Linkedlist {
    public static void main(String args[]) {
       // LinkedList list = new LinkedList();
        duck[] List = new duck[3];
        duck d1 = new duck();
        d1.age = 22;
        d1.weight = 23.3;
        duck d2 = new duck();
        d1.age = 23;
        d2.weight = 27.3;
        duck d3 = new duck();
        d1.age = 24;
        d2.weight = 24.3;
        List[0] = d1;
        List[1] = d2;
        List[2] = d3;
        System.out.println(List[0].toString());

    }
}

class duck extends Object {
    public int age;
    double weight;

    void mySound() {
        System.out.println("Qwak,Qwak");
    }

    @Override
    public String toString() {
        return "age : " + this.age + " weight:" + this.weight;
    }

}