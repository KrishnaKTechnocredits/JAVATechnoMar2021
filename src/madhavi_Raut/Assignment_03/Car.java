/*Assignment 03
 Program 02
 Create a class named Car, which contains method like below
	a. setcompanyName
	b. setIsCarAutomatic
	c. setCarSpeed
	d. displaySpecification
	Hint: One String, one boolean and one double variable needed*/
package madhavi_Raut.Assignment_03;

class Car {

	String companyName;
	boolean carAutomatic;
	double carSpeed;

	void setcompanyName(String compName) {
		companyName = compName;
	}

	void setIsCarAutomatic(boolean carAuto) {
		carAutomatic = carAuto;
	}

	void setCarSpeed(double speed) {
		carSpeed = speed;
	}

	void displaySpecification() {
		System.out.println("Company Name: " + companyName + "\n" + "Is Car Automatic: " + carAutomatic + "\n"
				+ "Car Speed: " + carSpeed);
	}

	public static void main(String[] args) {
		Car Car = new Car();
		Car.setcompanyName("Hyundai");
		Car.setIsCarAutomatic(false);
		Car.setCarSpeed(120.5);
		Car.displaySpecification();
	}
}
