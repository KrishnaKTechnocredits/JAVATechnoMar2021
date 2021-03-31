//2. Create a class named Car, which contains method like below*
// a. setcompanyName  
//  b. setIsCarAutomatic  
//   c. setCarSpeed  
//   d. displaySpecification   
//  Hint: One String, one boolean and one double variable needed.

package krati_Jain;

class Car {
	
	String carCompanyName;
	boolean carAtm;
	double carSpeed;
	
	void setcompanyName(String nameOfCar){
	carCompanyName = nameOfCar;
	}
 
	void setIsCarAutomatic(boolean flag) {
	carAtm = flag;
	}
	
	void setCarSpeed(double speedOfCar) {
	carSpeed = speedOfCar;
	}
	
	void displaySpecification() {
	System.out.println ("Car Company : " + carCompanyName);
	System.out.println ("Is the Car Automatic? : " + carAtm);
	System.out.println ("Car Speed : " + carSpeed);
	}

	public static void main(String[] a){
	Car car = new Car();
	car.setcompanyName("volkswagen");
	car.setIsCarAutomatic(true);
	car.setCarSpeed(200.50);
	car.displaySpecification();
	}
	
}