//Compile_time polymorphism means having same method with different parameters.
//Ex:Method overloading
class CTPolymorphism {
    public static void main(String[] args) {

        System.out.println(Main.multiply(12.5 , 13.6));
        System.out.println(Main.multiply(2,3,6));

    }
}

class Main {
    static int multiply(int a, int b) {
        return (a * b);

    }

    static double multiply(double c, double d) {
        return (c * d);
    }

    static int multiply(int x, int y, int z) {
        return (x * y * z);
    }

}
