import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Example list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

        // 1. Sorting a list - O(n log n) & O(1) 
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
        // Output: [1, 2, 3, 5, 8]
        // __

        // 2. Finding the maximum element - O(n) & O(1)
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
        // Output: 8
        // __

        // 3. Finding the minimum element - O(n) & O(1)
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);
        // Output: 1
        // __

        // 4. Reversing a list - O(n) & O(1)
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);
        // Output: [8, 5, 3, 2, 1]
        // __

        // 5. Shuffling a list - O(n) & O(1)
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);
        // Output: [random order]
        // __

        // 6. Copying elements from one list to another - O(n) & O(1)
        List<Integer> copiedList = new ArrayList<>(numbers);
        Collections.copy(copiedList, numbers);
        System.out.println("Copied List: " + copiedList);
        // Output: Same as numbers list
        // __

        // 7. Filling a list with a specific value - O(n) & O(1)
        Collections.fill(copiedList, 0);
        System.out.println("Filled List: " + copiedList);
        // Output: [0, 0, 0, 0, 0]
        // __

        // 8. Checking frequency of an element - O(n) & O(1)
        int frequency = Collections.frequency(numbers, 3);
        System.out.println("Frequency of 3: " + frequency);
        // Output: Count of 3 occurrences
        // __
    }
}
