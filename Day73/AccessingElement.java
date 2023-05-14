import java.util.*;

class AccessingElement {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(43.54);
        
        list.add("asdf");
        list.add("mock");
        list.add(true);
        list.addFirst("jaanu");
        list.addLast("lucky");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}