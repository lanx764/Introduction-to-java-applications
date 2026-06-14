import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.next();

        System.out.print("Enter student age: ");
        int studentAge = input.nextInt();

        System.out.print("Enter GPA (e.g. 3.75): ");
        double gpa = input.nextDouble();

        System.out.print("Is student enrolled? (true/false): ");
        boolean isEnrolled = input.nextBoolean();

        System.out.print("Enter grade (A/B/C/D/F): ");
        char grade = input.next().charAt(0);

        System.out.println("========================================");
        System.out.printf("%-15s %s%n", "Name:", studentName);
        System.out.printf("%-15s %d%n", "Age:", studentAge);
        System.out.printf("%-15s %.2f%n", "GPA:", gpa);
        System.out.printf("%-15s %b%n", "Enrolled:", isEnrolled);
        System.out.printf("%-15s %c%n", "Grade:", grade);
        System.out.println("========================================");

        input.close();
    }
}