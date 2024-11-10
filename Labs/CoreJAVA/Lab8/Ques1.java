public class Ques1 {
    public static void main(String[] args) {
        // Initialize a TreeMap with values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);
        // Display the original TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Remove the entry with the key "Two"
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value = " + removedValue);

        // Check if the entry with key "Three" is still present
        boolean isThreePresent = treeMap.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + !isThreePresent);
        // Remove the entry with the key "Three"
        treeMap.remove("Three");
        // Display the updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);
    }
}
