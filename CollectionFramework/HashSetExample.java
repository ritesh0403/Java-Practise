import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Creating a HashSet - O(1) & O(n)  
        HashSet<Integer> set = new HashSet<>();
        // __

        // 2. Adding elements - O(1) & O(n)  
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set after adding elements: " + set);
        // Output: [1, 2, 3]
        // __

        // 3. Checking if an element exists - O(1) & O(1)  
        boolean hasElement = set.contains(2);
        System.out.println("Contains element 2? " + hasElement);
        // Output: true
        // __

        // 4. Removing an element - O(1) & O(1)  
        set.remove(3);
        System.out.println("Set after removing element 3: " + set);
        // Output: [1, 2]
        // __

        // 5. Getting size of the set - O(1) & O(1)  
        int size = set.size();
        System.out.println("Set size: " + size);
        // Output: 2
        // __

        // 6. Checking if set is empty - O(1) & O(1)  
        boolean isEmpty = set.isEmpty();
        System.out.println("Is set empty? " + isEmpty);
        // Output: false
        // __

        // 7. Iterating over elements - O(n) & O(1)  
        for (Integer element : set) {
            System.out.println("Element: " + element);
        }
        // Output: Elements printed
        // __

        // 8. Converting to array - O(n) & O(n)  
        Object[] array = set.toArray();
        System.out.println("Set as array: " + Arrays.toString(array));
        // Output: [1, 2]
        // __

        // 9. Adding all elements from another collection - O(n) & O(n)  
        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.add(4);
        anotherSet.add(5);
        set.addAll(anotherSet);
        System.out.println("Set after adding another collection: " + set);
        // Output: [1, 2, 4, 5]
        // __

        // 10. Retaining only common elements - O(n) & O(1)  
        set.retainAll(anotherSet);
        System.out.println("Set after retaining common elements: " + set);
        // Output: [4, 5]
        // __

        // 11. Removing all elements from another collection - O(n) & O(1)  
        set.removeAll(anotherSet);
        System.out.println("Set after removing another collection: " + set);
        // Output: []
        // __

        // 12. Cloning a HashSet - O(n) & O(n)  
        HashSet<Integer> clonedSet = (HashSet<Integer>) set.clone();
        System.out.println("Cloned Set: " + clonedSet);
        // Output: []
        // __

        // 13. Creating an immutable set (Java 9+) - O(n) & O(n)  
        Set<Integer> immutableSet = Set.of(6, 7, 8);
        System.out.println("Immutable Set: " + immutableSet);
        // Output: [6, 7, 8]
        // __

        // 14. Clearing the set - O(n) & O(1)  
        set.clear();
        System.out.println("Set after clearing: " + set);
        // Output: []
        // __
    }
}
