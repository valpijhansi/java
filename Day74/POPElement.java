import java.util.*;

class POPElement {
    public static void main(String args[]) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s.pop());// it removes and returns top element of the stack
        System.out.println(s.peek());//it returns the element on the top of the stack but does not remove it
    }
}