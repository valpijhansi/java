package Cricle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cricle { 
    private double radius;

    public Cricle() {
        radius = 0;
    }


     public void setRadius(double Radius) {
       
      radius = Radius;
      iSValidRadius();
     }
       
        
    
    
    void iSValidRadius() {
        try{
        if(radius<0) {
            throw new InputMismatchException("radius not less than 0 ");
        }
    }catch(Exception e) {
            System.out.println(e.getMessage());

        }
    System.out.println("It is valid one");
       
    }
       
        
    
     

 

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of a Cricle is : "+area);
        
    }
    public void circumference() {
        double Circum = 2 * Math.PI * radius;
        System.out.println("Circumference of a circle is: "+Circum);
        

    }

    
}
