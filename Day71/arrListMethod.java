import java.util.ArrayList;

class arrListMethods {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2, 70);
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.set(3, 60));
        for (Integer i : list) {
            System.out.println(list);
        }
    }
}