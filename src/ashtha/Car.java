package ashtha;

class Car {
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	
	void setCompanyName(String compName){
		companyName = compName;
	}
	
	void setIsCarAutomatic(boolean automatic){
		isCarAutomatic = automatic;
	}
	
	void setCarSpeed(double speed){
		carSpeed = speed;
	}
	
	void displaySpecification(){
		System.out.println("The car is manufactured by "+companyName);
		System.out.println("Is the car automatic ? : "+isCarAutomatic);
		System.out.println("The speed of the car is "+carSpeed);
	}
	
	public static void main(String[] args){
		Car car = new Car();
		car.setCompanyName("BMW");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(120.55);
		car.displaySpecification();
	}
}
		