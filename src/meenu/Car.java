package meenu;

/* Assignment_3 -> Program_2: Create a class named Car, which contains method like below
 	a. setcompanyName  
 	b. setIsCarAutomatic  
 	c. setCarSpeed  
  	d. displaySpecification   
  */

class Car{
	String companyName;
	boolean isAutomatic;
	double carSpeed;
	
	void setcompanyName(String company){
		companyName = company;
	}
	
	void setIsCarAutomatic(boolean automatic){
		isAutomatic = automatic;
	}
	
	void setCarSpeed(double speed){
		carSpeed = speed;
	}
	
	void displaySpecification(){
		System.out.println("Company of car   = "+ companyName);
		System.out.println("Car is Automatic = "+ isAutomatic);
		System.out.println("Speed of  Car    = "+ carSpeed);
	}
	
	public static void main(String[] args){
		Car car1 = new Car();
		car1.setcompanyName("Honda city");
		car1.setIsCarAutomatic(false);
		car1.setCarSpeed(120);
		car1.displaySpecification();
	}
}

























