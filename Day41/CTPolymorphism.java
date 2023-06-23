//Compile_time polymorphism means having same method with different parameters.
//Ex:Method overloading
class CTPolymorphism {
    public static void main(String[] args) {

       Main m = new Main();
      // m.multiply(23,45);
       m.multiply(2,4,6);
       m.multiply(23.5, 35.0);

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
