//if an interface having only method then we can call it as a functional inter face
class functionalInterface {
    public static void main(String[] args) {

        Dog d1 = new Dog() {

            @Override
            public void bark() {

                System.out.println("Bow Bow");

            }

        };

        d1.bark();
    }
}

interface Dog {
    
    void bark();
}