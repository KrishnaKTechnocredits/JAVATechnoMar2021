/*Java Assignment 3: 23rd March 2021

2. Create a class named Car, which contains method like below
a. setcompanyName
b. setIsCarAutomatic
c. setCarSpeed
d. displaySpecification
Hint: One String, one boolean and one double variable needed.

 */

package vaibhav;

class Car{
	
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	
	void setcompanyName(String cName){
		companyName = cName;		
	}
	
	void setIsCarAutomatic(boolean autoCar){
		isCarAutomatic = autoCar;		
	}

	void setCarSpeed(double cSpeed){
		carSpeed = cSpeed;
	}

	void displaySpecification(){	
		System.out.println(" Comapny Name of the car is : " + companyName);
		System.out.println(" Car is Automatic : " + isCarAutomatic);
		System.out.println(" Car speed is : " + carSpeed);
	}
	
	public static void main (String[] args){
		Car car = new Car();
		car.setcompanyName("Maruti Suzuki");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(120.00);
		car.displaySpecification();
	}
	
}


