// Import the TreeMap class
import java.util.TreeMap;
public class NumberPrinter {
    public static void main(String[] args) {
        // Initialize a TreeMap that stores String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Add key-value pairs to the TreeMap
        // Note: TreeMap will automatically sort these by key in alphabetical order
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        // Display the original TreeMap contents
        // Output will be sorted: {One=1, Three=3, Two=2}
        System.out.println("TreeMap: " + treeMap);

        // Remove the entry with key "Two" and store its value
        // removedValue will contain 2
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value = " + removedValue);

        // Check if the entry with key "Three" exists in the TreeMap
        // containsKey() returns true if the key is present
        boolean isThreePresent = treeMap.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + !isThreePresent);

        // Remove the entry with key "Three"
        // After this operation, only {One=1} will remain
        treeMap.remove("Three");
        
        // Display the final state of the TreeMap
        // Output will show only the remaining entry: {One=1}
        System.out.println("Updated TreeMap: " + treeMap);
    }
}