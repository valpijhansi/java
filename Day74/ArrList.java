import java.util.*;

class ArrList {
    public static void main(String args[]) {
        int size = 10000000;
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        int arr[] = new int[10000000];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Added 1000000:" + (end - start) + "ms");
        ArrayList<Integer> li = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            li.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Added 100000:" + (end - start) + "ms");
    }
}