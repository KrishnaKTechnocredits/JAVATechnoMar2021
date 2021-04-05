package monika.Assignment3;

/*Assignment 3 : 23rd March 2021
2. Create a class named Car, which contains method like below
 	 a. setcompanyName  
 	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  	d. displaySpecification   
  Hint: One String, one boolean and one double variable needed. */

class Car{
String companyNameAnswer;
boolean typeOfCarAnswer;
int speedOfCarAnswer;

void setCompanyName(String companyName){
	companyNameAnswer = companyName;
}
void setIsCarAutomatic(boolean typeOfCar){
	typeOfCarAnswer = typeOfCar;
}
void setCarSpeed(int speedOfCar){
	speedOfCarAnswer = speedOfCar;
}
void displaySpecification(){
	System.out.println("Name of car company is "+companyNameAnswer+" and it's min speed is "+speedOfCarAnswer+"km/h.");
	System.out.println("This car is automatic = "+typeOfCarAnswer);
}
public static void main(String[] args){
	Car car = new Car();
	car.setCompanyName("BMW");
	car.setCarSpeed(100);
	car.setIsCarAutomatic(true);
	car.displaySpecification();
}
}