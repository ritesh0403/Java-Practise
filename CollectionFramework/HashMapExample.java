import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        
        // Adding elements
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        // Getting a value by key
        String value = map.get(2);
        
        // Checking if a key exists
        boolean hasKey = map.containsKey(1);
        
        // Checking if a value exists
        boolean hasValue = map.containsValue("Three");
        
        // Removing an element by key
        map.remove(3);
        
        // Replacing a value
        map.replace(2, "Twenty");
        
        // Getting size of the map
        int size = map.size();
        
        // Checking if map is empty
        boolean isEmpty = map.isEmpty();
        
        // Iterating over keys
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }
        
        // Iterating over values
        for (String val : map.values()) {
            System.out.println("Value: " + val);
        }
        
        // Iterating over key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Merging values
        map.merge(2, "Updated", (oldVal, newVal) -> oldVal + " & " + newVal);
        
        // Replacing all values
        map.replaceAll((k, v) -> v.toUpperCase());
        
        // Getting a value with default if key is missing
        String defaultValue = map.getOrDefault(4, "Default");
        
        // Computing a value
        map.compute(2, (k, v) -> v + " Computed");
        
        // Computing a value if absent
        map.computeIfAbsent(5, k -> "Five");
        
        // Computing a value if present
        map.computeIfPresent(1, (k, v) -> v + " Present");
        
        // Clearing the map
        map.clear();
    }
}
