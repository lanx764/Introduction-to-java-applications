import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.print("Enter a second temperature in Celsius: ");
        double secondCelsius = input.nextDouble();
        double celsiusFahrenheit = celsius * 9 / 5 + 32;
        double secondCelsiusFahrenheit = secondCelsius * 9 / 5 + 32;
        double averageFahrenheit = (celsiusFahrenheit + secondCelsiusFahrenheit) / 2;
        System.out.println("========================================");
        System.out.printf("%-20s%10s%n", "Celsius","Fahrenheit");
        System.out.printf("%-20.2f%10.2f%n",celsius,celsiusFahrenheit );
        System.out.printf("%-20.2f%10.2f%n",secondCelsius,secondCelsiusFahrenheit);
        System.out.printf("%-20s%10.2f%n", "Average Fahrenheit", averageFahrenheit);
        System.out.println("========================================");
        input.close();
    }
}