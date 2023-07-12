import java.util.Arrays;
import java.util.Scanner;

public class Result {

    

int rollNo;

String name;
int marks[] = new int[3];

public void inputValues() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the RollNo: ");
    rollNo = sc.nextInt();
    
    System.out.print("Enter the Name: ");
    name = sc.next();

    for (int i = 0; i < marks.length; i++) {
        System.out.print("Enter marks for subject " + (i + 1) + ": ");
        marks[i] = sc.nextInt();
    }

    }
   public void show() {
    System.out.println("Roll_no: " + rollNo);
    
    System.out.println("Name : " + name);
    
    System.out.println(Arrays.toString(marks));
   }
   public int  total() {
    int sum = 0;
    for(int i = 0;i<marks.length;i++) {
        sum += marks[i];
        
    }
    return sum;
   // System.out.println(sum);
   }

   public double Average() {
     return total()/marks.length;
   }
    

public static void main(String[] args) {
    Result r = new Result();
    r.inputValues();
    r.show();
    System.out.println(r.total());
    System.out.println(r.Average());
}


}
