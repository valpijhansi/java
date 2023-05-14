import java.util.*;

class OtherMethods {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(43.54);

        list.add("asdf");
        list.add("mock");
        list.add(true);
        list.addFirst("jaanu");
        list.addLast("lucky");

        System.out.println(list.clone());// this method returns shallow copy of the linkedlist.
        System.out.println(list.contains("mock"));// this method returns true if the list contain given specific element
                                                  // otherwise false.
        System.out.println(list.indexOf("jaanu"));// it returns the index of a given object.
        System.out.println(list.peek());// it returns the peek element of the list
        System.out.println(list.size());//it returns the size of the list
    }
}