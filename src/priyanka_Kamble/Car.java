package priyanka_Kamble;
/**

2. Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. 
 **/
 
 class Car{
	 String companyName;
	 boolean isAutomatic;
	 double speed;
	 
	 void setcompanyName(String name){
		 companyName= name;
	 }
	 
	 void setIsCarAutomatic(boolean automatic){
		 isAutomatic=automatic;
	 }
	 
	 void setCarSpeed(double s){
		 speed = s;
	 }
	 
	 void displaySpecification(){
		 System.out.println("Company name is  		"+companyName);
		 System.out.println("Is car Automatic?  	"+isAutomatic);
		 System.out.println("Speed of the Car is 	"+speed);
	 }
	 
	 public static void main(String args[]){
		Car c = new Car();
		c.setcompanyName("Maruti Suzuki");
		c.setIsCarAutomatic(true);
		c.setCarSpeed(280);
		c.displaySpecification();
		
	 }
 }