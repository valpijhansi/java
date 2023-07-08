import java.util.Scanner;

public class Student1 {
    String name;
    String ID;
    String email;
    double GPA;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addStudent(String name,String id,String email,double gpa) {
        System.out.println("Name:"+name+" "+"ID: "+id+" "+"Email: "+email+" "+"Marks: "+gpa);
        System.out.println("Student data recorded succesfully");
    }

}
