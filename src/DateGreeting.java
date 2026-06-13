import java.util.Scanner;

public class DateGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.printf("Hello %s, welcome to Java!%n", name);
        input.close();
    }
}