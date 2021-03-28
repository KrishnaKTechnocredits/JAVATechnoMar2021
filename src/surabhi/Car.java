package surabhi;
/*
 * Assignment No 4
 * 
 * */

class Car{
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	
	void setcompanyName(String name){
		companyName=name;
	}
	void setIsCarAutomatic(boolean type){
		isCarAutomatic=type;
	}
	void setCarSpeed(double speed){
		carSpeed=speed;
	}
	void displaySpecification(){
		System.out.println("Company name of a car is :" +companyName);
		System.out.println("Car is automatic :" +isCarAutomatic);
		System.out.println("Speed of a car is :" +carSpeed);
	}
	
	public static void main(String[] args){
		Car car=new Car();
		car.setcompanyName("Tata");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(180);
		car.displaySpecification();	
	}
}