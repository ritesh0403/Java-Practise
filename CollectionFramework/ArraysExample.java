import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
       
        // Example array
        int[] numbers = {5, 2, 8, 1, 3};

        // 1. Sorting an array - O(n log n) & O(1)  
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        // Output: [1, 2, 3, 5, 8]
        // __

        // 2. Binary Search in a sorted array - O(log n) & O(1)  
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);
        // Output: 2
        // __

        // 3. Copying an array - O(n) & O(n)  
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
        // Output: [1, 2, 3, 5, 8]
        // __

        // 4. Filling an array with a specific value - O(n) & O(1)  
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
        // Output: [7, 7, 7, 7, 7]
        // __

        // 5. Comparing two arrays for equality - O(n) & O(1)  
        boolean isEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are arrays equal? " + isEqual);
        // Output: true
        // __

        // 6. Converting an array to a String - O(n) & O(n)  
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayString);
        // Output: [1, 2, 3, 5, 8]
        // __

        // 7. Creating a parallel sort - O(n log n) & O(n)  
        int[] largeNumbers = {9, 4, 7, 3, 2, 6};
        Arrays.parallelSort(largeNumbers);
        System.out.println("Parallel Sorted Array: " + Arrays.toString(largeNumbers));
        // Output: [2, 3, 4, 6, 7, 9]
        // __
    }
}
