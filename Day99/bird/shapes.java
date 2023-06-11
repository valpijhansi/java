

/**
 * This packege contains different classes whic are relating to shapes like Rectangle,sphere,............etc.
 * @author jhansi
 * @since 2021
 * @version 2.0
 */
package bird;



/**
 * This is also one of the in built package in java .
 * It is imported becuase to implement some Math funtions
 */
import java.lang.*;
/**
 * It is class which is realting to geometrical Shapes.
 */
public class shapes {
    /**
     * @param args
     * @exception
     */
    public static void main(String args[])  throws Exception {

    
       System.out.println( Rectangle.area(10,30));
    
        

    }


    /**
     * this is one of the class 
     * It is no longer in use because we can declare it as deprecated Annotation
     */
    @Deprecated
   static class Rectangle {
        int length;
        int breadth;
        /**
         * @return
         */
        public int getLength() {
            return length;
        }
        /**
         * @return
         */
        public int getBreadth() {
            return breadth;
        }
        /**
         * @param a
         * @return
         * @throws
         */
        static int area(int length,int breadth)  throws Exception {
            return length * breadth;
        }
    }

    
    class Circle {
        double radius;

        /**
         * @return
         */
        public double getRadius() {
            return radius;
        }
        
        /**
         * @param r
         * @return
         */
        public double area(double r) {
            return 2*Math.PI*r*r;
        }
    }




    class sphere extends Circle {

 /**
 * @param radius
 * @return
 * @override
 * we can override method because we can extend sphere class from cricle
 */
@Override
public double area(double radius) {
    return 4*Math.PI*radius * radius;
 }

    } 


    class Square {
        int a;
        /**
         * @param a
         * @return
         */
        public int area(int a) {
            return a*a;
        }
    }
    
}

