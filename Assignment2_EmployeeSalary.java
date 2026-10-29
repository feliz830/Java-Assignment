package Assignment;

public class Assignment2_EmployeeSalary {
	 String employeeName = "Nandha";

	    double calculateSalary(double basicSalary, double allowance) {
	        return basicSalary + allowance;
	    }

	    double calculateNetSalary(double grossSalary, double deductions) {
	        return grossSalary - deductions;
	    }

	    void displayDetails(double grossSalary, double netSalary) {
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Gross Salary: " + grossSalary);
	        System.out.println("Net Salary: " + netSalary);
	    }

	    public static void main(String[] args) {
	        Assignment2_EmployeeSalary emp = new Assignment2_EmployeeSalary();

	        double gross = emp.calculateSalary(25000, 5000);
	        double net = emp.calculateNetSalary(gross, 2000);

	        emp.displayDetails(gross, net);
	    }
	}

