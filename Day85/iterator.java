import java.util.*;
class iterator {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(3);
        System.out.println("List:"+num);
        ListIterator<Integer> itr = num.listIterator();
        int num1 = itr.next();
        System.out.println("first element:"+num1);
        int num2 = itr.next();
        System.out.println("second element:"+num2);
        int index1 = itr.nextIndex();
        System.out.println("position of next element:"+index1);
        
    }
}