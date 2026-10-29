package Assignment;

public class Assignment1_InstanceVariable {
	 String name;
	    int rollNo;

	    void register(String n, int r) {
	        name = n;
	        rollNo = r;
	    }

	    void display() {
	        System.out.println(name + " " + rollNo);
	    }

	    public static void main(String[] args) {
	    	Assignment1_InstanceVariable s1 = new Assignment1_InstanceVariable();
	    	Assignment1_InstanceVariable s2 = new Assignment1_InstanceVariable();
	    	Assignment1_InstanceVariable s3 = new Assignment1_InstanceVariable();

	        s1.register("felix", 1);
	        s2.register("john", 2);
	        s3.register("james", 3);

	        s1.display();
	        s2.display();
	        s3.display();
	    }
	}


