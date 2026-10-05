class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Overriding toString() method of Object class
    @Override
    public String toString() {
        return "Student[Name=" + name + ", RollNo=" + rollNo + "]";
    }
}

public class OverrideToString {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        // Automatically calls toString() when object is printed
        System.out.println(s);
    }
}
