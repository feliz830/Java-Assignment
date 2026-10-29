package Assignment;

public class Assignment3_Student {
	 int studentId;
	    String studentName;
	    String course;

	    void displayDetails() {
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Course: " + course);
	    }

	    public static void main(String[] args) {
	        Assignment3_Student s = new Assignment3_Student();
	        s.displayDetails();
	    }
	}

