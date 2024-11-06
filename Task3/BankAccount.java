package Task3;

	public class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Your new balance is: $" + balance);
	        } else {
	            System.out.println("Invalid amount. Please enter a positive value.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
	        } else {
	            System.out.println("Invalid amount or insufficient funds.");
	        }
	    }
	}

