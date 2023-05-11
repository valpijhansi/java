import java.util.*;

class arrListSort {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(70);
        list.add(30);
        list.add(45);
        Collections.sort(list);//sorting the numbers
        for(int i : list) {
            System.out.println(i);
        }
    }
}