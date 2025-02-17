import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Example list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

        // 1. Sorting a list
        Collections.sort(numbers);
        // Use case: Sorting elements in ascending order
        // Return type: void
        // When to use: When you need to arrange elements in sorted order
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        System.out.println("Sorted List: " + numbers);
        // Output: [1, 2, 3, 5, 8]

        // 2. Finding the maximum element
        int max = Collections.max(numbers);
        // Use case: Getting the largest element in a collection
        // Return type: Element type (Integer here)
        // When to use: When you need the highest value in a list
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("Maximum Element: " + max);
        // Output: 8

        // 3. Finding the minimum element
        int min = Collections.min(numbers);
        // Use case: Getting the smallest element in a collection
        // Return type: Element type (Integer here)
        // When to use: When you need the lowest value in a list
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("Minimum Element: " + min);
        // Output: 1

        // 4. Reversing a list
        Collections.reverse(numbers);
        // Use case: Reversing the order of elements
        // Return type: void
        // When to use: When you need elements in reverse order
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("Reversed List: " + numbers);
        // Output: [8, 5, 3, 2, 1]

        // 5. Shuffling a list
        Collections.shuffle(numbers);
        // Use case: Randomizing the order of elements
        // Return type: void
        // When to use: When you need a randomized list
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("Shuffled List: " + numbers);
        // Output: [random order]

        // 6. Copying elements from one list to another
        List<Integer> copiedList = new ArrayList<>(numbers);
        Collections.copy(copiedList, numbers);
        // Use case: Copying elements from one list to another
        // Return type: void
        // When to use: When you need an exact copy of a list
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("Copied List: " + copiedList);
        // Output: Same as numbers list

        // 7. Filling a list with a specific value
        Collections.fill(copiedList, 0);
        // Use case: Assigning the same value to all elements
        // Return type: void
        // When to use: When initializing/resetting a list with a default value
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("Filled List: " + copiedList);
        // Output: [0, 0, 0, 0, 0]

        // 8. Checking frequency of an element
        int frequency = Collections.frequency(numbers, 3);
        // Use case: Counting occurrences of an element
        // Return type: int
        // When to use: When analyzing data for duplicates
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("Frequency of 3: " + frequency);
        // Output: Count of 3 occurrences
    }
}
