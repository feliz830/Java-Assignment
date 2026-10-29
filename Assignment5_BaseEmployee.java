
package Assignment;

class Assignment5_BaseEmployee {

    String name;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Assignment5_Developer extends Assignment5_BaseEmployee {

    String programmingLanguage;

    void displayDeveloper() {
        display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Assignment5_Tester extends Assignment5_BaseEmployee {

    String testingTool;

    void displayTester() {
        display();
        System.out.println("Testing Tool: " + testingTool);
    }
}

public class Assignment5_Employee {

    public static void main(String[] args) {

        Assignment5_Developer developer = new Assignment5_Developer();

        developer.name = "ramesh";
        developer.salary = 40000;
        developer.programmingLanguage = "Java";

        Assignment5_Tester tester = new Assignment5_Tester();

        tester.name = "james";
        tester.salary = 35000;
        tester.testingTool = "Postman";

        System.out.println("Developer Details:");
        developer.displayDeveloper();

        System.out.println("\nTester Details:");
        tester.displayTester();
    }
}
