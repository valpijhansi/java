class Super {
    public static void main(String[] args) {
        Inner n = new Inner();

    }
}

class Inner {

    Inner() {

        System.out.println("0 param");
    }

    Inner(int x) {
    
        System.out.println("1 param");
    }

    Inner(int x, int y) {
        this(3);
        System.out.println("2 param");
    }
}