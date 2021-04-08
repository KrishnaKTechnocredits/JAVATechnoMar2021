package krishna.Assignment_1_5;
class Car{
	String companyName;
	boolean carAutomatic;
	double carSpeed;
	
	void setcompanyName(String company){
		companyName=company;
	}
	void setIsCarAutomatic(boolean isAutomatic){
		carAutomatic = isAutomatic;
	}
	void setCarSpeed(double speed){
		carSpeed=speed;
	}
	void displaySpecification(){
		System.out.println("Company name of car is :"+companyName);
		System.out.println("Is car is automatic:"+carAutomatic);
		System.out.println("Speed of car is :"+carSpeed);
	}
	public static void main(String[] args){
		Car car= new Car();
		car.setcompanyName("Maruti");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(56.25);
		car.displaySpecification();
	}
}