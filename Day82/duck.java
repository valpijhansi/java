 public class duck{ 
    
    public static void main(String[] args) {

        Duck d1 =() -> {

                System.out.println("qwak,qwak");

        };

        d1.bark();
    }
}

interface Duck {
    
    void bark();

}