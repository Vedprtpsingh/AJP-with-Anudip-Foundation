// Import the necessary classes
import java.util.Map;
import java.util.TreeMap;

public class Ques2 {
    public static void main(String[] args) {
        // Initialize a TreeMap that stores String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Add key-value pairs to the TreeMap
        // Note: TreeMap will automatically sort these by key in alphabetical order
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);
        
        // Display the original TreeMap
        System.out.println("TreeMap: " + treeMap);

        // 1. Using entrySet()
        System.out.println("\n1. Using entrySet() with for-each loop:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 2. Using keySet()
        System.out.println("\n2. Using keySet() with for-each loop:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // 3. Using values()
        System.out.println("\n3. Using values() collection:");
        for (Integer value : treeMap.values()) {
            System.out.println("Value: " + value);
        }

        // 4. Using forEach()
        System.out.println("\n4. Using forEach() method:");
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // 5. Using descendingMap()
        System.out.println("\n5. Using descendingMap() - reverse order:");
        for (Map.Entry<String, Integer> entry : treeMap.descendingMap().entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 6. Using firstEntry() and lastEntry()
        System.out.println("\n6. Using firstEntry() and lastEntry():");
        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());

        // 7. Using Navigation Methods
        System.out.println("\n7. Using Navigation Methods:");
        String searchKey = "Two";
        System.out.println("Floor entry for 'Two': " + treeMap.floorEntry(searchKey));  // ≤
        System.out.println("Lower entry for 'Two': " + treeMap.lowerEntry(searchKey));  // <
        System.out.println("Ceiling entry for 'Two': " + treeMap.ceilingEntry(searchKey));  // ≥
        System.out.println("Higher entry for 'Two': " + treeMap.higherEntry(searchKey));  // >

        // 8. Using SubMap to get a subset of the map
        System.out.println("\n8. Using SubMap:");
        System.out.println("Subset from 'One' to 'Three':");
        TreeMap<String, Integer> subMap = new TreeMap<>(treeMap.subMap("One", true, "Three", true));
        subMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // 9. Using pollFirstEntry() and pollLastEntry() to remove first/last entries
        System.out.println("\n9. Using pollFirstEntry() and pollLastEntry():");
        System.out.println("Removed first entry: " + treeMap.pollFirstEntry());
        System.out.println("Removed last entry: " + treeMap.pollLastEntry());
        System.out.println("Remaining entries: " + treeMap);
    }
}
