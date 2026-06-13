public class CafeReceipt {
    public static void main(String[] args) {
        double subtotal = 17.47;
        double vat = (7.5 / 100) * subtotal;
        double total = subtotal + vat;


        System.out.println("========================================");
        System.out.println("     \tBASIT'S CAFE");
        System.out.println("========================================");
        System.out.printf("%-15s%10s%10s%n","Item","Qty","Price");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s%10d%10.2f%n", "Espresso",2,5.0);
        System.out.printf("%-15s%10d%10.2f%n", "Croissant",3,8.97);
        System.out.printf("%-15s%10d%10.2f%n", "Orange Juice",1,3.50);
        System.out.println("----------------------------------------");
        System.out.printf("%-15s%20.2f%n", "Subtotal", subtotal);
        System.out.printf("%-15s%20.2f%n", "VAT (7.5%)",vat);
        System.out.printf("%-15s%20.2f%n", "TOTAL", total);
        System.out.println("========================================");
        System.out.println("\tThank you for your visit!");
        System.out.println("========================================");

    }
}
