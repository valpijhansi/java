

import java.util.HashMap;
import java.util.Map;

 public class BouquetDataStructure {
    
    private static Map<String, String> bouquetMap = new HashMap<>();

    public static void main(String[] args) {
        initializeBouquetData();
        
        String input1 = "Red Rose";
        String input2 = "Pink Lily";
        
        System.out.println("Output for " + input1 + ": " + checkBouquetExists(input1));
        System.out.println("Output for " + input2 + ": " + checkBouquetExists(input2));
    }

    private static void initializeBouquetData() {
        bouquetMap.put("Red Rose", "Bouquet!");
        bouquetMap.put("Pink Lily", "None");
    }
    
    private static String checkBouquetExists(String input) {
        return bouquetMap.getOrDefault(input, "None");
    }
}