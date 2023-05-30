import java.util.*;
class StackUnderFlow {
    public static void main(String args[]) {
        Stack<String> s = new Stack<>();
        s.push("chinnu");
        s.push("munnu");
        s.push("junnu");
        s.push("kinnu");
        System.out.println(s);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s);
    }
}