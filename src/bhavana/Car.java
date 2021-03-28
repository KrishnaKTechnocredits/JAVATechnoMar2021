package bhavana;
class Car{
	String companyName;
	boolean isAutomatic;
	double carSpeed;
	
	void setCarSpecifications(String co_name,double car_speed){
		companyName=co_name;
		carSpeed=car_speed;
	}
	
	void setIsCarAutomatic(boolean automatic){
		isAutomatic=automatic;
	}
	
	void displaySpecification(){
		System.out.println("Name of  the company is:" +companyName);
		System.out.println("Speed of the car is:" +carSpeed);
		System.out.println("If car is automatic:" +isAutomatic);
	}
	
	public static void main(String[] args){
		Car car=new Car();
		car.setCarSpecifications("Volkswagen",160);
		car.setIsCarAutomatic(true);
		car.displaySpecification();
	}
}