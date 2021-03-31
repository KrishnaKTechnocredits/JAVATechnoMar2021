/*2. Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. 
*/
package ankit;
class Car{
	
	String companyName ;
	boolean setIsCarAutomatic;
	double setCarSpeed;
	
	void setcompanyName(String cName){
		companyName = cName;
	}
	void setIsCarAutomatic(boolean flag){
		setIsCarAutomatic = flag;
	}
	void setCarSpeed(double carSpeed){
		setCarSpeed = carSpeed;
	}
	void displaySpecification(){
		System.out.println("Company Name of car : " + companyName);
		System.out.println("The car is Automatic : " + setIsCarAutomatic);
		System.out.println("Maximum speed of car : " + setCarSpeed);	
	}
	public static void main(String[] args){
		Car car = new Car();
		car.setcompanyName("Audi");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(120.35);
		car.displaySpecification();
	}
}