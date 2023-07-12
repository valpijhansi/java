import java.util.Scanner;

public class Employee {
    int employeeNumber;
    float compensation;

    public void getValues() {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the EmployeeNumber: ");
        employeeNumber = sc.nextInt();
     
        System.out.print("Enter the  Compenstaion value : ");
        compensation = sc.nextFloat();
        
    }

    public void display() {
        System.out.println("Emplyee IdNum : " + employeeNumber);
        System.out.println("Compensation climed : " + compensation);

    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getValues();
        e.display();
    }

    
}
