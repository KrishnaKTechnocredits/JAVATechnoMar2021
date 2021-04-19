/*2. Create a class named Car, which contains method like below
 *   a. setcompanyName  
	 b. setIsCarAutomatic  
 	 c. setCarSpeed  
  Hint: One String, one boolean and one double variable needed. 
 */
	
package ravindra_J.Assignment_no_1_5;

class Car{
	String carName;
	boolean carFlag;
	double carSpeed;
	void setcompanyName(String name){
		carName = name;
	}
	void setIsCarAutomatic(boolean flag){
		carFlag = flag;
	}
	void setCarSpeed(double speed){
		carSpeed = speed;
	}
	void displaySpecification(){
		System.out.println("Car name is -> "+carName);
		System.out.println("wheather Car is Automatic? -> "+carFlag);
		System.out.println("What is max car speed ? -> "+carSpeed);
	}
	public static void main(String []args){
		Car car = new Car();
		car.setcompanyName("Jeep Compass");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(180);
		car.displaySpecification();
	}
}