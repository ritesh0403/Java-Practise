import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // 1. add(E e) - Adds element to the end, returns boolean
        list.add(10);
        
        // 2. add(int index, E element) - Inserts at specified index, returns void
        list.add(1, 20);
        
        // 3. addFirst(E e) - Adds element at the beginning, returns void
        list.addFirst(5);
        
        // 4. addLast(E e) - Adds element at the end, returns void
        list.addLast(30);
        
        // 5. remove() - Removes first element, returns E
        int removedFirst = list.remove();
        
        // 6. remove(int index) - Removes element at index, returns E
        int removedAtIndex = list.remove(1);
        
        // 7. removeFirst() - Removes first element, returns E
        int removedFirstExplicit = list.removeFirst();
        
        // 8. removeLast() - Removes last element, returns E
        int removedLast = list.removeLast();
        
        // 9. get(int index) - Retrieves element at index, returns E
        int element = list.get(0);
        
        // 10. getFirst() - Retrieves first element, returns E
        int firstElement = list.getFirst();
        
        // 11. getLast() - Retrieves last element, returns E
        int lastElement = list.getLast();
        
        // 12. set(int index, E element) - Replaces element at index, returns E
        list.set(0, 50);
        
        // 13. contains(Object o) - Checks if element exists, returns boolean
        boolean contains = list.contains(50);
        
        // 14. size() - Returns number of elements, returns int
        int size = list.size();
        
        // 15. clear() - Removes all elements, returns void
        list.clear();
        
        // 16. isEmpty() - Checks if list is empty, returns boolean
        boolean isEmpty = list.isEmpty();
        
        // 17. peek() - Retrieves first element without removal, returns E
        Integer peekElement = list.peek();
        
        // 18. peekFirst() - Retrieves first element, returns E
        Integer peekFirst = list.peekFirst();
        
        // 19. peekLast() - Retrieves last element, returns E
        Integer peekLast = list.peekLast();
        
        // 20. poll() - Retrieves and removes first element, returns E
        Integer polledElement = list.poll();
        
        // 21. pollFirst() - Retrieves and removes first element, returns E
        Integer polledFirst = list.pollFirst();
        
        // 22. pollLast() - Retrieves and removes last element, returns E
        Integer polledLast = list.pollLast();
        
        // 23. iterator() - Returns an iterator over elements, returns Iterator<E>
        java.util.Iterator<Integer> iterator = list.iterator();
    }
}
