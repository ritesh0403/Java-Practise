public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. Append string to the end, returns StringBuilder
        sb.append(" World");
        
        // 2. Insert at specific index, returns StringBuilder
        sb.insert(5, " Java");
        
        // 3. Replace characters from start to end index, returns StringBuilder
        sb.replace(6, 10, "Python");
        
        // 4. Delete characters from start to end index, returns StringBuilder
        sb.delete(6, 12);
        
        // 5. Delete a single character at index, returns StringBuilder
        sb.deleteCharAt(5);
        
        // 6. Reverse the sequence, returns StringBuilder
        sb.reverse();
        
        // 7. Get character at specific index, returns char
        char ch = sb.charAt(0);
        
        // 8. Set character at specific index, returns void
        sb.setCharAt(0, 'H');
        
        // 9. Get substring from start index, returns String
        String subStr1 = sb.substring(5);
        
        // 10. Get substring from start to end index, returns String
        String subStr2 = sb.substring(2, 7);
        
        // 11. Get index of a string, returns int
        int index = sb.indexOf("World");
        
        // 12. Get index of a string from specified index, returns int
        int lastIndex = sb.lastIndexOf("o");
        
        // 13. Get length of the sequence, returns int
        int length = sb.length();
        
        // 14. Get capacity of the StringBuilder, returns int
        int capacity = sb.capacity();
        
        // 15. Ensure minimum capacity, returns void
        sb.ensureCapacity(50);
        
        // 16. Trim the capacity to match length, returns void
        sb.trimToSize();
        
        // 17. Convert to string, returns String
        String str = sb.toString();
    }
}
