import java.util.*;

class removeElement {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(43.54);
        list.add("asdf");
        list.add("mock");
        list.add(true);
        list.removeFirst();// it removes the first element
        list.removeLast();// it removes the last element
        System.out.println(list);
    }
}