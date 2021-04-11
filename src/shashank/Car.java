package shashank;
class Car{
 String companyName;
 double carSpeed;
 boolean isAutomatic;
 public void setCompanyName(String cName)
 {
	 companyName=cName;
 }
 public void isCarAutomatic(boolean isAuto)
 {
	 isAutomatic=isAuto;
 }
 public void setCarSpeed(double cSpeed)
 {
	 carSpeed=cSpeed;
 }
 public void displaySpecification()
 {
	 System.out.println("Company Name is " + companyName);
	 System.out.println("Car is Automatic? " + isAutomatic);
	 System.out.println("Car speed is " + carSpeed);
 }
 public static void main (String args[])
 {
	 Car car = new Car();
	 car.setCompanyName("Maruti Suzuki");
	 car.isCarAutomatic(true);
	 car.setCarSpeed(90.30);
	 car.displaySpecification();
 }
}