package Assignment;

public class Assignment3_BankAccount {
	 int accountNumber;
	    String holderName;
	    double balance;

	    Assignment3_BankAccount() {
	        accountNumber = 1001;
	        holderName = "Nandha";
	        balance = 5000.0;
	    }

	    void displayAccount() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Holder Name: " + holderName);
	        System.out.println("Balance: " + balance);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        Assignment3_BankAccount a1 = new Assignment3_BankAccount();
	        Assignment3_BankAccount a2 = new Assignment3_BankAccount();

	        a1.displayAccount();
	        a2.displayAccount();
	    }
	}

