import java.util.Vector;

class vector {
    public static void main(String args[]) {
        Vector item = new Vector();
        int a[] = new int[5];
        item.add(10);
        item.add(20);
        item.add(30);
        item.add(40);
        item.add("asd");
        item.remove(2);
        System.out.println(item);

    }
}