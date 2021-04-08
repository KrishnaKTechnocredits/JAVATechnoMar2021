package kangan.assignments.assignment3;

public class Car {

	String carcompanyname;
	boolean result;
	double carspeed;
	
	void setcompanyName( String companyname) {
		carcompanyname = companyname;
	}
	void setIsCarAutomatic (boolean flag) {
		result = flag;
	}
	void setCarSpeed(double speed) {
		carspeed = speed;
	}
	void displaySpecification() {
		System.out.println("Car company name is " + carcompanyname);
		System.out.println("Car is automatic: " + result);
		System.out.println("Car speed is " + carspeed);
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setcompanyName("Honda");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(100);
		car.displaySpecification();
		
	}
}
