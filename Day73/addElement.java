import java.util.*;

class addElement {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(43.54);
        list.add("asdf");
        list.add("mock");
        list.add(true);
        list.addFirst("jaanu");//the element can be added at the first 
        list.addLast("lucky");//this element can be added at the last i
        System.out.println(list);
    }
}