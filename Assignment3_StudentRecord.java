package Assignment;

public class Assignment3_StudentRecord {
	 int rollNumber;
	    String studentName;
	    double marks;

	    // Parameterized constructor
	    Assignment3_StudentRecord(int rollNumber, String studentName, double marks) {
	        this.rollNumber = rollNumber;
	        this.studentName = studentName;
	        this.marks = marks;
	    }

	    // Copy constructor
	    Assignment3_StudentRecord(Assignment3_StudentRecord s) {
	        this.rollNumber = s.rollNumber;
	        this.studentName = s.studentName;
	        this.marks = s.marks;
	    }

	    void displayDetails() {
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Marks: " + marks);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        Assignment3_StudentRecord s1 =
	                new Assignment3_StudentRecord(101, "Nandha", 85);

	        Assignment3_StudentRecord s2 =
	                new Assignment3_StudentRecord(s1);

	        s2.marks = 95;

	        System.out.println("Original Student Record:");
	        s1.displayDetails();

	        System.out.println("Copied Student Record:");
	        s2.displayDetails();
	    }
	}

