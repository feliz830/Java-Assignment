package Assignment;

public class Assignment4_EmployeeDetails {
	 String name;
	    int id;

	    Assignment4_EmployeeDetails(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    void responsibility() {
	        System.out.println("General employee responsibilities");
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        responsibility();
	    }

	    public static void main(String[] args) {
	        Assignment4_Developer d =
	                new Assignment4_Developer("Nandha", 101);

	        Assignment4_TeamManager m =
	                new Assignment4_TeamManager("Manoj", 102);

	        d.display();
	        m.display();
	    }
	}

	class Assignment4_Developer extends Assignment4_EmployeeDetails {
	    Assignment4_Developer(String name, int id) {
	        super(name, id);
	    }

	    @Override
	    void responsibility() {
	        System.out.println("Develops and tests software");
	    }
	}

	class Assignment4_TeamManager extends Assignment4_EmployeeDetails {
	    Assignment4_TeamManager(String name, int id) {
	        super(name, id);
	    }

	    @Override
	    void responsibility() {
	        System.out.println("Manages the team and projects");
	    }
	}

