package aashay;
/*
 * Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. 
 */

class Car{
	String cmp_name;
	boolean car_auto;
	double speed;
	
	void setcompanyName(String cname){
		cmp_name = cname;
	}
 	void setIsCarAutomatic(boolean auto_manual){
		car_auto = auto_manual;
	}  
 	void setCarSpeed(double tspeed){
		speed = tspeed;	
	}  
  	void displaySpecification(){
		System.out.println("Car Company:"+cmp_name+"\nType of Transmission:"+car_auto+"\nTop Speed:"+speed);
	}
	
	public static void main(String[] args){
		Car c = new Car();
		c.setcompanyName("TATA");
		c.setIsCarAutomatic(false);
		c.setCarSpeed(220);
		c.displaySpecification();
	}
	
}