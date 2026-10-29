package Assignment;

public class Assignment3_Employee {
	int employeeId;
    String employeeName;
    double salary;

    Assignment3_Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
        System.out.println();
    }

    public static void main(String[] args) {

        Assignment3_Employee e1 = new Assignment3_Employee(101, "Nandha", 25000);
        Assignment3_Employee e2 = new Assignment3_Employee(102, "Manoj", 35000);
        Assignment3_Employee e3 = new Assignment3_Employee(103, "Sheik", 40000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}

