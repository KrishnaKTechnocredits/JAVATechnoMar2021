/*Create a class named Car, which contains method like below
 	 a. setcompanyName  
	 b. setIsCarAutomatic  
	 c. setCarSpeed  
 	d. displaySpecification   
   Hint: One String, one boolean and one double variable needed. */
 
package anubhav;

   class Car{
	    String companyName;
		boolean isCarAutomatic;
		double carSpeed;
	   
	    void setCompanyName(String c_companyName){
		   companyName= c_companyName;
	    }
	   
	    void setIsCarAutomatic(boolean flag){
		   isCarAutomatic= flag;
	    }
	   
	    void setCarSpeed(double c_carSpeed){
		   carSpeed= c_carSpeed;
	    }
	   
	    void displaySpecification(){
		   System.out.println("The company of car is " + companyName);
		   System.out.println("Is the car automatic? :" + isCarAutomatic);
		   System.out.println("The speed of car is :" + carSpeed);
	    }
	   
	    public static void main (String[] args){
		  Car car= new Car();
		  car.setCompanyName("Mercedes");
		  car.setIsCarAutomatic(true);
		  car.setCarSpeed(103.2);
		  car.displaySpecification();
	    }
   }