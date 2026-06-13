import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.next();

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Annual Rate: ");
        double annualRate = input.nextDouble();

        System.out.print("Loan Term: ");
        int loanTerm = input.nextInt();

        double totalRepayment = loanAmount * (1 + (annualRate / 100) * loanTerm);

        double monthlyRate = annualRate / 12;

        System.out.println("========================================");
        System.out.printf("    \tLOAN SUMMARY FOR %s%n", name);
        System.out.println("========================================");

        System.out.printf("%-20s %10.2f%n", "Loan Amount:", loanAmount);
        System.out.printf("%-20s %10.2f%%%n", "Annual Rate:", annualRate);
        System.out.printf("%-20s %10s%n", "Loan Term:", loanTerm + " years");
        System.out.printf("%-20s %10.2f%%%n", "Monthly Rate:", monthlyRate);
        System.out.printf("%-20s %10.2f%n", "Total Repayment:", totalRepayment);

        System.out.println("========================================");

        input.close();
    }
}
