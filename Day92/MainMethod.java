
public class MainMethod {
    public static void main(int[] a){
  
      System.out.println("Jaanu papa"); // by explicitly calling this method can execute this one.
  
    }  
    public static void main(String[] args) { // JVM will implicitly execute this one
  
      System.out.println("9381");
  
      // MainMethod.main(args);  when ever we call main method inside main method then StackOverFlow may occur
  
      int[] a ={1,23}; // by explicitly  we can call main method with integer array 
  
      main(a); 
    }
  
      
          
      
  }
    // --> static public void main(String[] args)  we can declare main method as static public 
    // --> static void public main(String[] args)  we can't declare like this, before the method type there must be return type
    // --> static public void main(String[] a)  instead of args we can declare any name
    // --> static public void main(int[] a) we can declare array type as int, double, float etc but it is not consider as starting point of execution,
      