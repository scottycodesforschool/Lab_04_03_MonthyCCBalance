public class MonthlyCCBalance { //

    public static void main(String[] args) {
        // Initial credit card balance
        double initialBalance = 5000.00;

        // Annual interest rate (17%)
        double annualInterestRate = 0.17;

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        // --- Calculations for Month 1 ---
        System.out.println("--- Credit Card Interest Calculation ---");
        System.out.println("Starting Balance: $" + String.format("%.2f", initialBalance));
        System.out.println("Annual Interest Rate: " + (annualInterestRate * 100) + "%");
        System.out.println("Monthly Interest Rate: " + String.format("%.4f", (monthlyInterestRate * 100)) + "%");
        System.out.println("----------------------------------------");

        double balanceAfterMonth1 = initialBalance;
        double interestMonth1 = balanceAfterMonth1 * monthlyInterestRate;
        balanceAfterMonth1 += interestMonth1; // Add interest to the balance

        System.out.println("After 1 month:");
        System.out.println("  Interest Due for Month 1: $" + String.format("%.2f", interestMonth1));
        System.out.println("  New Balance after Month 1: $" + String.format("%.2f", balanceAfterMonth1));


        // --- Calculations for Month 2 ---
        System.out.println("\nAfter 2 months (no payments made):");

        double balanceAfterMonth2 = balanceAfterMonth1; // Start with the balance from after month 1
        double interestMonth2 = balanceAfterMonth2 * monthlyInterestRate;
        balanceAfterMonth2 += interestMonth2; // Add interest to the balance

        System.out.println("  Interest Due for Month 2: $" + String.format("%.2f", interestMonth2));
        System.out.println("  New Balance after Month 2: $" + String.format("%.2f", balanceAfterMonth2));

        System.out.println("----------------------------------------");
    }
}
