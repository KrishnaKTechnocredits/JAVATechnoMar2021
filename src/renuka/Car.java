/*Assignment-3 :Create a class named Car,which contains method like below*/

package renuka;

class Car{
     String companyName;
	 boolean isAutomatic;
	 double carSpeed;
	 
	 void setCompanyName(String name){
	     companyName = name;
	 }
	 
	 void isCarAutomatic(boolean flag){
	     isAutomatic = flag;
	 }
	 
	 void setCarSpeed(double KilometerPerHour){
	     carSpeed = KilometerPerHour;
	 }
	 
	 void displaySpecification(){
	     System.out.println("Company Name is: " +companyName+ "\n Car Type is: " +isAutomatic+ 
		 "\n CarSpeed is: " +carSpeed);
	 }
	 
	 public static void main(String[] args){
		 Car car = new Car();
		 car.setCompanyName("Toyota");
		 car.isCarAutomatic(true);
		 car.setCarSpeed(70);
		 car.displaySpecification();
	 }
}