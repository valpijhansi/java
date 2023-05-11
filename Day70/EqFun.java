public class EqFun {

    public static void main(String[] args) {

        Duck1 d1 = new Duck1();
        d1.age = 21;
        d1.weight = 245.67;

        Duck1 d2 = new Duck1();
        d2.age = 21;
        d2.weight = 245.67;
        // d2=d1;

        System.out.println(d1.equals(d2));
        System.out.println(d1 == d2); // if we have same content also it checks only address of the both objects
                                       

    }
}

class Duck1 extends Object {

    public int age;
    double weight;
}