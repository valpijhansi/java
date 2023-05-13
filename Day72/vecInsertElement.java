import java.util.*;

class vecInsertElement {
    public static void main(String args[]) {
        Vector<Integer> v = new Vector<>();
        v.add(100);
        v.add(200);
        v.add(300);
        v.add(400);
        v.add(500);
        v.insertElementAt(250, 2);// we can insert element like this

        System.out.println(v);

    }
}