
interface Mock {
    

    void hello(String string);
}
public class Main{
  

    public static void main(String args[]) {

        Mock rock =  Roast::sayHello;
       
     
        rock.hello("Jaanu papa");
    
    }
}
class Roast {
    static public void sayHello(String str) {
        System.out.println("Hello:"+str);
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("LowerCase:"+str.toLowerCase());
        int a = 10;
        int b = 20;
        System.out.println("you are :"+a+b);
    }
}