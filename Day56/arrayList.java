import java.util.*;

class arrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list.get(0));
        System.out.println(list.set(2, 20));
        System.out.println(list.remove(3));
    }
}