 public class InterfaceConcrete implements hello{
    public static void main(String[] args) {

        InterfaceConcrete IC = new InterfaceConcrete();

        IC.say();

        hello.sayHi();
    }

}
interface hello {

    default void say() { 

        System.out.println("hi");

    }

    static void sayHi() { 

        System.out.println("This is a page");
    }

}