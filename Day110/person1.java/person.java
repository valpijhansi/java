import java.util.*;
class person {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.stu = new Student();
        s2 = null;
        s1.stu.stu = new Student();
        s1.stu.stu.id = 10;
        System.out.println(s1.stu.stu);
        
        
    }
}
class Student {
    Student stu;
     int id;
    String college;
    @Override
    public String toString() {
        return "Student [stu=" + stu + ", id=" + id + ", college=" + college + "]";
    }
 
    
    
}