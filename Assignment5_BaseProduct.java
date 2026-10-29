package Assignment;

public class Assignment5_BaseProduct {
	 int productId;
	    double price;

	    void display() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Price: " + price);
	    }
	}

	class Assignment5_Electronics extends Assignment5_BaseProduct {
	    void displayCategory() {
	        System.out.println("Category: Electronics");
	        display();
	    }
	}

	class Assignment5_Clothing extends Assignment5_BaseProduct {
	    void displayCategory() {
	        System.out.println("Category: Clothing");
	        display();
	    }
	}

	class Assignment5_Books extends Assignment5_BaseProduct {
	    void displayCategory() {
	        System.out.println("Category: Books");
	        display();
	    }
	}

	public class Assignment5_Product {
	    public static void main(String[] args) {
	        Assignment5_Electronics electronics =
	                new Assignment5_Electronics();
	        electronics.productId = 101;
	        electronics.price = 25000;

	        Assignment5_Clothing clothing = new Assignment5_Clothing();
	        clothing.productId = 102;
	        clothing.price = 1500;

	        Assignment5_Books books = new Assignment5_Books();
	        books.productId = 103;
	        books.price = 500;

	        electronics.displayCategory();
	        System.out.println();

	        clothing.displayCategory();
	        System.out.println();

	        books.displayCategory();
	    }
	}

