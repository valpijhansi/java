
import java.util.Vector;

class AccessingElemnts {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(45);
        v.add(50);
   //we can access elements in the given two types
        // for (Integer x : v) {

        // System.out.println(x);
        // }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

    }

}