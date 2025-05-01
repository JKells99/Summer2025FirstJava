import java.util.Scanner;

public class AddingMortageCalc {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user for the annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Prompt the user for the number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate the number of payments
        int numberOfPayments = years * 12;

        // Calculate the monthly payment using the formula
        double monthlyPayment = (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // Display the result
        System.out.printf("The monthly payment is: %.2f\n", monthlyPayment);
        scanner.close();
    }
}
