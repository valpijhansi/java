//with the help of interfce we can achieve complete abstarction and multiple inheritance

class multipleInterface {
    public static void main(String args[]) {
        trees t = new trees();
        t.weight();
        t.quantity();

    }
}

class fruits {
    public void weight() {
        System.out.println("weight measures in kgs");
    }
}

interface mango {
    int quantity = 10;

    public void quantity();
}

class trees extends fruits implements mango {//in a single class we can extend class & also implements interfaces at a time
    public void weight() {
        System.out.println("having different quantities");
    }

    public void quantity() {
        System.out.println("quantity is differ like kgs,liters");
    }
}