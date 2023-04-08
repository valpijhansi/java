//print constructor overloading
class rock {
    public static void main(String args[]) {
        rock r = new rock();
        rock r1 = new rock(15, 12);
    }

    rock() {
        System.out.println("empty parameter");
    }

    rock(String msg) {
        System.out.println("single parameter");
    }

    rock(int a, int b) {
        System.out.println("multiple parameter");
    }
}