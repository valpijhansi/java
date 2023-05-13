import java.util.*;

class vector1 {
    public static void main(String args[]) {
        Vector<Integer> v = new Vector<>();
        v.add(100);
        v.add(200);
        v.add(250);
        v.add(300);
        v.add(400);
        v.remove((Integer) 100);
        v.remove((Object) 200);
        v.remove(0);// it removes wht ever the element in 0th index

        System.out.println(v);
    }
}