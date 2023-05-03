class Is_A {

    public static void main(String args[]) {

        fruit f = new fruit();
        orange o = new orange();
        // f.quantity();
        o.taste();
        o.quantity();

    }
}

class fruit {
    void quantity() {
        System.out.println("quantity in kgs");
    }

}

class orange extends fruit { // when ever one class inherits another class it's have IS-A relation

    void taste() {
        System.out.println("it is citrus ");
    }
}
