import java.util.*;
class ArrayToList {
    public static void main(String args[]) {
        Integer arr[] = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(arr);
        Object[] rock = list.toArray();//parent class can hold the child class object but child class cannot hold parent class object
        //System.out.println(rock);
        for(var x : rock)
        {
            System.out.print(x);
        }
        System.out.println();
        System.out.println(list);
        //System.out.println();
    }
}