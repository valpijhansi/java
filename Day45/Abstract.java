//Abstraction means hiding the data & shows the required information

class Abstract {
    public static void main(String args[]) {
        Horse a = new Horse();
        a.sayHello();
    }

}
 
                                    
abstract class animal {
    abstract public void Makenoise();//we can not access abstract method directly the method can be overriden by other class

    void sayHello() {
        System.out.println("hello jenny");
    }
}

class Horse extends animal {
    public void Makenoise() {

    }
}