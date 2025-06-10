public class MonthlyCCBalance { //

    public static void main(String[] args) {

        double initialBalance = 5000.00; // Using a double in case the number changes in the future

        double monthlyInterestRate = 0.17; // Assume the 17% is monthly

        // Month 1
        System.out.println("--- Credit Card Interest Calculation (Monthly Rate) ---");

        System.out.println("Starting Balance: $" + String.format("%.2f", initialBalance)); // I googled how to format this to make it look tidier

        System.out.println("Monthly Interest Rate: " + (monthlyInterestRate * 100) + "%");

        System.out.println("-----------------------------------------------------");

        double balanceAfterMonth1 = initialBalance;

        double interestMonth1 = balanceAfterMonth1 * monthlyInterestRate;

        balanceAfterMonth1 += interestMonth1; // Add interest to the balance

        System.out.println("After 1 month:");

        System.out.println("  Interest Due for Month 1: $" + String.format("%.2f", interestMonth1));

        System.out.println("  Your New Balance after Month 1: $" + String.format("%.2f", balanceAfterMonth1));

        //Month 2
        System.out.println("\nAfter 2 months (assuming no payments made):");

        double balanceAfterMonth2 = balanceAfterMonth1; // Start with the balance from end of month 1

        double interestMonth2 = balanceAfterMonth2 * monthlyInterestRate;

        balanceAfterMonth2 += interestMonth2; // Add interest to the balance

        System.out.println("  Interest Due for Month 2: $" + String.format("%.2f", interestMonth2));

        System.out.println("  Your New Balance after Month 2: $" + String.format("%.2f", balanceAfterMonth2));

        System.out.println("-----------------------------------------------------");
    }
}