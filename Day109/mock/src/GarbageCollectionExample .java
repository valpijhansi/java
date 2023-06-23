 class GarbageCollectionExample {

    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Assign obj2 reference to obj1
        obj1 = obj2;

        // Set obj2 to null
        obj2 = null;

        
        System.gc();

        
        System.out.println("garbage Collectin");
    }
}

class MyClass {
    
    public MyClass() {
        System.out.println("Default Constructor");
    }

    
    
}