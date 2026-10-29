package Assignment;

public class Assignment2_BankingOperations {
	 double deposit(double balance, double amount) {
	        return balance + amount;
	    }

	    double withdraw(double balance, double amount) {
	        if (balance >= amount)
	            return balance - amount;
	        else {
	            System.out.println("Insufficient funds!");
	            return balance;
	        }
	    }

	    void checkBalance(double balance) {
	        System.out.println("Current Balance: " + balance);
	    }

	    void displayTransactionSummary(double initialBalance,
	                                   double deposit, double withdrawal,
	                                   double finalBalance) {
	        System.out.println("Initial Balance: " + initialBalance);
	        System.out.println("Deposited: " + deposit);
	        System.out.println("Withdrawn: " + withdrawal);
	        System.out.println("Final Balance: " + finalBalance);
	    }

	    public static void main(String[] args) {
	        Assignment2_BankingOperations bank =
	                new Assignment2_BankingOperations();

	        double initialBalance = 5000.0;
	        double depositAmount = 2000.0;
	        double withdrawalAmount = 1500.0;

	        double balance = bank.deposit(initialBalance, depositAmount);
	        balance = bank.withdraw(balance, withdrawalAmount);

	        bank.checkBalance(balance);

	        bank.displayTransactionSummary(
	                initialBalance, depositAmount,
	                withdrawalAmount, balance);
	    }
	}

