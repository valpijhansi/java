import java.util.*;
class StackOverFlow {
    public static void main(String args[]) {
        num();
        
    }
    static int count =1;
   public static void num() {
       if(count<=10000) {
        System.out.println("jaanu");
        count++;
        num();
       }
    }

}