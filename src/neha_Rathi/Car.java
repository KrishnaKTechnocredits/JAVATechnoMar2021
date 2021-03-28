/*
 * Assignment 3_2
 * Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
 */
package neha_Rathi;

class Car {
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;

	void setcompanyName(String name) {
		companyName = name;
	}

	void setIsCarAutomatic(boolean carAutomatic) {
		isCarAutomatic = carAutomatic;
	}

	void setCarSpeed(double speed) {
		carSpeed = speed;
	}

	void displaySpecification() {
		System.out.println("Car Comapany name is: " + companyName);
		System.out.println("Is Car Automatic: " + isCarAutomatic);
		System.out.println("Speed of Car is: " + carSpeed);
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.setcompanyName("Mahindra");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(91.5);
		car.displaySpecification();
	}
}