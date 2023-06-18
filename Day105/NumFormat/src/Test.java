public class Test {
    public static void main(String[] args) {
        greeting g = new greeting(){
            public void greeting(String name){
                System.out.println("hello"+name);
            }
            @Override
            public void greet(){
                System.out.println("Greetings...!");
            }
        };
        g.greet();
    }
}
class greeting{
    public void greet() {
        System.out.println("Greetings...!");
    }
}
