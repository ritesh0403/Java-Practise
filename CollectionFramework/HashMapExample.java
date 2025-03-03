import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Creating a HashMap - O(1) & O(n)  
        HashMap<Integer, String> map = new HashMap<>();
        // __

        // 2. Adding elements - O(1) & O(n)  
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        // __

        // 3. Getting a value by key - O(1) & O(1)  
        String value = map.get(2);
        System.out.println("Value at key 2: " + value);
        // Output: Two
        // __

        // 4. Checking if a key exists - O(1) ^ O(n - Due to hash Collision) & O(1)  
        boolean hasKey = map.containsKey(1);
        System.out.println("Contains key 1? " + hasKey);
        // Output: true
        // __

        // 5. Checking if a value exists - O(n) & O(1)  
        boolean hasValue = map.containsValue("Three");
        System.out.println("Contains value 'Three'? " + hasValue);
        // Output: true
        // __

        // 6. Removing an element by key - O(1) & O(1)  
        map.remove(3);
        System.out.println("Map after removing key 3: " + map);
        // Output: {1=One, 2=Two}
        // __

        // 7. Replacing a value - O(1) & O(1)  
        map.replace(2, "Twenty");
        System.out.println("Map after replacing key 2: " + map);
        // Output: {1=One, 2=Twenty}
        // __

        // 8. Getting size of the map - O(1) & O(1)  
        int size = map.size();
        System.out.println("Map size: " + size);
        // Output: 2
        // __

        // 9. Checking if map is empty - O(1) & O(1)  
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);
        // Output: false
        // __

        // 10. Iterating over keys - O(n) & O(1)  
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }
        // Output: Keys printed
        // __

        // 11. Iterating over values - O(n) & O(1)  
        for (String val : map.values()) {
            System.out.println("Value: " + val);
        }
        // Output: Values printed
        // __

        // 12. Iterating over key-value pairs - O(n) & O(1)  
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Output: Key-value pairs printed
        // __

        // 13. Merging values - O(1) & O(1)  
        map.merge(2, "Updated", (oldVal, newVal) -> oldVal + " & " + newVal);
        System.out.println("Map after merging: " + map);
        // Output: {1=One, 2=Twenty & Updated}
        // __

        // 14. Replacing all values - O(n) & O(1)  
        map.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("Map after replacing all values: " + map);
        // Output: {1=ONE, 2=TWENTY & UPDATED}
        // __

        // 15. Getting a value with default if key is missing - O(1) & O(1)  
        String defaultValue = map.getOrDefault(4, "Default");
        System.out.println("Value at key 4: " + defaultValue);
        // Output: Default
        // __

        // 16. Computing a value - O(1) & O(1)  
        map.compute(2, (k, v) -> v + " Computed");
        System.out.println("Map after computing key 2: " + map);
        // Output: {1=ONE, 2=TWENTY & UPDATED Computed}
        // __

        // 17. Computing a value if absent - O(1) & O(1)  
        map.computeIfAbsent(5, k -> "Five");
        System.out.println("Map after computing if absent: " + map);
        // Output: {1=ONE, 2=TWENTY & UPDATED Computed, 5=Five}
        // __

        // 18. Computing a value if present - O(1) & O(1)  
        map.computeIfPresent(1, (k, v) -> v + " Present");
        System.out.println("Map after computing if present: " + map);
        // Output: {1=ONE Present, 2=TWENTY & UPDATED Computed, 5=Five}
        // __

        // 19. Clearing the map - O(n) & O(1)  
        map.clear();
        System.out.println("Map after clearing: " + map);
        // Output: {}
        // __
    }
}
