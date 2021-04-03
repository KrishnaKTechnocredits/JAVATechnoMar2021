//2. Create a class named Car, which contains method like below
// 	 a. setcompanyName  
// 	 b. setIsCarAutomatic  
// 	 c. setCarSpeed  
//   d. displaySpecification   
//Hint: One String, one boolean and one double variable needed.

/*
Assignment 3 - Program 2 - Program Statement : Create a class named Car, which contains method like below
*/

package paras.Assignment_3;

class Car{
	
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	
	void setcompanyName(String name){
		companyName = name;
	}
	
	void setIsCarAutomatic(boolean isAutomatic){
		isCarAutomatic = isAutomatic;
	}
	
	void setCarSpeed(double speed){
		carSpeed = speed;
	}
	
	void displaySpecification(){
		System.out.println("Name of the Car Company is - " + companyName);
		System.out.println("Is Car Automatic - " + isCarAutomatic);
		System.out.println("Speed of the Car is - " + carSpeed);
	}
	
	public static void main(String[] args){
		Car car = new Car();
		car.setcompanyName("Hyundai");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(95.9);
		car.displaySpecification();
	}
}