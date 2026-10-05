class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name + ", Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 88);
        Student student2 = new Student("Bob", 92);

        student1.displayDetails();
        student2.displayDetails();
    }
}
