package Task3;

import java.util.Scanner;

public class BankApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static BankAccount bankAccount

    public static void main(String[] args) {
        System.out.println("Welcome to Simple Banking Application!");

        double initialBalance = 1000; // Initial balance for demonstration purposes
        bankAccount = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    System.out.println("Exiting the application. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + bankAccount.getBalance());
    }

    private static void depositMoney() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    private static void withdrawMoney() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }
}

