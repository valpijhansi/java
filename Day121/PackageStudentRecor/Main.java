package PackageStudentRecor;

  import java.util.*;


 public class Main {
    

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         Student1 st = new Student1();
          
       
            boolean result = true;
           
            while (result) {
                System.out.println("Student data record :");
                System.out.println("1. Add Student");
                System.out.println("2. Search Student");
                System.out.println("3. View All Students");
                System.out.println("4. sortedData");
                System.out.println("5. Exit");
                System.out.print("Enter your choice :");
                
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                    String name = Student1.isValidName();
                    int id = Student1.isValidID();
                    String email = Student1.isValidEmail();
                    double gpa = Student1.isValidGPA();
                    Student1.addStudent(id,name,email,gpa);
                         
                        
                      
                        break;
                    case 2:
                        System.out.print("Enter student name to search: ");
                        String name1 = scanner.next();
                        Student1.searchStudent(name1);

                        break;
                    case 3:
                        Student1.viewStudents();
                        break;
                    case 4:
                          System.out.println("enter the name to sort the data");
                          String name2 = scanner.next();
                          Student1.sortedData();

                    case 5:
                      System.out.println("Exit");
                        result = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }

            System.out.println(" ");
        }

  
    }
