import java.util.*;
import java.util.Objects;
import java.lang.Object;

class list1 {
    public static void main(String args[]) {
        ArrayList<Duck> list = new ArrayList();
        Duck d1 = new Duck();
        d1.age = 22;
        d1.weight = 23.3;
        Duck d2 = new Duck();
        d1.age = 23;
        d2.weight = 27.3;
        Duck d3 = new Duck();
        d1.age = 24;
        d2.weight = 24.3;
        list.add(d1);
        list.add(d2);
        list.add(d3);
        System.out.println(list);

    }
}

class Duck extends Object {
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