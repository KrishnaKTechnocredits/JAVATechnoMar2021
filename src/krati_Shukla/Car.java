package krati_Shukla;

class Car
{
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	
	void setcompanyName(String compName){
	 companyName = compName;
	}
	void setIsCarAutomatic(boolean flag){
		isCarAutomatic = flag;
	}
	void setCarSpeed(double speed){
		carSpeed = speed;
	}
	void displaySpecification(){
		System.out.println("Company name is "+companyName);
		System.out.println("Is this car automatic "+isCarAutomatic);
		System.out.println("The car speed is "+carSpeed);
	}
	public static void main (String[] a)
	{
		Car car = new Car();
		car.setcompanyName("Honda");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(89);
		car.displaySpecification();
	}
}
		