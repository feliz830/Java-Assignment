package Assignment;

public class Assignment4_Calculator {
	 int add(int a, int b) {
	        return a + b;
	    }

	    double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Assignment4_Calculator c =
	                new Assignment4_Calculator();

	        System.out.println("Integer Sum: " + c.add(10, 20));
	        System.out.println("Decimal Sum: " + c.add(2.5, 3.5));

	        Assignment4_Employee e =
	                new Assignment4_Manager();

	        System.out.println("Bonus: " + e.calculateBonus());
	    }
	}

	class Assignment4_Employee {
	    double calculateBonus() {
	        return 5000;
	    }
	}

	class Assignment4_Manager extends Assignment4_Employee {
	    @Override
	    double calculateBonus() {
	        return 10000;
	    }
	}

