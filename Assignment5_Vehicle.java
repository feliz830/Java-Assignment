package Assignment;

public class Assignment5_Vehicle {
	void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Assignment5_Car extends Assignment5_Vehicle {
    void displayType() {
        System.out.println("Type: Car");
    }
}

class Assignment5_Bike extends Assignment5_Vehicle {
    void displayType() {
        System.out.println("Type: Bike");
    }
}

public class Assignment5_BaseVehicle {
    public static void main(String[] args) {
        Assignment5_Car car = new Assignment5_Car();
        car.displayType();
        car.start();
        car.stop();

        System.out.println();

        Assignment5_Bike bike = new Assignment5_Bike();
        bike.displayType();
        bike.start();
        bike.stop();
    }
}


