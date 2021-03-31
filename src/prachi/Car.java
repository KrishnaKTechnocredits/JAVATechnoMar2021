package prachi;

//Assignment_3_Program2
//2. Create a class named Car, which contains method like below
//	 a. setcompanyName  
// 	 b. setIsCarAutomatic  
//	 c. setCarSpeed  
// 	d. displaySpecification   
//  Hint: One String, one boolean and one double variable needed. 

class Car{
	String CompanyName;
	boolean IsCarAutomatic;
	double CarSpeed;
	
	void setcompanyName(String cName){
		CompanyName=cName;		
	}
	
	void setIsCarAutomatic(boolean carAuto){
		IsCarAutomatic=carAuto;
	}
	
	void setCarSpeed(double cSpeed){
		CarSpeed = cSpeed;
	}
	
	void displaySpecification(){
		System.out.println("Car Company Name is: "+CompanyName);
		System.out.println("Is Car Automatic?: "+IsCarAutomatic);
		System.out.println("Car speed is: "+CarSpeed);
	}
	
	public static void main(String[] args){
		Car car = new Car();
		car.setcompanyName("BMW");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(60);
		car.displaySpecification();
	}
}