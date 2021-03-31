//Create a class named Car, which contains method like below
// 	 a. setcompanyName  
//	 b. setIsCarAutomatic  
//	 c. setCarSpeed  
//  	d. displaySpecification   
//  Hint: One String, one boolean and one double variable needed.
package komal;

class Car{
	
	String CompanyName;
	boolean IsCarAutomatic;
	double CarSpeed;
	
	void setcompanyName(String A6){
		CompanyName = A6;
	}
	void setIsCarAutomatic(boolean BMW){
		 IsCarAutomatic = BMW;
	}
	void setCarSpeed(double speed){
		CarSpeed = speed;
	}
	void displaySpecification(){
		System.out.println("Company Name is : " +CompanyName);
		System.out.println("Car is automatic : " +IsCarAutomatic);
		System.out.println("Speed of Car : " +CarSpeed);
	}
	public static void main(String[] args){
		Car c1 = new Car();
		c1.setcompanyName("Audi");
		c1.setIsCarAutomatic(true);
		c1.setCarSpeed(120);
		c1.displaySpecification();
	}
}
	