/*
 2. Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. 
 */

package pavan;

class CarDetails{
	
	String companyName;
	boolean iscarautomatic;
	double carSpeed;
	
	void setcompanyName( String compName){
		companyName= compName;	
	}
	
	void setIscarAutomatic( boolean isautomatic){
		iscarautomatic= isautomatic;	
	}
	
	void setCarSpeed(double carspd){
		carSpeed = carspd;
	}
	
	void displayInfo(){
		System.out.println ("The name of the company : "+ companyName);
		System.out.println("Is car Automatic ? "+ iscarautomatic);
		System.out.println("The top speed of the car :"+carSpeed);
	}
	
	public static void main(String[]args){
		CarDetails cardetails = new CarDetails();
		cardetails.setcompanyName("TATA");
		cardetails.setIscarAutomatic(true);
		cardetails.setCarSpeed(110.6);
		cardetails.displayInfo();			
	}
}


