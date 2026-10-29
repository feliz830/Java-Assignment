package Assignment;

public class Assignement2_ShoppingCart {
	double calculateTotal(double p1, double p2, double p3) {
        return p1 + p2 + p3;
    }

    double calculateDiscount(double total, String membership) {
        if (membership.equalsIgnoreCase("Gold"))
            return total * 0.20;
        else if (membership.equalsIgnoreCase("Silver"))
            return total * 0.10;
        else
            return total * 0.05;
    }

    double calculateFinalAmount(double total, double discount) {
        return total - discount;
    }

    void displayDetails(double total, double discount, double finalAmount) {
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        Assignement2_ShoppingCart cart = new Assignement2_ShoppingCart();

        double total = cart.calculateTotal(2000, 1500, 500);
        double discount = cart.calculateDiscount(total, "Gold");
        double finalAmount = cart.calculateFinalAmount(total, discount);

        cart.displayDetails(total, discount, finalAmount);
    }
}

