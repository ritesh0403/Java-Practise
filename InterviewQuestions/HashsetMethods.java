import java.util.*;
import java.util.stream.*;
// how to put vowels in both capital and small letters in hashset in java
// isn't there any better way to do it rather writing 10 .add statement

public class HashsetMethods {
    public static void main(String[] args) {

// 1. Using Arrays.asList() (Compact Initialization)

        // Initialize HashSet with vowels using Arrays.asList
        Set<Character> vowels1 = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        // Print the HashSet
        System.out.println("Vowel HashSet: " + vowels1);


// 2. Using Collections.addAll() (More Readable)

        Set<Character> vowels2 = new HashSet<>();
        Collections.addAll(vowels2, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        System.out.println("Vowel HashSet: " + vowels2);
    

// 3. Using a Stream (Java 8+)


        Set<Character> vowels3 = Stream.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
                                      .collect(Collectors.toSet());

        System.out.println("Vowel HashSet: " + vowels3);

// 4. Using a String to Avoid Typing Each Character

        Set<Character> vowels4 = new HashSet<>();
        for (char c : "AEIOUaeiou".toCharArray()) {
            vowels4.add(c);
        }
        System.out.println("Vowel HashSet: " + vowels4);

    }
}
