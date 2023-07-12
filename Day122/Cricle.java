import java.util.InputMismatchException;
import java.util.Scanner;

public class Cricle { 
    private int radius;

    public Cricle() {
        radius = 0;
    }

    public void getRadius() {
        try{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value for radius: ");
        radius = scan.nextInt();

       
         } catch (Exception e){
            System.out.println("Enter the valid one  ");
        }
        System.out.println("Enter the radius :");
    }
       
        
    
     

  public void setRadius(int Radius) {
       
      radius = Radius;
       
        
    }

    public double area() {
        return Math.PI * radius * radius;
        
    }
    public double circumference() {
        return 2 * Math.PI * radius;

    }

    public static void main(String[] args) {
        Cricle c = new Cricle();
        c.getRadius();
        
        System.out.println(c.area());
      System.out.println(  c.circumference());
    }
}
