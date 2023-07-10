
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

      int ID;
      double GPA;
    
     
     private static String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public int getID() {
        return ID;
    }

    public double getGPA() {
        return GPA;
    }

     void setGPA(double gPA) {
       this.GPA = gPA;
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
            System.out.print("Enter the Student Id: ");
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

    static String isValidEmail() {
        boolean res;
             String input ;

       
         do {
            
            int count = 0; 
            System.out.print("Enter your gmail account : ");
             input = scan.next();
            res = Pattern.matches(EMAIL_REGEX, input);

            if (res){

            }

            else {
                System.out.println("Please enter a valid gmail");
                count++;
                if (count == 0) {
                    res = true;
                }
            }

        } while (!res);
        return input;
    }

    static double IsvalidGPA() {
        boolean res = false;
        double GPA;
        if(list.size()==0){
        System.out.print("Enter the GPA : ");
        GPA =  scan.nextDouble();
        }
      else{
          do {
             System.out.print("Enter the GPA: ");
             GPA =scan.nextDouble();
            int count = 0;
            for(var marks :list)
              if(marks.GPA == GPA)
              System.out.println("you entered valid one");
              count++;
              if(count == 0) {
                    res = true;
                }
            }while(!res);

        }
        return GPA;
    }

   




    
    static void addStudent(int id,String name,String EMAIL_REGEX,double gpa) {
        Student1 st = new Student1();
        System.out.println("Add the new Student data :");

        System.out.print("Name: ");
        st.name = scan.next();
        
        //System.out.println("Enter the mail Id : ");
        
        isValidEmail(EMAIL_REGEX);
        
        System.out.print("Enter GPA :");
        scan.nextDouble();
       
        list.add(st);
    }

    private static boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }




    static void searchStudent(String name) {
        
        int count = 0;
        for (var x : list) {
            if (x.name.equalsIgnoreCase(name)||x.name.contains(name)||x.name.toLowerCase().contains(name)) {
                System.out.println(x);
                count++;
                break;
            } 
            if(count == 0) {
                System.out.println("Data not found");
            }

        }
        

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
                ", Email_RGEX='" + EMAIL_REGEX+ '\'' +
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
                    // int id  = Student1.isIDValid();
                    // String name = "haritha";
                    // String email = Student1.isValidEmail();
                    // double gpa = Student1.IsvalidGPA();

                        Student1.addStudent();
                         
                        // Student1.IsvalidGPA();
                      
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
                        result = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println(" ");
        }
    }
