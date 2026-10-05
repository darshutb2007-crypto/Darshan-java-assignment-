import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        // Check Grade 'A' for marks > 90
        if (marks > 90) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: B/C/D");
        }

        // Pass/Fail check (pass mark is 40)
        if (marks >= 40) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
