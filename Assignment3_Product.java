package Assignment;

public class Assignment3_Product {
	 int productId;
	    String productName;
	    double price;
	    Assignment3_Product() {
	        productId = 0;
	        productName = "Unknown";
	        price = 0.0;
	    }

	    Assignment3_Product(int productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	        price = 0.0;
	    }

	    Assignment3_Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    void displayDetails() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        Assignment3_Product p1 = new Assignment3_Product();
	        Assignment3_Product p2 = new Assignment3_Product(101, "Laptop");
	        Assignment3_Product p3 = new Assignment3_Product(102, "Mobile", 25000.0);

	        p1.displayDetails();
	        p2.displayDetails();
	        p3.displayDetails();
	    }
	}

