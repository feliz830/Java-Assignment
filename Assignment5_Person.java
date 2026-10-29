package Assignment;

public class Assignment5_Person {
	 String name;
	    int age;

	    Assignment5_Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}

	class Assignment5_StudentDetails extends Assignment5_Person {
	    int rollNumber;

	    Assignment5_StudentDetails(String name, int age, int rollNumber) {
	        super(name, age);
	        this.rollNumber = rollNumber;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Roll Number: " + rollNumber);
	    }
	}

	public class Assignment5_Student {
	    public static void main(String[] args) {
	        Assignment5_StudentDetails student =
	                new Assignment5_StudentDetails("Nandha", 21, 501);

	        student.display();
	    }
	}

