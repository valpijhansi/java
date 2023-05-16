import java.util.*;
public class iterator {
    public static void main(String[] args) {
        Queue<Integer>queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
//       Iterator it = queue.iterator(); it is just like looping process
//       while(iterator.hasNext()) {
//           System.out.println(iterator.next());
        int size = queue.size();
        for(int i = 0;i<size;i++){
            System.out.println(queue.poll());
       }
        System.out.println(queue);
    }
}
