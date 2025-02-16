import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 1. push(E item) - Adds an item to the top of the stack, returns E
        stack.push(10);
        
        // 2. pop() - Removes and returns the top element of the stack, returns E
        int poppedElement = stack.pop();
        
        // 3. peek() - Retrieves but does not remove the top element, returns E
        stack.push(20);
        int topElement = stack.peek();
        
        // 4. empty() - Checks if the stack is empty, returns boolean
        boolean isEmpty = stack.empty();
        
        // 5. search(Object o) - Returns position of the element (1-based index), returns int
        stack.push(30);
        int position = stack.search(20);
        
        // Additional methods that can be used with Stack (inherited from Vector)
        
        // 6. size() - Returns the number of elements in the stack, returns int
        int size = stack.size();
        
        // 7. contains(Object o) - Checks if an element is in the stack, returns boolean
        boolean contains = stack.contains(30);
        
        // 8. get(int index) - Retrieves element at specified index, returns E
        int elementAtIndex = stack.get(1);
        
        // 9. set(int index, E element) - Replaces element at index, returns E
        stack.set(1, 40);
        
        // 10. iterator() - Returns an iterator over the elements, returns Iterator<E>
        java.util.Iterator<Integer> iterator = stack.iterator();
        
        // 11. clear() - Removes all elements, returns void
        stack.clear();
    }
}
