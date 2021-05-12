/*Create a class named Car, which contains method like below
		a. setcompanyName  
 	 	b. setIsCarAutomatic  
 	 	c. setCarSpeed  
  		d. displaySpecification   */


package ami.Assignment_3;

public class Car {
	String companyName;
	boolean CarAuto;
	double speed;

	void setcompanyName(String company1) {
		companyName = company1;
	}

	void setIsCarAutomatic(boolean CarAuto1) {
		 CarAuto = CarAuto1;
	}

	void setCarSpeed(double speed1) {
		 speed = speed1;
	}

	void displaySpecification() {
		System.out.println("Your Company Name : " + companyName);
		System.out.println("is their car mode Auto : " + CarAuto);
		System.out.println("What is the normal speed of a car? : " + speed);
	}

	public static void main(String[] a) {
		Car car = new Car();
		car.setcompanyName("Scoda");
		car.setIsCarAutomatic(false);
		car.setCarSpeed(650.5689);
		car.displaySpecification();
	}
}
