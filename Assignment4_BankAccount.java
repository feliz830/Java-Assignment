package Assignment;

public class Assignment4_BankAccount {
	 private String name;
	    private double balance;

	    Assignment4_BankAccount(String name, double balance) {
	        this.name = name;
	        this.balance = balance;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful");
	        } else {
	            System.out.println("Insufficient balance or invalid amount");
	        }
	    }

	    public static void main(String[] args) {
	        Assignment4_BankAccount account =
	                new Assignment4_BankAccount("Arun", 5000);

	        System.out.println("Name: " + account.getName());
	        System.out.println("Balance: " + account.getBalance());

	        account.withdraw(2000);

	        System.out.println("Remaining Balance: " + account.getBalance());
	    }
	}

