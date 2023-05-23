class initializerBlock {
    public static void main(String args[]) {
        dog d = new dog();
        dog d1 = new dog();
        dog d2 = new dog();

    }
} 
class dog {
    String name;
    int age;
public dog() {
    System.out.println("default constructor");
}
{
    System.out.println("Initializer block");
}
static {
    System.out.println("static block");//whenever we have static block first it will execute first and only once. 
}
}