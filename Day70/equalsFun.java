public class equalsFun {

    public static void main(String[] args) {

        Duck d1 = new Duck();
        d1.age = 21;
        d1.weight = 245.67;

        Duck d2 = new Duck();
        d2.age = 21;
        d2.weight = 245.67;
        // d2=d1;

        Duck2 d3 = new Duck2();
        d3.age = 21;
        d3.weight = 245.67;

        System.out.println(d1.equals(d2)); //  it check address of the both  but not content
        System.out.println(d1 == d2);

        System.out.println(d1.equals(d3));

    }
}

class Duck extends Object {

    public int age;
    double weight;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // in this one this defines d1 and obj defines d2 both have same address so it gives value true otherwise fasle.
            return true;

        if (this.getClass() != obj.getClass())
            return false;

        Duck duck = (Duck) obj;
        return this.age == duck.age && this.weight == duck.weight;

    }
}

class Duck2 {
    int age;
    double weight;
}
