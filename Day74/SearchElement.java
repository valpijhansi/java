import java.util.*;

class SearchElement {
    public static void main(String args[]) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s.search("C"));//it returns the position of a given object in stack
        System.out.println(s.size());//it returns the size of the stack
        
    }
}