import java.util.*;
class Person1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.college = "Fun";
        s1.id = 112;
        System.out.println(s1);
        rock();
        
    }

   static void rock() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }
}
class Student {
    int id;
    String college;
    @Override
    public String toString() {
        return "Student [id=" + id + ", college=" + college + "]";
    }

}