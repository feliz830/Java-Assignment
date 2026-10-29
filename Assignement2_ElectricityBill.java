package Assignment;

public class Assignement2_ElectricityBill {
	 double calculateBill(int units) {
	        if (units <= 100)
	            return units * 2;
	        else if (units <= 200)
	            return 100 * 2 + (units - 100) * 3;
	        else
	            return 100 * 2 + 100 * 3 + (units - 200) * 5;
	    }

	    double addFixedCharge(double bill) {
	        return bill + 50;
	    }

	    void displayBill(double energyCharge, double finalBill) {
	        System.out.println("Energy Charge: " + energyCharge);
	        System.out.println("Fixed Charge: 50.0");
	        System.out.println("Final Bill: " + finalBill);
	    }

	    public static void main(String[] args) {
	        Assignement2_ElectricityBill eb =
	                new Assignement2_ElectricityBill();

	        int units = 250;

	        double energyCharge = eb.calculateBill(units);
	        double finalBill = eb.addFixedCharge(energyCharge);

	        eb.displayBill(energyCharge, finalBill);
	    }
	}

