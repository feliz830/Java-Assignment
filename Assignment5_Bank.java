package Assignment;

public class Assignment5_Bank {
	 int accountNumber;
	    double balance;

	    void displayAccount() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	}

	class Assignment5_SavingsAccount extends Assignment5_Bank {
	    double interestRate;

	    void displaySavings() {
	        displayAccount();
	        System.out.println("Interest Rate: " + interestRate + "%");
	    }
	}

	class Assignment5_PremiumSavingsAccount
	        extends Assignment5_SavingsAccount {
	    int rewardPoints;

	    void displayPremium() {
	        displaySavings();
	        System.out.println("Reward Points: " + rewardPoints);
	    }
	}

	public class Assignment5_BankAccount {
	    public static void main(String[] args) {
	        Assignment5_PremiumSavingsAccount account =
	                new Assignment5_PremiumSavingsAccount();

	        account.accountNumber = 101;
	        account.balance = 50000;
	        account.interestRate = 6.5;
	        account.rewardPoints = 250;

	        account.displayPremium();
	    }
	}

