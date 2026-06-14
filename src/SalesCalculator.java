public class SalesCalculator {
    public static void main(String[] args) {

        int unitsSold = 143;
        double pricePerUnit = 29.99;
        int discountRate = 15;
        double grossRevenue = unitsSold * pricePerUnit;
        double discountAmount = grossRevenue * discountRate / 100;
        double netRevenue = grossRevenue - discountAmount;

        System.out.println("--- Concatenation Output ---");
        System.out.println("Units Sold: " + unitsSold);
        System.out.println("Price Per Unit: " + pricePerUnit);
        System.out.println("Gross Revenue: " + grossRevenue);
        System.out.println("Discount (15%): " + discountAmount);
        System.out.println("Net Revenue: " + netRevenue);

        System.out.println("--- printf Output ---");
        System.out.printf("%-25s:%10d%n", "Units Sold",unitsSold);
        System.out.printf("%-25s:%10.2f%n", "Price Per Unit", pricePerUnit);
        System.out.printf("%-25s:%10.2f%n", "Gross Revenue", grossRevenue);
        System.out.printf("%-25s:%10.2f%n", "Discount Amount (15%)", discountAmount);
        System.out.printf("%-25s:%10.2f%n", "Net Revenue", netRevenue);
    }
}
