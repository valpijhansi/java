import java.util.*;

class ISemptyMethod {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(10);// it means that inserting an element into stack
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        System.out.println(s.isEmpty());//this method checks wether the stack is empty or not and returns the Boolean values
    }
}