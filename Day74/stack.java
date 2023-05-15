//stack class is a sub class of the Vector class and represents a last-in-first-out stack of objects.
import java.util.*;

class stack {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(10);// it means that inserting an element into stack
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);//
    }
}