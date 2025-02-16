import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<Integer> set = new HashSet<>();
        
        // Adding elements
        set.add(1);
        set.add(2);
        set.add(3);
        
        // Checking if an element exists
        boolean hasElement = set.contains(2);
        
        // Removing an element
        set.remove(3);
        
        // Getting size of the set
        int size = set.size();
        
        // Checking if set is empty
        boolean isEmpty = set.isEmpty();
        
        // Iterating over elements
        for (Integer element : set) {
            System.out.println("Element: " + element);
        }
        
        // Converting to array
        Object[] array = set.toArray();
        
        // Adding all elements from another collection
        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.add(4);
        anotherSet.add(5);
        set.addAll(anotherSet);
        
        // Retaining only common elements
        set.retainAll(anotherSet);
        
        // Removing all elements from another collection
        set.removeAll(anotherSet);
        
        // Cloning a HashSet
        HashSet<Integer> clonedSet = (HashSet<Integer>) set.clone();
        
        // Creating an immutable set (Java 9+)
        Set<Integer> immutableSet = Set.of(6, 7, 8);
        
        // Clearing the set
        set.clear();
    }
}
