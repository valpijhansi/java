public class SealedClass {


        public static void main(String[] args) {

            Human h = new Human();
            h.printName();
            Human h1 = new Neel();
            h1.printName();
            Human h2 = new Loki();
            h2.printName();

        }
    }
    sealed class Human  {
        void printName() {
            System.out.println("human class");
        }
    }
    non-sealed  class  Neel extends  Human {
        void printName() {
            System.out.println(" neel class");
        }
    }
    final class Loki extends Human {

        void printName() {
            System.out.println("Loki class");
        }
    }

