/*Assignment 3:Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed.*/
package prashant.Assignment_3_8;

public class Car {
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;

	void setCompanyName(String cmpname) {
		companyName = cmpname;
	}

	void setIsCarAutomatic(boolean carAutomatic) {
		isCarAutomatic = carAutomatic;
	}

	void setCarSpeed(double speed) {
		carSpeed = speed;
	}

	void displaySpecification() {
		System.out.println("Company is : " + companyName);
		System.out.println("Car is Automatic : " + isCarAutomatic);
		System.out.println("Speed of the car is : " + carSpeed + " km/h");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompanyName("BMW");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(200.5);
		car.displaySpecification();
	}
}
