/*2. Create a class named Car, which contains method like below a. setcompanyName b.setIsCarAutomatic c. setCarSpeed  d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. 
  */
package aparna.assignment3;

class Car {

	String carCompanyName;
	boolean isCarAutomatic;
	double carSpeed;

	void setcompanyName(String companyName) {
		carCompanyName = companyName;

	}

	void setIsCarAutomatic(boolean flag) {
		isCarAutomatic = flag;

	}

	void setCarSpeed(double car_Speed) {
		carSpeed = car_Speed;

	}

	void displaySpecification() {
		System.out.println("Car Company Name is:->" + carCompanyName);
		System.out.println("Is Car is Automatic?:->" + isCarAutomatic);
		System.out.println("Car Speed is:->" + carSpeed);
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.setcompanyName("Tata Nexon");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(85.66);
		car.displaySpecification();
	}
}
