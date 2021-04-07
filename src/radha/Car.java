/* Assignment3- Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. */

package radha;

class Car{
	String companyName;
	boolean carAutomatic;
	double carSpeed;
	
	void setcompanyName(String name){
		companyName = name;
	}
	
	void setIsCarAutomatic(boolean isAutomatic){
		carAutomatic = isAutomatic;
	}
	
	void setCarSpeed(double speed){
		carSpeed =speed;
	}
	
	void displaySpecification(){
		System.out.println("Specifications of the car are:");
		System.out.println("Company: "+ companyName);
		System.out.println("Is the car automatic?: "+ carAutomatic);
		System.out.println("Speed: "+ carSpeed + "Kmph");
	}
	
	public static void main(String[] args){
		Car carSpec = new Car();
		carSpec.setcompanyName("Hyundai");
		carSpec.setIsCarAutomatic(true);
		carSpec.setCarSpeed(98.25);
		carSpec.displaySpecification();
	}
}