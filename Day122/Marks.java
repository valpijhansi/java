import java.util.InputMismatchException;
import java.util.Scanner;

public class  Marks {
    int a;
    int b;
    int c;


    public Marks() {
        a = 0;
        b = 0;
        c = 0;

    }
    public void in() {
        Scanner scan = new Scanner(System.in);
        try{

        System.out.print("Enter the value of a : ");
        a = scan.nextInt();
        
        System.out.print("Enter the second  b : ");
        b = scan.nextInt();
        System.out.print("Enter the value of c : ");
        c = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Expected Integer but not found"); 
        }
            
        }
       
     
    public int Sum()  {
        int result = a + b + c;
        return result;
    }
    public double Avg() {
        double res  = Sum()/3;
        return res;
    }

    
    public static void main(String[] args) {
    Marks m = new Marks();
    
      m.in();
     
      System.out.println( m.Sum());

      System.out.println(m.Avg());
    
        
    }

}

     


