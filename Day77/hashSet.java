import java.util.*;

class hashSet {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = { 11, 2, 3, 5, 8, 9, 4, 6 };
        int target = 10;
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);

        }
        System.out.println(set);
    }
}