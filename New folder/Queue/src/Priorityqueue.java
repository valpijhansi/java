import java.util.*;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(21);
        pq.add(5);
        pq.add(1);
        System.out.println(pq);//the priorityQueue is based on the priority of the element
        System.out.println(pq.contains(5));//it checks whether the element is present in the queue and returns boolean value
        System.out.println(pq.remove(21));//it removes the specific element from the queue and returns boolean value
        System.out.println(pq);
        System.out.println(pq.comparator());
        System.out.println(pq.offer(12));//it inserts the value into queue and returns the boolean value
        System.out.println(pq);


    }
}
