import java.util.*;
import java.util.stream.*;

public class HashsetMethods {
    public static void main(String[] args) {

        // 1. Using Arrays.asList() - O(n) & O(n)  
        Set<Character> vowels1 = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        System.out.println("Vowel HashSet: " + vowels1);
        // Output: [A, E, I, O, U, a, e, i, o, u]
        // __

        // 2. Using Collections.addAll() - O(n) & O(n)  
        Set<Character> vowels2 = new HashSet<>();
        Collections.addAll(vowels2, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        System.out.println("Vowel HashSet: " + vowels2);
        // Output: [A, E, I, O, U, a, e, i, o, u]
        // __

        // 3. Using a Stream (Java 8+) - O(n) & O(n)  
        Set<Character> vowels3 = Stream.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
                                       .collect(Collectors.toSet());
        System.out.println("Vowel HashSet: " + vowels3);
        // Output: [A, E, I, O, U, a, e, i, o, u]
        // __

        // 4. Using a String to Avoid Typing Each Character - O(n) & O(n)  
        Set<Character> vowels4 = new HashSet<>();
        for (char c : "AEIOUaeiou".toCharArray()) {
            vowels4.add(c);
        }
        System.out.println("Vowel HashSet: " + vowels4);
        // Output: [A, E, I, O, U, a, e, i, o, u]
        // __
    }
}
