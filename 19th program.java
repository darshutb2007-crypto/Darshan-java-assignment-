import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");
        list.addLast("Grapes");

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.removeFirst(); // Removes Mango
        list.removeLast();  // Removes Grapes
        list.remove("Banana"); // Removes Banana

        System.out.println("Updated LinkedList: " + list);
    }
}
