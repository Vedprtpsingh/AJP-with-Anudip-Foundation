<<<<<<< HEAD
/*1.Write a Java program to associate the specified value with the specified key in a HashMap. */
import java.util.HashMap;

public class Ques1 {

    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Call the write method to add and display key-value pairs
        write(map);
    }

    public static void write(HashMap<String, Integer> map) {
        // Add multiple key-value pairs to the HashMap
        map.put("DBMS", 82);
        map.put("COA", 91);
        map.put("DS", 83);
        map.put("WT", 74);

        // Print the HashMap contents
        System.out.println("HashMap Contents: " + map);
        
        // Accessing values associated with each key
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key (Sub): " + key + ", Value (Marks): " + value);
        }
    }
}
=======
/*1.Write a Java program to associate the specified value with the specified key in a HashMap. */
import java.util.HashMap;

public class Ques1 {

    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Call the write method to add and display key-value pairs
        write(map);
    }

    public static void write(HashMap<String, Integer> map) {
        // Add multiple key-value pairs to the HashMap
        map.put("DBMS", 82);
        map.put("COA", 91);
        map.put("DS", 83);
        map.put("WT", 74);

        // Print the HashMap contents
        System.out.println("HashMap Contents: " + map);
        
        // Accessing values associated with each key
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key (Sub): " + key + ", Value (Marks): " + value);
        }
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
