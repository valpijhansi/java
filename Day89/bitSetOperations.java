import java.util.*;
class bitSetOperations {
    public static void main(String args[]) {
        BitSet data1 = new BitSet();
        data1.set(5);
        data1.set(20);
        data1.set(25);

        BitSet data2 = new BitSet();
        data2.set(40);
        data2.set(55);

        System.out.println(data1);
        System.out.println(data2);

        data1.and((data2));
        data1.or(data2);
        data1.xor(data2);

        System.out.println(data1);
        System.out.println(data2);


    }
}