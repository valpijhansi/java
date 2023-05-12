import java.util.ArrayList;

class arryList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.add(10));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(3);
        System.out.println(list.get(0));
        list.add(1,54);
        System.out.println(list.get(1));
    }
}