import java.util.*;
class Main {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String args[]) {
        int noOfPlayers = 5;
        for(int i =1;i<=noOfPlayers;i++) {
            map.put(i,1);

        }
        map.put(2,0);
        System.out.println(map.get(3));
        System.out.println(map.get(2));
        int[] arr = new int[noOfPlayers];
        Arrays.fill(arr,1);
        arr[3] = 0;
        System.out.println(arr[3]);
    }
}