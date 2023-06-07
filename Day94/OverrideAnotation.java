//we should use @Override annotation while overriding a method in the child class to mark that method

class OverrideAnotation{
    public static void main(String args[]) {
        Nick n = new Nick();
        n.sayHi();
        
    }
}



class Hello {
    void sayHi() {
        System.out.println("hello!");
    }
}
class Nick extends Hello {
    @Override
    void sayHi() {
        System.out.println("Nick");
    }
}