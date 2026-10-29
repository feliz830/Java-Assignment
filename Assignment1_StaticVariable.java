package Assignment;

public class Assignment1_StaticVariable {
	static int count = 0;

    void register() {
        count++;
        System.out.println("Employee Registered");
    }

    public static void main(String[] args) {
    	Assignment1_StaticVariable e1 = new Assignment1_StaticVariable();
    	Assignment1_StaticVariable e2 = new Assignment1_StaticVariable();
    	Assignment1_StaticVariable e3 = new Assignment1_StaticVariable();

        e1.register();
        e2.register();
        e3.register();

        System.out.println("Total Employees: " + count);
    }
}

