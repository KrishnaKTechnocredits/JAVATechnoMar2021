//2. Create a class named Car, which contains method like below
//a. setcompanyName
//b. setIsCarAutomatic
//c. setCarSpeed
//d. displaySpecification
//Hint: One String, one boolean and one double variable needed.

package mayur;

class Car
{
	String companyName;
	boolean IsCarAutomatic;
	double CarSpeed;
	
	void setcompanyName(String name)
	{
		companyName = name;
	}

	void IsCarAutomatic(boolean flag)
	{
		IsCarAutomatic = flag;
	}
	
	void CarSpeed(double speed)
	{
		CarSpeed = speed;
	}
	
	void displaySpecifications()
	{
		System.out.println("Name of the company is " +companyName);
		System.out.println("Is Car Automatic " +IsCarAutomatic);
		System.out.println("Speed of Car is" +CarSpeed);
	}
	
	public static void main (String[] args)
	{
		Car car = new Car();
		car.setcompanyName("Tesla");
		car.IsCarAutomatic(true);
		car.CarSpeed(249);
		car.displaySpecifications();
	}
	
}
