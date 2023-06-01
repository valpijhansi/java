import java.util.HashMap;

public class ReadyToPlay {

    static HashMap<Integer, Boolean> hashMap = new HashMap<>();
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {

            hashMap.put(i, true);
        }

        hashMap.put(7, false);

        hashMap.put(32, negation(hashMap.get(32)));

        hashMap.put(6, negation(hashMap.get(6)));

        hashMap.put(67, negation(hashMap.get(67)));

        hashMap.put(78,negation(hashMap.get(78)));

        System.out.println("Players ready: " + getPlayersReady());
    }
    
    static boolean negation(boolean prevState) {

        return !prevState;
    }

    static int getPlayersReady() {

        int count = 0;

        for(var x : hashMap.values()) {

            if(x)

                count++;

        }

        return count;
    }
}