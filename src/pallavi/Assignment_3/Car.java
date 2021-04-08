package pallavi.Assignment_3;
class Car{
	String companyName;
	boolean isCarAutomatic;
	float carSpeed;
	
	void setcompanyName(String comName){
		companyName=comName;
	}
	
	void setIsCarAutomatic(boolean flag){
		isCarAutomatic=flag;
	}		
	
	void setCarSpeed (float speed){
		carSpeed=speed;
	}
	
	void displaySpecification(){
		System.out.println("Company name is "+ companyName);
		System.out.println("Is car automatic ? "+ isCarAutomatic);
		System.out.println("cars's speed is "+ carSpeed);
	}		
	
	public static void main(String args[]){
		Car car= new Car();
		car.setcompanyName("TechnoCredits");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(80);
		car.displaySpecification();
	}
}