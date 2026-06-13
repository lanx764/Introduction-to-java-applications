import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.printf("Hello %s! You are %d years old.%n", firstName, age);

        input.close();
    }
}