import java.util.*;
class listIterator {// we can use listIterator because it can do both forword and backWord process but in case only forword process can be done
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,70);
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext())
        System.out.println(listIterator.next());
        while(listIterator.hasPrevious())
        System.out.print(listIterator.previous()+" ");
    }
} 