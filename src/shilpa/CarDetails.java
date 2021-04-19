// Create a class named Car, which contains method like below
//	 a. setcompanyName  
//	 b. setIsCarAutomatic  
// 	 c. setCarSpeed  
//	 d. displaySpecification   
//   Hint: One String, one boolean and one double variable needed. 

package shilpa;

class CarDetails{
	String CompanyName;
	boolean IsAutomatic;
	double carspeed;
	
	void Setcompanyname(String name){		
		CompanyName = name;
	}
	
	void setIsCarAutomatic(boolean isauto){		
		IsAutomatic = isauto;
	}
	
	void setCarSpeed(double speed){
		carspeed = speed;
	}
	
	void displaySpecification(){		
		
		System.out.println("Company Name is        : "+ CompanyName);
		System.out.println("Is Car Automatic       : "+ IsAutomatic);
		System.out.println("Car Speed is           : "+ carspeed);
	}
	
	public static void main(String[] args){
		CarDetails car = new CarDetails();
		car.Setcompanyname("TATA");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(60.5);
		car.displaySpecification();
	}
}
		
	
