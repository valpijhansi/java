
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.regex.Pattern;

 class Student1 {
    String name;

     int ID;

    private static String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    
   
    double GPA;

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }
    

    public void setName(String name) {
        this.name = name;
    }

     private Object getName() {
        return name;
    }


    static List<Student1> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    private String id;

    static void addStudent() {
        Student1 st = new Student1();
        System.out.println("Add the new Student data :");

        System.out.print("Name: ");
        st.name = scan.next();

        System.out.print("ID: ");
        st.ID = scan.nextInt();
       
        System.out.print("Eamil: ");
        st.EMAIL_REGEX = scan.next();
        
        if (isValidEmail(EMAIL_REGEX)) {
            
            System.out.println("It is valid one");
        } else {
            System.out.println("Invalid email format. Please try again.");
        }

        System.out.print("GPA: ");
        st.GPA = scan.nextDouble();

        list.add(st);
    }

    private static boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }




    static Student1 searchStudent(String name) {
        Student1 st = new Student1();
        for (Student1 x : list) {
            if (x.getName().equals(st.name)) {
                System.out.println("Student data found");
                return x;
            } else {
                System.out.println("student data not found");
            }

        }
        return null;

    }



   

   

    public static void viewStudents() {
        Student1 student1[] = list.toArray(new Student1[0]);
        if (student1.length> 0) {
            for (int i = 0; i < student1.length; i++) {
                System.out.println(student1[i]);
                
            }
        } else {
            System.out.println("No student records found.");
        }
    }

    static void sortedData() {
        for(Student1 student : list) {
            System.out.println(student);
        
        }
    }



    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", Email_RGEX='" + EMAIL_REGEX + '\'' +
                ", GPA=" + GPA +
                
                '}';
    }
}



class Main {
    

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            boolean result = true;
            while (result) {
                System.out.println("\n Enter the number to perfom an operation ");
                System.out.println("1. Add Student");
                System.out.println("2. Search Student");
                System.out.println("3. View All Students");
                System.out.println("4. sortedData");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Student1.addStudent();
                        break;
                    case 2:
                        System.out.print("Enter student name to search: ");
                        String name = scanner.next();
                        Student1.searchStudent(name);

                        break;
                    case 3:
                        Student1.viewStudents();
                        break;
                    case 4:
                          System.out.println("enter the name to sort the data");
                          String name1 = scanner.next();

                    case 5:
                        result = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println(" ");
        }
    }
