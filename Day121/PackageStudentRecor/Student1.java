package PackageStudentRecor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import java.util.regex.Pattern;

 public class Student1 {
    static List<Student1> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    

   
 private String name;

 private int ID;
 private double GPA;
 private String email;   
private static String EMAIL_REGEX = "^\\D[0-9a-z]{5,29}@[a-z]{2,10}[.][a-z]{2,3}";
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

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
    
    static String isValidName() {
        String name;
        boolean res;
        String name1 ="";
        scan.nextLine();
        do {
            System.out.print("Enter  name of the Student: ");
            name = scan.nextLine();

            res = Pattern.matches("[a-zA-z][A-Za-z/s]{2,20}", name);

            try {
                
                if (!name.equals(res)) {
                throw new Exception("Given name does not match the expected name");
                   
                }
                
            
              
            } catch (Exception e) {
                System.out.println(e.getMessage());
            
               
            }
            if(res) {
                String str = name.toLowerCase();
                boolean flag=true;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>64&&str.charAt(i)<91)  
                             name1 = name1+ str.charAt(i);  
                    else if(flag==true){
                        name1 = name1+ (char)(str.charAt(i)-32);
                        flag=false;
                    }
                    else if(str.charAt(i)==' '){
                        name1 = name1+(" ");
                        flag=true;
                    }
                    else{
                              name1 = name1 + str.charAt(i);
                    }
                        }
            }

            else {
                System.out.println(" name is not valid: ");
            }

        } while(!res);

        return name1;
    }



    static int isValidID() { 
        boolean flag = false;
        int id;
        if(list.size()==0) {
            do{
                System.out.print("Enter Student ID: ");
                id = scan.nextInt();
                
                 try {
                if (id < 0 || id > 100) {
                    throw new InputMismatchException("Invalid ID");
                }
                
                
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                
            }
            if(id>=1 && id<=100){
                    flag = true;
                }
                
            } while(!flag);
           
        }
        else {
            do {
                System.out.print("Enter Student ID: ");
                id = scan.nextInt();
                int count = 0;
                boolean flag1 = false;
                for (var record : list) {
                    if (record.ID == id &&(id >=1 && id<=100)) {
                        System.out.println("ID already exist, please enter valid ID");
                        count++;
                        flag1 = true;
                       
                    }
                    
                }
                if(count==0 && (id >=1 && id<=100)) {
                    flag = true;
                }
                else if(!flag1) {
                    System.out.println(" ID between From 1 to 100");
                }

            } while (!flag);
        }
        return id;
    }





    static String  isValidEmail() {
        String gmail;
        boolean result;
        scan.nextLine();
        do {

            System.out.print("Enter Mail ID : ");
             gmail = scan.next();
            result = Pattern.matches(EMAIL_REGEX, gmail);
            try {
                
                if (!gmail.equals(result)) {
                    throw new Exception("Given mail does not match the expected one");
                }
            
            
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            
            }
            
            if(result);
            
            
           else {
          
              System.out.println("Enter valid mail ");

        } 

     } while(!result);
      return gmail;
    }




   static double isValidGPA() {
        boolean res= false;
        double gpa;
        do {
            System.out.print("Enter student GPA: ");
            gpa = scan.nextDouble();
            try {
                if (gpa < 0 || gpa > 10) {
                    throw new InputMismatchException("Invalid GPA");
                }
                
                
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                
            }
            if(gpa>0 && gpa<=10) {
                res = true;
            }
            if(res);
            else
                System.out.println("Please enter a valid GPA from 0 to 10");
        } while(!res);

        return gpa;

    }


   




    
    static void addStudent(int id,String name,String email,double gpa) {
        
        Student1 s1 = new Student1();
        s1.name = name;
        s1.ID = id;
        s1.email = email;
        s1.GPA = gpa;

        list.add(s1);
        System.out.println("Student data added successfully.");
        System.out.println();
    }

     static boolean isValidEmail(String email) {
        return EMAIL_REGEX.matches(email);
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
 
        System.out.println("\nSorted by ");
        for (int i=0; i<Student1.list.size(); i++)
            System.out.println(Student1.list.get(i));
           
    }
   static class Sortbyroll implements Comparator<Student1>
{
    
    public int compare(Student1 a, Student1 b)
    {
        return a.ID- b.ID;
    }

    

    
}
@Override
public String toString() {
    return "Student1 [name=" + name + ", ID=" + ID+ ", GPA=" + GPA + ",Email_REGEX="+email+"]";
}



   
    }




