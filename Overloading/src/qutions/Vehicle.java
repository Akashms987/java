package qutions;

public class Vehicle {
	void speed() {
		System.out.println("vehicle different speed");
		
		
	}
	void speed(int max_speed) {
		System.out.println("Maximum speed of the vehicle is"+max_speed);
		
	}

}
class car extends Vehicle {
	void speed(String mode) {
		System.out.println("Car is running in " +mode+ "mode.");
		
	}
	
	}

