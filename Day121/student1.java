
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import java.util.regex.Pattern;

 class Student1 {
    static List<Student1> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    

    String name;

     static int ID;
     double GPA;
     
     private static String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

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
    static int isIDValid() {
        boolean flag = false;
        int id;
        if(list.size()==0) {
            System.out.print("Enter the Student Ind: ");
            id = scan.nextInt();
        }
        else{
            do {
                System.out.print("Enter Student Id: ");
                id = scan.nextInt();
                int count = 0;
                for(var y : list) {
                    if(y.ID == id) {
                        System.out.println("Id already exists  ");
                        count++;
                    }
                }
                if(count==0) {
                    flag = true;
                }
            }while(!flag);
        }
        return id;
    }


    static String isValiEmail() {
        boolean res;
         do {
            
            int count = 0; 
            System.out.println("Enter your gmail account : ");
            String input = scan.next();
            res = Pattern.matches(EMAIL_REGEX, input);

            if (res)
                System.out.println("You are loged in");

            else {
                System.out.println("Please enter a valid gmail");
                count++;
                if (count == 0) {
                    res = true;
                }
            }

        } while (!res);
        return EMAIL_REGEX;
    }


    
    static void addStudent() {
        Student1 st = new Student1();
        System.out.println("Add the new Student data :");

        System.out.print("Name: ");
        st.name = scan.next();

        // System.out.print("ID: ");
        // st.ID = scan.nextInt();
        // //st.isIDValid();
       
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
         
        for (int i=0; i<Student1.list.size(); i++)
            System.out.println(Student1.list.get(i));
 
        Collections.sort(Student1.list, new Student1.Sortbyroll());
 
        System.out.println("\nSorted by rollno");
        for (int i=0; i<Student1.list.size(); i++)
            System.out.println(Student1.list.get(i));
           
    }
   static class Sortbyroll implements Comparator<Student1>
{
    
    public int compare(Student1 a, Student1 b)
    {
        return a.ID - b.ID;
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
                        Student1.isIDValid();
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
                          Student1.sortedData();

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
