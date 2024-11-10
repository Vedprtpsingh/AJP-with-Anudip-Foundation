<<<<<<< HEAD
/*2 Write a Java program to check whether a HashMap contains key-value mappings (empty) or not */
import java.util.HashMap;
public class Ques2 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the HashMap is empty initially
        checkIsEmpty(map);

        // Add multiple key-value pairs to the HashMap
        map.put("DBMS", 82);
        map.put("COA", 91);
        map.put("DS", 83);
        map.put("WT", 74);

        // Check again after adding elements
        checkIsEmpty(map);

        // Display the HashMap contents
        System.out.println("HashMap Contents: " + map);
    }

    // Function to check if a HashMap is empty
    public static void checkIsEmpty(HashMap<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
=======
/*2 Write a Java program to check whether a HashMap contains key-value mappings (empty) or not */
import java.util.HashMap;
public class Ques2 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the HashMap is empty initially
        checkIsEmpty(map);

        // Add multiple key-value pairs to the HashMap
        map.put("DBMS", 82);
        map.put("COA", 91);
        map.put("DS", 83);
        map.put("WT", 74);

        // Check again after adding elements
        checkIsEmpty(map);

        // Display the HashMap contents
        System.out.println("HashMap Contents: " + map);
    }

    // Function to check if a HashMap is empty
    public static void checkIsEmpty(HashMap<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}