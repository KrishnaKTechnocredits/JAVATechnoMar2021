//Assignment 3

package ravindra_V;

class Car{
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	
	void setCompanyName( String name){
		companyName = name;
	}
	
	void setIsCarAutomatic(boolean isAutomatic){
		isCarAutomatic = isAutomatic;
	}	
	
	void setCarSpeed(double speed){
		carSpeed = speed;
	}

	void displaySpecification(){
		System.out.println("Name of the Car Company is " + companyName);
		System.out.println("Is Car Automation = " + isCarAutomatic);
		System.out.println("Speed of the Car is = " + carSpeed);
	}
	
	public static void main(String[] args){
		Car car = new Car();
		car.setCompanyName("BMW");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(300.50);
		car.displaySpecification();
	}
}
		
	