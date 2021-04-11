/*
 * 2. Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. 
 */

package amruta.Assignment_3;

class Car{
	String carname;
	boolean iscarAutomatic;
	double speed;
	
	void setcompanyName(String carcompanyname){
		carname = carcompanyname;
	}
	void setIsCarAutomatic(boolean carautomaticstatus){
		iscarAutomatic = carautomaticstatus;
	}
	void setCarSpeed(double carspeed){
		speed = carspeed;
	}
	void displaySpecification(){
		System.out.println("Company Name of the Car is : "+carname);
		System.out.println("Automatic status of the Car is : "+iscarAutomatic);
		System.out.println("Speed of the Car is : "+speed);
	}
	
	public static void main(String[] args){
		Car car = new Car();
		car.setcompanyName("Maruti Suzuki");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(256);
		car.displaySpecification();
	}
}