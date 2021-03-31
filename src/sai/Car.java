package sai;

class Car{
	String companyName;
	boolean carAutomatic;
	double carSpeed;
	
	void setCompanyName(String name){
		companyName = name;
	}
	
	void setIsCarAutomatic(boolean isCarAutomatic){
		carAutomatic = isCarAutomatic;
	}
	
	void setCarSpeed(double speed){
		carSpeed = speed;
	}
	
	void displaySpecification(){
		System.out.println("Name of the company is " + companyName);
		System.out.println("Is car automatic " + carAutomatic);
		System.out.println("Speed of the car is " + carSpeed);
	}
	
	public static void main(String[] args){
		Car car = new Car();
		car.setCompanyName("Lambhorgini");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(217.5);
		car.displaySpecification();
	}
}