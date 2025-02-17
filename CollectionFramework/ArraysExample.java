import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 1, 3};

        // 1. Sorting an array
        Arrays.sort(numbers);
        // Use case: Sorting elements in ascending order
        // Return type: void
        // When to use: When you need to arrange elements in sorted order
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        // Output: [1, 2, 3, 5, 8]

        // 2. Binary Search in a sorted array
        int index = Arrays.binarySearch(numbers, 3);
        // Use case: Finding an element in a sorted array
        // Return type: int (index of the element or negative if not found)
        // When to use: When searching for an element in a sorted array
        System.out.println("Index of 3: " + index);
        // Output: 2 (position of 3 in sorted array)

        // 3. Copying an array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        // Use case: Creating a new array with the same elements
        // Return type: int[] (new copied array)
        // When to use: When you need a duplicate of the array
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
        // Output: [1, 2, 3, 5, 8]

        // 4. Filling an array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        // Use case: Assigning the same value to all elements
        // Return type: void
        // When to use: When initializing an array with a default value
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
        // Output: [7, 7, 7, 7, 7]

        // 5. Comparing two arrays for equality
        boolean isEqual = Arrays.equals(numbers, copiedArray);
        // Use case: Checking if two arrays have the same content
        // Return type: boolean
        // When to use: When comparing arrays for exact equality
        System.out.println("Are arrays equal? " + isEqual);
        // Output: true

        // 6. Converting an array to a String
        String arrayString = Arrays.toString(numbers);
        // Use case: Getting a string representation of the array
        // Return type: String
        // When to use: When you need to print or store the array as a string
        System.out.println("Array as String: " + arrayString);
        // Output: [1, 2, 3, 5, 8]

        // 7. Creating a parallel sort
        int[] largeNumbers = {9, 4, 7, 3, 2, 6};
        Arrays.parallelSort(largeNumbers);
        // Use case: Sorting large arrays using multiple threads
        // Return type: void
        // When to use: When sorting large datasets efficiently
        System.out.println("Parallel Sorted Array: " + Arrays.toString(largeNumbers));
        // Output: [2, 3, 4, 6, 7, 9]
    }
}
