public class DivisionTrap {
    public static void main(String[] args) {
        int totalMinutes = 150;
        int people = 4;
        int items = 7;

        // Calculation 1 — hours from minutes
        double hours = (double) totalMinutes / 60;

        // Calculation 2 — share per person
        double sharePerPerson = (double) 100 / people;

        // Calculation 3 — average items
        double averageItems = (double) items / 2;

        // Calculation 4 — this one is correct, explain why
        double celsius = 37.5;
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Hours: " + hours);
        System.out.println("Share per person: " + sharePerPerson);
        System.out.println("Average items: " + averageItems);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}