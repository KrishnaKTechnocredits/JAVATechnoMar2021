//4. Create a class named as ITProfessional which contain below methods
//a. empName()
//b. doesPartyOnWeekend()
//c. isAddictedToTea()
//d. isAddictedToCoffee()
//e. isAddictedToAlcohol()
//f. displayInformation()
//Hint: One String, 4 boolean variable needed

package mayur;

class ITProfessional
{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void empName(String name)
	{
		empName = name;
	}
	
	void  doesPartyOnWeekend(boolean flag)
	{
		doesPartyOnWeekend = flag; 
	}
	
	void isAddictedToTea(boolean flag)
	{
		isAddictedToTea = flag;
	}
	
	void isAddictedToCoffee(boolean flag)
	{
		isAddictedToCoffee = flag;
	}
	
	void isAddictedToAlcohol(boolean flag)
	{
		isAddictedToAlcohol = flag;
	}
	
	void displayInformation()
	{
		System.out.println("Name of the employee is " +empName);
		System.out.println("is Addicted To Tea " +isAddictedToTea);
		System.out.println("is Addicted To Coffee " +isAddictedToCoffee);
		System.out.println("is Addicted To Alcohol " +isAddictedToAlcohol);
		System.out.println("does Party On Weekend " +doesPartyOnWeekend);
	}
	
	public static void main(String[] args)
	{
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Mayur");
		itProfessional.doesPartyOnWeekend(true);		
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(false);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}