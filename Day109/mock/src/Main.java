class Main {

        public static void main(String[] args) {

            System.out.println(Main1.multiply(12.5 , 13.6));
            System.out.println(Main1.multiply(2,3,6));

        }
    }

    class Main1 {
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

