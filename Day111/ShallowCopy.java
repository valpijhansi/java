public class ShallowCopy {
    public static void main(String[] args) {
        Copy c = new Copy();
        c.a = 10;
        c.b = 40;

         System.out.print(c.a+" ");
         System.out.println(c.b+" ");
        
         Copy c1 = c;//if we change the value of variable in the c1 object it will automatically effect on object c
         System.out.print(c1.a+" ");
         System.out.println(c1.b+" ");
        
    }
}
class Copy {
    int a ;
    int b;

    
}