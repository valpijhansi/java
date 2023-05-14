import java.util.*;

class ClearElement {
    public static void main(String args[]) {

        LinkedList list = new LinkedList();
        list.add(12);
        list.add(43.54);

        list.add("asdf");
        list.add("mock");
        list.add(true);
        list.addFirst("jaanu");
        list.addLast("lucky");
        list.clear();//this method removes all the elements in the list.
        System.out.println(list);

    }
}