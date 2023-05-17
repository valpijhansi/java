import java.util.*;
public class queueOperations {
    public static void main(String[] args) {
        Queue<Integer>queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.remove();//This function removes first element in the queue
        queue.offer(35);//this function  makes that adds an element at the end of queue
        System.out.println(queue.size());//it returns the size of the queue
        //System.out.println(queue);
        System.out.println(queue.poll());//remove and returns the top element
        System.out.println(queue);
        System.out.println(queue.element());//it returns top element and doesn't remove.
        System.out.println(queue.peek());//it returns top element in the queue.
        queue.clear();//it removes all the elements in a queue
        System.out.println(queue);

    }
}
