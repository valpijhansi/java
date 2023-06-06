@FunctionalInterface
interface Fun{
    int mock(int value1,int value2);

    
}
public class MethodRef{
    public static void main(String args[]) {
        int a = 30;
        Fun rock = (x,y) -> { 
        System.out.println(x+y+a);
        return x;
       
     
    };
    rock.mock(4,3);
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