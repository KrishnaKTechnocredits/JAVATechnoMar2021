/* 
 * Assignment 3 class car with 4 methods
 */
package purva;

class Car{
   String companyName;
   boolean isAutomatic;
   double speed;
   
   void setCompanyName(String name){
		companyName =name;
   }
   
   void setIsCarAutomatic(boolean flag){
		isAutomatic = flag;
   }
   
   void setCarSpeed(double spd){
		speed = spd;
	   
   }
   
   void displaySpecification(){
		System.out.println("Car company is"+companyName);
		System.out.println("Is car automatic?" +isAutomatic);
		System.out.println("Speed of the car is set to "+ speed + "km/h");   
   }
   
   public static void main(String[] args){
		Car car = new Car();
		car.setCompanyName("Hyundai");
		car.setIsCarAutomatic(false);
		car.setCarSpeed(120);
		car.displaySpecification();
   }
	
}