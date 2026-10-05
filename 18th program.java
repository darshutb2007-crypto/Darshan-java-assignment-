import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java Homework");
        tasks.add("Read a book");
        tasks.add("Go for a run");

        // Removing a task by index or object
        tasks.remove("Read a book"); // tasks.remove(1);

        // Iterating over the list
        System.out.println("To-Do List Tasks:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
