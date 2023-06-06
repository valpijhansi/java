@FunctionalInterface
interface Mock {
    

    void hello(int x,int y);
}

class ConstructorReference {
    public static void main(String args[]) {
        Mock rock = ConstructorReference::new;
        rock.hello(2,4);
       
    }
    ConstructorReference(){
        System.out.println("Hello");
    }
    ConstructorReference(int a,int b){
        System.out.println(a+b);
    }

}
class Roast {
    static public void syHello(String str) {
        System.out.println("Hello"+str);
        System.out.println("Uppercase"+str.toUpperCase());
        System.out.println("LowerCase"+str.toLowerCase());
        int a = 10;
        int b = 20;
        System.out.println("you are"+a+b);
    }
}