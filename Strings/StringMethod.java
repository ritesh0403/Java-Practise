public class StringMethod{

    public static void main(String Args[]){
        
        String str = "Hello, World!";

        // 1. Length of the string
        int len = str.length();  // Returns: int (length of the string)

        // 2. Get character at a specific index
        char ch = str.charAt(1);  // Returns: char ('e')

        // 3. Find first occurrence of a substring/character
        int index = str.indexOf("o");  // Returns: int (4)

        // 4. Find last occurrence of a substring/character
        int lastIndex = str.lastIndexOf("o");  // Returns: int (8)

        // 5. Check if string contains a substring
        boolean contains = str.contains("World");  // Returns: boolean (true)

        // 6. Extract substring
        String sub = str.substring(7);  // Returns: String ("World!")
        String sub2 = str.substring(0, 5);  // Returns: String ("Hello")

        // 7. Convert to lowercase
        String lower = str.toLowerCase();  // Returns: String ("hello, world!")

        // 8. Convert to uppercase
        String upper = str.toUpperCase();  // Returns: String ("HELLO, WORLD!")

        // 9. Remove spaces from start and end
        String trimmed = "  Java  ".trim();  // Returns: String ("Java")

        // 10. Replace characters/substrings
        String replaced = str.replace("World", "Java");  // Returns: String ("Hello, Java!")

        // 11. Check if two strings are equal (case-sensitive)
        boolean isEqual = str.equals("hello, world!");  // Returns: boolean (false)

        // 12. Check if two strings are equal (ignore case)
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");  // Returns: boolean (true)

        // 13. Check if string starts with a specific prefix
        boolean starts = str.startsWith("Hello");  // Returns: boolean (true)

        // 14. Check if string ends with a specific suffix
        boolean ends = str.endsWith("!");  // Returns: boolean (true)

        // 15. Split string into an array using a delimiter
        String[] words = str.split(", ");  // Returns: String[] (["Hello", "World!"])

        // 16. Convert number to string
        String numStr = String.valueOf(123);  // Returns: String ("123")

        // 17. Convert string to char array
        char[] charArray = str.toCharArray();  // Returns: char[] (['H', 'e', 'l', 'l', 'o', ...])

        // 18. Check if string is empty
        boolean isEmpty = "".isEmpty();  // Returns: boolean (true)

        // 19. Check if string is blank (empty or only spaces)
        boolean isBlank = "   ".isBlank();  // Returns: boolean (true)

        // 20. Concatenate two strings
        String concat = str.concat(" How are you?");  // Returns: String ("Hello, World! How are you?")

        // 21. To check if the character is digit or not
        System.out.println("\nis it a digit ? " + Character.isDigit('d'));

        // 22.  Replace the first substring with desired string 
        str = str.replaceFirst("World", "Ritesh"); 
        System.out.println("\nReplace the first occurance of the substring => " + str);


        // Print examples
        System.out.println("Length: " + len);
        System.out.println("Character at index 1: " + ch);
        System.out.println("First occurrence of 'o': " + index);
        System.out.println("Last occurrence of 'o': " + lastIndex);
        System.out.println("Contains 'World': " + contains);
        System.out.println("Substring(7): " + sub);
        System.out.println("Substring(0,5): " + sub2);
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        System.out.println("Trimmed: " + trimmed);
        System.out.println("Replaced: " + replaced);
        System.out.println("Equals (case-sensitive): " + isEqual);
        System.out.println("Equals (ignore case): " + isEqualIgnoreCase);
        System.out.println("Starts with 'Hello': " + starts);
        System.out.println("Ends with '!': " + ends);
        System.out.println("Split words: " + java.util.Arrays.toString(words));
        System.out.println("Number to String: " + numStr);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Is Blank: " + isBlank);
        System.out.println("Concatenated: " + concat);
    }
}

