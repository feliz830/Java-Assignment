package Assignment;

public class Assignment7_SmallestNumberArray {
	 public static void main(String[] args) {

	        int[] a = {10, 25, 5, 40, 15};

	        int smallest = a[0];

	        for (int i = 1; i < a.length; i++) {
	            if (a[i] < smallest) {
	                smallest = a[i];
	            }
	        }

	        System.out.println("Smallest number is: " + smallest);
	    }
	}

